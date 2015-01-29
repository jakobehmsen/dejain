package dejain.lang.ast;

import dejain.lang.ASMCompiler;
import dejain.lang.ClassResolver;
import java.util.List;

public class ThisContext extends AbstractContext implements ExpressionContext {
    private ThisTypeContext resultType;

    public ThisContext(ASMCompiler.Region region) {
        super(region);
        resultType = new ThisTypeContext(region);
    }

    @Override
    public void resolve(ClassContext thisClass, ClassResolver resolver, List<ASMCompiler.Message> errorMessages) {
        resultType.resolve(thisClass, resolver, errorMessages);
    }

    @Override
    public TypeContext resultType() {
        return resultType;
    }

    @Override
    public void accept(CodeVisitor visitor) {
        visitor.visitThis(this);
    }
}
