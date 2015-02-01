package dejain.lang.ast;

import dejain.lang.ASMCompiler;
import dejain.lang.ASMCompiler.Region;
import dejain.lang.ClassResolver;
import dejain.runtime.asm.CommonClassTransformer;
import dejain.runtime.asm.CompositeTransformer;
import dejain.runtime.asm.IfAllTransformer;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.objectweb.asm.Label;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.commons.AdviceAdapter;
import org.objectweb.asm.commons.GeneratorAdapter;
import org.objectweb.asm.commons.Method;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldNode;
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
        code.accept(new CodeVisitor() {
            @Override
            public void visitReturn(ReturnAST ctx) {
                returnTypes.add(ctx.expression.resultType());
            }

            @Override
            public void visitStringLiteral(LiteralAST<String> ctx) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void visitIntegerLiteral(LiteralAST<Integer> ctx) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void visitBinaryExpression(BinaryExpressionAST ctx) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void visitInvocation(InvocationAST ctx) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void visitFieldSet(FieldSetAST ctx) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void visitLongLiteral(LiteralAST<Long> ctx) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void visitMeta(MetaExpressionAST ctx) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void visitThis(ThisAST ctx) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void visitFieldGet(FieldGetAST ctx) {
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
                    String thisClassName = c.getTarget().name;
                    
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
        body.forEach(ctx -> toCode(c, ctx, generator, originalIl, false));
    }

    public static void toCode(Transformation<ClassNode> c, CodeAST ctx, MethodCodeGenerator generator, boolean asExpression) {
        toCode(c, ctx, generator, new InsnList(), asExpression);
    }

    private static void toCode(Transformation<ClassNode> c, CodeAST ctx, MethodCodeGenerator generator, InsnList originalIl, boolean asExpression) {
        ctx.accept(new CodeVisitor() {
            @Override
            public void visitReturn(ReturnAST ctx) {
                ctx.expression.accept(this);
                generator.methodNode.returnValue();
            }

            @Override
            public void visitStringLiteral(LiteralAST<String> ctx) {
                generator.methodNode.push(ctx.value);
            }

            @Override
            public void visitIntegerLiteral(LiteralAST<Integer> ctx) {
                generator.methodNode.push(ctx.value);
            }

            @Override
            public void visitLongLiteral(LiteralAST<Long> ctx) {
                generator.methodNode.push(ctx.value);
            }

            @Override
            public void visitBinaryExpression(BinaryExpressionAST ctx) {
                ctx.lhs.accept(this);
                ctx.rhs.accept(this);
                
                switch(ctx.resultType().getSimpleName(c.getTarget().name)) {
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

            @Override
            public void visitInvocation(InvocationAST ctx) {
                ctx.arguments.forEach(a -> a.accept(this));
                
                Type[] argumentTypes = ctx.arguments.stream().map(a -> Type.getType(a.resultType().getDescriptor(c.getTarget().name))).toArray(size -> new Type[size]);
                Type returnType = Type.getType(ctx.resultType().getDescriptor(c.getTarget().name));
                Method method = new Method(ctx.methodName, returnType, argumentTypes);
                
                if(ctx.target != null)
                    generator.methodNode.invokeVirtual(Type.getType(ctx.target.resultType().getDescriptor(c.getTarget().name)), method);
                else
                    generator.methodNode.invokeStatic(Type.getType(ctx.declaringClass.getDescriptor(c.getTarget().name)), method);
            }

            @Override
            public void visitFieldSet(FieldSetAST ctx) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void visitMeta(MetaExpressionAST ctx) {
                Class<?> generatorClass2 = ctx.bodyAsMethod.getDeclaringClass();
                try {
                    Object generator = generatorClass2.newInstance();

                    // 2) Evaluate the generated code which result in a String
                    for(String fieldName: ctx.mp.metaScope.getFieldNames()) {
                        try {
                            Field f = generatorClass2.getField(fieldName);
                            Object value = c.getVariableValue(fieldName);
                            f.set(generator, value);
                        } catch (NoSuchFieldException ex) {
                            Logger.getLogger(MethodAST.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
//                    for(Map.Entry<String, Object> patternVariable: patternVariables.entrySet()) {
//                        try {
//                            Field f = generatorClass2.getField(patternVariable.getKey());
//                            f.set(generator, patternVariable.getValue());
//                        } catch (NoSuchFieldException ex) {
//                            Logger.getLogger(MetaExpressionAST.class.getName()).log(Level.SEVERE, null, ex);
//                        }
//                    }

//                    bodyAsMethod = generatorClass2.getMethod("generator", null);

                    // Expression is derived pr transformation
                    Object value = ctx.bodyAsMethod.invoke(generator, null);
                    ExpressionAST generatedExpression = ctx.convertToExpression(value, ctx.bodyAsMethod.getReturnType());
                    generatedExpression.accept(this);
                } catch (SecurityException | IllegalArgumentException | InstantiationException | IllegalAccessException | InvocationTargetException ex) {
                    Logger.getLogger(MetaExpressionAST.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                
//                ctx.generatedExpression.accept(this);
            }

            @Override
            public void visitThis(ThisAST ctx) {
                generator.methodNode.loadThis();
            }

            @Override
            public void visitFieldGet(FieldGetAST ctx) {
                ctx.target.accept(this);
                generator.methodNode.getField(Type.getType(ctx.target.resultType().getDescriptor(c.getTarget().name)), ctx.fieldName, Type.getType(ctx.resultType().getDescriptor(c.getTarget().name)));
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
