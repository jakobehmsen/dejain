package jasy.lang.ast;

import jasy.lang.ASMCompiler;
import jasy.lang.ClassResolver;
import java.util.List;

public class IncDecExpression extends AbstractAST implements ExpressionAST {
    public static final int TIMING_PRE = 0;
    public static final int TIMING_POST = 1;
    public static final int OPERATOR_INC = 0;
    public static final int OPERATOR_DEC = 1;
    
    public int timing;
    public int operator;
    public ExpressionAST operand;

    public IncDecExpression(ASMCompiler.Region region, int timing, int operator, ExpressionAST operand) {
        super(region);
        this.timing = timing;
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
        return visitor.visitIncDec(this);
    }

    public String getOperatorText() {
        switch(operator) {
            case OPERATOR_INC:
                return "++";
            case OPERATOR_DEC:
                return "--";
        }
        
        return null;
    }
}
