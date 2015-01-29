package dejain.lang.ast;

import dejain.lang.ASMCompiler;
import dejain.lang.ClassResolver;
import java.util.List;

public class FieldGetContext extends AbstractContext implements ExpressionContext {
    public ExpressionContext target;
    public String fieldName;
    public TypeContext fieldType;

    public FieldGetContext(ASMCompiler.Region region, ExpressionContext target, String fieldName) {
        super(region);
        this.target = target;
        this.fieldName = fieldName;
    }

    @Override
    public void resolve(ClassContext thisClass, ClassResolver resolver, List<ASMCompiler.Message> errorMessages) {
        target.resolve(thisClass, resolver, errorMessages);
        fieldType = target.resultType().getFieldType(fieldName);
    }

    @Override
    public TypeContext resultType() {
        return fieldType;
    }

    @Override
    public void accept(CodeVisitor visitor) {
        visitor.visitFieldGet(this);
    }
}
