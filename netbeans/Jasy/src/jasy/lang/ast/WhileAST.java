package jasy.lang.ast;

import jasy.lang.ASMCompiler;
import jasy.lang.ClassResolver;
import java.util.List;

public class WhileAST extends AbstractAST implements CodeAST {
    public ExpressionAST condition;
    public CodeAST body;

    public WhileAST(ASMCompiler.Region region, ExpressionAST condition, CodeAST body) {
        super(region);
        this.condition = condition;
        this.body = body;
    }
    
    @Override
    public void resolve(Scope thisClass, TypeAST expectedResultType, ClassResolver resolver, ClassLoader classLoader, List<ASMCompiler.Message> errorMessages) {
        condition.resolve(thisClass, expectedResultType, resolver, classLoader, errorMessages);
        body.resolve(thisClass, expectedResultType, resolver, classLoader, errorMessages);
    }

    @Override
    public <T> T accept(CodeVisitor<T> visitor) {
        return visitor.visitWhile(this);
    }
}
