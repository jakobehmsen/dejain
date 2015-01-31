package dejain.lang.ast;

import dejain.lang.ASMCompiler;
import dejain.lang.ASMCompiler.Region;
import dejain.lang.ClassResolver;
import dejain.runtime.asm.CommonClassTransformer;
import dejain.runtime.asm.CompositeTransformer;
import dejain.runtime.asm.IfAllTransformer;
import java.util.HashMap;
import java.util.List;
import java.util.OptionalInt;
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

    @Override
    public void resolve(ClassAST thisClass, TypeAST expectedResultType, ClassResolver resolver, List<dejain.lang.ASMCompiler.Message> errorMessages) {
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
                    toCode(thisClassName, body, generator, new InsnList() /*Something that generates a default values for non-void returns?*/);
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

    public static void toCode(String thisClassName, List<CodeAST> body, MethodCodeGenerator generator) {
        toCode(thisClassName, body, generator, new InsnList());
    }

    private static void toCode(String thisClassName, List<CodeAST> body, MethodCodeGenerator generator, InsnList originalIl) {
        body.forEach(ctx -> toCode(thisClassName, ctx, generator, originalIl, false));
    }

    public static void toCode(String thisClassName, CodeAST ctx, MethodCodeGenerator generator, boolean asExpression) {
        toCode(thisClassName, ctx, generator, new InsnList(), asExpression);
    }

    private static void toCode(String thisClassName, CodeAST ctx, MethodCodeGenerator generator, InsnList originalIl, boolean asExpression) {
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
                
                switch(ctx.resultType().getSimpleName(thisClassName)) {
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
                
                Type[] argumentTypes = ctx.arguments.stream().map(a -> Type.getType(a.resultType().getDescriptor(thisClassName))).toArray(size -> new Type[size]);
                Type returnType = Type.getType(ctx.resultType().getDescriptor(thisClassName));
                Method method = new Method(ctx.methodName, returnType, argumentTypes);
                
                if(ctx.target != null)
                    generator.methodNode.invokeVirtual(Type.getType(ctx.target.resultType().getDescriptor(thisClassName)), method);
                else
                    generator.methodNode.invokeStatic(Type.getType(ctx.declaringClass.getDescriptor(thisClassName)), method);
            }

            @Override
            public void visitFieldSet(FieldSetAST ctx) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void visitMeta(MetaExpressionAST ctx) {
                ctx.generatedExpression.accept(this);
            }

            @Override
            public void visitThis(ThisAST ctx) {
                generator.methodNode.loadThis();
            }

            @Override
            public void visitFieldGet(FieldGetAST ctx) {
                ctx.target.accept(this);
                generator.methodNode.getField(Type.getType(ctx.target.resultType().getDescriptor(thisClassName)), ctx.fieldName, Type.getType(ctx.resultType().getDescriptor(thisClassName)));
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
