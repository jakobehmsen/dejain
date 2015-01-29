package dejain.runtime.agent;

import dejain.lang.ASMCompiler;
import dejain.lang.CommonClassMap;
import dejain.lang.CommonClassResolver;
import dejain.lang.ast.ModuleContext;
import dejain.runtime.asm.ClassTransformer;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.instrument.Instrumentation;
import java.util.ArrayList;

public class Agent {
    public static void premain(String args, Instrumentation inst) throws IOException {
        String sourceCodeFilePath = args;
        System.out.println(sourceCodeFilePath);
        InputStream sourceCode = new FileInputStream(sourceCodeFilePath);
        ArrayList<ASMCompiler.Message> errorMessages = new ArrayList<ASMCompiler.Message>();
        long start = System.currentTimeMillis();
//        ClassResolver classResolver = new ClassResolver(new ClassMap());
        CommonClassResolver classResolver = new CommonClassResolver(CommonClassMap.createDefault());
        long end = System.currentTimeMillis();
        System.out.println("Default class map loading: " + (end - start) + "ms");
        classResolver.importPackage("java.lang");
        ASMCompiler compiler = new ASMCompiler(classResolver);
        ModuleContext module = compiler.compile(sourceCode);
//        ClassTransformer classTransformer = compiler.compile(sourceCode, errorMessages);
        // Parsing and ClassResolver creation can be performed in parallel
        
        module.resolve(null, classResolver, errorMessages);
        
        if(errorMessages.isEmpty()) {
//            ClassTransformer classTransformer = module.toClassTransformer();
//            inst.addTransformer(new ASMBasedClassFileTransformer(classTransformer));
        } else {
            System.out.println("The following errors were found for '" + sourceCodeFilePath + "':");
            errorMessages.forEach(m -> System.out.println(m));
        }
    }
}
