package dejain.lang.ast;

import dejain.lang.ASMCompiler;
import dejain.lang.ASMCompiler.Region;
import dejain.lang.ClassResolver;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinaryExpressionContext extends AbstractContext implements ExpressionContext {
    public static final int OPERATOR_ADD = 0;
    public static final int OPERATOR_SUB = 1;
    
    public int operator;
    public ExpressionContext lhs;
    public ExpressionContext rhs;

    public BinaryExpressionContext(Region region, int operator, ExpressionContext lhs, ExpressionContext rhs) {
        super(region);
        this.operator = operator;
        this.lhs = lhs;
        this.rhs = rhs;
    }
    
    @Override
    public Class<?> resultType() {
        return resultType;
    }

    @Override
    public void accept(CodeVisitor visitor) {
        visitor.visitBinaryExpression(this);
    }
    
    private Class<?> resultType;

    @Override
    public void resolve(ClassResolver resolver, List<ASMCompiler.Message> errorMessages) {
        resultType = Void.class;
        
        lhs.resolve(resolver, errorMessages);
        rhs.resolve(resolver, errorMessages);
        
        if(lhs.resultType() == String.class || rhs.resultType() == String.class) {
            switch(operator) {
                case OPERATOR_ADD:
                    if(lhs.resultType() != String.class)
                        lhs = expressionAsString(lhs);
                    if(rhs.resultType() != String.class)
                        rhs = expressionAsString(rhs);
                    resultType = String.class;
                    break;
                default:
                    errorMessages.add(new ASMCompiler.Message(getRegion(), "Bad operand types for binary operator '" + getOperatorString() + "'"));
                    break;
            }
        } else if(lhs.resultType() == int.class && rhs.resultType() == int.class) {
            resultType = int.class;
        }
    }
    
    private String getOperatorString() {
        switch(operator) {
            case OPERATOR_ADD: return "+";
            case OPERATOR_SUB: return "-";
        }
        
        return null;
    }
    
    private ExpressionContext expressionAsString(ExpressionContext ctx) {
        switch(ctx.resultType().getSimpleName()) {
            case "int":
                return new InvocationContext(ctx.getRegion(), null, new TypeContext(ctx.getRegion(), Integer.class), "toString", Arrays.asList(ctx), String.class);
            default:
                return new InvocationContext(ctx.getRegion(), ctx, null, "toString", Collections.emptyList(), String.class);
        }
    }
}
