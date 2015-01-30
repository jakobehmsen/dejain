package dejain.lang.ast;

import dejain.lang.ASMCompiler;
import dejain.lang.ASMCompiler.Region;
import dejain.lang.ClassResolver;
import dejain.lang.CommonClassResolver;
import java.util.List;

public class ReturnContext extends AbstractContext implements CodeContext {
    public ExpressionContext expression;

    public ReturnContext(Region region, ExpressionContext expression) {
        super(region);
        this.expression = expression;
    }

    @Override
    public void accept(CodeVisitor visitor) {
        visitor.visitReturn(this);
    }

    @Override
    public void resolve(ClassContext thisClass, TypeContext expectedResultType, ClassResolver resolver, List<ASMCompiler.Message> errorMessages) {
        expression.resolve(thisClass, expectedResultType, resolver, errorMessages);
    }
}
