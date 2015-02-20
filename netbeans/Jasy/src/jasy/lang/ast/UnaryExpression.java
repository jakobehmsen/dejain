package jasy.lang.ast;

import jasy.lang.ASMCompiler;
import jasy.lang.ClassResolver;
import java.util.List;

public class UnaryExpression extends AbstractAST implements ExpressionAST {
    public static final int OPERATOR_SIGN_POS = 0;
    public static final int OPERATOR_SIGN_NEG = 1;
    public static final int OPERATOR_BIN_COMP = 2;
    public static final int OPERATOR_LOG_COMP = 3;
    
    public int operator;
    public ExpressionAST operand;

    public UnaryExpression(ASMCompiler.Region region, int operator, ExpressionAST operand) {
        super(region);
        this.operator = operator;
        this.operand = operand;
    }

    @Override
    public void resolve(Scope thisClass, TypeAST expectedResultType, ClassResolver resolver, List<ASMCompiler.Message> errorMessages) {
        operand.resolve(thisClass, expectedResultType, resolver, errorMessages);
    }

    @Override
    public TypeAST resultType() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public <T> T accept(CodeVisitor<T> visitor) {
        return visitor.visitUnary(this);
    }

    public String getOperatorText() {
        switch(operator) {
            case OPERATOR_SIGN_POS:
                return "+";
            case OPERATOR_SIGN_NEG:
                return "-";
            case OPERATOR_BIN_COMP:
                return "~";
            case OPERATOR_LOG_COMP:
                return "!";
        }
        
        return null;
    }
}
