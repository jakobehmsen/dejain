package jasy.runtime.agent;

import jasy.lang.ASMCompiler;
import jasy.lang.CommonClassMap;
import jasy.lang.CommonClassResolver;
import jasy.lang.ast.ModuleAST;
import jasy.runtime.asm.ClassTransformer;
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
        ModuleAST module = compiler.compile(sourceCode);
//        ClassTransformer classTransformer = compiler.compile(sourceCode, errorMessages);
        // Parsing and ClassResolver creation can be performed in parallel
        
        module.resolve(null, null, classResolver, ClassLoader.getSystemClassLoader(), errorMessages);
        
        if(errorMessages.isEmpty()) {
//            ClassTransformer classTransformer = module.toClassTransformer();
//            inst.addTransformer(new ASMBasedClassFileTransformer(classTransformer));
        } else {
            System.out.println("The following errors were found for '" + sourceCodeFilePath + "':");
            errorMessages.forEach(m -> System.out.println(m));
        }
    }
}
