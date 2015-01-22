/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dejain.lang;

import dejain.lang.antlr4.DejainBaseVisitor;
import dejain.lang.antlr4.DejainLexer;
import dejain.lang.antlr4.DejainParser;
import dejain.lang.antlr4.DejainParser.AnnotationContext;
import dejain.lang.antlr4.DejainParser.ProgramContext;
import dejain.runtime.asm.ClassTransformer;
import dejain.runtime.asm.ClassTransformerSequence;
import dejain.runtime.asm.CommonClassTransformer;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import javax.lang.model.element.Modifier;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.Label;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.JumpInsnNode;
import org.objectweb.asm.tree.LabelNode;
import org.objectweb.asm.tree.MethodNode;

/**
 *
 * @author Jakob
 */
public class ASMCompiler {
//    private static Class<?> resolveType(String typeName) throws ClassNotFoundException {
//        switch(typeName) {
//            case "boolean": return boolean.class;
//            case "byte": return byte.class;
//            case "short": return short.class;
//            case "int": return int.class;
//            case "long": return long.class;
//            case "float": return float.class;
//            case "double": return double.class;
//        }
//        
//        return Class.forName(typeName);
//    }
    
//    public static AST compile(InputStream sourceCode) throws IOException {
//        return null;
//    }
    
    private ClassResolver classResolver;

    public ASMCompiler(ClassResolver classResolver) {
        this.classResolver = classResolver;
    }
    
