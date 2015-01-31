package dejain.lang.ast;

public interface MemberVisitor {
    void visitMethod(MethodAST ctx);
    void visitField(FieldAST ctx);
}
