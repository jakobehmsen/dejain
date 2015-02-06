package jasy.lang.ast;

import jasy.lang.ASMCompiler;
import jasy.lang.ASMCompiler.Region;
import jasy.lang.ClassResolver;
import java.util.List;

public class LiteralAST<T> extends AbstractAST implements ExpressionAST {
    public T value;
    private LiteralDelegateAST<T> delegate;

    public LiteralAST(Region region, T value, LiteralDelegateAST<T> delegate) {
        super(region);
        this.value = value;
        this.delegate = delegate;
    }

    @Override
    public void resolve(Scope thisClass, TypeAST expectedResultType, ClassResolver resolver, List<ASMCompiler.Message> errorMessages) {
        
    }

    @Override
    public TypeAST resultType() {
        return delegate.resultType(getRegion());
    }

    @Override
    public <T> T accept(CodeVisitor<T> visitor) {
        return delegate.accept(visitor, this);
    }
}
