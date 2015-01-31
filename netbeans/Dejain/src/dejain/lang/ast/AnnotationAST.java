package dejain.lang.ast;

import dejain.lang.ASMCompiler;
import dejain.lang.ASMCompiler.Region;
import dejain.lang.ClassResolver;
import dejain.lang.CommonClassResolver;
import dejain.runtime.asm.CommonClassTransformer;
import java.util.List;

public class AnnotationAST extends AbstractAST {
    public boolean isAdd;
    public TypeAST type;

    public AnnotationAST(Region region, boolean isAdd, TypeAST type) {
        super(region);
        this.isAdd = isAdd;
        this.type = type;
    }

    @Override
    public void resolve(ClassAST thisClass, TypeAST expectedResultType, ClassResolver resolver, List<ASMCompiler.Message> errorMessages) {
        type.resolve(thisClass, expectedResultType, resolver, errorMessages);
    }

    void populate(CommonClassTransformer transformer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
