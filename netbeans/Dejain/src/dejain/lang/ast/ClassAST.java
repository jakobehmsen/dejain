package dejain.lang.ast;

import dejain.lang.ASMCompiler;
import dejain.lang.ASMCompiler.Region;
import dejain.lang.ClassResolver;
import dejain.lang.CommonClassResolver;
import dejain.runtime.asm.ClassTransformer;
import dejain.runtime.asm.CommonClassTransformer;
import dejain.runtime.asm.FirstByIndexTransformer;
import dejain.runtime.asm.IfAllTransformer;
import dejain.runtime.asm.IfAnyTransformer;
import dejain.runtime.asm.IfAnyWithin;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.MethodNode;

public class ClassAST extends AbstractAST {
    public List<AnnotationAST> annotations;
    public Integer accessModifier;
    public NameTypeAST type;
    public List<MemberAST> members;

    public ClassAST(Region region, List<AnnotationAST> annotations, Integer accessModifier, NameTypeAST type, List<MemberAST> members) {
        super(region);
        this.annotations = annotations;
        this.accessModifier = accessModifier;
        this.type = type;
        this.members = members;
    }

    @Override
    public void resolve(ClassAST thisClass, TypeAST expectedResultType, ClassResolver resolver, List<ASMCompiler.Message> errorMessages) {
        annotations.forEach(a -> a.resolve(this, expectedResultType, resolver, errorMessages));
        if(type != null)
            type.resolve(this, expectedResultType, resolver, errorMessages);
        members.forEach(m -> m.resolve(this, expectedResultType, resolver, errorMessages));
    }

    public void populate(CommonClassTransformer transformer) {
        annotations.forEach(x -> x.populate(transformer));
        if(accessModifier != null)
            transformer.addPredicate(c -> c.access == accessModifier);
        if(type != null)
            transformer.addPredicate(c -> c.name.equals(type.name));
        members.forEach(x -> x.populate(transformer));
    }

    public void populate(IfAllTransformer<Transformation<ClassNode>> transformer) {
        IfAllTransformer<Transformation<FieldNode>> fieldTransformer = new IfAllTransformer<>();
        IfAllTransformer<Transformation<MethodNode>> methodTransformer = new IfAllTransformer<>();
        
        members.forEach(x -> x.accept(new MemberVisitor() {
            @Override
            public void visitMethod(MethodAST ctx) {
                ctx.populate(transformer, methodTransformer);
            }

            @Override
            public void visitField(FieldAST ctx) {
                ctx.populate(transformer, fieldTransformer);
            }
        }));
        
        transformer.addTransformer(new IfAnyWithin<>(c -> (List<Transformation<FieldNode>>)c.getTarget().fields.stream().map(f -> c.inner(f)).collect(Collectors.toList()), fieldTransformer));
        transformer.addTransformer(new IfAnyWithin<>(c -> (List<Transformation<MethodNode>>)c.getTarget().methods.stream().map(f -> c.inner(f)).collect(Collectors.toList()), methodTransformer));
//        transformer.addTransformer(new IfAnyWithin<>(c -> c.getTarget().methods, methodTransformer));
    }

    public TypeAST getFieldType(String fieldName) {
        Optional<TypeAST> field = members.stream()
            .filter(m -> m instanceof FieldAST)
            .filter(f -> ((FieldAST)f).selector.name.equals(fieldName))
            .map(f -> ((FieldAST)f).selector.fieldType).findFirst();
        
        return field.isPresent() ? field.get() : null;
    }
}
