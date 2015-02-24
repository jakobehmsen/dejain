package jasy.lang.ast;

import jasy.lang.ClassResolver;
import java.util.Hashtable;
import java.util.List;
import java.util.stream.Collectors;
import org.objectweb.asm.Label;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.commons.GeneratorAdapter;
import org.objectweb.asm.commons.Method;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.InsnList;

public class CodePreparer implements CodeVisitor<PreparedAST> {
    private Scope thisClass;
    private ClassResolver classResolver;
    private ClassLoader classLoader;
    private Hashtable<String, ParameterInfo> parameters;
    private Hashtable<String, TypeAST> variables;

    public CodePreparer(Scope thisClass, ClassResolver classResolver, ClassLoader classLoader, Hashtable<String, ParameterInfo> parameters, Hashtable<String, TypeAST> variables) {
        this.thisClass = thisClass;
        this.classResolver = classResolver;
        this.classLoader = classLoader;
        this.parameters = parameters;
        this.variables = variables;
    }
    
    private PreparedExpressionAST toExpression(ExpressionAST expression) {
        return MethodAST.toExpression(thisClass, expression, classResolver, classLoader, parameters, variables);
    }
    
    private PreparedExpressionAST toExpression(ExpressionAST expression, boolean asExpression) {
        return MethodAST.toExpression(thisClass, expression, classResolver, classLoader, parameters, variables, asExpression);
    }

