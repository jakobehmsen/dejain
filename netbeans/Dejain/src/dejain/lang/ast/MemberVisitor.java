package dejain.lang.ast;

public interface MemberVisitor {
    void visitMethod(MethodContext ctx);
    void visitField(FieldContext ctx);
}
