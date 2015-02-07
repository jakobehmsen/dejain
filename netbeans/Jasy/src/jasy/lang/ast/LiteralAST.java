package jasy.lang.ast;

import jasy.lang.ASMCompiler;
import jasy.lang.ASMCompiler.Region;
import jasy.lang.ClassResolver;
import java.util.List;

public abstract class LiteralAST<T> extends AbstractAST implements ExpressionAST {
    public T value;

    public LiteralAST(Region region, T value) {
        super(region);
        this.value = value;
    }

    @Override
    public void resolve(Scope thisClass, TypeAST expectedResultType, ClassResolver resolver, List<ASMCompiler.Message> errorMessages) {
        
    }
}
