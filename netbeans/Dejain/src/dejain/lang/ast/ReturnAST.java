package dejain.lang.ast;

import dejain.lang.ASMCompiler;
import dejain.lang.ASMCompiler.Region;
import dejain.lang.ClassResolver;
import java.util.List;

public class ReturnAST extends AbstractAST implements CodeAST {
    public ExpressionAST expression;

    public ReturnAST(Region region, ExpressionAST expression) {
        super(region);
        this.expression = expression;
    }

    @Override
    public <T> T accept(CodeVisitor<T> visitor) {
        return visitor.visitReturn(this);
    }

    @Override
    public void resolve(Scope thisClass, TypeAST expectedResultType, ClassResolver resolver, List<ASMCompiler.Message> errorMessages) {
        expression.resolve(thisClass, expectedResultType, resolver, errorMessages);
    }
}
