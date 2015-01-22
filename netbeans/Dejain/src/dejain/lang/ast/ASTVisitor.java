package dejain.lang.ast;

public interface ASTVisitor {

    public void visitCode(ASTBehavior aThis);

    public void visitReturn(ASTReturn aThis);

    public void visitStringLiteral(ASTStringLiteral aThis);

    public void visitIntLiteral(ASTIntLiteral aThis);

    public void visitMethodAdd(ASTMethodAdd aThis);

    public void visitClass(ASTClass aThis);
    
}