    @Override
    public PreparedAST visitReturn(ReturnAST ctx) {
        if(ctx.expression != null) {
            PreparedExpressionAST expression = toExpression(ctx.expression, true);
            TypeAST expressionResultType = expression.resultType();
            return new PreparedAST() {
                @Override
                public void generate(Transformation<ClassNode> c, MethodCodeGenerator generator, InsnList originalIl, Label ifFalseLabel) {
                    expression.generate(c, generator, originalIl);
                    
                    switch(expressionResultType.getSimpleName()) {
                    case "boolean":
                    case "byte":
                    case "short":
                    case "int":
                        generator.methodNode.visitInsn(Opcodes.IRETURN);
                        break;
                    case "long":
                        generator.methodNode.visitInsn(Opcodes.LRETURN);
                        break;
                    case "float":
                        generator.methodNode.visitInsn(Opcodes.FRETURN);
                        break;
                    case "double":
                        generator.methodNode.visitInsn(Opcodes.DRETURN);
                        break;
                    default:
                        generator.methodNode.visitInsn(Opcodes.ARETURN);
                        break;
                    }
                }

                @Override
                public void returns(java.util.List<jasy.lang.ast.TypeAST> returnTypes) {
                    returnTypes.add(expression.resultType());
                }
            };
        } else {
            return new PreparedAST() {
                @Override
                public void generate(Transformation<ClassNode> c, MethodCodeGenerator generator, InsnList originalIl, Label ifFalseLabel) {
                    generator.methodNode.visitInsn(Opcodes.RETURN);
                }
            };
        }
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
            public void generate(Transformation<ClassNode> c, MethodCodeGenerator generator, InsnList originalIl, Label ifFalseLabel) {
                pas.forEach((pa) -> 
                    pa.generate(c, generator, originalIl));
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
            public void generate(Transformation<ClassNode> c, MethodCodeGenerator generator, InsnList originalIl, Label ifFalseLabel) {
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
        return toExpression(ctx, false);
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
        PreparedExpressionAST value = ctx.value != null ? toExpression(ctx.value) : null;
        return new PreparedAST() {
            @Override
            public void generate(Transformation<ClassNode> c, MethodCodeGenerator generator, InsnList originalIl, Label ifFalseLabel) {
                int varId = generator.declareVariable(ctx.name, ctx.type.getDescriptor(), ctx.type);
                if (value != null) {
                    value.generate(c, generator, originalIl);
                    generator.methodNode.storeLocal(varId);
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
        return toExpression(ctx.expression, false);
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
        PreparedExpressionAST expression = toExpression(ctx.expression, true);
        return new PreparedAST() {
            @Override
            public void generate(Transformation<ClassNode> c, MethodCodeGenerator generator, InsnList originalIl, Label ifFalseLabel) {
//                if (((NameTypeAST) expression.resultType()).getType() != void.class) {
//                    // dup list
//                    generator.methodNode.dup();
//                }
//                // generate expresion
//                expression.generate(c, generator, originalIl);
//                if (((NameTypeAST) expression.resultType()).getType() != void.class) {
//                    // add to list
//                    generator.methodNode.invokeInterface(Type.getType(List.class), new Method("add", Type.BOOLEAN_TYPE, new Type[]{Type.getType(Object.class)}));
//                    // pop return from add
//                    generator.methodNode.pop();
//                }
                
                int injectionListIndex = generator.getInjectionListIndex();
                
                if (((NameTypeAST) expression.resultType()).getType(classLoader) != void.class) {
                    // dup list
                    generator.methodNode.loadLocal(injectionListIndex);
                }
                // generate expresion
                expression.generate(c, generator, originalIl);
                if (((NameTypeAST) expression.resultType()).getType(classLoader) != void.class) {
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
        PreparedExpressionAST condition = toExpression(ctx.condition);
        PreparedAST body = ctx.body.accept(this);
        
        return new PreparedAST() {
            @Override
            public void generate(Transformation<ClassNode> c, MethodCodeGenerator generator, InsnList originalIl, Label ifFalseLabel) {
                Label loopStart = new Label();
                Label end = new Label();
                
                generator.methodNode.visitLabel(loopStart);
                
                condition.generate(c, generator, originalIl);
                generator.methodNode.ifZCmp(GeneratorAdapter.EQ, end);
                
                body.generate(c, generator, originalIl);
                generator.methodNode.goTo(loopStart);
                
                generator.methodNode.visitLabel(end);
            }
        };
    }

    @Override
    public PreparedAST visitIfElse(IfElseAST ctx) {
        PreparedExpressionAST condition = toExpression(ctx.condition);
        PreparedAST ifTrueBody = ctx.ifTrueBody.accept(this);
        PreparedAST ifFalseBody = ctx.ifFalseBody != null ? ctx.ifFalseBody.accept(this) : null;
        
        return new PreparedAST() {
            @Override
            public void generate(Transformation<ClassNode> c, MethodCodeGenerator generator, InsnList originalIl, Label ifFalseLabel) {
//                Label end = new Label();
//                Label ifFalseBodyStart = end;
                
                if(ctx.ifFalseBody == null) {
                    Label end = new Label();
                    condition.generate(c, generator, originalIl, end);
                    ifTrueBody.generate(c, generator, originalIl);
                    generator.methodNode.visitLabel(end);
                } else {
                    Label end = new Label();
                    Label ifFalseBodyStart = new Label();
                    condition.generate(c, generator, originalIl, ifFalseBodyStart);
                    ifTrueBody.generate(c, generator, originalIl);
                    generator.methodNode.goTo(end);
                    generator.methodNode.visitLabel(ifFalseBodyStart);
                    ifFalseBody.generate(c, generator, originalIl);
                    generator.methodNode.visitLabel(end);
                }
                
//                condition.generate(c, generator, originalIl);
//                generator.methodNode.ifZCmp(GeneratorAdapter.EQ, ifFalseBodyStart);
//                
//                ifTrueBody.generate(c, generator, originalIl);
//                generator.methodNode.goTo(end);
//                
//                generator.methodNode.visitLabel(ifFalseBodyStart);
//                ifFalseBody.generate(c, generator, originalIl);
//                
//                generator.methodNode.visitLabel(end);
            }
        };
    }

    @Override
    public PreparedAST visitBoolean(BooleanLiteralAST ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PreparedAST visitUnary(UnaryExpression ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PreparedAST visitIncDec(IncDecExpression ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PreparedAST visitFloatLiteral(FloatLiteralAST ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PreparedAST visitDoubleLiteral(DoubleLiteralAST ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PreparedAST visitAmbiguousName(AmbiguousNameAST ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
