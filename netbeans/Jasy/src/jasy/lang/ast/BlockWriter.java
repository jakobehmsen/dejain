package jasy.lang.ast;

import jasy.lang.ASMCompiler.Region;
import java.util.ArrayList;

public class BlockWriter implements CodeVisitor<Object> {
    private Region firstRegion;
    private Region lastRegion;
    private ArrayList<CodeAST> statements = new ArrayList<>();
    
    private void updateRegion(CodeAST ctx) {
        if(firstRegion == null)
            firstRegion = ctx.getRegion();
        
        lastRegion = ctx.getRegion();
    }

    @Override
    public Object visitReturn(ReturnAST ctx) {
        updateRegion(ctx);
        statements.add(ctx);
        return null;
    }
    
    public BlockAST getBlock() {
        return new BlockAST(new Region(firstRegion.start, lastRegion.end), statements);
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
    public Object visitBoolean(BooleanLiteralAST ctx) {
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
        statements.add(ctx);
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
        statements.add(ctx);
        return null;
    }

    @Override
    public Object visitQuote(QuoteAST ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitBlock(BlockAST ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitInjectionBlock(InjectionBlockAST ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitWhile(WhileAST ctx) {
        statements.add(ctx);
        return null;
    }

    @Override
    public Object visitIfElse(IfElseAST ctx) {
        statements.add(ctx);
        return null;
    }
    
}
