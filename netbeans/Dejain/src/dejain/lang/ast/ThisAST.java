package dejain.lang.ast;

import dejain.lang.ASMCompiler;
import dejain.lang.ClassResolver;
import java.util.Hashtable;
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
    public void accept(CodeVisitor visitor) {
        visitor.visitThis(this);
    }
}
