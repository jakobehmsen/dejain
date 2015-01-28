package dejain.lang.ast;

import dejain.lang.ASMCompiler;
import dejain.lang.ClassResolver;
import dejain.lang.CommonClassResolver;
import dejain.runtime.asm.IfAllTransformer;
import dejain.runtime.asm.IfAllWithin;
import java.util.List;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.ParameterNode;

public class MethodSelectorContext {
    public Integer accessModifier;
    public Boolean isStatic;
    public TypeContext returnType;
    public String name;
    public List<TypeContext> parameterTypes;

    public MethodSelectorContext(Integer accessModifier, Boolean isStatic, TypeContext returnType, String name, List<TypeContext> parameterTypes) {
        this.accessModifier = accessModifier;
        this.isStatic = isStatic;
        this.returnType = returnType;
        this.name = name;
        this.parameterTypes = parameterTypes;
    }

    public void resolve(ClassResolver resolver, List<ASMCompiler.Message> errorMessages) {
        returnType.resolve(resolver, errorMessages);
        parameterTypes.forEach(pt -> pt.resolve(resolver, errorMessages));
    }

    public void populate(IfAllTransformer<MethodNode> transformer) {
        if(accessModifier != null)
            transformer.addPredicate(m -> (m.access & accessModifier) != 0);
        if(isStatic != null)
            transformer.addPredicate(m -> (m.access & Opcodes.ACC_STATIC) != 0);
        if(returnType != null)
            transformer.addPredicate(m -> Type.getType(m.desc).getClassName().equals(returnType.name));
        if(name != null)
            transformer.addPredicate(m -> m.name.equals(name));
        
        if(parameterTypes != null) {
            transformer.addPredicate(m -> {
                Type[] argumentTypes = Type.getArgumentTypes(m.desc);
                
                if(argumentTypes.length != parameterTypes.size())
                    return false;
                
                for(int i = 0; i < parameterTypes.size(); i++) {
                    if(!argumentTypes[i].getClassName().equals(parameterTypes.get(0).name))
                        return false;
                }
                
                return true;
            });
        }
    }
}
