package jasy.lang.ast;

import java.util.stream.Collectors;

public class ExpressionFlattener implements CodeVisitor<ExpressionAST> {
    private QuoteFlattener quoteFlattener;

    public ExpressionFlattener(QuoteFlattener quoteFlattener) {
        this.quoteFlattener = quoteFlattener;
    }
    
    private ExpressionAST getExpression(ExpressionAST ctx) {
        return ctx.accept(new ExpressionFlattener(quoteFlattener));
    }

    @Override
    public ExpressionAST visitReturn(ReturnAST ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ExpressionAST visitStringLiteral(StringLiteralAST ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ExpressionAST visitIntLiteral(IntLiteralAST ctx) {
        return ctx;
    }

    @Override
    public ExpressionAST visitLongLiteral(LongLiteralAST ctx) {
        return ctx;
    }

    @Override
    public ExpressionAST visitBinaryExpression(BinaryExpressionAST ctx) {
        return new BinaryExpressionAST(ctx.getRegion(), ctx.operator, getExpression(ctx.lhs), getExpression(ctx.rhs));
    }

    @Override
    public ExpressionAST visitInvocation(InvocationAST ctx) {
        return new InvocationAST(
            ctx.getRegion(), 
            ctx.target != null ? getExpression(ctx.target) : null, 
            ctx.declaringClass, 
            ctx.methodName, 
            ctx.arguments.stream().map(a -> getExpression(a)).collect(Collectors.toList()), 
            null);
    }

    @Override
    public ExpressionAST visitFieldSet(FieldSetAST ctx) {
        return new FieldSetAST(
            ctx.getRegion(), 
            ctx.target != null ? getExpression(ctx.target) : null, 
            ctx.declaringClass,
            ctx.fieldName,
            getExpression(ctx.value));
    }

    @Override
    public ExpressionAST visitMetaExpression(MetaExpressionAST ctx) {
        return new MetaExpressionAST(ctx.getRegion(), getExpression(ctx.body));
    }

    @Override
    public ExpressionAST visitThis(ThisAST ctx) {
        return ctx;
    }

    @Override
    public ExpressionAST visitFieldGet(FieldGetAST ctx) {
        return new FieldGetAST(
            ctx.getRegion(), 
            ctx.target != null ? getExpression(ctx.target) : null,
            ctx.fieldName);
    }

    @Override
    public ExpressionAST visitVariableDeclaration(VariableDeclarationAST ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ExpressionAST visitLookup(LookupAST ctx) {
        return ctx;
    }

    @Override
    public ExpressionAST visitVariableAssignment(VariableAssignmentAST ctx) {
        return new VariableAssignmentAST(ctx.getRegion(), ctx.name, getExpression(ctx.value));
    }

    @Override
    public ExpressionAST visitRootExpression(RootExpressionAST ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ExpressionAST visitQuote(QuoteAST ctx) {
        return ctx.ast.accept(quoteFlattener);
    }

    @Override
    public ExpressionAST visitBlock(BlockAST ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ExpressionAST visitNew(NewAST ctx) {
        return new NewAST(ctx.getRegion(), ctx.c, ctx.arguments.stream().map(a -> getExpression(a)).collect(Collectors.toList()));
    }

    @Override
    public ExpressionAST visitArray(ArrayAST ctx) {
        return new ArrayAST(ctx.getRegion(), ctx.type, ctx.elements.stream().map(a -> getExpression(a)).collect(Collectors.toList()));
    }

    @Override
    public ExpressionAST visitNull(NullAST ctx) {
        return ctx;
    }

    @Override
    public ExpressionAST visitTypecast(TypecastAST ctx) {
        return new TypecastAST(ctx.getRegion(), getExpression(ctx.expression), ctx.type);
    }

    @Override
    public ExpressionAST visitGetClass(GetClassAST ctx) {
        return ctx;
    }

    @Override
    public ExpressionAST visitMetaCode(MetaCodeAST ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ExpressionAST visitInject(InjectAST ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ExpressionAST visitInjectionBlock(InjectionBlockAST ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ExpressionAST visitWhile(WhileAST ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ExpressionAST visitIfElse(IfElseAST ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ExpressionAST visitBoolean(BooleanLiteralAST ctx) {
        return ctx;
    }

    @Override
    public ExpressionAST visitUnary(UnaryExpression ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ExpressionAST visitIncDec(IncDecExpression ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ExpressionAST visitFloatLiteral(FloatLiteralAST ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ExpressionAST visitDoubleLiteral(DoubleLiteralAST ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
