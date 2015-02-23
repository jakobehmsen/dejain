package jasy.lang.ast;

import jasy.lang.ASMCompiler;
import jasy.lang.ASMCompiler.Region;
import jasy.lang.ClassResolver;
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
    public void resolve(Scope thisClass, TypeAST expectedResultType, ClassResolver resolver, ClassLoader classLoader, List<ASMCompiler.Message> errorMessages) {
        if(expression != null)
            expression.resolve(thisClass, expectedResultType, resolver, classLoader, errorMessages);
    }
}
