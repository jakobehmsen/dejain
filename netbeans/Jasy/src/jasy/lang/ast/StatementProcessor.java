package jasy.lang.ast;

public class StatementProcessor extends CodeMapper {
    private CodeMapper expressionMapper;

    public StatementProcessor(CodeMapper expressionMapper) {
        this.expressionMapper = expressionMapper;
    }

    @Override
    protected ExpressionAST getExpression(CodeAST ctx) {
        return expressionMapper.getExpression(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CodeAST visitRootExpression(RootExpressionAST ctx) {
        return getExpression(ctx.expression);
    }
}
