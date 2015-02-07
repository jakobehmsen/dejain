package jasy.lang;

import jasy.lang.antlr4.JasyBaseVisitor;
import jasy.lang.antlr4.JasyLexer;
import jasy.lang.antlr4.JasyParser;
import jasy.lang.antlr4.JasyParser.AnnotationContext;
import jasy.lang.antlr4.JasyParser.ClassTransformerContext;
import jasy.lang.antlr4.JasyParser.ClassTransformerMemberContext;
import jasy.lang.antlr4.JasyParser.ClassTransformerMemberFieldContext;
import jasy.lang.antlr4.JasyParser.ClassTransformerMemberMethodContext;
import jasy.lang.antlr4.JasyParser.ExpressionContext;
import jasy.lang.antlr4.JasyParser.ProgramContext;
import jasy.lang.antlr4.JasyParser.StatementContext;
import jasy.lang.antlr4.JasyParser.StatementsContext;
import jasy.runtime.javassist.ClassAction;
import jasy.runtime.javassist.ClassTransformer;
import jasy.runtime.javassist.ClassTransformerSequence;
import jasy.runtime.javassist.CommonClassTransformer;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import javassist.CannotCompileException;
import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtField;
import javassist.CtMethod;
import javassist.NotFoundException;
import javassist.bytecode.AnnotationsAttribute;
import javassist.bytecode.BadBytecode;
import javassist.bytecode.ConstPool;
import javassist.bytecode.LocalVariableAttribute;
import javassist.bytecode.annotation.Annotation;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.Interval;
import org.objectweb.asm.tree.MethodNode;

