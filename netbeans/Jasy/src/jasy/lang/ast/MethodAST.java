package jasy.lang.ast;

import jasy.lang.ASMCompiler;
import jasy.lang.ASMCompiler.Region;
import jasy.lang.ClassResolver;
import jasy.lang.SingleClassLoader;
import jasy.runtime.asm.CommonClassTransformer;
import jasy.runtime.asm.CompositeTransformer;
import jasy.runtime.asm.IfAllTransformer;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;
import java.util.OptionalInt;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.IntStream;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.commons.GeneratorAdapter;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.util.CheckClassAdapter;
import org.objectweb.asm.util.Textifier;
import org.objectweb.asm.util.TraceClassVisitor;

public class MethodAST extends AbstractAST implements MemberAST {
    public boolean isAdd;
    public MethodSelectorAST selector;
    public CodeAST body; // AST generator body
    public ASMCompiler.MetaProcessing mp;

    public MethodAST(Region region, boolean isAdd, MethodSelectorAST selector, CodeAST body, ASMCompiler.MetaProcessing mp) {
        super(region);
        this.isAdd = isAdd;
        this.selector = selector;
        this.body = body;
        this.mp = mp;
    }

    @Override
    public void accept(MemberVisitor visitor) {
        visitor.visitMethod(this);
    }

    @Override
    public void resolve(Scope thisClass, TypeAST expectedResultType, ClassResolver resolver, List<jasy.lang.ASMCompiler.Message> errorMessages) {
        selector.resolve(thisClass, expectedResultType, resolver, errorMessages);
        body.resolve(thisClass, expectedResultType, resolver, errorMessages);
    }

