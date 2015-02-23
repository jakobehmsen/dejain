package jasy.lang.ast;

import jasy.lang.ASMCompiler;
import jasy.lang.ClassResolver;
import java.util.List;

public class BooleanLiteralAST extends AbstractAST implements ExpressionAST {
    public boolean value;

    public BooleanLiteralAST(ASMCompiler.Region region, boolean value) {
        super(region);
        this.value = value;
    }

    @Override
    public void resolve(Scope thisClass, TypeAST expectedResultType, ClassResolver resolver, ClassLoader classLoader, List<ASMCompiler.Message> errorMessages) {
        
    }

    @Override
    public TypeAST resultType() {
        return new NameTypeAST(null, boolean.class);
    }

    @Override
    public <T> T accept(CodeVisitor<T> visitor) {
        return visitor.visitBoolean(this);
    }
}
