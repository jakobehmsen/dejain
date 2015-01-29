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
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.MethodNode;

public class ClassContext extends AbstractContext {
    public List<AnnotationContext> annotations;
    public Integer accessModifier;
    public NameTypeContext type;
    public List<MemberContext> members;

    public ClassContext(Region region, List<AnnotationContext> annotations, Integer accessModifier, NameTypeContext type, List<MemberContext> members) {
        super(region);
        this.annotations = annotations;
        this.accessModifier = accessModifier;
        this.type = type;
        this.members = members;
    }

    @Override
    public void resolve(ClassContext thisClass, ClassResolver resolver, List<ASMCompiler.Message> errorMessages) {
        annotations.forEach(a -> a.resolve(this, resolver, errorMessages));
        if(type != null)
            type.resolve(this, resolver, errorMessages);
        members.forEach(m -> m.resolve(this, resolver, errorMessages));
    }

    public void populate(CommonClassTransformer transformer) {
        annotations.forEach(x -> x.populate(transformer));
        if(accessModifier != null)
            transformer.addPredicate(c -> c.access == accessModifier);
        if(type != null)
            transformer.addPredicate(c -> c.name.equals(type.name));
        members.forEach(x -> x.populate(transformer));
    }

    public void populate(IfAllTransformer<ClassNode> transformer) {
        IfAllTransformer<FieldNode> fieldTransformer = new IfAllTransformer<>();
        IfAllTransformer<MethodNode> methodTransformer = new IfAllTransformer<>();
        
        members.forEach(x -> x.accept(new MemberVisitor() {
            @Override
            public void visitMethod(MethodContext ctx) {
                ctx.populate(transformer, methodTransformer);
            }

            @Override
            public void visitField(FieldContext ctx) {
                ctx.populate(transformer, fieldTransformer);
            }
        }));
        
        transformer.addTransformer(new IfAnyWithin<>(c -> c.fields, fieldTransformer));
        transformer.addTransformer(new IfAnyWithin<>(c -> c.methods, methodTransformer));
    }

    public TypeContext getFieldType(String fieldName) {
        Optional<TypeContext> field = members.stream()
            .filter(m -> m instanceof FieldContext)
            .filter(f -> ((FieldContext)f).selector.name.equals(fieldName))
            .map(f -> ((FieldContext)f).selector.fieldType).findFirst();
        
        return field.isPresent() ? field.get() : null;
    }
}
