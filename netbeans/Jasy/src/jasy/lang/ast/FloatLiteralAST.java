package jasy.lang.ast;

import jasy.lang.ASMCompiler;
import jasy.lang.ClassResolver;
import java.util.List;

public class FloatLiteralAST extends AbstractAST implements ExpressionAST {
    public float value;
    
    public FloatLiteralAST(ASMCompiler.Region region, float value) {
        super(region);
        this.value = value;
    }

    @Override
    public TypeAST resultType() {
        return new NameTypeAST(null, String.class);
    }

    @Override
    public <T> T accept(CodeVisitor<T> visitor) {
        return visitor.visitFloatLiteral(this);
    }

    @Override
    public void resolve(Scope thisClass, TypeAST expectedResultType, ClassResolver resolver, List<ASMCompiler.Message> errorMessages) {
    
    }
}
