package jasy.lang.ast;

import java.util.ArrayList;
import java.util.Arrays;

public class StatementFlattener implements CodeVisitor<Object> {
    private QuoteFlattener quoteFlattener;

    public StatementFlattener(QuoteFlattener quoteFlattener) {
        this.quoteFlattener = quoteFlattener;
    }

    @Override
    public Object visitReturn(ReturnAST ctx) {
        quoteFlattener.flattenedCode.add(new ReturnAST(ctx.getRegion(), getExpression(ctx.expression)));
        return null;
    }

    @Override
    public Object visitStringLiteral(StringLiteralAST ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitIntLiteral(IntLiteralAST ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitLongLiteral(LongLiteralAST ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitBinaryExpression(BinaryExpressionAST ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitInvocation(InvocationAST ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitFieldSet(FieldSetAST ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitMetaExpression(MetaExpressionAST ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitThis(ThisAST ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitFieldGet(FieldGetAST ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitVariableDeclaration(VariableDeclarationAST ctx) {
        quoteFlattener.flattenedCode.add(new VariableDeclarationAST(ctx.getRegion(), ctx.name, ctx.type, getExpression(ctx.value)));
        return null;
    }

    @Override
    public Object visitLookup(LookupAST ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitVariableAssignment(VariableAssignmentAST ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitRootExpression(RootExpressionAST ctx) {
        quoteFlattener.flattenedCode.add(new RootExpressionAST(ctx.getRegion(), getExpression(ctx.expression)));
        return null;
    }

    @Override
    public Object visitQuote(QuoteAST ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitBlock(BlockAST ctx) {
        for(CodeAST statement: ctx.statements)
            statement.accept(this);
        return null;
    }

    @Override
    public Object visitNew(NewAST ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitArray(ArrayAST ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitNull(NullAST ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitTypecast(TypecastAST ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitGetClass(GetClassAST ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitMetaCode(MetaCodeAST ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitInject(InjectAST ctx) {
        String statementVarName = quoteFlattener.getCurrentStaVarName();

        quoteFlattener.flattenedCode.add(new InvocationAST(
            null, 
            new LookupAST(null, new StringLiteralAST(null, statementVarName)), 
            null, 
            "add", 
            Arrays.asList(getExpression(ctx.expression)), 
            null
        ));

        return null;
    }

    @Override
    public Object visitInjectionBlock(InjectionBlockAST ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private ExpressionAST getExpression(ExpressionAST ctx) {
        return ctx.accept(new ExpressionFlattener(quoteFlattener));
    }

    @Override
    public Object visitWhile(WhileAST ctx) {
        quoteFlattener.flattenedCode.add(new WhileAST(ctx.getRegion(), getExpression(ctx.condition), flatten(ctx.body)));
        return null;
    }
    
    private CodeAST flatten(CodeAST ctx) {
        ArrayList<CodeAST> flattened = new ArrayList<>();
        ctx.accept(new StatementFlattener(new QuoteFlattener(flattened)));
        return new BlockAST(null, flattened);
    }

    @Override
    public Object visitIfElse(IfElseAST ctx) {
        quoteFlattener.flattenedCode.add(new IfElseAST(ctx.getRegion(), getExpression(ctx.condition), flatten(ctx.ifTrueBody), flatten(ctx.ifFalseBody)));
        return null;
    }

    @Override
    public Object visitBoolean(BooleanLiteralAST ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitUnary(UnaryExpression ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitIncDec(IncDecExpression ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitFloatLiteral(FloatLiteralAST ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitDoubleLiteral(DoubleLiteralAST ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
