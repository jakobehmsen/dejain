package dejain.lang.ast;

import dejain.lang.ASMCompiler;
import dejain.lang.ASMCompiler.Region;
import dejain.lang.ClassResolver;
import dejain.lang.SingleClassLoader;
import static dejain.lang.ast.BinaryExpressionAST.OPERATOR_ADD;
import dejain.runtime.asm.CommonClassTransformer;
import dejain.runtime.asm.CompositeTransformer;
import dejain.runtime.asm.IfAllTransformer;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.OptionalInt;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.apache.commons.beanutils.MethodUtils;
import org.objectweb.asm.Label;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.commons.GeneratorAdapter;
import org.objectweb.asm.commons.Method;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.MethodNode;

public class MethodAST extends AbstractAST implements MemberAST {
    public boolean isAdd;
    public MethodSelectorAST selector;
    public List<CodeAST> body;

    public MethodAST(Region region, boolean isAdd, MethodSelectorAST selector, List<CodeAST> body) {
        super(region);
        this.isAdd = isAdd;
        this.selector = selector;
        this.body = body;
    }

    @Override
    public void accept(MemberVisitor visitor) {
        visitor.visitMethod(this);
    }
    
    public static List<TypeAST> getReturnType(List<CodeAST> body) {
        ArrayList<TypeAST> returnTypes = new ArrayList<>();
        
        body.forEach(c -> getReturnType(c, returnTypes));
        
        return returnTypes;
    }
    
