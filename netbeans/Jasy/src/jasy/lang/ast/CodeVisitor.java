package jasy.lang.ast;

public interface CodeVisitor<T> {
    T visitReturn(ReturnAST ctx);
    T visitStringLiteral(StringLiteralAST ctx);
    T visitIntLiteral(IntLiteralAST ctx);
    T visitLongLiteral(LongLiteralAST ctx);
    T visitBinaryExpression(BinaryExpressionAST ctx);
    T visitInvocation(InvocationAST ctx);
    T visitFieldSet(FieldSetAST ctx);
    T visitMetaExpression(MetaExpressionAST ctx);
    T visitThis(ThisAST ctx);
    T visitFieldGet(FieldGetAST ctx);
    T visitVariableDeclaration(VariableDeclarationAST ctx);
    T visitLookup(LookupAST ctx);
    T visitVariableAssignment(VariableAssignmentAST ctx);
    T visitRootExpression(RootExpressionAST ctx);
    T visitQuote(QuoteAST ctx);
    T visitBlock(BlockAST ctx);
    T visitNew(NewAST ctx);
    T visitArray(ArrayAST ctx);
    T visitNull(NullAST ctx);
    T visitTypecast(TypecastAST ctx);
    T visitGetClass(GetClassAST ctx);
    T visitMetaCode(MetaCodeAST ctx);
    T visitInject(InjectAST ctx);
    T visitInjectionBlock(InjectionBlockAST ctx);
}
