package jasy.lang.ast;

import jasy.lang.ASMCompiler;
import jasy.lang.ClassResolver;
import java.util.List;

public class IntLiteralAST extends AbstractAST implements ExpressionAST {
    public int value;
    
    public IntLiteralAST(ASMCompiler.Region region, int value) {
        super(region);
        this.value = value;
    }

    @Override
    public TypeAST resultType() {
        return new NameTypeAST(null, String.class);
    }

    @Override
    public <T> T accept(CodeVisitor<T> visitor) {
        return visitor.visitIntLiteral(this);
    }

    @Override
    public void resolve(Scope thisClass, TypeAST expectedResultType, ClassResolver resolver, List<ASMCompiler.Message> errorMessages) {
    
    }
}
