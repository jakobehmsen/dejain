package jasy.lang.ast;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class QuoteProcessor extends CodeMapper {
    @Override
    public ExpressionAST visitReturn(ReturnAST ctx) {
        ExpressionAST quotedExpression = ctx.expression != null ? getExpression(ctx.expression) : new NullAST(null);
        return new NewAST(ctx.getRegion(), new NameTypeAST(null, ReturnAST.class), Arrays.asList(new NullAST(null), quotedExpression));
    }

    @Override
    public ExpressionAST visitMetaCode(MetaCodeAST ctx) {
        return ctx;
    }

    @Override
    public ExpressionAST visitStringLiteral(StringLiteralAST ctx) {
        return new NewAST(ctx.getRegion(), new NameTypeAST(null, StringLiteralAST.class), Arrays.asList(new NullAST(null), new StringLiteralAST(null, ctx.value)));
    }

    @Override
    public ExpressionAST visitIntLiteral(IntLiteralAST ctx) {
        return new NewAST(ctx.getRegion(), new NameTypeAST(null, IntLiteralAST.class), Arrays.asList(new NullAST(null), new IntLiteralAST(null, ctx.value)));
    }

    @Override
    public ExpressionAST visitLongLiteral(LongLiteralAST ctx) {
        return new NewAST(ctx.getRegion(), new NameTypeAST(null, LongLiteralAST.class), Arrays.asList(new NullAST(null), new LongLiteralAST(null, ctx.value)));
    }

    @Override
    public ExpressionAST visitBoolean(BooleanLiteralAST ctx) {
        return new NewAST(ctx.getRegion(), new NameTypeAST(null, BooleanLiteralAST.class), Arrays.asList(new NullAST(null), new BooleanLiteralAST(null, ctx.value)));
    }
 
    @Override
    public ExpressionAST visitBinaryExpression(BinaryExpressionAST ctx) {
        ExpressionAST quotedLhs = getExpression(ctx.lhs);
        ExpressionAST quotedRhs = getExpression(ctx.rhs);
        return new NewAST(ctx.getRegion(), new NameTypeAST(null, BinaryExpressionAST.class), Arrays.asList(new NullAST(null), new IntLiteralAST(null, ctx.operator), quotedLhs, quotedRhs));
    }

    @Override
    public ExpressionAST visitInvocation(InvocationAST ctx) {
        ExpressionAST quotedTarget = ctx.target != null ? getExpression(ctx.target) : new NullAST(null);
        ExpressionAST quotedDeclaringClass = ctx.declaringClass != null ? MethodAST.quote(ctx.declaringClass) : new NullAST(null);
        ExpressionAST quotedMethodName = MethodAST.quote(ctx.methodName);
        ExpressionAST quotedArguments = quote(ctx.arguments);
        return new NewAST(ctx.getRegion(), new NameTypeAST(null, InvocationAST.class), Arrays.asList(new NullAST(null), quotedTarget, quotedDeclaringClass, quotedMethodName, quotedArguments, new NullAST(null)));
    }

    private <T extends CodeAST> ExpressionAST quote(List<T> expressions) {
        List<ExpressionAST> expressionList = expressions.stream().map((a) -> getExpression(a)).collect(Collectors.toList());
        ExpressionAST quotedExpressionsAsArray = new ArrayAST(null, new NameTypeAST(null, CodeAST.class), expressionList);
        return new InvocationAST(null, null, new NameTypeAST(null, Arrays.class), "asList", Arrays.asList(quotedExpressionsAsArray), null);
    }

    @Override
    public ExpressionAST visitFieldSet(FieldSetAST ctx) {
        ExpressionAST quotedTarget = getExpression(ctx.target);
        ExpressionAST quotedDeclaringClass = MethodAST.quote(ctx.declaringClass);
        ExpressionAST quotedFieldName = MethodAST.quote(ctx.fieldName);
        ExpressionAST quotedValue = getExpression(ctx.value);
        return new NewAST(ctx.getRegion(), new NameTypeAST(null, FieldSetAST.class), Arrays.asList(null, quotedTarget, quotedDeclaringClass, quotedFieldName, quotedValue));
    }

    @Override
    public ExpressionAST visitMetaExpression(MetaExpressionAST ctx) {
        // Should just return body in executed form.
        // Body should be an ExpressionAST.
        /*
        Somehow, it should be figured out, what the result type of the body is.
        If the result type is not an ExpressionAST, then it is decided whether
        it is possible to convert the result type into an ExpressionAST.
        - E.g. string expresions are converted into a "new StringLiteral(...)" expression
         */
        return (ExpressionAST)ctx.body.accept(new MetaProcessor());
    }

    @Override
    public ExpressionAST visitThis(ThisAST ctx) {
        return new NewAST(ctx.getRegion(), new NameTypeAST(null, ThisAST.class), Arrays.<ExpressionAST>asList(new NullAST(null)));
    }

    @Override
    public ExpressionAST visitFieldGet(FieldGetAST ctx) {
        ExpressionAST quotedTarget = getExpression(ctx.target);
        ExpressionAST quotedFieldName = getExpression(ctx.fieldName);
        return new NewAST(ctx.getRegion(), new NameTypeAST(null, FieldGetAST.class), Arrays.asList(null, quotedTarget, quotedFieldName));
    }

    @Override
    public ExpressionAST visitVariableDeclaration(VariableDeclarationAST ctx) {
        ExpressionAST quotedName = MethodAST.quote(ctx.name);
        ExpressionAST quotedType = MethodAST.quote(ctx.type);
        ExpressionAST quotedValue = ctx.value != null ? getExpression(ctx.value) : new NullAST(null);
        return new NewAST(ctx.getRegion(), new NameTypeAST(null, VariableDeclarationAST.class), Arrays.asList(new NullAST(null), quotedName, quotedType, quotedValue));
    }

    @Override
    public ExpressionAST visitLookup(LookupAST ctx) {
        ExpressionAST quotedName = getExpression(ctx.name);
        return new NewAST(ctx.getRegion(), new NameTypeAST(null, LookupAST.class), Arrays.asList(new NullAST(null), quotedName));
    }

    @Override
    public ExpressionAST visitVariableAssignment(VariableAssignmentAST ctx) {
        ExpressionAST quotedName = MethodAST.quote(ctx.name);
        ExpressionAST quotedValue = getExpression(ctx.value);
        return new NewAST(ctx.getRegion(), new NameTypeAST(null, VariableAssignmentAST.class), Arrays.asList(new NullAST(null), quotedName, quotedValue));
    }

    @Override
    public ExpressionAST visitRootExpression(RootExpressionAST ctx) {
        ExpressionAST quotedExpression = getExpression(ctx.expression);
        return new NewAST(ctx.getRegion(), new NameTypeAST(null, RootExpressionAST.class), Arrays.asList(new NullAST(null), quotedExpression));
    }

    @Override
    public ExpressionAST visitBlock(BlockAST ctx) {
        // Some of the statements may be root meta expressions
        // root meta expressions are interpolated
        
        ExpressionAST concatenation = null;
        
        for(int i = 0; i < ctx.statements.size(); i++) {
            CodeAST statement = ctx.statements.get(i);
            ExpressionAST quotedStatement;
            
            if(statement instanceof RootExpressionAST && ((RootExpressionAST)statement).expression instanceof MetaExpressionAST)
                quotedStatement = ((RootExpressionAST)statement).expression;
            else
                quotedStatement = getExpression(statement);
            
            if(i == 0)
                concatenation = quotedStatement;
            else {
                ExpressionAST lhs = concatenation;
                ExpressionAST rhs = quotedStatement;
                concatenation = new BinaryExpressionAST(null, BinaryExpressionAST.OPERATOR_ADD, lhs, rhs);
            }
        }
        
        if(concatenation != null)
            return concatenation;
        
        return new NewAST(ctx.getRegion(), new NameTypeAST(null, BlockAST.class), Arrays.asList(new NullAST(null), quote(Collections.emptyList())));
    }

    @Override
    public ExpressionAST visitNew(NewAST ctx) {
        ExpressionAST quotedC = MethodAST.quote(ctx.c);
        ExpressionAST quotedArguments = quote(ctx.arguments);
        return new NewAST(ctx.getRegion(), new NameTypeAST(null, NewAST.class), Arrays.asList(new NullAST(null), quotedC, quotedArguments));
    }

    @Override
    public ExpressionAST visitArray(ArrayAST ctx) {
        ExpressionAST quotedType = MethodAST.quote(ctx.type);
        ExpressionAST quotedElements = quote(ctx.elements);
        return new NewAST(ctx.getRegion(), new NameTypeAST(null, ArrayAST.class), Arrays.asList(new NullAST(null), quotedType, quotedElements));
    }

    @Override
    public ExpressionAST visitNull(NullAST ctx) {
        return new NewAST(ctx.getRegion(), new NameTypeAST(null, NullAST.class), Arrays.<ExpressionAST>asList(new NullAST(null)));
    }

    @Override
    public ExpressionAST visitTypecast(TypecastAST ctx) {
        ExpressionAST quotedExpression = getExpression(ctx.expression);
        return new NewAST(ctx.getRegion(), new NameTypeAST(null, TypecastAST.class), Arrays.asList(new NullAST(null), quotedExpression));
    }

    @Override
    public ExpressionAST visitGetClass(GetClassAST ctx) {
        ExpressionAST quotedType = MethodAST.quote(ctx.t);
        return new NewAST(ctx.getRegion(), new NameTypeAST(null, GetClassAST.class), Arrays.asList(new NullAST(null), quotedType));
    }

    @Override
    public ExpressionAST visitWhile(WhileAST ctx) {
        ExpressionAST quotedCondition = getExpression(ctx.condition);
        ExpressionAST quotedBody = getExpression(ctx.body);
        return new NewAST(ctx.getRegion(), new NameTypeAST(null, WhileAST.class), Arrays.asList(new NullAST(null), quotedCondition, quotedBody));
    }

    @Override
    public ExpressionAST visitIfElse(IfElseAST ctx) {
        ExpressionAST quotedCondition = getExpression(ctx.condition);
        ExpressionAST quotedIfTrueBody = getExpression(ctx.ifTrueBody);
        ExpressionAST quotedIfFalseBody = getExpression(ctx.ifFalseBody);
        
        return new NewAST(
            ctx.getRegion(), 
            new NameTypeAST(null, IfElseAST.class), 
            Arrays.asList(new NullAST(null), quotedCondition, quotedIfTrueBody, quotedIfFalseBody)
        );
    }
}
