package dejain.lang.ast;

import dejain.lang.ASMCompiler;
import dejain.lang.ASMCompiler.Region;
import dejain.lang.ClassResolver;
import dejain.lang.CommonClassResolver;
import java.util.Hashtable;
import java.util.List;

public class ReturnAST extends AbstractAST implements CodeAST {
    public ExpressionAST expression;

    public ReturnAST(Region region, ExpressionAST expression) {
        super(region);
        this.expression = expression;
    }

    @Override
    public void accept(CodeVisitor visitor) {
        visitor.visitReturn(this);
    }

    @Override
    public void resolve(Scope thisClass, TypeAST expectedResultType, ClassResolver resolver, List<ASMCompiler.Message> errorMessages) {
        expression.resolve(thisClass, expectedResultType, resolver, errorMessages);
    }
}
