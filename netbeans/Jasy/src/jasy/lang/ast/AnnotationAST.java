package jasy.lang.ast;

import jasy.lang.ASMCompiler;
import jasy.lang.ASMCompiler.Region;
import jasy.lang.ClassResolver;
import jasy.runtime.asm.CommonClassTransformer;
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
    public void resolve(Scope thisClass, TypeAST expectedResultType, ClassResolver resolver, ClassLoader classLoader, List<ASMCompiler.Message> errorMessages) {
        type.resolve(thisClass, expectedResultType, resolver, classLoader, errorMessages);
    }

    public void populate(CommonClassTransformer transformer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