    public void populate(CompositeTransformer<Transformation<ClassNode>> classTransformer, IfAllTransformer<Transformation<MethodNode>> transformer) {
        if(!isAdd) {
            selector.populate(transformer);
        } else {
            java.lang.reflect.Method astGeneratorMethod = createASTGeneratorMethod();
            
            classTransformer.addTransformer(c -> {
                return () -> {
                    try {
                        // Invoke code generator code resulting into a CodeAST
                        Class<?> astGeneratorClass = astGeneratorMethod.getDeclaringClass();
                        Object astGenerator = astGeneratorClass.newInstance();
                        
                        for(String fieldName: mp.metaScope.getFieldNames()) {
                            try {
                                Field f = astGeneratorClass.getField(fieldName);
                                Object value = c.getVariableValue(fieldName);
                                f.set(astGenerator, value);
                            } catch (NoSuchFieldException ex) {
                                Logger.getLogger(MethodAST.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        
                        CodeAST body = (CodeAST)astGeneratorMethod.invoke(astGenerator, new Object[0]);
                        
                        System.out.println("Synthesized body:");
                        body.accept(new CodePrinter(System.out));
                        System.out.println();
                        
                        // Use the resulting CodeAST in toCode below
                        
                        int methodAccess = AST.Util.getAccessModifier(selector.accessModifier, selector.isStatic);
                        String methodName = selector.name;
                        Type[] argumentTypes = selector.parameters.stream()
                            .map(x -> Type.getType(x.type.getDescriptor(c.getTarget().name)))
                            .toArray(size -> new Type[size]);
                        String methodDescriptor = Type.getMethodDescriptor(
                            Type.getType(selector.returnType.getDescriptor(c.getTarget().name)), 
                            argumentTypes);

                        MethodNode methodNode = new MethodNode(methodAccess, methodName, methodDescriptor, null, null);
                        GeneratorAdapter generatorAdapter = new GeneratorAdapter(methodNode, methodAccess, methodName, methodDescriptor);
                        MethodCodeGenerator generator = new MethodCodeGenerator(generatorAdapter, selector.returnType);
                        
                        Hashtable<String, ParameterInfo> parameters = new Hashtable<>();
                        for(int i = 0; i < selector.parameters.size(); i++) {
                            Parameter p = selector.parameters.get(i);
                            parameters.put(p.name, new ParameterInfo(p.type, i + 1));
                        }

                        methodNode.visitCode();
                        generator.start();
                        toCode(c, body, generator, parameters, new InsnList() /*Something that generates a default values for non-void returns?*/);
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
                    } catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
                        Logger.getLogger(MethodAST.class.getName()).log(Level.SEVERE, null, ex);
                    }
                };
            });
        }
    }

    private java.lang.reflect.Method createASTGeneratorMethod() {
        // 1) Generate code to generate code
        ClassNode metaObjectClassNode = new ClassNode(Opcodes.ASM5);
        
        mp.metaScope.addFields(metaObjectClassNode);
        
        Hashtable<String, ParameterInfo> metaParameters = new Hashtable<>();
        Hashtable<String, TypeAST> metaVariables = new Hashtable<>();
        PreparedAST pbody = toCode(mp.metaScope, body, metaParameters, metaVariables);
//        ArrayList<TypeAST> returnTypes = new ArrayList<>();
//        pbody.returns(returnTypes);
        // Must return CodeAST
//        TypeAST returnType = returnTypes.get(0);
        
//        Class<?> returnTypeClass = int.class;
        Class<?> returnTypeClass = CodeAST.class;
        
        metaObjectClassNode.version = MetaExpressionAST.getOpcodesVersion();
        metaObjectClassNode.access = Opcodes.ACC_PUBLIC;
        metaObjectClassNode.name = "dejain/generator/ASMGenerator" + mp.generatorCount;
        metaObjectClassNode.signature = "L" + metaObjectClassNode.name + ";";
        metaObjectClassNode.superName = "java/lang/Object";
        
        MethodNode defaultConstructor = new MethodNode(Opcodes.ACC_PUBLIC, "<init>", "()V", null, null);
        defaultConstructor.visitCode();
        defaultConstructor.visitVarInsn(Opcodes.ALOAD, 0);
        defaultConstructor.visitMethodInsn(Opcodes.INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
        defaultConstructor.visitInsn(Opcodes.RETURN);
        defaultConstructor.visitMaxs(1,1);
        defaultConstructor.visitEnd();
        metaObjectClassNode.methods.add(defaultConstructor);
        
        MethodNode generatorMethod = new MethodNode(Opcodes.ACC_PUBLIC, "generator", Type.getMethodDescriptor(Type.getType(returnTypeClass)), null, new String[]{});
        GeneratorAdapter generatorAdapter = new GeneratorAdapter(generatorMethod, generatorMethod.access, generatorMethod.name, generatorMethod.desc);
        MethodCodeGenerator metaCodeGenerator = new MethodCodeGenerator(generatorAdapter, null);
        generatorMethod.visitCode();
        pbody.generate(new Transformation<>(metaObjectClassNode), metaCodeGenerator, new InsnList());
        generatorMethod.visitMaxs(0,0);
        generatorMethod.visitEnd();
        metaObjectClassNode.methods.add(generatorMethod);
        
        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS|ClassWriter.COMPUTE_FRAMES);
//        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              _MAXS);
        metaObjectClassNode.accept(cw);
        
        TraceClassVisitor traceClassVisitor = new TraceClassVisitor(null, new Textifier(), new PrintWriter(System.out));
        new ClassReader(cw.toByteArray()).accept(traceClassVisitor, 0);
//        metaObjectClassNode.accept(traceClassVisitor);
        CheckClassAdapter.verify(new ClassReader(cw.toByteArray()), true, new PrintWriter(System.out));
        
        SingleClassLoader classLoader = new SingleClassLoader(metaObjectClassNode);
        Class<?> metaObjectClass = classLoader.loadClass();
        java.lang.reflect.Method bodyAsMethodTmp = null;
        
        try {
                                                                                                                                                                                                                                                                                                                        bodyAsMethodTmp = metaObjectClass.getMethod("generator", new Class<?>[0]);  
                                                                                                                                                                                                                                                                                                                    } catch (NoSuchMethodException | SecurityException ex) {
            Logger.getLogger(MetaExpressionAST.class.getName()).log(Level.SEVERE, null, ex);
        }

        mp.generatorCount++;
        
        return bodyAsMethodTmp;
    }
    

    public static void toCode(Transformation<ClassNode> c, CodeAST body, MethodCodeGenerator generator, Hashtable<String, ParameterInfo> parameters) {
        toCode(c, body, generator, parameters, new InsnList());
    }

    private static void toCode(Transformation<ClassNode> c, CodeAST body, MethodCodeGenerator generator, Hashtable<String, ParameterInfo> parameters, InsnList originalIl) {
        Hashtable<String, TypeAST> variables = new Hashtable<>();
        
        PreparedAST pa = toCode(new ClassNodeScope(c.getTarget()), body, parameters, variables);
        pa.generate(c, generator, originalIl);
    }

    public static PreparedAST toCode(Scope thisClass, CodeAST ctx, Hashtable<String, ParameterInfo> parameters, Hashtable<String, TypeAST> variables) {
        return ctx.accept(new CodePreparer(thisClass, ctx, parameters, variables));
    }

    public static void appendStore(MethodCodeGenerator generator, int ordinal, TypeAST type) {
        switch(type.getSimpleName()) {
            case "boolean":
            case "byte":
            case "short":
            case "int":
                generator.methodNode.visitVarInsn(Opcodes.ISTORE, ordinal);
                break;
            case "long":
                generator.methodNode.visitVarInsn(Opcodes.LSTORE, ordinal);
                break;
            case "float":
                generator.methodNode.visitVarInsn(Opcodes.FSTORE, ordinal);
                break;
            case "double":
                generator.methodNode.visitVarInsn(Opcodes.DSTORE, ordinal);
                break;
            default:
                generator.methodNode.visitVarInsn(Opcodes.ASTORE, ordinal);
                break;
        }
    }
    
    public static PreparedExpressionAST toExpression(Scope thisClass, ExpressionAST expression, Hashtable<String, ParameterInfo> parameters, Hashtable<String, TypeAST> variables) {
        return toExpression(thisClass, expression, parameters, variables, true);
    }
    
    public static PreparedExpressionAST toExpression(Scope thisClass, ExpressionAST expression, Hashtable<String, ParameterInfo> parameters, Hashtable<String, TypeAST> variables, boolean asExpression) {
        return expression.accept(new ExpressionPreparer(thisClass, expression, parameters, variables, asExpression));
    }
    
    public static ExpressionAST quote(Scope thisClass, CodeAST ctx, Hashtable<String, TypeAST> variables) {
        return ctx.accept(new CodeQuoter(thisClass, ctx, variables));
    }
    
    public static ExpressionAST quote(String str) {
        return new StringLiteralAST(null, str);
    }
            
    public static ExpressionAST quote(TypeAST type) {
        ExpressionAST classForName = new GetClassAST(null, type);
        
        return new NewAST(null, new NameTypeAST(null, NameTypeAST.class), Arrays.asList(new NullAST(null), classForName));
    }
    
    @Override
    public void populate(CommonClassTransformer transformer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