    public ClassTransformer compile(InputStream sourceCode, ArrayList<Message> errorMessages) throws IOException {
        CharStream charStream = new ANTLRInputStream(sourceCode);
        DejainLexer lexer = new DejainLexer(charStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        DejainParser parser = new DejainParser(tokenStream);
        
        DejainParser.ProgramContext program = parser.program();
        
        ClassTransformerSequence classTransformers = new ClassTransformerSequence();
        
        validateProgram(program, errorMessages);
        
        program.accept(new DejainBaseVisitor<Object>() {
            @Override
            public Object visitClassTransformer(DejainParser.ClassTransformerContext ctx) {
                CommonClassTransformer transformer = new CommonClassTransformer();
                
                List<AnnotationContext> aCtxs = ctx.annotations().annotation().stream().filter(pa -> pa.PLUS() == null).collect(Collectors.toList());
                transformer.addPredicate(classNode -> {
                    return aCtxs.stream().allMatch(pa ->
                    {
                        String annotationName = pa.typeQualifier().getText().replace(".", "/");
                        if(classNode.visibleAnnotations != null && classNode.visibleAnnotations.size() > 0)
                            return classNode.visibleAnnotations.stream().anyMatch(a -> ((AnnotationNode)a).desc.equals(annotationName));
                        
                        return false;
                    });
                });
                
                if(ctx.typeQualifier() != null) {
                    String className = ctx.typeQualifier().getText().replace(".", "/");
                    transformer.addPredicate(classNode -> {
                        return classNode.name.equals(className);
                    });
                }
                
                if(ctx.members != null) {
                    for(DejainParser.ClassTransformerMemberContext memberCtx: ctx.members.classTransformerMember()) {
                        memberCtx.accept(new DejainBaseVisitor<Object>() {
                            @Override
                            public Object visitClassTransformerMemberFieldAdd(DejainParser.ClassTransformerMemberFieldAddContext ctx) {
                                try {
                                    int fieldAccess = getAccessModifier(ctx.accessModifier(), ctx.modStatic());
                                    String fieldName = ctx.identifier().getText();
                                    String fieldTypeName = ctx.typeQualifier().getText();
                                    String fieldDescriptor = Type.getDescriptor(classResolver.resolveType(fieldTypeName));
                                    
                                    transformer.addAction(classNode ->
                                    {
                                        classNode.fields.add(new FieldNode(fieldAccess, fieldName, fieldDescriptor, null, null));
                                    });
                                    
                                    return null;
                                } catch (ClassNotFoundException ex) {
                                    Logger.getLogger(ASMCompiler.class.getName()).log(Level.SEVERE, null, ex);
                                    return null;
                                }
                            }

                            @Override
                            public Object visitClassTransformerMemberMethod(DejainParser.ClassTransformerMemberMethodContext ctx) {
                                try {
                                    int methodAccess = getAccessModifier(ctx.accessModifier(), ctx.modStatic());
                                    String methodName = ctx.identifier().getText();
                                    String methodDescriptor = getMethodDescriptor(ctx.typeQualifier(), ctx.parameters());
                                    
                                    transformer.addPredicate(classNode -> {
                                        System.out.println(methodName + " " + methodDescriptor);
                                        return classNode.methods.stream().anyMatch(m ->
                                            ((MethodNode)m).name.equals(methodName) &&
                                            ((MethodNode)m).desc.equals(methodDescriptor));
                                    });
                                    
                                    transformer.addAction(classNode ->
                                    {
                                        MethodNode methodNode = new MethodNode(methodAccess, methodName, methodDescriptor, null, null);
                                        
                                        OptionalInt existingMethodIndex =
                                            IntStream.range(0, classNode.methods.size())
                                            .filter(i -> 
                                                ((MethodNode)classNode.methods.get(i)).name.equals(methodName) && 
                                                ((MethodNode)classNode.methods.get(i)).desc.equals(methodDescriptor))
                                            .findFirst();
                                        
                                        MethodNode methodNodeOriginal = (MethodNode)classNode.methods.get(existingMethodIndex.getAsInt());
                                        
                                        InsnList originalIl = new InsnList();
                                        originalIl.add(methodNodeOriginal.instructions);
                                        
                                        treeToCode(ctx, methodNode, originalIl, false);
                                        
                                        methodNode.visitEnd();
                                        
                                        classNode.methods.remove(existingMethodIndex.getAsInt());
                                        classNode.methods.add(methodNode);
                                    });
                                    
                                    return null;
                                } catch (ClassNotFoundException ex) {
                                    Logger.getLogger(ASMCompiler.class.getName()).log(Level.SEVERE, null, ex);
                                    return null;
                                }
                            }

                            @Override
                            public Object visitClassTransformerMemberMethodAdd(DejainParser.ClassTransformerMemberMethodAddContext ctx) {
                                try {
                                    int methodAccess = getAccessModifier(ctx.methodDefinition().accessModifier(), ctx.methodDefinition().modStatic());
                                    String methodName = ctx.methodDefinition().identifier().getText();
                                    String methodDescriptor = getMethodDescriptor(ctx.methodDefinition().typeQualifier(), ctx.methodDefinition().parameters());
                                    
                                    transformer.addAction(classNode ->
                                    {
                                        MethodNode methodNode = new MethodNode(methodAccess, methodName, methodDescriptor, null, null);
                                        
                                        treeToCode(ctx, methodNode, new InsnList() /*Something that generates a default values for non-void returns?*/, false);
                                        
                                        methodNode.visitEnd();
                                        
                                        OptionalInt existingMethodIndex =
                                            IntStream.range(0, classNode.methods.size())
                                            .filter(i -> 
                                                ((MethodNode)classNode.methods.get(i)).name.equals(methodName) && 
                                                ((MethodNode)classNode.methods.get(i)).desc.equals(methodDescriptor))
                                            .findFirst();
                                        if(existingMethodIndex.isPresent())
                                            classNode.methods.remove(existingMethodIndex.getAsInt());
                                        
                                        classNode.methods.add(methodNode);
                                    });
                                    
                                    return null;
                                } catch (ClassNotFoundException ex) {
                                    Logger.getLogger(ASMCompiler.class.getName()).log(Level.SEVERE, null, ex);
                                    return null;
                                }
                            }
                        });
                    }
                }
                
                transformer.addAction(classNode -> {
                    ctx.annotations().annotation().stream().filter(pa -> pa.PLUS() != null).forEach(pa -> {
                        String annotationName = pa.typeQualifier().getText().replace(".", "/");
                        
                        try {
                            classNode.visitAnnotation(annotationName, true);
                        } catch(Exception e) {
                            e.printStackTrace();
                        }
                    });
                });
                
                classTransformers.addTransformer(transformer);
                
                return null;
            }
        });
        
        return classTransformers;
    }
    
    private String getMethodDescriptor(DejainParser.TypeQualifierContext returnType, DejainParser.ParametersContext paramsCtx) throws ClassNotFoundException {
        String returnDescriptor = Type.getDescriptor(classResolver.resolveType(returnType.getText()));
        String parametersDescriptor = paramsCtx.parameter().stream().map(pCtx -> {
            String parameterDescriptor;
            try {
                parameterDescriptor = Type.getDescriptor(classResolver.resolveType(pCtx.typeQualifier().getText()));
            return parameterDescriptor + ";";
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ASMCompiler.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }
        }).collect(Collectors.joining());
        return "(" + parametersDescriptor + ")" + returnDescriptor + "";
    }
    
    private static int getAccessModifier(DejainParser.AccessModifierContext ctx, DejainParser.ModStaticContext statCtx) {
        int mod = Opcodes.ACC_PRIVATE;
        
        if(ctx != null) {
            switch(((TerminalNode)ctx.getChild(0)).getSymbol().getType()) {
                case DejainLexer.ACC_MOD_PRIVATE:
                    mod = Opcodes.ACC_PRIVATE;
                case DejainLexer.ACC_MOD_PROTECTED:
                    mod = Opcodes.ACC_PROTECTED;
                case DejainLexer.ACC_MOD_PUBLIC:
                    mod = Opcodes.ACC_PUBLIC;
            }
        }
        
        if(statCtx != null)
            return mod | Opcodes.ACC_STATIC;
        
        return mod;
    }
    
    private static class Position {
        private int line;
        private int column;

        public Position(Token token) {
            this.line = token.getLine();
            this.column = token.getCharPositionInLine();
        }

        @Override
        public String toString() {
            return "" + line + "," + column;
        }
    }
    
    public static class Message {
        private Position start;
        private Position end;
        private String text;

        public Message(ParserRuleContext ctx, String text) {
            start = new Position(ctx.getStart());
            end = new Position(ctx.getStop());
            this.text = text;
        }

        @Override
        public String toString() {
            return "" + start + "-" + end + ": " + text;
        }
    }
    
    private void validateProgram(ProgramContext ctx, ArrayList<Message> errorMessages) {
        ctx.accept(new DejainBaseVisitor<Object>() {
            @Override
            public Object visitClassTransformer(DejainParser.ClassTransformerContext ctx) {
                if(ctx.members != null) {
                    for(DejainParser.ClassTransformerMemberContext memberCtx: ctx.members.classTransformerMember()) {
                        memberCtx.accept(new DejainBaseVisitor<Object>() {
                            @Override
                            public Object visitClassTransformerMemberMethodAdd(DejainParser.ClassTransformerMemberMethodAddContext ctx) {
                                validateMethodAdd(ctx, errorMessages);
                                
                                return null;
                            }
                        });
                    }
                }
                
                return null;
            }
        });
    }
    
    private void validateMethodAdd(DejainParser.ClassTransformerMemberMethodAddContext ctxMethodAdd, ArrayList<Message> errorMessages) {
        ctxMethodAdd.accept(new DejainBaseVisitor<Object>() {
            @Override
            public Object visitReturnStatement(DejainParser.ReturnStatementContext ctx) {
                try {
                    Class<?> expressionType = validateExpression(ctx.expression(), errorMessages);
                    Class<?> returnTypeClass = classResolver.resolveType(ctxMethodAdd.methodDefinition().typeQualifier().getText());
                    
                    if(!returnTypeClass.isAssignableFrom(expressionType))
                        errorMessages.add(new Message(ctx, "" + expressionType + " is not assignable to " + returnTypeClass));
                    
                    return null;
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ASMCompiler.class.getName()).log(Level.SEVERE, null, ex);
                    return null;
                }
            }
        });
    }
    
