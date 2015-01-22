package dejain.lang.ast;

public interface MemberContext extends Context {
    void accept(MemberVisitor visitor);
}
