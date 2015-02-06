package jasy.lang.ast;

import jasy.runtime.asm.CommonClassTransformer;

public interface MemberAST extends AST {
    void accept(MemberVisitor visitor);
    void populate(CommonClassTransformer transformer);
}
