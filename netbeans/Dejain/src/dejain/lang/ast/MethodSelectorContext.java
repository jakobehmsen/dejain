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

    public void resolve(ClassContext thisClass, TypeContext expectedResultType, ClassResolver resolver, List<ASMCompiler.Message> errorMessages) {
        returnType.resolve(thisClass, expectedResultType, resolver, errorMessages);
        parameterTypes.forEach(pt -> pt.resolve(thisClass, expectedResultType, resolver, errorMessages));
    }

    public void populate(IfAllTransformer<Transformation<MethodNode>> transformer) {
        if(accessModifier != null)
            transformer.addPredicate(m -> (m.getTarget().access & accessModifier) != 0);
        if(isStatic != null)
            transformer.addPredicate(m -> (m.getTarget().access & Opcodes.ACC_STATIC) != 0);
        if(returnType != null)
            transformer.addPredicate(m -> Type.getType(m.getTarget().desc).getClassName().equals(returnType.getDescriptor()));
        if(name != null)
            transformer.addPredicate(m -> m.getTarget().name.equals(name));
        
        if(parameterTypes != null) {
            transformer.addPredicate(m -> {
                Type[] argumentTypes = Type.getArgumentTypes(m.getTarget().desc);
                
                if(argumentTypes.length != parameterTypes.size())
                    return false;
                
                for(int i = 0; i < parameterTypes.size(); i++) {
                    if(!argumentTypes[i].getClassName().equals(parameterTypes.get(0).getDescriptor()))
                        return false;
                }
                
                return true;
            });
        }
    }
}
