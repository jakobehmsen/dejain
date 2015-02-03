package dejain.lang.ast;

import dejain.lang.ASMCompiler;
import dejain.lang.ClassResolver;
import java.util.List;

public class FieldGetAST extends AbstractAST implements ExpressionAST {
    public ExpressionAST target;
    public String fieldName;
    public TypeAST fieldType;

    public FieldGetAST(ASMCompiler.Region region, ExpressionAST target, String fieldName) {
        super(region);
        this.target = target;
        this.fieldName = fieldName;
    }

    @Override
    public void resolve(Scope thisClass, TypeAST expectedResultType, ClassResolver resolver, List<ASMCompiler.Message> errorMessages) {
        // At this point, a lookup may implicate either a field get or a "match-captured-variable".
        
//        target.resolve(thisClass, expectedResultType, resolver, errorMessages);
//        fieldType = target.resultType().getFieldType(fieldName);
    }

    @Override
    public TypeAST resultType() {
        return fieldType;
    }

    @Override
    public <T> T accept(CodeVisitor<T> visitor) {
        return visitor.visitFieldGet(this);
    }
}
