package jasy.lang.ast;

import java.util.stream.Collectors;

public class ExpressionFlattener implements CodeVisitor<ExpressionAST> {
    private QuoteFlattener quoteFlattener;
    private boolean asExpression;

    public ExpressionFlattener(QuoteFlattener quoteFlattener, boolean asExpression) {
        this.quoteFlattener = quoteFlattener;
        this.asExpression = asExpression;
    }
    
    private ExpressionAST getAsExpression(ExpressionAST ctx) {
        return ctx.accept(new ExpressionFlattener(quoteFlattener, true));
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
        return new BinaryExpressionAST(ctx.getRegion(), ctx.operator, getAsExpression(ctx.lhs), getAsExpression(ctx.rhs));
    }

    @Override
    public ExpressionAST visitInvocation(InvocationAST ctx) {
        return new InvocationAST(
            ctx.getRegion(), 
            ctx.target != null ? getAsExpression(ctx.target) : null, 
            ctx.declaringClass, 
            ctx.methodName, 
            ctx.arguments.stream().map(a -> getAsExpression(a)).collect(Collectors.toList()), 
            null);
    }

    @Override
    public ExpressionAST visitFieldSet(FieldSetAST ctx) {
        return new FieldSetAST(
            ctx.getRegion(), 
            ctx.target != null ? getAsExpression(ctx.target) : null, 
            ctx.declaringClass,
            ctx.fieldName,
            getAsExpression(ctx.value));
    }

    @Override
    public ExpressionAST visitMetaExpression(MetaExpressionAST ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ExpressionAST visitThis(ThisAST ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ExpressionAST visitFieldGet(FieldGetAST ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ExpressionAST visitVariableDeclaration(VariableDeclarationAST ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ExpressionAST visitLookup(LookupAST ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ExpressionAST visitVariableAssignment(VariableAssignmentAST ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ExpressionAST visitRootExpression(RootExpressionAST ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ExpressionAST visitQuote(QuoteAST ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ExpressionAST visitBlock(BlockAST ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ExpressionAST visitNew(NewAST ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ExpressionAST visitArray(ArrayAST ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ExpressionAST visitNull(NullAST ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ExpressionAST visitTypecast(TypecastAST ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ExpressionAST visitGetClass(GetClassAST ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
