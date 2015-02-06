package jasy.lang.ast;

import jasy.lang.ASMCompiler;
import jasy.lang.ClassResolver;
import java.util.List;

public class ThisAST extends AbstractAST implements ExpressionAST {
    private ThisTypeAST resultType;

    public ThisAST(ASMCompiler.Region region) {
        super(region);
        resultType = new ThisTypeAST(region);
    }

    @Override
    public void resolve(Scope thisClass, TypeAST expectedResultType, ClassResolver resolver, List<ASMCompiler.Message> errorMessages) {
        resultType.resolve(thisClass, expectedResultType, resolver, errorMessages);
    }

    @Override
    public TypeAST resultType() {
        return resultType;
    }

    @Override
    public <T> T accept(CodeVisitor<T> visitor) {
        return visitor.visitThis(this);
    }
}
