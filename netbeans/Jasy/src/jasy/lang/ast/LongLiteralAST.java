package jasy.lang.ast;

import jasy.lang.ASMCompiler;
import jasy.lang.ClassResolver;
import java.util.List;

public class LongLiteralAST extends AbstractAST implements ExpressionAST {
    public long value;
    
    public LongLiteralAST(ASMCompiler.Region region, long value) {
        super(region);
        this.value = value;
    }

    @Override
    public TypeAST resultType() {
        return new NameTypeAST(null, String.class);
    }

    @Override
    public <T> T accept(CodeVisitor<T> visitor) {
        return visitor.visitLongLiteral(this);
    }

    @Override
    public void resolve(Scope thisClass, TypeAST expectedResultType, ClassResolver resolver, ClassLoader classLoader, List<ASMCompiler.Message> errorMessages) {
    
    }
}
