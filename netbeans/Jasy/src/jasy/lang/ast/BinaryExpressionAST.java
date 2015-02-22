package jasy.lang.ast;

import jasy.lang.ASMCompiler;
import jasy.lang.ASMCompiler.Region;
import jasy.lang.ClassResolver;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinaryExpressionAST extends AbstractAST implements ExpressionAST {
    public static final int OPERATOR_ADD = 0;
    public static final int OPERATOR_SUB = 1;
    public static final int OPERATOR_MULT = 2;
    public static final int OPERATOR_DIV = 3;
    public static final int OPERATOR_REM = 4;
    public static final int OPERATOR_LT = 5;
    public static final int OPERATOR_LTE = 6;
    public static final int OPERATOR_GT = 7;
    public static final int OPERATOR_GTE = 8;
    public static final int OPERATOR_EQ = 9;
    public static final int OPERATOR_NE = 10;
    
    public int operator;
    public ExpressionAST lhs;
    public ExpressionAST rhs;

    public BinaryExpressionAST(Region region, int operator, ExpressionAST lhs, ExpressionAST rhs) {
        super(region);
        this.operator = operator;
        this.lhs = lhs;
        this.rhs = rhs;
    }
    
    @Override
    public TypeAST resultType() {
        return resultType;
    }

    @Override
    public <T> T accept(CodeVisitor<T> visitor) {
        return visitor.visitBinaryExpression(this);
    }
    
    private TypeAST resultType;

    @Override
    public void resolve(Scope thisClass, TypeAST expectedResultType, ClassResolver resolver, List<ASMCompiler.Message> errorMessages) {
//        resultType = new NameTypeAST(getRegion(), Void.class);
//        
        lhs.resolve(thisClass, expectedResultType, resolver, errorMessages);
        rhs.resolve(thisClass, expectedResultType, resolver, errorMessages);
//        
//        if(lhs.resultType().getDescriptor().equals("Ljava/lang/String;") || rhs.resultType().getDescriptor().equals("Ljava/lang/String;")) {
//            switch(operator) {
//                case OPERATOR_ADD:
//                    if(!lhs.resultType().getDescriptor().equals("Ljava/lang/String;"))
//                        lhs = expressionAsString(lhs);
//                    if(!rhs.resultType().getDescriptor().equals("Ljava/lang/String;"))
//                        rhs = expressionAsString(rhs);
//                    resultType = new NameTypeAST(getRegion(), String.class);
//                    break;
//                default:
//                    errorMessages.add(new ASMCompiler.Message(getRegion(), "Bad operand types for binary operator '" + getOperatorString() + "'"));
//                    break;
//            }
//        } else if(lhs.resultType().getSimpleName().equals("int") && rhs.resultType().getSimpleName().equals("int")) {
//            resultType = new NameTypeAST(getRegion(), int.class);
//        }
    }
    
    public String getOperatorString() {
        switch(operator) {
            case OPERATOR_ADD: return "+";
            case OPERATOR_SUB: return "-";
            case OPERATOR_MULT: return "*";
            case OPERATOR_DIV: return "/";
            case OPERATOR_REM: return "%";
            case OPERATOR_LT: return "<";
            case OPERATOR_LTE: return "<=";
            case OPERATOR_GT: return ">";
            case OPERATOR_GTE: return ">=";
            case OPERATOR_EQ: return "==";
            case OPERATOR_NE: return "!=";
        }
        
        return null;
    }
    
    private ExpressionAST expressionAsString(ExpressionAST ctx) {
        switch(ctx.resultType().getSimpleName()) {
            case "int":
                return new InvocationAST(ctx.getRegion(), new NameTypeAST(ctx.getRegion(), Integer.class), "toString", Arrays.asList(ctx));
            default:
                return new InvocationAST(ctx.getRegion(), ctx, "toString", Collections.emptyList());
        }
    }
}
