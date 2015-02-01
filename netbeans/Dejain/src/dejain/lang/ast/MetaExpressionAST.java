package dejain.lang.ast;

import dejain.lang.ASMCompiler;
import dejain.lang.ASMCompiler.Message;
import dejain.lang.ASMCompiler.Region;
import dejain.lang.ClassResolver;
import dejain.lang.SingleClassLoader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import javafx.beans.binding.StringExpression;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.commons.GeneratorAdapter;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.MethodNode;

public class MetaExpressionAST<T> extends AbstractAST implements ExpressionAST {
    public ASMCompiler compiler;
    public List<CodeAST> body;
    public Method bodyAsMethod;
    public TypeAST resultType;
//    public ExpressionAST generatedExpression;
    public ASMCompiler.MetaProcessing mp;

    // Region and compiler could probably be merged into a single CompilationContext|CompilationUnit thingy
    public MetaExpressionAST(ASMCompiler.Region region, ASMCompiler compiler, List<CodeAST> body, ASMCompiler.MetaProcessing mp) {
        super(region);
        
        this.compiler = compiler;
        this.body = body;
        this.bodyAsMethod = bodyAsMethod;
        this.mp = mp;
    }
    
    private static int getOpcodesVersion() {
        String javaVersion = System.getProperty("java.version");
        String[] javaVersionNumbers = javaVersion.split("\\.|_");
        int major = Integer.parseInt(javaVersionNumbers[0]);
        int minor = Integer.parseInt(javaVersionNumbers[1]);
        
        switch(major) {
            case 1:
                switch(minor) {
                    case 1:
                        return Opcodes.V1_1;
                    case 2:
                        return Opcodes.V1_2;
                    case 3:
                        return Opcodes.V1_3;
                    case 4:
                        return Opcodes.V1_4;
                    case 5:
                        return Opcodes.V1_5;
                    case 6:
                        return Opcodes.V1_6;
                    case 7:
                        return Opcodes.V1_7;
                    case 8:
                        return Opcodes.V1_8;
                }
            break;
        }
        
        return -1;
    }

    @Override
    public void resolve(Scope thisClass, TypeAST expectedResultType, ClassResolver resolver, List<ASMCompiler.Message> errorMessages) {
        // expectedResultType should for body should a type pattern including String, int, ...rest primitive types..., ExpressionAST
        body.forEach(s -> s.resolve(mp.metaScope, new NameTypeAST(getRegion(), ExpressionAST.class), resolver, errorMessages));
        List<TypeAST> returnTypes = MethodAST.getReturnType(body);
        // Dangerous
        Class<?> returnTypeClass = ((NameTypeAST)returnTypes.get(0)).getType();

        // 1) Generate code to generate code
        ClassNode generatorClassNode = new ClassNode(Opcodes.ASM5);
        
        mp.metaScope.addFields(generatorClassNode);
        
        generatorClassNode.version = getOpcodesVersion();
        generatorClassNode.access = Opcodes.ACC_PUBLIC;
        generatorClassNode.name = "dejain/generator/ASMGenerator" + mp.generatorCount;
        generatorClassNode.superName = "java/lang/Object";
        MethodNode generatorMethod = new MethodNode(Opcodes.ACC_PUBLIC, "generator", Type.getMethodDescriptor(Type.getType(returnTypeClass)), null, new String[]{});
        generatorClassNode.methods.add(generatorMethod);
        
        MethodNode defaultConstructor = new MethodNode(Opcodes.ACC_PUBLIC, "<init>", "()V", null, null);
        defaultConstructor.visitCode();
        defaultConstructor.visitVarInsn(Opcodes.ALOAD, 0);
        defaultConstructor.visitMethodInsn(Opcodes.INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
        defaultConstructor.visitInsn(Opcodes.RETURN);
        defaultConstructor.visitMaxs(1,1);
        defaultConstructor.visitEnd();
        generatorClassNode.methods.add(defaultConstructor);

        GeneratorAdapter generatorAdapter = new GeneratorAdapter(generatorMethod, generatorMethod.access, generatorMethod.name, generatorMethod.desc);
        MethodAST.toCode(new Transformation<>(generatorClassNode), body, new MethodAST.MethodCodeGenerator(generatorAdapter, null));

        SingleClassLoader classLoader = new SingleClassLoader(generatorClassNode);
        Class<?> generatorClass2 = classLoader.loadClass();
        try {
            bodyAsMethod = generatorClass2.getMethod("generator", null);
        } catch (NoSuchMethodException ex) {
            Logger.getLogger(MetaExpressionAST.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SecurityException ex) {
            Logger.getLogger(MetaExpressionAST.class.getName()).log(Level.SEVERE, null, ex);
        }

//        try {
//            Object generator = generatorClass2.newInstance();
//            
//            // 2) Evaluate the generated code which result in a String
//            for(Map.Entry<String, Object> patternVariable: patternVariables.entrySet()) {
//                try {
//                    Field f = generatorClass2.getField(patternVariable.getKey());
//                    f.set(generator, patternVariable.getValue());
//                } catch (NoSuchFieldException ex) {
//                    Logger.getLogger(MetaExpressionAST.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//            
//            bodyAsMethod = generatorClass2.getMethod("generator", null);
//            
//            // Expression is derived pr transformation
//            Object value = bodyAsMethod.invoke(generator, null);
//            generatedExpression = convertToExpression(value, bodyAsMethod.getReturnType());
//        } catch (NoSuchMethodException | SecurityException | IllegalArgumentException | InstantiationException | IllegalAccessException | InvocationTargetException ex) {
//            Logger.getLogger(MetaExpressionAST.class.getName()).log(Level.SEVERE, null, ex);
//        }

        mp.generatorCount++;
        
//        resultType = expectedResultType;
        resultType = new NameTypeAST(getRegion(), resultType(bodyAsMethod.getReturnType()));
        // Check that the return type of the body is valid. 
        // - I.e., convertible into an ExpressionAST.
        
//        try {
//            Object value = bodyAsMethod.invoke(null, null);
//            generatedExpression = convertToExpression(value, bodyAsMethod.getReturnType());
//        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
//            Logger.getLogger(MetaExpressionAST.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }
    
    public ExpressionAST convertToExpression(Object value, Class<?> returnType) {
        switch(returnType.getName()) {
            case "java.lang.String":
                return new LiteralAST<>(getRegion(), (String)value, LiteralDelegateAST.String);
            case "int":
                return new LiteralAST<>(getRegion(), (int)value, LiteralDelegateAST.Integer);
        }
        
        if(value instanceof ExpressionAST)
            return (ExpressionAST)value;
        
        return null;
    }
    
    private Class<?> resultType(Class<?> returnType) {
        switch(returnType.getName()) {
            case "java.lang.String":
            case "int":
                return LiteralAST.class;
        }
        
        if(returnType == ExpressionAST.class)
            return ExpressionAST.class;
        
        return null;
    }

    @Override
    public TypeAST resultType() {
//        return new NameTypeAST(getRegion(), resultType(bodyAsMethod.getReturnType()));
        return resultType;
    }

    @Override
    public void accept(CodeVisitor visitor) {
        visitor.visitMeta(this);
    }
}
