package jasy.lang.ast;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CodePrinter implements CodeVisitor<Object> {
    private PrintStream printStream;
    private boolean indentPending = true;
    private int indentation;
    
    private void println() {
        printStream.println();
        indentPending = true;
    }
    
    private void indent() {
        indentation++;
    }
    
    private void dedent() {
        indentation--;
    }
    
    private void print(Object obj) {
        print(obj.toString());
    }
    
    private void print(String text) {
        if(indentPending) {
            String indentionStr = IntStream.range(0, indentation).mapToObj(i-> "    ").collect(Collectors.joining());
            printStream.print(indentionStr);
            indentPending = false;
        }
        
        printStream.print(text);
    }

    public CodePrinter(PrintStream printStream) {
        this.printStream = printStream;
    }

    @Override
    public Object visitReturn(ReturnAST ctx) {
        print("return ");
        ctx.expression.accept(this);
        print(";");
        return null;
    }

    @Override
    public Object visitStringLiteral(StringLiteralAST ctx) {
        print("\"");
        print(ctx.value.replace("\n", "\\n"));
        print("\"");
        
        return null;
    }

    @Override
    public Object visitIntLiteral(IntLiteralAST ctx) {
        print(ctx.value);
        
        return null;
    }

    @Override
    public Object visitLongLiteral(LongLiteralAST ctx) {
        print(ctx.value);
        
        return null;
    }

    @Override
    public Object visitBoolean(BooleanLiteralAST ctx) {
        print(ctx.value);
        
        return null;
    }

    @Override
    public Object visitBinaryExpression(BinaryExpressionAST ctx) {
        print("(");
        ctx.lhs.accept(this);
        print(")");
        print(" ");
        print(ctx.getOperatorString());
        print(" ");
        print("(");
        ctx.rhs.accept(this);
        print(")");
        
        return null;
    }

    @Override
    public Object visitInvocation(InvocationAST ctx) {
        ctx.target.accept(this);
        print(".");
        print(ctx.methodName);
        print("(");
        ctx.arguments.stream()
            .flatMap(a -> Arrays.<Runnable>asList(() -> print(","), () -> a.accept(this)).stream())
            .skip(1)
            .forEach(r -> r.run());
        print(")");
        return null;
    }

    @Override
    public Object visitFieldSet(FieldSetAST ctx) {
        if(ctx.target != null)
            ctx.target.accept(this);
        else
            print(ctx.declaringClass.getName());
        
        print(".");
        print(ctx.fieldName);
        print(" = ");
        return ctx.value.accept(this);
    }

    @Override
    public Object visitMetaExpression(MetaExpressionAST ctx) {
        print("$");
        return ctx.body.accept(this);
    }

    @Override
    public Object visitThis(ThisAST ctx) {
        print("this");
        return null;
    }

    @Override
    public Object visitFieldGet(FieldGetAST ctx) {
        if(ctx.target != null)
            ctx.target.accept(this);
//        else
//            print(ctx.declaringClass.getName());
        
        print(".");
        printName(ctx.fieldName);
        
        return null;
    }

    @Override
    public Object visitVariableDeclaration(VariableDeclarationAST ctx) {
        print(ctx.type.getName());
        print(" ");
        print(ctx.name);
        
        if(ctx.value != null) {
            print(" = ");
            ctx.value.accept(this);
        }
        
        print(";");
        
        return null;
    }

    @Override
    public Object visitLookup(LookupAST ctx) {
        print(":");
        printName(ctx.name);
        
        return null;
    }
    
    private void printName(CodeAST ctx) {
        if(ctx instanceof StringLiteralAST)
            print(((StringLiteralAST)ctx).value);
        else
            ctx.accept(this);
    }

    @Override
    public Object visitVariableAssignment(VariableAssignmentAST ctx) {
        print(ctx.name);
        print(" = ");
        ctx.value.accept(this);
        
        return null;
    }

    @Override
    public Object visitRootExpression(RootExpressionAST ctx) {
        ctx.expression.accept(this);
        print(";");
        return null;
    }

    @Override
    public Object visitQuote(QuoteAST ctx) {
        print("#");
        ctx.ast.accept(this);
        return null;
    }

    @Override
    public Object visitBlock(BlockAST ctx) {
        print("{");
        println();
        indent();
        ctx.statements.forEach(s -> {
            s.accept(this);
            println();
        });
        dedent();
        print("}");
            
        return null;
    }

    @Override
    public Object visitNew(NewAST ctx) {
        print("new ");
        print(ctx.c.getName());
        print("(");
        ctx.arguments.stream()
            .flatMap(a -> Arrays.<Runnable>asList(() -> print(","), () -> a.accept(this)).stream())
            .skip(1)
            .forEach(r -> r.run());
        print(")");
        return null;
    }

    @Override
    public Object visitArray(ArrayAST ctx) {
        print("new ");
        print(ctx.type.getName());
        print("[]{");
        ctx.elements.stream()
            .flatMap(a -> Arrays.<Runnable>asList(() -> print(","), () -> a.accept(this)).stream())
            .skip(1)
            .forEach(r -> r.run());
        print("}");
        return null;
    }

    @Override
    public Object visitNull(NullAST ctx) {
        print("null");
        return null;
    }

    @Override
    public Object visitTypecast(TypecastAST ctx) {
        print("(");
        print(ctx.type.getName());
        print(")");
        ctx.expression.accept(this);
        return null;
    }

    @Override
    public Object visitGetClass(GetClassAST ctx) {
        print(ctx.t.getName());
        print(".class");
        return null;
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
        print("while(");
        ctx.condition.accept(this);
        print(")");
        ctx.body.accept(this);
        return null;
    }

    @Override
    public Object visitIfElse(IfElseAST ctx) {
        print("if(");
        ctx.condition.accept(this);
        print(")");
        ctx.ifTrueBody.accept(this);
        if(ctx.ifFalseBody != null) {
            print(" else ");
            ctx.ifFalseBody.accept(this);
        }
        return null;
    }

    @Override
    public Object visitUnary(UnaryExpression ctx) {
        print(ctx.getOperatorText());
        ctx.operand.accept(this);
        return null;
    }

    @Override
    public Object visitIncDec(IncDecExpression ctx) {
        if(ctx.timing == IncDecExpression.TIMING_PRE)
            print(ctx.getOperatorText());
        ctx.operand.accept(this);
        if(ctx.timing == IncDecExpression.TIMING_POST)
            print(ctx.getOperatorText());
        return null;
    }

    @Override
    public Object visitFloatLiteral(FloatLiteralAST ctx) {
        print(ctx.value);
        print("f");
        return null;
    }

    @Override
    public Object visitDoubleLiteral(DoubleLiteralAST ctx) {
        print(ctx.value);
        return null;
    }
}
