package dejain.lang.ast;

import dejain.runtime.asm.CommonClassTransformer;

public interface MemberContext extends Context {
    void accept(MemberVisitor visitor);
    void populate(CommonClassTransformer transformer);
}
