package dejain.lang.ast;

import dejain.lang.ASMCompiler;
import dejain.lang.ClassResolver;
import dejain.lang.CommonClassResolver;
import dejain.runtime.asm.CommonClassTransformer;
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

    void populate(CommonClassTransformer transformer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
