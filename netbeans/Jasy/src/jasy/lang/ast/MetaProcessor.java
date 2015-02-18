package jasy.lang.ast;

public class MetaProcessor extends CodeMapper {
    @Override
    public ExpressionAST visitQuote(QuoteAST ctx) {
        return (ExpressionAST)ctx.ast.accept(new QuoteProcessor());
    }
}
