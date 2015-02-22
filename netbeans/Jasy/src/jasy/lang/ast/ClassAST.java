package jasy.lang.ast;

import jasy.lang.ASMCompiler;
import jasy.lang.ASMCompiler.Region;
import jasy.lang.ClassResolver;
import jasy.runtime.asm.CommonClassTransformer;
import jasy.runtime.asm.IfAllTransformer;
import jasy.runtime.asm.IfAllWithin;
import java.util.Hashtable;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.MethodNode;

public class ClassAST extends AbstractAST implements Scope {
    public String variableId;
    public List<AnnotationAST> annotations;
    public Integer accessModifier;
    public NameTypeAST type;
    public List<MemberAST> members;

    public ClassAST(Region region, String variableId, List<AnnotationAST> annotations, Integer accessModifier, NameTypeAST type, List<MemberAST> members) {
        super(region);
        this.variableId = variableId;
        this.annotations = annotations;
        this.accessModifier = accessModifier;
        this.type = type;
        this.members = members;
    }

    @Override
    public void resolve(Scope thisClass, TypeAST expectedResultType, ClassResolver resolver, List<ASMCompiler.Message> errorMessages) {    
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

    public void populate(ClassResolver classResolver, IfAllTransformer<Transformation<ClassNode>> transformer) {
        IfAllTransformer<Transformation<FieldNode>> fieldTransformer = new IfAllTransformer<>();
        IfAllTransformer<Transformation<MethodNode>> methodTransformer = new IfAllTransformer<>();
        
        transformer.addTransformer(c -> {
//            Hashtable<String, Object> variables = new Hashtable<>();
                
            if(variableId != null) {
                c.putVariableValue(variableId, c.getTarget());
//                variables.put(variableId, c.getTarget());
            }
            
//            c = c.inner(c.getTarget(), variables);
                
            IfAllTransformer<Transformation<ClassNode>> memberTransformer = new IfAllTransformer<>();

//            memberTransformer.addTransformer(new IfAllWithin<>(c2 -> (List<Transformation<FieldNode>>)c2.getTarget().fields.stream().map(f -> c2.inner(f)).collect(Collectors.toList()), fieldTransformer));
//            memberTransformer.addTransformer(new IfAllWithin<>(c2 -> (List<Transformation<MethodNode>>)c2.getTarget().methods.stream().map(f -> c2.inner(f)).collect(Collectors.toList()), methodTransformer));
            
            members.forEach(x -> x.accept(new MemberVisitor() {
                @Override
                public void visitMethod(MethodAST ctx) {
                    ctx.populate(classResolver, memberTransformer, methodTransformer);
                }

                @Override
                public void visitField(FieldAST ctx) {
                    ctx.populate(classResolver, memberTransformer, fieldTransformer);
                }
            }));

            return memberTransformer.apply(c);
        });
    }

    public TypeAST getFieldType(String fieldName) {
        Optional<TypeAST> field = members.stream()
            .filter(m -> m instanceof FieldAST)
            .filter(f -> ((FieldAST)f).selector.name.equals(fieldName))
            .map(f -> ((FieldAST)f).selector.fieldType).findFirst();
        
        return field.isPresent() ? field.get() : null;
    }
}
