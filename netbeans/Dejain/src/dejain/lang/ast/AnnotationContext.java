package dejain.lang.ast;

import dejain.lang.ASMCompiler;
import dejain.lang.ClassResolver;
import dejain.lang.CommonClassResolver;
import java.util.List;

public class AnnotationContext implements Context {
    public boolean isAdd;
    public TypeContext type;

    public AnnotationContext(boolean isAdd, TypeContext type) {
        this.isAdd = isAdd;
        this.type = type;
    }

    @Override
    public void resolve(ClassResolver resolver, List<ASMCompiler.Message> errorMessages) {
        type.resolve(resolver, errorMessages);
    }
}
