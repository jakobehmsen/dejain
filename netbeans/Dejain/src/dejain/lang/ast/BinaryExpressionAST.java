package dejain.lang.ast;

import dejain.lang.ASMCompiler;
import dejain.lang.ASMCompiler.Region;
import dejain.lang.ClassResolver;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinaryExpressionAST extends AbstractAST implements ExpressionAST {
    public static final int OPERATOR_ADD = 0;
    public static final int OPERATOR_SUB = 1;
    
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
        resultType = new NameTypeAST(getRegion(), Void.class);
        
        lhs.resolve(thisClass, expectedResultType, resolver, errorMessages);
        rhs.resolve(thisClass, expectedResultType, resolver, errorMessages);
        
        if(lhs.resultType().getDescriptor().equals("Ljava/lang/String;") || rhs.resultType().getDescriptor().equals("Ljava/lang/String;")) {
            switch(operator) {
                case OPERATOR_ADD:
                    if(!lhs.resultType().getDescriptor().equals("Ljava/lang/String;"))
                        lhs = expressionAsString(lhs);
                    if(!rhs.resultType().getDescriptor().equals("Ljava/lang/String;"))
                        rhs = expressionAsString(rhs);
                    resultType = new NameTypeAST(getRegion(), String.class);
                    break;
                default:
                    errorMessages.add(new ASMCompiler.Message(getRegion(), "Bad operand types for binary operator '" + getOperatorString() + "'"));
                    break;
            }
        } else if(lhs.resultType().getSimpleName().equals("int") && rhs.resultType().getSimpleName().equals("int")) {
            resultType = new NameTypeAST(getRegion(), int.class);
        }
    }
    
    private String getOperatorString() {
        switch(operator) {
            case OPERATOR_ADD: return "+";
            case OPERATOR_SUB: return "-";
        }
        
        return null;
    }
    
    private ExpressionAST expressionAsString(ExpressionAST ctx) {
        switch(ctx.resultType().getSimpleName()) {
            case "int":
                return new InvocationAST(ctx.getRegion(), null, new NameTypeAST(ctx.getRegion(), Integer.class), "toString", Arrays.asList(ctx), new NameTypeAST(ctx.getRegion(), String.class));
            default:
                return new InvocationAST(ctx.getRegion(), ctx, null, "toString", Collections.emptyList(), new NameTypeAST(ctx.getRegion(), String.class));
        }
    }
}
