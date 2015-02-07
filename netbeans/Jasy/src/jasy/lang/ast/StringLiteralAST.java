package jasy.lang.ast;

import jasy.lang.ASMCompiler;
import jasy.lang.ClassResolver;
import java.util.List;

public class StringLiteralAST extends AbstractAST implements ExpressionAST {
    public String value;
    
    public StringLiteralAST(ASMCompiler.Region region, String value) {
        super(region);
        this.value = value;
    }

    @Override
    public TypeAST resultType() {
        return new NameTypeAST(null, String.class);
    }

    @Override
    public <T> T accept(CodeVisitor<T> visitor) {
        return visitor.visitStringLiteral(this);
    }

    @Override
    public void resolve(Scope thisClass, TypeAST expectedResultType, ClassResolver resolver, List<ASMCompiler.Message> errorMessages) {
    
    }
}
