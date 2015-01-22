package dejain.lang.ast;

import dejain.lang.ASMCompiler;
import dejain.lang.ClassResolver;
import java.util.List;

public class MethodSelectorContext implements Context {
    public Integer accessModifer;
    public Boolean isStatic;
    public TypeContext returnType;
    public String name;
    public List<TypeContext> parameterTypes;

    public MethodSelectorContext(Integer accessModifer, Boolean isStatic, TypeContext returnType, String name, List<TypeContext> parameterTypes) {
        this.accessModifer = accessModifer;
        this.isStatic = isStatic;
        this.returnType = returnType;
        this.name = name;
        this.parameterTypes = parameterTypes;
    }

    @Override
    public void resolve(ClassResolver resolver, List<ASMCompiler.Message> errorMessages) {
        System.out.println("returnType=" + returnType);
        returnType.resolve(resolver, errorMessages);
        parameterTypes.forEach(pt -> pt.resolve(resolver, errorMessages));
    }
}
