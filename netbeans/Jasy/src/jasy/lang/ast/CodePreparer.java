package jasy.lang.ast;

import java.util.Hashtable;
import java.util.List;
import java.util.stream.Collectors;
import org.objectweb.asm.Type;
import org.objectweb.asm.commons.Method;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.InsnList;

public class CodePreparer implements CodeVisitor<PreparedAST> {
    private Scope thisClass;
    private CodeAST ctx;
    private Hashtable<String, ParameterInfo> parameters;
    private Hashtable<String, TypeAST> variables;

    public CodePreparer(Scope thisClass, CodeAST ctx, Hashtable<String, ParameterInfo> parameters, Hashtable<String, TypeAST> variables) {
        this.thisClass = thisClass;
        this.ctx = ctx;
        this.parameters = parameters;
        this.variables = variables;
    }

    @Override
    public PreparedAST visitReturn(ReturnAST ctx) {
        PreparedExpressionAST expression = MethodAST.toExpression(thisClass, ctx.expression, parameters, variables, true);
        return new PreparedAST() {
            @Override
            public void generate(Transformation<ClassNode> c, MethodCodeGenerator generator, InsnList originalIl) {
                expression.generate(c, generator, originalIl);
                generator.methodNode.returnValue();
            }

            @Override
            public void returns(java.util.List<jasy.lang.ast.TypeAST> returnTypes) {
                returnTypes.add(expression.resultType());
            }
        };
    }

    @Override
    public PreparedAST visitBlock(BlockAST ctx) {
        List<PreparedAST> pas = ctx.statements.stream().map((jasy.lang.ast.CodeAST s) -> {
            if (s instanceof ExpressionAST) {
                return new RootExpressionAST(null, (ExpressionAST) s);
            }
            return s;
        }).map((s) -> s.accept(this)).collect(Collectors.toList());
        return new PreparedAST() {
            @Override
            public void generate(Transformation<ClassNode> c, MethodCodeGenerator generator, InsnList originalIl) {
                pas.forEach((pa) -> pa.generate(c, generator, originalIl));
            }

            @Override
            public void returns(java.util.List<jasy.lang.ast.TypeAST> returnTypes) {
                pas.forEach((pa) -> pa.returns(returnTypes));
            }
        };
    }

    @Override
    public PreparedAST visitMetaCode(MetaCodeAST ctx) {
        PreparedAST body = ctx.body.accept(this);
        return new PreparedAST() {
            @Override
            public void generate(Transformation<ClassNode> c, MethodCodeGenerator generator, InsnList originalIl) {
                body.generate(c, generator, originalIl);
            }
        };
    }

    @Override
    public PreparedAST visitStringLiteral(StringLiteralAST ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public PreparedAST visitIntLiteral(IntLiteralAST ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public PreparedAST visitLongLiteral(LongLiteralAST ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public PreparedAST visitBinaryExpression(BinaryExpressionAST ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public PreparedAST visitInvocation(InvocationAST ctx) {
        return MethodAST.toExpression(thisClass, ctx, parameters, variables, false);
    }

    @Override
    public PreparedAST visitFieldSet(FieldSetAST ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public PreparedAST visitMetaExpression(MetaExpressionAST ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public PreparedAST visitThis(ThisAST ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public PreparedAST visitFieldGet(FieldGetAST ctx) {
        throw new UnsupportedOperationException();
    }

    @Override
    public PreparedAST visitVariableDeclaration(VariableDeclarationAST ctx) {
        variables.put(ctx.name, ctx.type);
        PreparedExpressionAST value = ctx.value != null ? MethodAST.toExpression(thisClass, ctx.value, parameters, variables) : null;
        return new PreparedAST() {
            @Override
            public void generate(Transformation<ClassNode> c, MethodCodeGenerator generator, InsnList originalIl) {
                int ordinal = generator.declareVariable(ctx.name, ctx.type.getDescriptor(), ctx.type);
                if (value != null) {
                    value.generate(c, generator, originalIl);
                    MethodAST.appendStore(generator, ordinal, ctx.type);
                }
            }
        };
    }

    @Override
    public PreparedAST visitLookup(LookupAST ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PreparedAST visitVariableAssignment(VariableAssignmentAST ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PreparedAST visitRootExpression(RootExpressionAST ctx) {
        return MethodAST.toExpression(thisClass, ctx.expression, parameters, variables, false);
    }

    @Override
    public PreparedAST visitQuote(QuoteAST ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PreparedAST visitNew(NewAST ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PreparedAST visitArray(ArrayAST ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PreparedAST visitNull(NullAST ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PreparedAST visitTypecast(TypecastAST ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PreparedAST visitGetClass(GetClassAST ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PreparedAST visitInject(InjectAST ctx) {
        // A list for the statements of the immediate outer block being
        // built is assumed to be on the top of the stack.
        PreparedExpressionAST expression = MethodAST.toExpression(thisClass, ctx.expression, parameters, variables, true);
        return new PreparedAST() {
            @Override
            public void generate(Transformation<ClassNode> c, MethodCodeGenerator generator, InsnList originalIl) {
                if (((NameTypeAST) expression.resultType()).getType() != void.class) {
                    // dup list
                    generator.methodNode.dup();
                }
                // generate expresion
                expression.generate(c, generator, originalIl);
                if (((NameTypeAST) expression.resultType()).getType() != void.class) {
                    // add to list
                    generator.methodNode.invokeInterface(Type.getType(List.class), new Method("add", Type.BOOLEAN_TYPE, new Type[]{Type.getType(Object.class)}));
                    // pop return from add
                    generator.methodNode.pop();
                }
            }
        };
    }

    @Override
    public PreparedAST visitInjectionBlock(InjectionBlockAST ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PreparedAST visitWhile(WhileAST ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    } 
}
