package dejain.lang.ast;

import dejain.lang.ASMCompiler;
import dejain.lang.ClassResolver;
import dejain.lang.CommonClassResolver;
import dejain.runtime.asm.CommonClassTransformer;
import dejain.runtime.asm.IfAllTransformer;
import java.util.List;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.FieldNode;

public class FieldSelectorAST {
    public Integer accessModifier;
    public Boolean isStatic;
    public TypeAST fieldType;
    public String name;

    public FieldSelectorAST(Integer accessModifier, Boolean isStatic, TypeAST fieldType, String name) {
        this.accessModifier = accessModifier;
        this.isStatic = isStatic;
        this.fieldType = fieldType;
        this.name = name;
    }

    public void resolve(ClassAST thisClass, TypeAST expectedResultType, ClassResolver resolver, List<ASMCompiler.Message> errorMessages) {
        fieldType.resolve(thisClass, expectedResultType, resolver, errorMessages);
    }

    public void populate(CommonClassTransformer transformer) {
//        transformer.addPredicate(c -> c.fields.stream().anyMatch(f -> 
//            ((FieldNode)f).name.equals(name)) &&
//            ((FieldNode)f).access == 
//        );
    }

    public void populate(IfAllTransformer<Transformation<FieldNode>> transformer) {
        if(accessModifier != null)
            transformer.addPredicate(f -> (f.getTarget().access & accessModifier) != 0);
        if(isStatic != null)
            transformer.addPredicate(f -> (f.getTarget().access & Opcodes.ACC_STATIC) != 0);
        if(fieldType != null)
            transformer.addPredicate(f -> Type.getType(f.getTarget().desc).getClassName().equals(fieldType.getDescriptor()));
        if(name != null)
            transformer.addPredicate(f -> f.getTarget().name.equals(name));
    }
}
