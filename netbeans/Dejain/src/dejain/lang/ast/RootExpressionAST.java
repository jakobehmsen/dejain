package dejain.lang.ast;

import dejain.lang.ASMCompiler;
import dejain.lang.ClassResolver;
import java.util.List;

public class RootExpressionAST extends AbstractAST implements CodeAST {
    public ExpressionAST expression;
    
    public RootExpressionAST(ASMCompiler.Region region, ExpressionAST expression) {
        super(region);
        this.expression = expression;
    }

    @Override
    public void resolve(Scope thisClass, TypeAST expectedResultType, ClassResolver resolver, List<ASMCompiler.Message> errorMessages) {
        expression.resolve(thisClass, expectedResultType, resolver, errorMessages);
    }

    @Override
    public <T> T accept(CodeVisitor<T> visitor) {
        return visitor.visitRootExpression(this);
    }
}
