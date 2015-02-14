package jasy.lang.ast;

import jasy.lang.ASMCompiler;
import jasy.lang.ClassResolver;
import java.util.List;

public class IfElseAST extends AbstractAST implements CodeAST {
    public ExpressionAST condition; 
    public CodeAST ifTrueBody;
    public CodeAST ifFalseBody;

    public IfElseAST(ASMCompiler.Region region, ExpressionAST condition, CodeAST ifTrueBody, CodeAST ifFalseBody) {
        super(region);
        this.condition = condition;
        this.ifTrueBody = ifTrueBody;
        this.ifFalseBody = ifFalseBody;
    }

    @Override
    public void resolve(Scope thisClass, TypeAST expectedResultType, ClassResolver resolver, List<ASMCompiler.Message> errorMessages) {
        condition.resolve(thisClass, expectedResultType, resolver, errorMessages);
        ifTrueBody.resolve(thisClass, expectedResultType, resolver, errorMessages);
        ifFalseBody.resolve(thisClass, expectedResultType, resolver, errorMessages);
    }

    @Override
    public <T> T accept(CodeVisitor<T> visitor) {
        return visitor.visitIfElse(this);
    }
}