    private static Class<?> validateExpression(ParserRuleContext ctx, ArrayList<Message> errorMessages) {
        return ctx.accept(new DejainBaseVisitor<Class<?>>() {
            @Override
            public Class<?> visitStringLiteral(DejainParser.StringLiteralContext ctx) {
                return String.class;
            }

            @Override
            public Class<?> visitIntegerLiteral(DejainParser.IntegerLiteralContext ctx) {
                return int.class;
            }
        });
    }
    
    private static boolean isReturn(int opcode) {
        switch(opcode) {
            case Opcodes.ARETURN:
            case Opcodes.DRETURN:
            case Opcodes.FRETURN:
            case Opcodes.IRETURN:
            case Opcodes.RET:
            case Opcodes.RETURN:
                return true;
        }
        
        return false;
    }
    
    private Class<?> treeToCode(ParserRuleContext ctx, MethodNode methodNode, InsnList originalIl, boolean asExpression) {
        return ctx.accept(new DejainBaseVisitor<Class<?>>() {
            @Override
            public Class<?> visitProceedStatement(DejainParser.ProceedStatementContext ctx) {
                InsnList originalIlCopy = new InsnList();
                originalIlCopy.add(originalIl);
                
                Label afterProceed = new Label();
                
                // Replace all return instructions with unconditional jumps
                for(int i = 0; i < originalIlCopy.size(); i++) {
                    AbstractInsnNode insn = originalIlCopy.get(i);
                    
                    if(isReturn(insn.getOpcode()))
                        methodNode.visitJumpInsn(Opcodes.GOTO, afterProceed);
                    else
                        methodNode.instructions.add(insn);
                    
//                    if(isReturn(insn.getOpcode()))
//                        originalIlCopy.set(insn, new JumpInsnNode(Opcodes.GOTO, new LabelNode(afterProceed)));
                }
                
//                methodNode.instructions.add(originalIlCopy);
                methodNode.visitLabel(afterProceed);
                
                if(asExpression) {
                    Type returnType = Type.getReturnType(methodNode.desc);

                    try {
                        return classResolver.resolveType(returnType.getClassName());
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(ASMCompiler.class.getName()).log(Level.SEVERE, null, ex);
                        return null;
                    }
                } else {
                    methodNode.visitInsn(Opcodes.POP);
                    return void.class;
                }
            }
            
            @Override
            public Class<?> visitExpression1(DejainParser.Expression1Context ctx) {
                if(asExpression) {
                    Class<?> resultType = ctx.expression2(0).accept(this);

                    for(int i = 1; i < ctx.expression2().size(); i++) {
                        Class<?> lhsResultType = resultType;

                        DejainParser.Expression2Context rhsCtx = ctx.expression2(i);

                        Class<?> rhsResultType = rhsCtx.accept(this);

                        switch(ctx.binaryOperator(i - 1).operator.getType()) {
                            case DejainLexer.PLUS:
                                if(lhsResultType.equals(String.class)) {
                                    if(!rhsResultType.equals(String.class))
                                        methodNode.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/Object", "toString", "()Ljava/lang/String;", false);
                                    methodNode.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/String", "concat", "(Ljava/lang/String;)Ljava/lang/String;", false);
                                } else if(rhsResultType.equals(String.class)) {
                                    // Not supported
                                } else {
                                    switch(lhsResultType.getSimpleName()) {
                                        case "short":
                                            methodNode.visitInsn(Opcodes.IADD);
                                            break;
                                        case "int":
                                            methodNode.visitInsn(Opcodes.IADD);
                                            break;
                                        case "long":
                                            methodNode.visitInsn(Opcodes.LADD);
                                            break;
                                        case "float":
                                            methodNode.visitInsn(Opcodes.FADD);
                                            break;
                                        case "double":
                                            methodNode.visitInsn(Opcodes.DADD);
                                            break;
                                    }
                                }
                                break;
                            case DejainLexer.MINUS:
                                switch(lhsResultType.getSimpleName()) {
                                    case "short":
                                        methodNode.visitInsn(Opcodes.ISUB);
                                        break;
                                    case "int":
                                        methodNode.visitInsn(Opcodes.ISUB);
                                        break;
                                    case "long":
                                        methodNode.visitInsn(Opcodes.LSUB);
                                        break;
                                    case "float":
                                        methodNode.visitInsn(Opcodes.FSUB);
                                        break;
                                    case "double":
                                        methodNode.visitInsn(Opcodes.DSUB);
                                        break;
                                }
                                break;
                        }

                        resultType = rhsResultType;
                    }

                    return resultType;
                }
                
                return void.class;
            }
            
            @Override
            public Class<?> visitStringLiteral(DejainParser.StringLiteralContext ctx) {
                String str = ctx.STRING().getText().substring(1, ctx.STRING().getText().length() - 1);
                methodNode.visitLdcInsn(str);
                
                return String.class;
            }

            @Override
            public Class<?> visitIntegerLiteral(DejainParser.IntegerLiteralContext ctx) {
                int i = Integer.parseInt(ctx.INTEGER().getText());
                methodNode.visitLdcInsn(i);
                
                return int.class;
            }
            
            @Override
            public Class<?> visitReturnStatement(DejainParser.ReturnStatementContext ctx) {
                treeToCode(ctx.expression(), methodNode, originalIl, true);
                
                Type returnType = Type.getReturnType(methodNode.desc);                    
                String returnTypeDescriptor = returnType.getDescriptor();
                switch(returnTypeDescriptor) {
                    case "V":
                        methodNode.visitInsn(Opcodes.RETURN);
                    case "J":
                        methodNode.visitInsn(Opcodes.LRETURN);
                    case "D":
                        methodNode.visitInsn(Opcodes.DRETURN);
                    case "F":
                        methodNode.visitInsn(Opcodes.FRETURN);
                    case "I": case "Z": case "B": case "C": case "S":
                        methodNode.visitInsn(Opcodes.IRETURN);
                    default:
                        methodNode.visitInsn(Opcodes.ARETURN);
                }
//                if(type.equals("V")){
//                   node.visitInsn(Opcodes.RETURN);
//                }else if(type.equals("J")){     
//                   node.visitInsn(Opcodes.LRETURN);
//                }else if(type.equals("D")){
//                   node.visitInsn(Opcodes.DRETURN);
//                }else if(type.equals("F")){
//                   node.visitInsn(Opcodes.FRETURN);
//                }else if (type.equals("I") || type.equals("Z") || type.equals("B")
//                      || type.equals("C") || type.equals("S")) {
//                   node.visitInsn(Opcodes.IRETURN);
//                } else {
//                   node.visitInsn(Opcodes.ARETURN);
//                }

                return void.class;
            }
        });
    }
}
