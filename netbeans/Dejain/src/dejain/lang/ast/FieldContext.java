package dejain.lang.ast;

import dejain.lang.ASMCompiler;
import dejain.lang.CommonClassResolver;
import java.util.List;

public class FieldContext implements MemberContext {
    public boolean isAdd;
    public FieldSelectorContext selector;
    public ExpressionContext value;

    public FieldContext(boolean isAdd, FieldSelectorContext selector, ExpressionContext value) {
        this.isAdd = isAdd;
        this.selector = selector;
        this.value = value;
    }
    
    @Override
    public void accept(MemberVisitor visitor) {
        visitor.visitField(this);
    }

    @Override
    public void resolve(CommonClassResolver resolver, List<ASMCompiler.Message> errorMessages) {
        selector.resolve(resolver, errorMessages);
        value.resolve(resolver, errorMessages);
    }
}
