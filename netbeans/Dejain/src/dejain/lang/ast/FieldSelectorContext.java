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

public class FieldSelectorContext {
    public Integer accessModifier;
    public Boolean isStatic;
    public TypeContext fieldType;
    public String name;

    public FieldSelectorContext(Integer accessModifier, Boolean isStatic, TypeContext fieldType, String name) {
        this.accessModifier = accessModifier;
        this.isStatic = isStatic;
        this.fieldType = fieldType;
        this.name = name;
    }

    public void resolve(ClassContext thisClass, ClassResolver resolver, List<ASMCompiler.Message> errorMessages) {
        fieldType.resolve(thisClass, resolver, errorMessages);
    }

    public void populate(CommonClassTransformer transformer) {
//        transformer.addPredicate(c -> c.fields.stream().anyMatch(f -> 
//            ((FieldNode)f).name.equals(name)) &&
//            ((FieldNode)f).access == 
//        );
    }

    public void populate(IfAllTransformer<FieldNode> transformer) {
        if(accessModifier != null)
            transformer.addPredicate(f -> (f.access & accessModifier) != 0);
        if(isStatic != null)
            transformer.addPredicate(f -> (f.access & Opcodes.ACC_STATIC) != 0);
        if(fieldType != null)
            transformer.addPredicate(f -> Type.getType(f.desc).getClassName().equals(fieldType.getName()));
        if(name != null)
            transformer.addPredicate(f -> f.name.equals(name));
    }
}
