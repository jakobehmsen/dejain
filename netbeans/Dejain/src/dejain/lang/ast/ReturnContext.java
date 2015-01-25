package dejain.lang.ast;

import dejain.lang.ASMCompiler;
import dejain.lang.ClassResolver;
import dejain.lang.CommonClassResolver;
import java.util.List;

public class ReturnContext implements CodeContext {
    public ExpressionContext expression;

    public ReturnContext(ExpressionContext expression) {
        this.expression = expression;
    }

    @Override
    public void accept(CodeVisitor visitor) {
        visitor.visitReturn(this);
    }

    @Override
    public void resolve(ClassResolver resolver, List<ASMCompiler.Message> errorMessages) {
        expression.resolve(resolver, errorMessages);
    }
}
