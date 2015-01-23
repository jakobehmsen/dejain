package dejain.lang.ast;

import java.util.List;

public class MethodContext implements MemberContext {
    public boolean isAdd;
    public MethodSelectorContext selector;
    public List<StatementContext> body;

    public MethodContext(boolean isAdd, MethodSelectorContext selector, List<StatementContext> body) {
        this.isAdd = isAdd;
        this.selector = selector;
        this.body = body;
    }

    @Override
    public void accept(MemberVisitor visitor) {
        visitor.visitMethod(this);
    }

    @Override
    public void resolve(dejain.lang.CommonClassResolver resolver, List<dejain.lang.ASMCompiler.Message> errorMessages) {
        selector.resolve(resolver, errorMessages);
        body.forEach(s -> s.resolve(resolver, errorMessages));
    }
}
