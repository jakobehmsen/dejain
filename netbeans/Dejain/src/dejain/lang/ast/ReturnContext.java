package dejain.lang.ast;

import dejain.lang.ASMCompiler;
import dejain.lang.CommonClassResolver;
import java.util.List;

public class ReturnContext implements StatementContext {
    public ExpressionContext expression;

    public ReturnContext(ExpressionContext expression) {
        this.expression = expression;
    }

    @Override
    public void accept(StatementVisitor visitor) {
        visitor.visitReturn(this);
    }

    @Override
    public void resolve(CommonClassResolver resolver, List<ASMCompiler.Message> errorMessages) {
        expression.resolve(resolver, errorMessages);
    }
}
