package dejain.lang.ast;

import dejain.lang.ASMCompiler;
import dejain.lang.ClassResolver;
import dejain.lang.CommonClassResolver;
import java.util.List;

public class FieldSelectorContext implements Context {
    public Integer accessModifer;
    public Boolean isStatic;
    public TypeContext fieldType;
    public String name;

    public FieldSelectorContext(Integer accessModifer, Boolean isStatic, TypeContext fieldType, String name) {
        this.accessModifer = accessModifer;
        this.isStatic = isStatic;
        this.fieldType = fieldType;
        this.name = name;
    }

    @Override
    public void resolve(ClassResolver resolver, List<ASMCompiler.Message> errorMessages) {
        fieldType.resolve(resolver, errorMessages);
    }
}
