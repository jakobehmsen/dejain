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
    public TypeContext resultType() {
        return resultType;
    }

    @Override
    public void accept(CodeVisitor visitor) {
        visitor.visitBinaryExpression(this);
    }
    
    private TypeContext resultType;

    @Override
    public void resolve(ClassContext thisClass, TypeContext expectedResultType, ClassResolver resolver, List<ASMCompiler.Message> errorMessages) {
        resultType = new NameTypeContext(getRegion(), Void.class);
        
        lhs.resolve(thisClass, expectedResultType, resolver, errorMessages);
        rhs.resolve(thisClass, expectedResultType, resolver, errorMessages);
        
        if(lhs.resultType().getDescriptor().equals("Ljava/lang/String;") || rhs.resultType().getDescriptor().equals("Ljava/lang/String;")) {
            switch(operator) {
                case OPERATOR_ADD:
                    if(!lhs.resultType().getDescriptor().equals("Ljava/lang/String;"))
                        lhs = expressionAsString(lhs);
                    if(!rhs.resultType().getDescriptor().equals("Ljava/lang/String;"))
                        rhs = expressionAsString(rhs);
                    resultType = new NameTypeContext(getRegion(), String.class);
                    break;
                default:
                    errorMessages.add(new ASMCompiler.Message(getRegion(), "Bad operand types for binary operator '" + getOperatorString() + "'"));
                    break;
            }
        } else if(lhs.resultType().getSimpleName().equals("int") && rhs.resultType().getSimpleName().equals("int")) {
            resultType = new NameTypeContext(getRegion(), int.class);
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
                return new InvocationContext(ctx.getRegion(), null, new NameTypeContext(ctx.getRegion(), Integer.class), "toString", Arrays.asList(ctx), new NameTypeContext(ctx.getRegion(), String.class));
            default:
                return new InvocationContext(ctx.getRegion(), ctx, null, "toString", Collections.emptyList(), new NameTypeContext(ctx.getRegion(), String.class));
        }
    }
}
