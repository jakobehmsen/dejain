package jasy.lang.ast;

public class CodeAdapter<T> implements CodeVisitor<T> {
    private CodeVisitor<T> visitor;

    public CodeAdapter(CodeVisitor<T> visitor) {
        this.visitor = visitor;
    }

    @Override
    public T visitReturn(ReturnAST ctx) {
        return visitor.visitReturn(ctx);
    }

    @Override
    public T visitStringLiteral(StringLiteralAST ctx) {
        return visitor.visitStringLiteral(ctx);
    }

    @Override
    public T visitIntLiteral(IntLiteralAST ctx) {
        return visitor.visitIntLiteral(ctx);
    }

    @Override
    public T visitLongLiteral(LongLiteralAST ctx) {
        return visitor.visitLongLiteral(ctx);
    }

    @Override
    public T visitBoolean(BooleanLiteralAST ctx) {
        return visitor.visitBoolean(ctx);
    }

    @Override
    public T visitBinaryExpression(BinaryExpressionAST ctx) {
        return visitor.visitBinaryExpression(ctx);
    }

    @Override
    public T visitInvocation(InvocationAST ctx) {
        return visitor.visitInvocation(ctx);
    }

    @Override
    public T visitFieldSet(FieldSetAST ctx) {
        return visitor.visitFieldSet(ctx);
    }

    @Override
    public T visitMetaExpression(MetaExpressionAST ctx) {
        return visitor.visitMetaExpression(ctx);
    }

    @Override
    public T visitThis(ThisAST ctx) {
        return visitor.visitThis(ctx);
    }

    @Override
    public T visitFieldGet(FieldGetAST ctx) {
        return visitor.visitFieldGet(ctx);
    }

    @Override
    public T visitVariableDeclaration(VariableDeclarationAST ctx) {
        return visitor.visitVariableDeclaration(ctx);
    }

    @Override
    public T visitLookup(LookupAST ctx) {
        return visitor.visitLookup(ctx);
    }

    @Override
    public T visitVariableAssignment(VariableAssignmentAST ctx) {
        return visitor.visitVariableAssignment(ctx);
    }

    @Override
    public T visitRootExpression(RootExpressionAST ctx) {
        return visitor.visitRootExpression(ctx);
    }

    @Override
    public T visitQuote(QuoteAST ctx) {
        return visitor.visitQuote(ctx);
    }

    @Override
    public T visitBlock(BlockAST ctx) {
        return visitor.visitBlock(ctx);
    }

    @Override
    public T visitNew(NewAST ctx) {
        return visitor.visitNew(ctx);
    }

    @Override
    public T visitArray(ArrayAST ctx) {
        return visitor.visitArray(ctx);
    }

    @Override
    public T visitNull(NullAST ctx) {
        return visitor.visitNull(ctx);
    }

    @Override
    public T visitTypecast(TypecastAST ctx) {
        return visitor.visitTypecast(ctx);
    }

    @Override
    public T visitGetClass(GetClassAST ctx) {
        return visitor.visitGetClass(ctx);
    }

    @Override
    public T visitMetaCode(MetaCodeAST ctx) {
        return visitor.visitMetaCode(ctx);
    }

    @Override
    public T visitInject(InjectAST ctx) {
        return visitor.visitInject(ctx);
    }

    @Override
    public T visitInjectionBlock(InjectionBlockAST ctx) {
        return visitor.visitInjectionBlock(ctx);
    }

    @Override
    public T visitWhile(WhileAST ctx) {
        return visitor.visitWhile(ctx);
    }

    @Override
    public T visitIfElse(IfElseAST ctx) {
        return visitor.visitIfElse(ctx);
    }

    @Override
    public T visitUnary(UnaryExpression ctx) {
        return visitor.visitUnary(ctx);
    }

    @Override
    public T visitIncDec(IncDecExpression ctx) {
        return visitor.visitIncDec(ctx);
    }
}
