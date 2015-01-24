package dejain.lang.ast;

import dejain.lang.ASMCompiler;
import dejain.lang.ClassResolver;
import dejain.lang.CommonClassResolver;
import java.util.List;

public class LiteralContext implements ExpressionContext {
    public Object value;

    public LiteralContext(Object value) {
        this.value = value;
    }

    @Override
    public void accept(ExpressionVisitor visitor) {
        visitor.visitLiteral(this);
    }

    @Override
    public Class<?> resultType() {
        return value.getClass();
    }

    @Override
    public void resolve(ClassResolver resolver, List<ASMCompiler.Message> errorMessages) { }
}
