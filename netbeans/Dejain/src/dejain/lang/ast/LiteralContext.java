package dejain.lang.ast;

import dejain.lang.ASMCompiler;
import dejain.lang.ASMCompiler.Region;
import dejain.lang.ClassResolver;
import dejain.lang.CommonClassResolver;
import java.util.List;

public class LiteralContext<T> extends AbstractContext implements ExpressionContext {
    public T value;
    private LiteralDelegateContext<T> delegate;

    public LiteralContext(Region region, T value, LiteralDelegateContext<T> delegate) {
        super(region);
        this.value = value;
        this.delegate = delegate;
    }

    @Override
    public void resolve(ClassContext thisClass, TypeContext expectedResultType, ClassResolver resolver, List<ASMCompiler.Message> errorMessages) {
        
    }

    @Override
    public TypeContext resultType() {
        return delegate.resultType(getRegion());
    }

    @Override
    public void accept(CodeVisitor visitor) {
        delegate.accept(visitor, this);
    }
}
