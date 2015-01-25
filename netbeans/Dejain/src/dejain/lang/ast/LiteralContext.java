package dejain.lang.ast;

import dejain.lang.ASMCompiler;
import dejain.lang.ClassResolver;
import dejain.lang.CommonClassResolver;
import java.util.List;

public class LiteralContext<T> implements ExpressionContext {
    public T value;
    private LiteralDelegateContext<T> delegate;

    public LiteralContext(T value, LiteralDelegateContext<T> delegate) {
        this.value = value;
        this.delegate = delegate;
    }

    @Override
    public void resolve(ClassResolver resolver, List<ASMCompiler.Message> errorMessages) { }

    @Override
    public Class<?> resultType() {
        return delegate.resultType();
    }

    @Override
    public void accept(CodeVisitor visitor) {
        delegate.accept(visitor, this);
    }
}
