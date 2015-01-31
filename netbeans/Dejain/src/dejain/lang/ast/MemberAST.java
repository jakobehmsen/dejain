package dejain.lang.ast;

import dejain.runtime.asm.CommonClassTransformer;

public interface MemberAST extends AST {
    void accept(MemberVisitor visitor);
    void populate(CommonClassTransformer transformer);
}
