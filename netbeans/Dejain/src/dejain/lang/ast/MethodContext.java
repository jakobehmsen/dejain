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

public class MethodContext extends AbstractContext implements MemberContext {
    public boolean isAdd;
    public MethodSelectorContext selector;
    public List<CodeContext> body;

    public MethodContext(Region region, boolean isAdd, MethodSelectorContext selector, List<CodeContext> body) {
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
    public void resolve(ClassContext thisClass, ClassResolver resolver, List<dejain.lang.ASMCompiler.Message> errorMessages) {
        selector.resolve(thisClass, resolver, errorMessages);
        body.forEach(s -> s.resolve(thisClass, resolver, errorMessages));
    }

    public void populate(CompositeTransformer<ClassNode> classTransformer, IfAllTransformer<MethodNode> transformer) {
        if(!isAdd) {
            selector.populate(transformer);
        } else {
            classTransformer.addTransformer(c -> {
                return () -> {                    
                    int methodAccess = Context.Util.getAccessModifier(selector.accessModifier, selector.isStatic);
                    String methodName = selector.name;
                    Type[] argumentTypes = selector.parameterTypes.stream()
                        .map(x -> Type.getType(x.getName()))
                        .toArray(size -> new Type[size]);
                    String methodDescriptor = Type.getMethodDescriptor(
                        Type.getType(selector.returnType.getName()), 
                        argumentTypes);
                    
                    MethodNode methodNode = new MethodNode(methodAccess, methodName, methodDescriptor, null, null);
                    GeneratorAdapter generatorAdapter = new GeneratorAdapter(methodNode, methodAccess, methodName, methodDescriptor);
                    MethodCodeGenerator generator = new MethodCodeGenerator(generatorAdapter, selector.returnType);

                    generator.start();
                    toCode(body, generator, new InsnList() /*Something that generates a default values for non-void returns?*/);
                    generator.end();

                    methodNode.visitEnd();

                    OptionalInt existingMethodIndex =
                        IntStream.range(0, c.methods.size())
                        .filter(i -> 
                            ((MethodNode)c.methods.get(i)).name.equals(methodName) && 
                            ((MethodNode)c.methods.get(i)).desc.equals(methodDescriptor))
                        .findFirst();
                    if(existingMethodIndex.isPresent())
                        c.methods.remove(existingMethodIndex.getAsInt());

                    c.methods.add(methodNode);
                };
            });
        }
    }

    private static void toCode(List<CodeContext> body, MethodCodeGenerator generator, InsnList originalIl) {
        body.forEach(ctx -> toCode(ctx, generator, originalIl, false));
    }

    public static void toCode(CodeContext ctx, MethodCodeGenerator generator, boolean asExpression) {
        toCode(ctx, generator, new InsnList(), asExpression);
    }

    private static void toCode(CodeContext ctx, MethodCodeGenerator generator, InsnList originalIl, boolean asExpression) {
        ctx.accept(new CodeVisitor() {
            @Override
            public void visitReturn(ReturnContext ctx) {
                ctx.expression.accept(this);
                generator.methodNode.returnValue();
            }

            @Override
            public void visitStringLiteral(LiteralContext<String> ctx) {
                generator.methodNode.push(ctx.value);
            }

            @Override
            public void visitIntegerLiteral(LiteralContext<Integer> ctx) {
                generator.methodNode.push(ctx.value);
            }

            @Override
            public void visitLongLiteral(LiteralContext<Long> ctx) {
                generator.methodNode.push(ctx.value);
            }

            @Override
            public void visitBinaryExpression(BinaryExpressionContext ctx) {
                ctx.lhs.accept(this);
                ctx.rhs.accept(this);
                
                switch(ctx.resultType().getSimpleName()) {
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
            public void visitInvocation(InvocationContext ctx) {
                ctx.arguments.forEach(a -> a.accept(this));
                
                Type[] argumentTypes = ctx.arguments.stream().map(a -> Type.getType(a.resultType().getName())).toArray(size -> new Type[size]);
                Type returnType = Type.getType(ctx.resultType().getName());
                Method method = new Method(ctx.methodName, returnType, argumentTypes);
                
                if(ctx.target != null)
                    generator.methodNode.invokeVirtual(Type.getType(ctx.target.resultType().getName()), method);
                else
                    generator.methodNode.invokeStatic(Type.getType(ctx.declaringClass.getName()), method);
            }

            @Override
            public void visitFieldSet(FieldSetContext ctx) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void visitMeta(MetaContext ctx) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void visitThis(ThisContext ctx) {
                generator.methodNode.loadThis();
            }

            @Override
            public void visitFieldGet(FieldGetContext ctx) {
                ctx.target.accept(this);
                generator.methodNode.getField(Type.getType(ctx.target.resultType().getName()), ctx.fieldName, Type.getType(ctx.resultType().getName()));
            }
        });
    }
    
    public static class MethodCodeGenerator {
        private static class VariableInfo {
            public int index;
            public TypeContext type;

            public VariableInfo(int index, TypeContext type) {
                this.index = index;
                this.type = type;
            }
        }
        
        public GeneratorAdapter methodNode;
        private TypeContext returnType;
        private HashMap<String, VariableInfo> localNameToIndexMap = new HashMap<>();
        private Label start;
        private Label end;

        public MethodCodeGenerator(GeneratorAdapter methodNode, TypeContext returnType) {
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
        
        public int declareVariable(String name, String desc, TypeContext type) {
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

        private TypeContext getVariableType(String name) {
            return localNameToIndexMap.get(name).type;
        }

        private TypeContext getReturnType() {
            return returnType;
        }
    }

    @Override
    public void populate(CommonClassTransformer transformer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
