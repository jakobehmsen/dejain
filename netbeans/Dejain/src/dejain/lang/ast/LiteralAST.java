package dejain.lang.ast;

import dejain.lang.ASMCompiler;
import dejain.lang.ASMCompiler.Region;
import dejain.lang.ClassResolver;
import dejain.lang.CommonClassResolver;
import java.util.Hashtable;
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
    public void accept(CodeVisitor visitor) {
        delegate.accept(visitor, this);
    }
}
