package dejain.lang.ast;

import dejain.lang.ASMCompiler;
import dejain.lang.ASMCompiler.Region;
import dejain.lang.ClassResolver;
import dejain.lang.CommonClassResolver;
import dejain.runtime.asm.CommonClassTransformer;
import java.util.List;

public class AnnotationContext extends AbstractContext {
    public boolean isAdd;
    public TypeContext type;

    public AnnotationContext(Region region, boolean isAdd, TypeContext type) {
        super(region);
        this.isAdd = isAdd;
        this.type = type;
    }

    @Override
    public void resolve(ClassContext thisClass, TypeContext expectedResultType, ClassResolver resolver, List<ASMCompiler.Message> errorMessages) {
        type.resolve(thisClass, expectedResultType, resolver, errorMessages);
    }

    void populate(CommonClassTransformer transformer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
