package jasy.lang.ast;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javassist.bytecode.analysis.ControlFlow.Block;

public class QuoteFlattener implements CodeVisitor<ExpressionAST> {
    public List<CodeAST> flattenedCode;

    public QuoteFlattener(List<CodeAST> flattenedCode) {
        this.flattenedCode = flattenedCode;
    }
    
    private int blockCount = 0;
    private ArrayDeque<String> statementVarNameStack = new ArrayDeque<>();

    public String getCurrentStaVarName() {
        return statementVarNameStack.peek();
    }

    @Override
    public ExpressionAST visitBlock(BlockAST ctx) {
        String statementVarName = "$blockStatements" + blockCount;
        
        statementVarNameStack.push(statementVarName);
        
        flattenedCode.add(new VariableDeclarationAST(null, statementVarName, 
            new NameTypeAST(null, List.class), 
            new NewAST(null, new NameTypeAST(null, ArrayList.class))
        ));
        
        for(CodeAST statement: ctx.statements) {
            ExpressionAST quotedStatement = statement.accept(this);
            
            if(quotedStatement != null) {
                flattenedCode.add(new InvocationAST(
                    null, 
                    new LookupAST(null, statementVarName), 
                    null, 
                    "add", 
                    Arrays.asList(quotedStatement), 
                    null
                ));
            }
        }
        
        statementVarNameStack.pop();
        
        return new NewAST(
            null, 
            new NameTypeAST(null, Block.class), 
            Arrays.asList(new NullAST(null), new LookupAST(null, statementVarName))
        );
    }

    @Override
    public ExpressionAST visitMetaCode(MetaCodeAST ctx) {
        ctx.accept(new StatementFlattener(this));
        
        return null;
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ExpressionAST visitLongLiteral(LongLiteralAST ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ExpressionAST visitBinaryExpression(BinaryExpressionAST ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ExpressionAST visitInvocation(InvocationAST ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ExpressionAST visitFieldSet(FieldSetAST ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