public class JavassistCompiler {
    public static ClassTransformer compile(InputStream sourceCode) throws IOException {
        CharStream charStream = new ANTLRInputStream(sourceCode);
        JasyLexer lexer = new JasyLexer(charStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        JasyParser parser = new JasyParser(tokenStream);
        
        ProgramContext program = parser.program();
        
        /*
        Should return something that is able to figure out which actions to invoke based on the 
        particular classes supplied.
        
        There might be multiple of these rules.
        
        Behavior resolvers; search for appropriate behavior;
        
        interface ClassTransformer
            ClassAction resolve(CtClass ctClass);
            
        interface ClassAction
            void perform (CtClass ctClass);
        
        ClassTransformer root = ...
        
        while(true) {
            ClassAction action = root.resolve(ctClass);
            if(action == null)
                break;
            action.perform(ctClass);
        }
        
        */
        
        ClassTransformerSequence classTransformers = new ClassTransformerSequence();
        
        program.accept(new JasyBaseVisitor<Object>() {
            @Override
            public Object visitClassTransformer(ClassTransformerContext ctx) {
                CommonClassTransformer transformer = new CommonClassTransformer();
                
                for(AnnotationContext annotationCtx: ctx.annotations().annotation()) {
                    if(annotationCtx.PLUS() == null) {
                        
                    }
                }
                
                if(ctx.members != null) {
//                    for(ClassTransformerMemberContext memberCtx: ctx.members.classTransformerMember()) {
//                        memberCtx.accept(new DejainBaseVisitor<Object>() {
//                            @Override
//                            public Object visitClassTransformerMemberField(ClassTransformerMemberFieldContext ctx) {
//                                
//                                
//                                return null;
//                            }
//                            
//                            @Override
//                            public Object visitClassTransformerMemberFieldAdd(ClassTransformerMemberFieldAddContext ctx) {
//                                transformer.addAction(ctClass -> 
//                                {
//                                    String fieldSrc = "";
//                                    
//                                    if(ctx.accessModifier() != null)
//                                        fieldSrc += ctx.accessModifier().getText() + " ";
//                                    if(ctx.modStatic() != null)
//                                        fieldSrc += "static ";
//                                    
//                                    fieldSrc += ctx.typeQualifier().getText() + " ";
//                                    fieldSrc += ctx.identifier().getText() + ";";
//                                    
//                                    try {
//                                        if(ctx.expression() != null) {
//                                            String init = contextAdVerbatim(charStream, ctx.expression());
//                                            ctClass.addField(CtField.make(fieldSrc, ctClass), init);
//                                        } else
//                                            ctClass.addField(CtField.make(fieldSrc, ctClass));
//                                    } catch (CannotCompileException ex) {
//                                        Logger.getLogger(JavassistCompiler.class.getName()).log(Level.SEVERE, null, ex);
//                                    }
//                                });
//                                return null;
//                            }
//
//                            @Override
//                            public Object visitClassTransformerMemberMethod(ClassTransformerMemberMethodContext ctx) {
//                                Predicate<CtMethod> methodFilter = m -> {
//                                    if(ctx.accessModifier() != null) {
//                                        if(ctx.accessModifier().ACC_MOD_PRIVATE() != null && !Modifier.isPrivate(m.getModifiers()))
//                                            return false;
//                                        else if(ctx.accessModifier().ACC_MOD_PROTECTED() != null && !Modifier.isProtected(m.getModifiers()))
//                                            return false;
//                                        else if(ctx.accessModifier().ACC_MOD_PUBLIC() != null && !Modifier.isPublic(m.getModifiers()))
//                                            return false;
//                                    }
//
//                                    if(ctx.modStatic() != null && !Modifier.isStatic(m.getModifiers()))
//                                        return false;
//
//                                    try {
//                                        if(ctx.typeQualifier() != null && !m.getReturnType().getName().equals(ctx.typeQualifier().getText()))
//                                            return false;
//                                    } catch (NotFoundException ex) {
//                                        Logger.getLogger(JavassistCompiler.class.getName()).log(Level.SEVERE, null, ex);
//                                    }
//
//                                    if(ctx.identifier() != null && !m.getName().equals(ctx.identifier().getText()))
//                                        return false;
//
//                                    try {
//                                        // Compare parameters also
//                                        if(ctx.parameters().parameter().size() != m.getParameterTypes().length)
//                                            return false;
//                                    } catch (NotFoundException ex) {
//                                        Logger.getLogger(JavassistCompiler.class.getName()).log(Level.SEVERE, null, ex);
//                                    }
//
//                                    return true;
//                                };
//                                
//                                transformer.addPredicate(ctClass -> 
//                                    Arrays.asList(ctClass.getDeclaredMethods()).stream().anyMatch(methodFilter));
//                                
//                                transformer.addAction(ctClass -> 
//                                {
//                                    Arrays.asList(ctClass.getDeclaredMethods()).stream().filter(methodFilter).forEach(m -> {
//                                        String methodSelector = "";
//
//                                        if(Modifier.isPrivate(m.getModifiers()))
//                                            methodSelector += "private ";
//                                        else if(Modifier.isProtected(m.getModifiers()))
//                                            methodSelector += "protected ";
//                                        else if(Modifier.isPublic(m.getModifiers()))
//                                            methodSelector += "public ";
//
//                                        if(Modifier.isStatic(m.getModifiers()))
//                                            methodSelector += "static ";
//                                        
//                                        try {
//                                            methodSelector += m.getReturnType().getName() + " ";
//                                        } catch (NotFoundException ex) {
//                                            Logger.getLogger(JavassistCompiler.class.getName()).log(Level.SEVERE, null, ex);
//                                        }
//                                        
//                                        methodSelector += m.getName();
//                                        
//                                        // Generate from parameters also
//                                        methodSelector += "() ";
//                                        
//                                        String methodBodySrc = charStream.getText(new Interval(ctx.OPEN_BRA().getSymbol().getStopIndex() + 1, ctx.CLOSE_BRA().getSymbol().getStartIndex() - 1));
////                                        methodBodySrc = methodBodySrc.replace("thisResult", "$_");
//                                        
//                                        if(methodBodySrc.contains("...")) {
//                                            bodyTransform(charStream, ctx.statements(), m);
//                                            
////                                            String beforeSrc = methodBodySrc.substring(0, methodBodySrc.indexOf("..."));
////                                            String afterSrc = methodBodySrc.substring(methodBodySrc.indexOf("...") + 3);
////                                            try {
////                                                m.insertBefore(beforeSrc);
////                                                m.insertAfter(afterSrc);
////                                            } catch (CannotCompileException ex) {
////                                                Logger.getLogger(Compiler.class.getName()).log(Level.SEVERE, null, ex);
////                                            }
//                                        } else {
//                                            try {
//                                                methodBodySrc = "{" + compileSource(methodBodySrc) + "}";
//                                                m.setBody(methodBodySrc);
//                                            } catch (CannotCompileException ex) {
//                                                Logger.getLogger(JavassistCompiler.class.getName()).log(Level.SEVERE, null, ex);
//                                            }
//                                        }
//                                        
//                                        try {
//                                            m.getMethodInfo().rebuildStackMap(ClassPool.getDefault());
//                                        } catch (BadBytecode ex) {
//                                            Logger.getLogger(JavassistCompiler.class.getName()).log(Level.SEVERE, null, ex);
//                                        }
//                                    });
//                                    
////                                    for(CtMethod method: ctClass.getDeclaredMethods()) {
////                                        String methodSelector = "";
////
////                                        if(ctx.accessModifier().ACC_MOD_PRIVATE() != null)
////                                            methodSelector += "private ";
////                                        else if(ctx.accessModifier().ACC_MOD_PROTECTED() != null)
////                                            methodSelector += "protected ";
////                                        else if(ctx.accessModifier().ACC_MOD_PUBLIC() != null)
////                                            methodSelector += "public ";
////
////                                        if(ctx.modStatic() != null)
////                                            methodSelector += "static ";
////                                        // Generate from parameters also
////                                        methodSelector += "()";
////
////                                        String methodSrc = charStream.getText(new Interval(ctx.OPEN_BRA().getSymbol().getStartIndex(), ctx.CLOSE_BRA().getSymbol().getStopIndex()));
////                                        methodSrc = methodSrc.replace("...", "$_= $proceed($$);");
////
////                                        try {
////                                            ctClass.addMethod(CtMethod.make(methodSrc, ctClass));
////                                        } catch (CannotCompileException ex) {
////                                            Logger.getLogger(Compiler.class.getName()).log(Level.SEVERE, null, ex);
////                                        }
////                                    }
//                                });
//                                
//                                return super.visitClassTransformerMemberMethod(ctx); //To change body of generated methods, choose Tools | Templates.
//                            }
//
//                            @Override
//                            public Object visitClassTransformerMemberMethodAdd(ClassTransformerMemberMethodAddContext ctx) {
//                                transformer.addAction(ctClass -> 
//                                {
//                                    String methodSrc = charStream.getText(new Interval(ctx.methodDefinition().getStart().getStartIndex(), ctx.methodDefinition().getStop().getStopIndex()));
//                                    
//                                    try {
//                                        ctClass.addMethod(CtMethod.make(methodSrc, ctClass));
//                                    } catch (CannotCompileException ex) {
//                                        Logger.getLogger(JavassistCompiler.class.getName()).log(Level.SEVERE, null, ex);
//                                    }
//                                });
//                                
//                                return null;
//                            }
//                        });
//                    }
                }
                
                transformer.addPredicate(ctClass -> {
                    // Pass a ClassReader and a CtClass in a lazy way, such that
                    // the construction of the CtClass is postponed. Necessary?
                    return ctx.annotations().annotation().stream().filter(pa -> pa.PLUS() == null).allMatch(pa ->
                    {
                        String annotationName = pa.typeQualifier().getText();

                        List<AnnotationsAttribute> attributes = 
                            (List<AnnotationsAttribute>)ctClass.getClassFile().getAttributes().stream()
                            .filter(a -> a instanceof AnnotationsAttribute).collect(Collectors.toList());
                        boolean annotationMatched = attributes
                            .stream().anyMatch(aa -> 
                                Arrays.asList(aa.getAnnotations()).stream()
                                .anyMatch(a -> a.getTypeName().equals(annotationName))
                        );

                        return annotationMatched;
                    });
                });
                
                transformer.addAction(ctClass -> {
                    ctx.annotations().annotation().stream().filter(pa -> pa.PLUS() != null).forEach(pa -> {
                        String annotationName = pa.typeQualifier().getText();
                        
                        ConstPool constantPool = ctClass.getClassFile().getConstPool();
                        AnnotationsAttribute attr = new AnnotationsAttribute(constantPool, AnnotationsAttribute.visibleTag);
                        Annotation annotation = new Annotation(annotationName, constantPool);
                        attr.addAnnotation(annotation);
                        ctClass.getClassFile().addAttribute(attr);
                    });
                });
                
                if(ctx.typeQualifier() != null) {
                    String className = ctx.typeQualifier().getText();
                    transformer.addPredicate(ctClass -> {
                        return ctClass.getName().equals(className);
                    });
                }
                
                classTransformers.addTransformer(transformer);
                
                return null;
            }
        });
        
        return classTransformers;
    }
    
//    private static void statementsTransform(StatementsContext ctx, CtMethod method) {
//        ctx.accept(new DejainBaseVisitor<Object>() {
//            @Override
//            public Object visitTryCatchStatement(DejainParser.TryCatchStatementContext ctx) {
//                method.add
//            }
//        });
//        
//        ctx.accept(new DejainBaseVisitor<Object>() {
//
//            @Override
//            public Object visitBinaryOperator(DejainParser.BinaryOperatorContext ctx) {
//                ctx
//                
//                return null;
//            }
//        });
//    }
    
    private interface CodeBuilder {
        void visitStatement(String stmt);
        void visitReturn();
        void visitProceed();
        CatchCodeBuilder createCatchBuilder(String exceptionTypeName, String exceptionName);
    }
    
    private static class MethodCodeBuilder implements CodeBuilder {
        private boolean visitedProceed;
        
        private CtMethod method;
        private int lineNumberInsertion;

        public MethodCodeBuilder(CtMethod method) {
            this.visitedProceed = visitedProceed;
            this.method = method;
            this.lineNumberInsertion = lineNumberInsertion;
        }
        
        public void visitStatement(String stmt) {
            if(!visitedProceed) {
                try {
                    method.insertAt(lineNumberInsertion, stmt + "\n");
                    lineNumberInsertion++;
                } catch (CannotCompileException ex) {
                    Logger.getLogger(JavassistCompiler.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                try {
                    method.insertAfter(stmt + "\n");
                } catch (CannotCompileException ex) {
                    Logger.getLogger(JavassistCompiler.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        @Override
        public void visitReturn() { }
        
        public void visitProceed() {
            visitedProceed = true;
        }

        @Override
        public CatchCodeBuilder createCatchBuilder(String exceptionTypeName, String exceptionName) {
            return new CatchCodeBuilder(method, exceptionTypeName, exceptionName);
        }
    }
    
    private static class CatchCodeBuilder implements CodeBuilder {
        private StringBuilder statements = new StringBuilder();
        private CtMethod method;
        private String exceptionTypeName; 
        private String exceptionName;
        private boolean lastWasReturn;

        public CatchCodeBuilder(CtMethod method, String exceptionTypeName, String exceptionName) {
            this.method = method;
            this.exceptionTypeName = exceptionTypeName;
            this.exceptionName = exceptionName;
        }
        
        @Override
        public void visitStatement(String stmt) {
            statements.append(stmt + "\n");
            lastWasReturn = false;
        }

        @Override
        public void visitReturn() {
            lastWasReturn = true;
        }

        @Override
        public void visitProceed() { }

        @Override
        public CatchCodeBuilder createCatchBuilder(String exceptionTypeName, String exceptionName) {
            return new CatchCodeBuilder(method, exceptionTypeName, exceptionName);
        }
        
        private String defaultValueSource(CtClass c) {
            if(c == CtClass.booleanType)
                return "false";
            else if(c == CtClass.byteType)
                return "(byte)0";
            else if(c == CtClass.charType)
                return "'0'";
            else if(c == CtClass.doubleType)
                return "0.0";
            else if(c == CtClass.floatType)
                return "0.0f";
            else if(c == CtClass.intType)
                return "0";
            else if(c == CtClass.longType)
                return "0L";
            else if(c == CtClass.shortType)
                return "0S";
            
            return "null";
        }
        
        public void addToMethod() {
            try {
                String src = statements.toString();
                if(!lastWasReturn) {
                    if(method.getReturnType() == CtClass.voidType)
                        src += "\nreturn;"; // Should return default value if not void
                    else {
                        String defaultValue = defaultValueSource(method.getReturnType());
                        src += "\nreturn " + defaultValue + ";";
                    }
                }
                src = "{\n" + src + "\n}";
                method.addCatch(src, ClassPool.getDefault().get(exceptionTypeName), exceptionName);
//                method.getMethodInfo().getCodeAttribute().iterator().
            } catch (NotFoundException | CannotCompileException ex) {
                Logger.getLogger(JavassistCompiler.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    private static void bodyTransform(CharStream source, StatementsContext ctx, CtMethod method) {
        MethodCodeBuilder methodCoderBuilder = new MethodCodeBuilder(method);
        statementsTransform(source, ctx, methodCoderBuilder);
    }
    
    private static void statementsTransform(CharStream source, StatementsContext ctx, CodeBuilder codeBuilder) {
        for(StatementContext stmtCtx: ctx.statement())
            statementTransform(source, stmtCtx, codeBuilder);
    }
    
    private static void statementTransform(CharStream source, StatementContext ctx, CodeBuilder codeBuilder) {
        ctx.accept(new JasyBaseVisitor<Object>() {
            @Override
            public Object visitTryCatchStatement(JasyParser.TryCatchStatementContext ctx) {
                statementsTransform(source, ctx.tryStatement().statements(), codeBuilder);
                
                if(ctx.catchStatement() != null) {
                    String exceptionTypeName = ctx.catchStatement().parameter().typeQualifier().getText();
                    String exceptionName = ctx.catchStatement().parameter().identifier().getText();
                    CatchCodeBuilder catchCodeBuilder = 
                        codeBuilder.createCatchBuilder(exceptionTypeName, exceptionName);
                    statementsTransform(source, ctx.catchStatement().statements(), catchCodeBuilder);
                    catchCodeBuilder.addToMethod();
                } else {
                    statementsTransform(source, ctx.finallyStatement().statements(), codeBuilder);
                }
                
                return null;
            }

            @Override
            public Object visitProceedStatement(JasyParser.ProceedStatementContext ctx) {
                codeBuilder.visitProceed();
                
                return null;
            }

            @Override
            public Object visitReturnStatement(JasyParser.ReturnStatementContext ctx) {
                String statement = contextAdVerbatim(source, ctx);
                codeBuilder.visitStatement(statement + ";");
                codeBuilder.visitReturn();
                
                return null;
            }

            @Override
            public Object visitThrowStatement(JasyParser.ThrowStatementContext ctx) {
                String statement = contextAdVerbatim(source, ctx);
                codeBuilder.visitStatement(statement + ";");
                codeBuilder.visitReturn();
                
                return null;
            }

            @Override
            public Object visitIfElseStatement(JasyParser.IfElseStatementContext ctx) {
                String statement = contextAdVerbatim(source, ctx);
                codeBuilder.visitStatement(statement + ";");
                
                return null;
            }

            @Override
            public Object visitExpression(ExpressionContext ctx) {
                String statement = contextAdVerbatim(source, ctx);
                codeBuilder.visitStatement(statement + ";");
                
                return null;
            }
        });
    }
    
    private static String contextAdVerbatim(CharStream source, ParserRuleContext ctx) {
        String sourceStr = 
            source.getText(new Interval(ctx.getStart().getStartIndex(), ctx.getStop().getStopIndex()));
        return compileSource(sourceStr);
    }
    
    private static String compileSource(String source) {
        return source
            .replace("thisResult", "$_")
            .replace("false", "!true");
    }
}
