package jasy.lang.ast;

import java.util.List;
import java.util.stream.Collectors;

public class CodeMapper implements CodeVisitor<CodeAST> {
    protected CodeAST getStatement(CodeAST ctx) {
        return ctx.accept(this);
    }
    
    protected ExpressionAST getExpression(CodeAST ctx) {
        return (ExpressionAST)ctx.accept(this);
    }

    @Override
    public CodeAST visitReturn(ReturnAST ctx) {
        return new ReturnAST(ctx.getRegion(), getExpression(ctx.expression));
    }

    @Override
    public CodeAST visitStringLiteral(StringLiteralAST ctx) {
        return ctx;
    }

    @Override
    public CodeAST visitIntLiteral(IntLiteralAST ctx) {
        return ctx;
    }

    @Override
    public CodeAST visitLongLiteral(LongLiteralAST ctx) {
        return ctx;
    }

    @Override
    public CodeAST visitBoolean(BooleanLiteralAST ctx) {
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
            ctx.target, 
            ctx.methodName, 
            ctx.arguments.stream().map(a -> getExpression(a)).collect(Collectors.toList()));
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
            ctx.target,
            ctx.fieldName);
    }

    @Override
    public CodeAST visitVariableDeclaration(VariableDeclarationAST ctx) {
        ExpressionAST value = ctx.value != null ? getExpression(ctx.value) : null;
        return new VariableDeclarationAST(ctx.getRegion(), ctx.name, ctx.type, value);
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
    public CodeAST visitRootExpression(RootExpressionAST ctx) {
        return new RootExpressionAST(ctx.getRegion(), getExpression(ctx.expression));
    }

    @Override
    public ExpressionAST visitQuote(QuoteAST ctx) {
        return ctx;
    }

    @Override
    public CodeAST visitBlock(BlockAST ctx) {
        List<CodeAST> statements = ctx.statements.stream().map(s -> getStatement(ctx)).collect(Collectors.toList());
        return new BlockAST(ctx.getRegion(), statements);
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
    public CodeAST visitMetaCode(MetaCodeAST ctx) {
        return new MetaCodeAST(ctx.getRegion(), getStatement(ctx.body));
    }

    @Override
    public CodeAST visitInject(InjectAST ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CodeAST visitInjectionBlock(InjectionBlockAST ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CodeAST visitWhile(WhileAST ctx) {
        return new WhileAST(ctx.getRegion(), getExpression(ctx.condition), getStatement(ctx.body));
    }

    @Override
    public CodeAST visitIfElse(IfElseAST ctx) {
        return new IfElseAST(ctx.getRegion(), getExpression(ctx.condition), getStatement(ctx.ifTrueBody), getStatement(ctx.ifFalseBody));
    }

    @Override
    public CodeAST visitUnary(UnaryExpression ctx) {
        return new UnaryExpression(ctx.getRegion(), ctx.operator, getExpression(ctx.operand));
    }

    @Override
    public CodeAST visitIncDec(IncDecExpression ctx) {
        return new IncDecExpression(ctx.getRegion(), ctx.timing, ctx.operator, getExpression(ctx.operand));
    }

    @Override
    public CodeAST visitFloatLiteral(FloatLiteralAST ctx) {
        return ctx;
    }

    @Override
    public CodeAST visitDoubleLiteral(DoubleLiteralAST ctx) {
        return ctx;
    }

    @Override
    public CodeAST visitAmbiguousName(AmbiguousNameAST ctx) {
        List<LookupAST> nameParts = ctx.nameParts.stream()
            .map(p -> (LookupAST)getExpression(p))
            .collect(Collectors.toList());
        
        return new AmbiguousNameAST(ctx.getRegion(), nameParts);
    }
}