    public static void getReturnType(CodeAST code, List<TypeAST> returnTypes) {
        code.accept(new CodeVisitor<Object>() {
            @Override
            public Object visitReturn(ReturnAST ctx) {
                returnTypes.add(ctx.expression.resultType());
                return null;
            }

            @Override
            public Object visitStringLiteral(LiteralAST<String> ctx) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Object visitIntegerLiteral(LiteralAST<Integer> ctx) {
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
            public Object visitLongLiteral(LiteralAST<Long> ctx) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Object visitMeta(MetaExpressionAST ctx) {
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
        });
    }

    @Override
    public void resolve(Scope thisClass, TypeAST expectedResultType, ClassResolver resolver, List<dejain.lang.ASMCompiler.Message> errorMessages) {
        selector.resolve(thisClass, expectedResultType, resolver, errorMessages);
        body.forEach(s -> s.resolve(thisClass, expectedResultType, resolver, errorMessages));
    }

    public void populate(CompositeTransformer<Transformation<ClassNode>> classTransformer, IfAllTransformer<Transformation<MethodNode>> transformer) {
        if(!isAdd) {
            selector.populate(transformer);
        } else {
            classTransformer.addTransformer(c -> {
                return () -> {
                    int methodAccess = AST.Util.getAccessModifier(selector.accessModifier, selector.isStatic);
                    String methodName = selector.name;
                    Type[] argumentTypes = selector.parameterTypes.stream()
                        .map(x -> Type.getType(x.getDescriptor(c.getTarget().name)))
                        .toArray(size -> new Type[size]);
                    String methodDescriptor = Type.getMethodDescriptor(
                        Type.getType(selector.returnType.getDescriptor(c.getTarget().name)), 
                        argumentTypes);
                    
                    MethodNode methodNode = new MethodNode(methodAccess, methodName, methodDescriptor, null, null);
                    GeneratorAdapter generatorAdapter = new GeneratorAdapter(methodNode, methodAccess, methodName, methodDescriptor);
                    MethodCodeGenerator generator = new MethodCodeGenerator(generatorAdapter, selector.returnType);

                    generator.start();
                    toCode(c, body, generator, new InsnList() /*Something that generates a default values for non-void returns?*/);
                    generator.end();

                    methodNode.visitEnd();

                    OptionalInt existingMethodIndex =
                        IntStream.range(0, c.getTarget().methods.size())
                        .filter(i -> 
                            ((MethodNode)c.getTarget().methods.get(i)).name.equals(methodName) && 
                            ((MethodNode)c.getTarget().methods.get(i)).desc.equals(methodDescriptor))
                        .findFirst();
                    if(existingMethodIndex.isPresent())
                        c.getTarget().methods.remove(existingMethodIndex.getAsInt());

                    c.getTarget().methods.add(methodNode);
                };
            });
        }
    }

    public static void toCode(Transformation<ClassNode> c, List<CodeAST> body, MethodCodeGenerator generator) {
        toCode(c, body, generator, new InsnList());
    }

    private static void toCode(Transformation<ClassNode> c, List<CodeAST> body, MethodCodeGenerator generator, InsnList originalIl) {
        body.forEach(ctx -> {
            PreparedAST pa = toCode(ctx);
            pa.generate(c, generator, originalIl);
        });
    }

    public static PreparedAST toCode(CodeAST ctx) {
        return ctx.accept(new CodeVisitor<PreparedAST>() {
            @Override
            public PreparedAST visitReturn(ReturnAST ctx) {
                PreparedExpressionAST expression = toExpression(ctx.expression, true);
                
                return new PreparedAST() {
                    @Override
                    public void generate(Transformation<ClassNode> c, MethodCodeGenerator generator, InsnList originalIl) {
                        expression.generate(c, generator, originalIl);
                        generator.methodNode.returnValue();
                    }
                };
                
//                ctx.expression.accept(this);
//                expression.generate(null, null, null, isAdd);
//                generator.methodNode.returnValue();
            }

            @Override
            public PreparedAST visitStringLiteral(LiteralAST<String> ctx) {
                throw new UnsupportedOperationException();
            }

            @Override
            public PreparedAST visitIntegerLiteral(LiteralAST<Integer> ctx) {
                throw new UnsupportedOperationException();
            }

            @Override
            public PreparedAST visitLongLiteral(LiteralAST<Long> ctx) {
                throw new UnsupportedOperationException();
            }

            @Override
            public PreparedAST visitBinaryExpression(BinaryExpressionAST ctx) {
                throw new UnsupportedOperationException();
//                ctx.lhs.accept(this);
//                ctx.rhs.accept(this);
//                
//                switch(ctx.resultType().getSimpleName(c.getTarget().name)) {
//                    case "String":
//                        generator.methodNode.invokeVirtual(Type.getType("java/lang/String"), new Method("concat", "(Ljava/lang/String;)Ljava/lang/String;"));
//                        break;
//                    case "short":
//                        generator.methodNode.visitInsn(Opcodes.IADD);
//                        break;
//                    case "int":
//                        generator.methodNode.visitInsn(Opcodes.IADD);
//                        break;
//                    case "long":
//                        generator.methodNode.visitInsn(Opcodes.LADD);
//                        break;
//                    case "float":
//                        generator.methodNode.visitInsn(Opcodes.FADD);
//                        break;
//                    case "double":
//                        generator.methodNode.visitInsn(Opcodes.DADD);
//                        break;
//                }
            }

            @Override
            public PreparedAST visitInvocation(InvocationAST ctx) {
                return toExpression(ctx, false);
//                ctx.arguments.forEach(a -> a.accept(this));
//                
//                Type[] argumentTypes = ctx.arguments.stream().map(a -> Type.getType(a.resultType().getDescriptor(c.getTarget().name))).toArray(size -> new Type[size]);
//                Type returnType = Type.getType(ctx.resultType().getDescriptor(c.getTarget().name));
//                Method method = new Method(ctx.methodName, returnType, argumentTypes);
//                
//                if(ctx.target != null)
//                    generator.methodNode.invokeVirtual(Type.getType(ctx.target.resultType().getDescriptor(c.getTarget().name)), method);
//                else
//                    generator.methodNode.invokeStatic(Type.getType(ctx.declaringClass.getDescriptor(c.getTarget().name)), method);
            }

            @Override
            public PreparedAST visitFieldSet(FieldSetAST ctx) {
                throw new UnsupportedOperationException();
            }

            @Override
            public PreparedAST visitMeta(MetaExpressionAST ctx) {
//                
//                Class<?> generatorClass2 = ctx.bodyAsMethod.getDeclaringClass();
//                try {
//                    Object generator = generatorClass2.newInstance();
//
//                    // 2) Evaluate the generated code which result in a String
//                    for(String fieldName: ctx.mp.metaScope.getFieldNames()) {
//                        try {
//                            Field f = generatorClass2.getField(fieldName);
//                            Object value = c.getVariableValue(fieldName);
//                            f.set(generator, value);
//                        } catch (NoSuchFieldException ex) {
//                            Logger.getLogger(MethodAST.class.getName()).log(Level.SEVERE, null, ex);
//                        }
//                    }
//
//                    // Expression is derived pr transformation
//                    Object value = ctx.bodyAsMethod.invoke(generator, null);
//                    ExpressionAST generatedExpression = ctx.convertToExpression(value, ctx.bodyAsMethod.getReturnType());
//                    generatedExpression.accept(this);
//                } catch (SecurityException | IllegalArgumentException | InstantiationException | IllegalAccessException | InvocationTargetException ex) {
//                    Logger.getLogger(MetaExpressionAST.class.getName()).log(Level.SEVERE, null, ex);
//                }
                
                throw new UnsupportedOperationException();
            }

            @Override
            public PreparedAST visitThis(ThisAST ctx) {
                throw new UnsupportedOperationException();
            }

            @Override
            public PreparedAST visitFieldGet(FieldGetAST ctx) {
                throw new UnsupportedOperationException();
//                ctx.target.accept(this);
//                generator.methodNode.getField(Type.getType(ctx.target.resultType().getDescriptor(c.getTarget().name)), ctx.fieldName, Type.getType(ctx.resultType().getDescriptor(c.getTarget().name)));
            }
        });
    }
    
    public static PreparedExpressionAST toExpression(ExpressionAST expression) {
        return toExpression(expression, true);
    }
    
    public static PreparedExpressionAST toExpression(ExpressionAST expression, boolean asExpression) {
        return expression.accept(new CodeVisitor<PreparedExpressionAST>() {
            @Override
            public PreparedExpressionAST visitReturn(ReturnAST ctx) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public PreparedExpressionAST visitStringLiteral(LiteralAST<String> ctx) {
                return new PreparedExpressionAST() {
                    @Override
                    public TypeAST resultType() {
                        return new NameTypeAST(ctx.getRegion(), String.class);
                    }

                    @Override
                    public void generate(Transformation<ClassNode> c, MethodCodeGenerator generator, InsnList originalIl) {
                        if(asExpression)
                            generator.methodNode.push(ctx.value);
                    }
                };
            }

            @Override
            public PreparedExpressionAST visitIntegerLiteral(LiteralAST<Integer> ctx) {
                return new PreparedExpressionAST() {
                    @Override
                    public TypeAST resultType() {
                        return new NameTypeAST(ctx.getRegion(), int.class);
                    }

                    @Override
                    public void generate(Transformation<ClassNode> c, MethodCodeGenerator generator, InsnList originalIl) {
                        if(asExpression)
                            generator.methodNode.push(ctx.value);
                    }
                };
            }

            @Override
            public PreparedExpressionAST visitBinaryExpression(BinaryExpressionAST ctx) {
                PreparedExpressionAST lhsTmp = ctx.lhs.accept(this);             
                PreparedExpressionAST rhsTmp = ctx.rhs.accept(this);
                
                TypeAST resultType;
                
                if(lhsTmp.resultType().getDescriptor().equals("Ljava/lang/String;") || rhsTmp.resultType().getDescriptor().equals("Ljava/lang/String;")) {
                    switch(ctx.operator) {
                        case OPERATOR_ADD:
                            if(!lhsTmp.resultType().getDescriptor().equals("Ljava/lang/String;"))
                                lhsTmp = expressionAsString(lhsTmp);
                            if(!rhsTmp.resultType().getDescriptor().equals("Ljava/lang/String;"))
                                rhsTmp = expressionAsString(rhsTmp);
                            resultType = new NameTypeAST(ctx.getRegion(), String.class);
                            break;
                        default:
                            resultType = null;
//                            errorMessages.add(new ASMCompiler.Message(getRegion(), "Bad operand types for binary operator '" + getOperatorString() + "'"));
                            break;
                    }
                } else if(lhsTmp.resultType().getSimpleName().equals("int") && rhsTmp.resultType().getSimpleName().equals("int")) {
                    resultType = new NameTypeAST(ctx.getRegion(), int.class);
                } else
                    resultType = null;
                
                PreparedExpressionAST lhs = lhsTmp;             
                PreparedExpressionAST rhs = rhsTmp;
                
                return new PreparedExpressionAST() {
                    @Override
                    public TypeAST resultType() {
                        return resultType;
                    }

                    @Override
                    public void generate(Transformation<ClassNode> c, MethodCodeGenerator generator, InsnList originalIl) {
                        lhs.generate(c, generator, originalIl);
                        rhs.generate(c, generator, originalIl);
                        
                        switch(resultType().getSimpleName(c.getTarget().name)) {
                            case "String":
                                generator.methodNode.invokeVirtual(Type.getType("java/lang/String"), new Method("concat", "(Ljava/lang/String;)Ljava/lang/String;"));
                                break;
                            case "short":
                                generator.methodNode.visitInsn(Opcodes.IADD);
                                break;
                            case "int":
                                generator.methodNode.visitInsn(Opcodes.IADD);
                                break;
                            case "long":
                                generator.methodNode.visitInsn(Opcodes.LADD);
                                break;
                            case "float":
                                generator.methodNode.visitInsn(Opcodes.FADD);
                                break;
                            case "double":
                                generator.methodNode.visitInsn(Opcodes.DADD);
                                break;
                        }
                    }
                };
            }
            
            private PreparedExpressionAST expressionAsString(PreparedExpressionAST ctx) {
                switch(ctx.resultType().getSimpleName()) {
                    case "int":
                        return createInvocation(null, new NameTypeAST(null, Integer.class), "toString", Arrays.asList(ctx));
//                        return new InvocationAST(ctx.getRegion(), null, new NameTypeAST(ctx.getRegion(), Integer.class), "toString", Arrays.asList(ctx), new NameTypeAST(ctx.getRegion(), String.class));
                    default:
                        return createInvocation(ctx, null, "toString", Collections.emptyList());
//                        return new InvocationAST(ctx.getRegion(), ctx, null, "toString", Collections.emptyList(), new NameTypeAST(ctx.getRegion(), String.class));
                }
            }

            @Override
            public PreparedExpressionAST visitInvocation(InvocationAST ctx) {
                PreparedExpressionAST target = ctx.target != null ? ctx.target.accept(this) : null;
                
                List<PreparedExpressionAST> arguments = ctx.arguments.stream().map(a -> a.accept(this)).collect(Collectors.toList());
                return createInvocation(target, ctx.declaringClass, ctx.methodName, arguments);
//                Class<?>[] parameterTypes = arguments.stream().map(a -> a.resultType()).toArray(size -> new Class<?>[size]);
//                Type[] argumentTypes = Arrays.asList(parameterTypes).stream().map(a -> Type.getType(a)).toArray(size -> new Type[size]);
//        
//                java.lang.reflect.Method method;
//
//                if(target != null) {
//                    // Generalize getAccessibleMethod
//                    method = MethodUtils.getAccessibleMethod(((NameTypeAST)target.resultType()).getType(), ctx.methodName, parameterTypes);
//                } else {
//                    method = MethodUtils.getAccessibleMethod(((NameTypeAST)ctx.declaringClass).getType(), ctx.methodName, parameterTypes);
//                }
//                
//                return new PreparedExpressionAST() {
//                    @Override
//                    public TypeAST resultType() {
//                        return new NameTypeAST(ctx.getRegion(), method.getReturnType());
//                    }
//
//                    @Override
//                    public void generate(Transformation<ClassNode> c, MethodCodeGenerator generator, InsnList originalIl) {
//                        arguments.forEach(a -> a.generate(c, generator, originalIl));
//                        Method asmMethod = new Method(ctx.methodName, Type.VOID_TYPE, argumentTypes);
//                        if(target != null)
//                            generator.methodNode.invokeVirtual(Type.getType(target.resultType().getDescriptor()), asmMethod);
//                        else
//                            generator.methodNode.invokeStatic(Type.getType(ctx.declaringClass.getDescriptor()), asmMethod);
//                        
//                        if(!asExpression && method.getReturnType() != Void.class)
//                            generator.methodNode.pop();
//                    }
//                };
            }
            
            private PreparedExpressionAST createInvocation(PreparedExpressionAST target, TypeAST declaringClass, String methodName, List<PreparedExpressionAST> arguments) {
                Class<?>[] parameterTypes = arguments.stream().map(a -> 
                    ((NameTypeAST)a.resultType()).getType()
                ).toArray(size -> new Class<?>[size]);
                Type[] argumentTypes = Arrays.asList(parameterTypes).stream().map(a -> Type.getType(a)).toArray(size -> new Type[size]);
        
                java.lang.reflect.Method method;

                if(target != null) {
                    // Generalize getAccessibleMethod
                    method = MethodUtils.getAccessibleMethod(((NameTypeAST)target.resultType()).getType(), methodName, parameterTypes);
                } else {
                    method = MethodUtils.getAccessibleMethod(((NameTypeAST)declaringClass).getType(), methodName, parameterTypes);
                }
                
                return new PreparedExpressionAST() {
                    @Override
                    public TypeAST resultType() {
                        return new NameTypeAST(null, method.getReturnType());
                    }

                    @Override
                    public void generate(Transformation<ClassNode> c, MethodCodeGenerator generator, InsnList originalIl) {
                        arguments.forEach(a -> 
                            a.generate(c, generator, originalIl));
                        Method asmMethod = new Method(methodName, Type.getType(method.getReturnType()), argumentTypes);
                        if(target != null)
                            generator.methodNode.invokeVirtual(Type.getType(target.resultType().getDescriptor()), asmMethod);
                        else
                            generator.methodNode.invokeStatic(Type.getType(declaringClass.getDescriptor()), asmMethod);
                        
                        if(!asExpression && method.getReturnType() != Void.class)
                            generator.methodNode.pop();
                    }
                };
            }

            @Override
            public PreparedExpressionAST visitFieldSet(FieldSetAST ctx) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public PreparedExpressionAST visitLongLiteral(LiteralAST<Long> ctx) {
                return new PreparedExpressionAST() {
                    @Override
                    public TypeAST resultType() {
                        return new NameTypeAST(ctx.getRegion(), long.class);
                    }

                    @Override
                    public void generate(Transformation<ClassNode> c, MethodCodeGenerator generator, InsnList originalIl) {
                        if(asExpression)
                            generator.methodNode.push(ctx.value);
                    }
                };
            }

            @Override
            public PreparedExpressionAST visitMeta(MetaExpressionAST ctx) {
                // expectedResultType should for body should a type pattern including String, int, ...rest primitive types..., ExpressionAST
//                ctx.body.forEach(s -> s.resolve(mp.metaScope, new NameTypeAST(getRegion(), ExpressionAST.class), resolver, errorMessages));
//                ctx.body.stream().collect(Collectors.toList())
                List<PreparedAST> body = ((List<CodeAST>)ctx.body).stream().map(c -> toCode(c)).collect(Collectors.toList());
//                ctx.body.stream().map(c -> toCode(c)).collect(Collectors.toList());
                List<TypeAST> returnTypes = body.stream().map(c -> c.returns()).filter(r -> r != null).collect(null);
//                List<TypeAST> returnTypes = MethodAST.getReturnType(ctx.body);
                // Dangerous
                Class<?> returnTypeClass = ((NameTypeAST)returnTypes.get(0)).getType();

                // 1) Generate code to generate code
                ClassNode metaObjectClassNode = new ClassNode(Opcodes.ASM5);

                ctx.mp.metaScope.addFields(metaObjectClassNode);

                metaObjectClassNode.version = MetaExpressionAST.getOpcodesVersion();
                metaObjectClassNode.access = Opcodes.ACC_PUBLIC;
                metaObjectClassNode.name = "dejain/generator/ASMGenerator" + ctx.mp.generatorCount;
                metaObjectClassNode.superName = "java/lang/Object";
                MethodNode generatorMethod = new MethodNode(Opcodes.ACC_PUBLIC, "generator", Type.getMethodDescriptor(Type.getType(returnTypeClass)), null, new String[]{});
                metaObjectClassNode.methods.add(generatorMethod);

                MethodNode defaultConstructor = new MethodNode(Opcodes.ACC_PUBLIC, "<init>", "()V", null, null);
                defaultConstructor.visitCode();
                defaultConstructor.visitVarInsn(Opcodes.ALOAD, 0);
                defaultConstructor.visitMethodInsn(Opcodes.INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
                defaultConstructor.visitInsn(Opcodes.RETURN);
                defaultConstructor.visitMaxs(1,1);
                defaultConstructor.visitEnd();
                metaObjectClassNode.methods.add(defaultConstructor);

                GeneratorAdapter generatorAdapter = new GeneratorAdapter(generatorMethod, generatorMethod.access, generatorMethod.name, generatorMethod.desc);
//                MethodAST.toCode(new Transformation<>(generatorClassNode), body, new MethodAST.MethodCodeGenerator(generatorAdapter, null));
                body.forEach(c -> c.generate(new Transformation<>(metaObjectClassNode), new MethodCodeGenerator(generatorAdapter, null), new InsnList()));

                SingleClassLoader classLoader = new SingleClassLoader(metaObjectClassNode);
                Class<?> metaObjectClass = classLoader.loadClass();
                java.lang.reflect.Method bodyAsMethod;
                
                try {
                    bodyAsMethod = metaObjectClass.getMethod("generator", null);
                } catch (NoSuchMethodException ex) {
                    Logger.getLogger(MetaExpressionAST.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SecurityException ex) {
                    Logger.getLogger(MetaExpressionAST.class.getName()).log(Level.SEVERE, null, ex);
                }

                ctx.mp.generatorCount++;

//                resultType = new NameTypeAST(getRegion(), resultType(bodyAsMethod.getReturnType()));
                
                TypeAST resultType = returnTypes.get(0);
                
                return new PreparedExpressionAST() {
                    @Override
                    public TypeAST resultType() {
                        return resultType;
                    }

                    @Override
                    public void generate(Transformation<ClassNode> c, MethodCodeGenerator generator, InsnList originalIl) {
                        try {
                            Object metaObject = metaObjectClass.newInstance();

                            // 2) Evaluate the generated code which result in a String
                            for(String fieldName: ctx.mp.metaScope.getFieldNames()) {
                                try {
                                    Field f = metaObjectClass.getField(fieldName);
                                    Object value = c.getVariableValue(fieldName);
                                    f.set(metaObject, value);
                                } catch (NoSuchFieldException ex) {
                                    Logger.getLogger(MethodAST.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }

                            // Expression is derived pr transformation
                            Object astValue = ctx.bodyAsMethod.invoke(metaObject, null);
                            ExpressionAST generatedExpression = ctx.convertToExpression(astValue, ctx.bodyAsMethod.getReturnType());
                            PreparedAST preparedGeneratedExpression = toExpression(generatedExpression, true);
                            preparedGeneratedExpression.generate(c, generator, originalIl);
//                            generatedExpression.accept(this);
                        } catch (SecurityException | IllegalArgumentException | InstantiationException | IllegalAccessException | InvocationTargetException ex) {
                            Logger.getLogger(MetaExpressionAST.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                };
                
//                Class<?> generatorClass2 = ctx.bodyAsMethod.getDeclaringClass();
                
                
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public PreparedExpressionAST visitThis(ThisAST ctx) {
                return new PreparedExpressionAST() {
                    @Override
                    public TypeAST resultType() {
                        return new ThisTypeAST(ctx.getRegion());
                    }

                    @Override
                    public void generate(Transformation<ClassNode> c, MethodCodeGenerator generator, InsnList originalIl) {
                        generator.methodNode.loadThis();
                    }
                };
            }

            @Override
            public PreparedExpressionAST visitFieldGet(FieldGetAST ctx) {
                PreparedExpressionAST target = ctx.target != null ? ctx.target.accept(this) : null;
                TypeAST fieldType = target != null ? target.resultType().getFieldType(ctx.fieldName) : null /*from declared class instead*/;
                
                return new PreparedExpressionAST() {
                    @Override
                    public TypeAST resultType() {
                        return fieldType;
                    }

                    @Override
                    public void generate(Transformation<ClassNode> c, MethodCodeGenerator generator, InsnList originalIl) {
                        if(asExpression) {
                            target.generate(c, generator, originalIl);
                            generator.methodNode.getField(Type.getType(ctx.target.resultType().getDescriptor(c.getTarget().name)), ctx.fieldName, Type.getType(ctx.resultType().getDescriptor(c.getTarget().name)));
                        }
                    }
                };
            }
        });
    }
    
    public static class MethodCodeGenerator {
        private static class VariableInfo {
            public int index;
            public TypeAST type;

            public VariableInfo(int index, TypeAST type) {
                this.index = index;
                this.type = type;
            }
        }
        
        public GeneratorAdapter methodNode;
        private TypeAST returnType;
        private HashMap<String, VariableInfo> localNameToIndexMap = new HashMap<>();
        private Label start;
        private Label end;

        public MethodCodeGenerator(GeneratorAdapter methodNode, TypeAST returnType) {
            this.methodNode = methodNode;
            this.returnType = returnType;
            this.start = new Label();
            this.end = new Label();
        }
        
        public void start() {
            methodNode.visitLabel(start);
        }
        
        public void end() {
            methodNode.visitLabel(end);
        }
        
        public int declareVariable(String name, String desc, TypeAST type) {
            int index = localNameToIndexMap.size();
            localNameToIndexMap.put(name, new VariableInfo(index, type));
            methodNode.visitLocalVariable(name, desc, null, start, end, index);
            return index;
        }
        
        public int getVariableIndex(String name) {
            return localNameToIndexMap.get(name).index;
        }

        private boolean isVariable(String name) {
            return localNameToIndexMap.containsKey(name);
        }

        private TypeAST getVariableType(String name) {
            return localNameToIndexMap.get(name).type;
        }

        private TypeAST getReturnType() {
            return returnType;
        }
    }

    @Override
    public void populate(CommonClassTransformer transformer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
