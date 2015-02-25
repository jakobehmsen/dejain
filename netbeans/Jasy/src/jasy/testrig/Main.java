package jasy.testrig;

import jasy.lang.ASMCompiler;
import jasy.lang.ASMCompiler.Message;
import jasy.lang.ClassBytesFromFile;
import jasy.lang.ClassBytesSource;
import jasy.lang.CommonClassMap;
import jasy.lang.CommonClassResolver;
import jasy.lang.ModuleClassBytesTransformer;
import jasy.lang.ProxyClassLoader;
import jasy.lang.SingleClassLoader;
import jasy.lang.ast.ClassNodeScope;
import jasy.lang.ast.CodeAST;
import jasy.lang.ast.CodePrinter;
import jasy.lang.ast.MetaExpressionAST;
import jasy.lang.ast.MethodAST;
import static jasy.lang.ast.MethodAST.toCode;
import jasy.lang.ast.MethodCodeGenerator;
import jasy.lang.ast.ParameterInfo;
import jasy.lang.ast.PreparedAST;
import jasy.lang.ast.Transformation;
import jasy.lang.ast.TypeAST;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JSplitPane;
import javax.swing.JTextPane;
import javax.swing.JToolBar;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.commons.GeneratorAdapter;
import org.objectweb.asm.commons.Method;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.util.CheckClassAdapter;
import org.objectweb.asm.util.Textifier;
import org.objectweb.asm.util.TraceClassVisitor;

public class Main {
    private static ExecutorService resourceService = Executors.newCachedThreadPool();
    
    private static <T> Future<T> getResource(Callable<T> source) {
        return resourceService.submit(source);
    }
    
    public static void main(String[] args) {
//        if(args.length != 1) {
//            System.out.println("Valid invocation: <programName> <classPath>");
//            return;
//        }
//        
//        String classPath = args[0];
        
        Font codeFont = new Font(Font.MONOSPACED, Font.PLAIN, 12);
        
        JFrame frame = new JFrame("Jasy Testrig");
        
        JToolBar toolBar = new JToolBar();
        toolBar.setFloatable(false);
        
        frame.getContentPane().add(toolBar, BorderLayout.NORTH);
        
        JSplitPane splitPane = new JSplitPane();
        
        splitPane.setResizeWeight(0.5);
        
        JTextPane transformationText = createCodeTextPane();
        transformationText.setBorder(BorderFactory.createTitledBorder("Transformation"));
        
        splitPane.setLeftComponent(transformationText);
        
        JTextPane applicationText = createCodeTextPane();
        applicationText.setBorder(BorderFactory.createTitledBorder("Application"));
        
        splitPane.setRightComponent(applicationText);
        
        String javaRTJar = System.getProperty("java.home") + "/lib/rt.jar";
//        JarClassBytesSource classBytesSource = new JarClassBytesSource(javaRTJar);
        
        Future<JarClassBytesSource> classBytesSourceResource = getResource(() -> new JarClassBytesSource(javaRTJar));
//        ClassLoader alwaysErrClassLoader = new ClassLoader() {
//            @Override
//            public Class<?> loadClass(String name) throws ClassNotFoundException {
//                throw new ClassNotFoundException(name);
//            }
//        };
        
        toolBar.add(new AbstractAction("Run") {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    CommonClassMap classMap = new CommonClassMap();
                    CommonClassResolver classResolver = new CommonClassResolver(classMap);
                    ASMCompiler compiler = new ASMCompiler(classResolver);
                    
                    String moduleSource = transformationText.getText();
                    String applicationSourceCode = applicationText.getText();
                    
//                String javaRTJar = System.getProperty("java.home") + "/lib/rt.jar";
                    ClassBytesSource classBytesSource = classBytesSourceResource.get();
                    ClassLoader classLoader = new ProxyClassLoader(
                        classBytesSource
                        .andThen(new ModuleClassBytesTransformer(moduleSource, classResolver))
                    );
                    try {
                        CodeAST applicationCode = compiler.compileStatements(new ByteArrayInputStream(applicationSourceCode.getBytes()));
                        
                        ArrayList<Message> errorMessages = new ArrayList<>();
                        
                        ClassNode metaObjectClassNode = new ClassNode(Opcodes.ASM5);
                        
                        applicationCode.resolve(new ClassNodeScope(metaObjectClassNode), null, classResolver, classLoader, errorMessages);
                        
                        Hashtable<String, ParameterInfo> metaParameters = new Hashtable<>();
                        Hashtable<String, TypeAST> metaVariables = new Hashtable<>();
                        
                        PreparedAST pbody = MethodAST.toCode(new ClassNodeScope(metaObjectClassNode), applicationCode, classResolver, classLoader, metaParameters, metaVariables);
                        
                        metaObjectClassNode.version = MetaExpressionAST.getOpcodesVersion();
                        metaObjectClassNode.access = Opcodes.ACC_PUBLIC;
                        metaObjectClassNode.name = "Main";
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
                        
                        MethodNode generatorMethod = new MethodNode(Opcodes.ACC_PUBLIC | Opcodes.ACC_STATIC, "main", "()V", null, new String[]{});
                        GeneratorAdapter generatorAdapter = new GeneratorAdapter(generatorMethod, generatorMethod.access, generatorMethod.name, generatorMethod.desc);
                        MethodCodeGenerator metaCodeGenerator = new MethodCodeGenerator(generatorAdapter, null);
                        generatorMethod.visitCode();
                        
                        pbody.generate(new Transformation<>(metaObjectClassNode), metaCodeGenerator, new InsnList());
                    
                        metaCodeGenerator.methodNode.visitInsn(Opcodes.RETURN);
                        generatorMethod.visitMaxs(0,0);
                        generatorMethod.visitEnd();
                        metaObjectClassNode.methods.add(generatorMethod);
                        
                        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS|ClassWriter.COMPUTE_FRAMES);
                        metaObjectClassNode.accept(cw);
                        
//                        TraceClassVisitor traceClassVisitor = new TraceClassVisitor(null, new Textifier(), new PrintWriter(System.out));
//                        new ClassReader(cw.toByteArray()).accept(traceClassVisitor, 0);
//                        CheckClassAdapter.verify(new ClassReader(cw.toByteArray()), true, new PrintWriter(System.out));
                        
                        SingleClassLoader metaClassLoader = new SingleClassLoader(metaObjectClassNode);
                        Class<?> metaObjectClass = metaClassLoader.loadClass();
                        java.lang.reflect.Method bodyAsMethodTmp;
                        try {
                            bodyAsMethodTmp = metaObjectClass.getDeclaredMethod(generatorMethod.name, new Class<?>[0]);
                            try {
                                bodyAsMethodTmp.invoke(null, new Object[0]);
                            } catch (IllegalAccessException ex) {
                                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                            } catch (IllegalArgumentException ex) {
                                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                            } catch (InvocationTargetException ex) {
                                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        } catch (NoSuchMethodException ex) {
                            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (SecurityException ex) {
                            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    } catch (IOException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } catch (InterruptedException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ExecutionException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        frame.getContentPane().add(splitPane, BorderLayout.CENTER);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1024, 768);
        
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
    private static Font codeFont = new Font(Font.MONOSPACED, Font.PLAIN, 12);
    
    private static JTextPane createCodeTextPane() {
        JTextPane textPane = new JTextPane();
        textPane.setFont(codeFont);
        return textPane;
    }
}
