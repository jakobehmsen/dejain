package jasy.lang.ast;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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
    
//    public static AST flatten(AST ctx, boolean quoted) {
//        if(!quoted) {
//            return ctx.withChildren(ctx.getChildren().stream.map(childSlot -> {
//                if(childSlot.getValue() instanceof QuoteAST) {
//                    AST flatten = flatten(childSlot.getValue(), true);
//                    return childSlot.withValue(flatten);
//                } else
//                    return childSlot;
//            }));
//        } else {
//            
//        }
//    }
//    
//    public static void replace(AST ctx, Function<AST, AST> replacer) {
//        ctx.getChildren().
//    }

    @Override
    public ExpressionAST visitBlock(BlockAST ctx) {
        String statementVarName = "$blockStatements" + blockCount++;
        
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
                    new LookupAST(null, new StringLiteralAST(null, statementVarName)),
                    "add", 
                    Arrays.asList(quotedStatement)
                ));
            }
        }
        
        statementVarNameStack.pop();
        
        return new NewAST(
            null, 
            new NameTypeAST(null, BlockAST.class), 
            Arrays.asList(new NullAST(null), new LookupAST(null, new StringLiteralAST(null, statementVarName)))
        );
    }

    @Override
    public ExpressionAST visitMetaCode(MetaCodeAST ctx) {
        ctx.body.accept(new StatementFlattener(this));
        
        return null;
    }

    @Override
    public ExpressionAST visitReturn(ReturnAST ctx) {
        ExpressionAST quotedExpression = ctx.expression != null ? ctx.expression.accept(this) : new NullAST(null);
        return new NewAST(ctx.getRegion(), new NameTypeAST(null, ReturnAST.class), Arrays.asList(new NullAST(null), quotedExpression));
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
        ExpressionAST quotedLhs = ctx.lhs.accept(this);
        ExpressionAST quotedRhs = ctx.rhs.accept(this);
        return new NewAST(ctx.getRegion(), new NameTypeAST(null, BinaryExpressionAST.class), Arrays.asList(new NullAST(null), new IntLiteralAST(null, ctx.operator), quotedLhs, quotedRhs));
    }

    @Override
    public ExpressionAST visitInvocation(InvocationAST ctx) {
//        ExpressionAST quotedTarget = ctx.target != null ? ctx.target.accept(this) : new NullAST(null);
//        ExpressionAST quotedDeclaringClass = ctx.declaringClass != null ? MethodAST.quote(ctx.declaringClass) : new NullAST(null);
//        ExpressionAST quotedMethodName = MethodAST.quote(ctx.methodName);
//        ExpressionAST quotedArguments = quote(ctx.arguments);
//        return new NewAST(ctx.getRegion(), new NameTypeAST(null, InvocationAST.class), Arrays.asList(new NullAST(null), quotedTarget, quotedDeclaringClass, quotedMethodName, quotedArguments, new NullAST(null)));
        
        return null;
    }

    private <T extends CodeAST> ExpressionAST quote(List<T> expressions) {
        List<ExpressionAST> expressionList = expressions.stream().map((a) -> a.accept(this)).collect(Collectors.toList());
        ExpressionAST quotedExpressionsAsArray = new ArrayAST(null, new NameTypeAST(null, CodeAST.class), expressionList);
        return new InvocationAST(null, new NameTypeAST(null, Arrays.class), "asList", Arrays.asList(quotedExpressionsAsArray));
    }

    @Override
    public ExpressionAST visitFieldSet(FieldSetAST ctx) {
        ExpressionAST quotedTarget = ctx.target.accept(this);
        ExpressionAST quotedDeclaringClass = MethodAST.quote(ctx.declaringClass);
        ExpressionAST quotedFieldName = MethodAST.quote(ctx.fieldName);
        ExpressionAST quotedValue = ctx.value.accept(this);
        return new NewAST(ctx.getRegion(), new NameTypeAST(null, FieldSetAST.class), Arrays.asList(null, quotedTarget, quotedDeclaringClass, quotedFieldName, quotedValue));
    }

    @Override
    public ExpressionAST visitMetaExpression(MetaExpressionAST ctx) {
        return ctx;
    }

    @Override
    public ExpressionAST visitThis(ThisAST ctx) {
        return new NewAST(ctx.getRegion(), new NameTypeAST(null, ThisAST.class), Arrays.<ExpressionAST>asList(new NullAST(null)));
    }

    @Override
    public ExpressionAST visitFieldGet(FieldGetAST ctx) {
//        ExpressionAST quotedTarget = ctx.target.accept(this);
//        ExpressionAST quotedFieldName = ctx.fieldName.accept(this);
//        return new NewAST(ctx.getRegion(), new NameTypeAST(null, FieldGetAST.class), Arrays.asList(null, quotedTarget, quotedFieldName));
        
        return null;
    }

    @Override
    public ExpressionAST visitVariableDeclaration(VariableDeclarationAST ctx) {
        ExpressionAST quotedName = MethodAST.quote(ctx.name);
        ExpressionAST quotedType = MethodAST.quote(ctx.type);
        ExpressionAST quotedValue = ctx.value != null ? ctx.value.accept(this) : new NullAST(null);
        return new NewAST(ctx.getRegion(), new NameTypeAST(null, VariableDeclarationAST.class), Arrays.asList(new NullAST(null), quotedName, quotedType, quotedValue));
    }

    @Override
    public ExpressionAST visitLookup(LookupAST ctx) {
        ExpressionAST quotedName = ctx.name.accept(this);
        return new NewAST(ctx.getRegion(), new NameTypeAST(null, LookupAST.class), Arrays.asList(new NullAST(null), quotedName));
    }

    @Override
    public ExpressionAST visitVariableAssignment(VariableAssignmentAST ctx) {
        ExpressionAST quotedName = MethodAST.quote(ctx.name);
        ExpressionAST quotedValue = ctx.value.accept(this);
        return new NewAST(ctx.getRegion(), new NameTypeAST(null, VariableAssignmentAST.class), Arrays.asList(new NullAST(null), quotedName, quotedValue));
    }

    @Override
    public ExpressionAST visitRootExpression(RootExpressionAST ctx) {
        ExpressionAST quotedExpression = ctx.expression.accept(this);
        return new NewAST(ctx.getRegion(), new NameTypeAST(null, RootExpressionAST.class), Arrays.asList(new NullAST(null), quotedExpression));
    }

    @Override
    public ExpressionAST visitQuote(QuoteAST ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    public ExpressionAST visitTypecast(TypecastAST ctx) {
        ExpressionAST quotedExpression = ctx.expression.accept(this);
        return new NewAST(ctx.getRegion(), new NameTypeAST(null, TypecastAST.class), Arrays.asList(new NullAST(null), quotedExpression));
    }

    @Override
    public ExpressionAST visitNull(NullAST ctx) {
        return new NewAST(ctx.getRegion(), new NameTypeAST(null, NullAST.class), Arrays.<ExpressionAST>asList(new NullAST(null)));
    }

    @Override
    public ExpressionAST visitGetClass(GetClassAST ctx) {
        ExpressionAST quotedType = MethodAST.quote(ctx.t);
        return new NewAST(ctx.getRegion(), new NameTypeAST(null, GetClassAST.class), Arrays.asList(new NullAST(null), quotedType));
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
        ExpressionAST quotedCondition = ctx.condition.accept(this);
        ExpressionAST quotedBody = ctx.body.accept(this);
        return new NewAST(ctx.getRegion(), new NameTypeAST(null, WhileAST.class), Arrays.asList(new NullAST(null), quotedCondition, quotedBody));
    }

    @Override
    public ExpressionAST visitIfElse(IfElseAST ctx) {
        ExpressionAST quotedCondition = ctx.condition.accept(this);
        ExpressionAST quotedIfTrueBody = ctx.ifTrueBody.accept(this);
        ExpressionAST quotedIfFalseBody = ctx.ifFalseBody.accept(this);
        
        return new NewAST(
            ctx.getRegion(), 
            new NameTypeAST(null, IfElseAST.class), 
            Arrays.asList(new NullAST(null), quotedCondition, quotedIfTrueBody, quotedIfFalseBody)
        );
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

    @Override
    public ExpressionAST visitAmbiguousName(AmbiguousNameAST aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
