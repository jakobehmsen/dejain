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
import dejain.lang.ast.BinaryExpressionContext;
import dejain.lang.ast.ClassContext;
import dejain.lang.ast.ExpressionContext;
import dejain.lang.ast.FieldContext;
import dejain.lang.ast.FieldSelectorContext;
import dejain.lang.ast.LiteralContext;
import dejain.lang.ast.MemberContext;
import dejain.lang.ast.MethodContext;
import dejain.lang.ast.MethodSelectorContext;
import dejain.lang.ast.ModuleContext;
import dejain.lang.ast.ReturnContext;
import dejain.lang.ast.CodeContext;
import dejain.lang.ast.LiteralDelegateContext;
import dejain.lang.ast.TypeContext;
import dejain.runtime.asm.ClassTransformer;
import dejain.runtime.asm.ClassTransformerSequence;
import dejain.runtime.asm.CommonClassTransformer;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
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
    
    public ModuleContext compile(InputStream sourceCode) throws IOException {
        ArrayList<ClassContext> classes = new ArrayList<>();
        
        CharStream charStream = new ANTLRInputStream(sourceCode);
        DejainLexer lexer = new DejainLexer(charStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        DejainParser parser = new DejainParser(tokenStream);
        
        DejainParser.ProgramContext program = parser.program();
        
        program.accept(new DejainBaseVisitor<Object>() {
            @Override
            public Object visitClassTransformer(DejainParser.ClassTransformerContext ctx) {
                List<dejain.lang.ast.AnnotationContext> annotations = ctx.annotations().annotation().stream()
                    .map(aCtx -> new dejain.lang.ast.AnnotationContext(new Region(aCtx), aCtx.PLUS() != null, new TypeContext(new Region(aCtx), aCtx.typeQualifier().getText())))
                    .collect(Collectors.toList());
                
                Integer accessModifer = null;
                if(ctx.accessModifier() != null)
                    accessModifer = getAccessModifier(ctx.accessModifier(), null);
                
                TypeContext type = ctx.typeQualifier() != null ? new TypeContext(new Region(ctx), ctx.typeQualifier().getText()) : null;
                
                ArrayList<MemberContext> members = new ArrayList<>();
                
                if(ctx.members != null) {
                    for(DejainParser.ClassTransformerMemberDefinitionContext memberCtx: ctx.members.classTransformerMemberDefinition()) {
                        boolean isAdd = memberCtx.PLUS() != null;
                        memberCtx.member.accept(new DejainBaseVisitor<Object>() {
                            @Override
                            public Object visitClassTransformerMemberField(DejainParser.ClassTransformerMemberFieldContext ctx) {
                                Integer accessModifier = ctx.accessModifier() != null ? getAccessModifier(ctx.accessModifier(), null) : null;
                                boolean isStatic = ctx.modStatic() != null;
                                TypeContext fieldType = new TypeContext(new Region(ctx), ctx.typeQualifier().getText());
                                String name = ctx.identifier().getText();
                                
                                ExpressionContext value = null;
                                
                                if(ctx.value != null)
                                    value = getExpression(ctx.value);
                                
                                FieldContext field = new FieldContext(new Region(ctx), isAdd, new FieldSelectorContext(accessModifier, isStatic, fieldType, name), value);
                                
                                members.add(field);
                                
                                return null;
                            }
                            
                            @Override
                            public Object visitClassTransformerMemberMethod(DejainParser.ClassTransformerMemberMethodContext ctx) {
                                Integer accessModifier = ctx.accessModifier() != null ? getAccessModifier(ctx.accessModifier(), null) : null;
                                boolean isStatic = ctx.modStatic() != null;
                                TypeContext returnType = new TypeContext(new Region(ctx), ctx.typeQualifier().getText());
                                String name = ctx.identifier().getText();
                                List<TypeContext> parameterTypes = ctx.parameters().parameter().stream()
                                    .map(pCtx -> new TypeContext(new Region(ctx), pCtx.typeQualifier().getText()))
                                    .collect(Collectors.toList());
                                List<dejain.lang.ast.CodeContext> body = getStatements(ctx.statements());
                                System.out.println("Body:");
                                body.forEach(s -> System.out.println(s));
                                MethodContext method = new MethodContext(new Region(ctx), isAdd, new MethodSelectorContext(accessModifier, isStatic, returnType, name, parameterTypes), body);
                                
                                members.add(method);
                                
                                return null;
                            }
                        });
                    }
                }
                
                classes.add(new ClassContext(new Region(ctx), annotations, accessModifer, type, members));
                
                return null;
            }
        });
        
        return new ModuleContext(new Region(program), classes);
    }

    private List<dejain.lang.ast.CodeContext> getStatements(DejainParser.StatementsContext ctx) {
        return ctx.statement().stream()
            .map(sCtx -> getStatement(sCtx))
            .collect(Collectors.toList());
    }
    
    private dejain.lang.ast.CodeContext getStatement(DejainParser.StatementContext ctx) {
        dejain.lang.ast.CodeContext r = ctx.accept(new DejainBaseVisitor<dejain.lang.ast.CodeContext>() {
            @Override
            public CodeContext visitStatement(DejainParser.StatementContext ctx) {
                return ctx.nonDelimitedStatement() != null
                    ? ctx.nonDelimitedStatement().accept(this)
                    : ctx.delimitedStatement().accept(this);
            }
            
            @Override
            public CodeContext visitReturnStatement(DejainParser.ReturnStatementContext ctx) {
                System.out.println("At return");
                ExpressionContext expression = getExpression(ctx.expression());
                
                return new ReturnContext(new Region(ctx), expression);
            }
        });
        System.out.println("r=" + r);
        return r;
    }

    private ExpressionContext getExpression(DejainParser.ExpressionContext ctx) {
        return ctx.accept(new DejainBaseVisitor<ExpressionContext>() {
            @Override
            public ExpressionContext visitStringLiteral(DejainParser.StringLiteralContext ctx) {
                String value = ctx.getText().substring(1, ctx.getText().length() - 1);
                return new LiteralContext(new Region(ctx), value, LiteralDelegateContext.String);
            }

            @Override
            public ExpressionContext visitIntegerLiteral(DejainParser.IntegerLiteralContext ctx) {
                int value = Integer.parseInt(ctx.getText());
                return new LiteralContext(new Region(ctx), value, LiteralDelegateContext.Integer);
            }

            @Override
            public ExpressionContext visitBinarySum(DejainParser.BinarySumContext ctx) {
                ExpressionContext result = ctx.first.accept(this);
                // Derive 
                
                for(int i = 1; i < ctx.leafExpression().size(); i++) {
                    ExpressionContext lhs = result;
                    ExpressionContext rhs = ctx.leafExpression(i).accept(this);

                    int operator;

                    switch(ctx.binarySumOperator(i - 1).operator.getType()) {
                        case DejainLexer.PLUS:
                            operator = BinaryExpressionContext.OPERATOR_ADD;
                            break;
                        case DejainLexer.MINUS:
                            operator = BinaryExpressionContext.OPERATOR_SUB;
                            break;
                        default:
                            operator = -1;
                    }

                    result = new BinaryExpressionContext(new Region(lhs.getRegion().start, rhs.getRegion().end), operator, lhs, rhs);
                }
                
                return result;
            }
        });
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
//                    for(DejainParser.ClassTransformerMemberContext memberCtx: ctx.members.classTransformerMember()) {
//                        memberCtx.accept(new DejainBaseVisitor<Object>() {
//                            @Override
//                            public Object visitClassTransformerMemberFieldAdd(DejainParser.ClassTransformerMemberFieldAddContext ctx) {
//                                try {
//                                    int fieldAccess = getAccessModifier(ctx.accessModifier(), ctx.modStatic());
//                                    String fieldName = ctx.identifier().getText();
//                                    String fieldTypeName = ctx.typeQualifier().getText();
//                                    String fieldDescriptor = Type.getDescriptor(classResolver.resolveType(fieldTypeName));
//                                    
//                                    transformer.addAction(classNode ->
//                                    {
//                                        classNode.fields.add(new FieldNode(fieldAccess, fieldName, fieldDescriptor, null, null));
//                                    });
//                                    
//                                    return null;
//                                } catch (ClassNotFoundException ex) {
//                                    Logger.getLogger(ASMCompiler.class.getName()).log(Level.SEVERE, null, ex);
//                                    return null;
//                                }
//                            }
//
//                            @Override
//                            public Object visitClassTransformerMemberMethod(DejainParser.ClassTransformerMemberMethodContext ctx) {
//                                try {
//                                    int methodAccess = getAccessModifier(ctx.accessModifier(), ctx.modStatic());
//                                    String methodName = ctx.identifier().getText();
//                                    Class<?> returnType = classResolver.resolveType(ctx.typeQualifier().getText());
//                                    String methodDescriptor = getMethodDescriptor(ctx.typeQualifier(), ctx.parameters());
//                                    
//                                    transformer.addPredicate(classNode -> {
//                                        System.out.println(methodName + " " + methodDescriptor);
//                                        return classNode.methods.stream().anyMatch(m ->
//                                            ((MethodNode)m).name.equals(methodName) &&
//                                            ((MethodNode)m).desc.equals(methodDescriptor));
//                                    });
//                                    
//                                    transformer.addAction(classNode ->
//                                    {
//                                        MethodNode methodNode = new MethodNode(methodAccess, methodName, methodDescriptor, null, null);
//                                        
//                                        OptionalInt existingMethodIndex =
//                                            IntStream.range(0, classNode.methods.size())
//                                            .filter(i -> 
//                                                ((MethodNode)classNode.methods.get(i)).name.equals(methodName) && 
//                                                ((MethodNode)classNode.methods.get(i)).desc.equals(methodDescriptor))
//                                            .findFirst();
//                                        
//                                        MethodNode methodNodeOriginal = (MethodNode)classNode.methods.get(existingMethodIndex.getAsInt());
//                                        
//                                        InsnList originalIl = new InsnList();
//                                        originalIl.add(methodNodeOriginal.instructions);
//                                        
//                                        MethodCodeGenerator generator = new MethodCodeGenerator(methodNode, returnType);
//                                        
//                                        generator.start();
//                                        treeToCode(ctx, generator, originalIl, false);
//                                        generator.end();
//                                        
//                                        methodNode.visitEnd();
//                                        
//                                        classNode.methods.remove(existingMethodIndex.getAsInt());
//                                        classNode.methods.add(methodNode);
//                                    });
//                                    
//                                    return null;
//                                } catch (ClassNotFoundException ex) {
//                                    Logger.getLogger(ASMCompiler.class.getName()).log(Level.SEVERE, null, ex);
//                                    return null;
//                                }
//                            }
//
//                            @Override
//                            public Object visitClassTransformerMemberMethodAdd(DejainParser.ClassTransformerMemberMethodAddContext ctx) {
//                                try {
//                                    int methodAccess = getAccessModifier(ctx.methodDefinition().accessModifier(), ctx.methodDefinition().modStatic());
//                                    String methodName = ctx.methodDefinition().identifier().getText();
//                                    Class<?> returnType = classResolver.resolveType(ctx.methodDefinition().typeQualifier().getText());
//                                    String methodDescriptor = getMethodDescriptor(ctx.methodDefinition().typeQualifier(), ctx.methodDefinition().parameters());
//                                    
//                                    transformer.addAction(classNode ->
//                                    {
//                                        MethodNode methodNode = new MethodNode(methodAccess, methodName, methodDescriptor, null, null);
//                                        MethodCodeGenerator generator = new MethodCodeGenerator(methodNode, returnType);
//                                        
//                                        generator.start();
//                                        treeToCode(ctx, generator, new InsnList() /*Something that generates a default values for non-void returns?*/, false);
//                                        generator.end();
//                                        
//                                        methodNode.visitEnd();
//                                        
//                                        OptionalInt existingMethodIndex =
//                                            IntStream.range(0, classNode.methods.size())
//                                            .filter(i -> 
//                                                ((MethodNode)classNode.methods.get(i)).name.equals(methodName) && 
//                                                ((MethodNode)classNode.methods.get(i)).desc.equals(methodDescriptor))
//                                            .findFirst();
//                                        if(existingMethodIndex.isPresent())
//                                            classNode.methods.remove(existingMethodIndex.getAsInt());
//                                        
//                                        classNode.methods.add(methodNode);
//                                    });
//                                    
//                                    return null;
//                                } catch (ClassNotFoundException ex) {
//                                    Logger.getLogger(ASMCompiler.class.getName()).log(Level.SEVERE, null, ex);
//                                    return null;
//                                }
//                            }
//                        });
//                    }
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
                    break;
                case DejainLexer.ACC_MOD_PROTECTED:
                    mod = Opcodes.ACC_PROTECTED;
                    break;
                case DejainLexer.ACC_MOD_PUBLIC:
                    mod = Opcodes.ACC_PUBLIC;
                    break;
            }
        }
        
        if(statCtx != null)
            return mod | Opcodes.ACC_STATIC;
        
        return mod;
    }
    
    public static class Region {
        public Position start;
        public Position end;

        public Region(Position start, Position end) {
            this.start = start;
            this.end = end;
        }
        
        public Region(ParserRuleContext ctx) {
            start = new Position(ctx.getStart());
            end = new Position(ctx.getStop());
        }
    }
    
    public static class Position {
        private int line;
        private int column;

        public Position(Token token) {
            this.line = token.getLine();
            this.column = token.getCharPositionInLine();
        }

        public Position(int line, int column) {
            this.line = line;
            this.column = column;
        }

        @Override
        public String toString() {
            return "" + line + "," + column;
        }
    }
    
    public static class Message {
        private Region region;
        private String text;

        public Message(ParserRuleContext ctx, String text) {
            region = new Region(new Position(ctx.getStart()), new Position(ctx.getStop()));
            this.text = text;
        }

        public Message(Region region, String text) {
            this.region = region;
            this.text = text;
        }

        @Override
        public String toString() {
            return "" + region.start + "-" + region.end + ": " + text;
        }
    }
    
    private void validateProgram(ProgramContext ctx, ArrayList<Message> errorMessages) {
        ctx.accept(new DejainBaseVisitor<Object>() {
            @Override
            public Object visitClassTransformer(DejainParser.ClassTransformerContext ctx) {
                if(ctx.members != null) {
//                    for(DejainParser.ClassTransformerMemberContext memberCtx: ctx.members.classTransformerMember()) {
//                        memberCtx.accept(new DejainBaseVisitor<Object>() {
//                            @Override
//                            public Object visitClassTransformerMemberMethod(DejainParser.ClassTransformerMemberMethodContext ctx) {
//                                try {
//                                    String methodName = ctx.identifier().getText();
//                                    Class<?> returnType = classResolver.resolveType(ctx.typeQualifier().getText());
//                                    validateMethod(ctx, methodName, returnType, errorMessages);
//                                } catch (ClassNotFoundException ex) {
//                                    Logger.getLogger(ASMCompiler.class.getName()).log(Level.SEVERE, null, ex);
//                                }
//                                
//                                return null;
//                            }
//                            
//                            @Override
//                            public Object visitClassTransformerMemberMethodAdd(DejainParser.ClassTransformerMemberMethodAddContext ctx) {
//                                try {
//                                    String methodName = ctx.methodDefinition().identifier().getText();
//                                    Class<?> returnType = classResolver.resolveType(ctx.methodDefinition().typeQualifier().getText());
//                                    validateMethod(ctx, methodName, returnType, errorMessages);
//                                } catch (ClassNotFoundException ex) {
//                                    Logger.getLogger(ASMCompiler.class.getName()).log(Level.SEVERE, null, ex);
//                                }
//                                
//                                return null;
//                            }
//                        });
//                    }
                }
                
                return null;
            }
        });
    }
    
    private static class VariableInfo {
        public Class<?> type;
        public boolean isAssigned;

        public VariableInfo(Class<?> type, boolean isAssigned) {
            this.type = type;
            this.isAssigned = isAssigned;
        }
    }
    
    private void validateMethod(ParserRuleContext ctx, String methodName, Class<?> returnTypeClass, ArrayList<Message> errorMessages) {
        ctx.accept(new DejainBaseVisitor<Object>() {
            HashMap<String, VariableInfo> locals = new HashMap<>();

            @Override
            public Object visitVariableDeclaration(DejainParser.VariableDeclarationContext ctx) {
                String name = ctx.id.getText();
                if(locals.containsKey(name))
                    errorMessages.add(new Message(ctx, "Variable " + name + " is already declared in method " + methodName + "."));
                else {
                    try {
                        Class<?> fieldType = classResolver.resolveType(ctx.typeQualifier().getText());
                        
                        if(ctx.expression() != null) {
                            Class<?> expressionType = validateExpression(ctx.expression(), errorMessages);
                            System.out.println("expressionType=" + expressionType);
                            errorMessages.add(new Message(ctx, "Variable " + name + " is already declared in method " + methodName + "."));
                            if(!fieldType.isAssignableFrom(expressionType)) {
                                errorMessages.add(new Message(ctx, "" + expressionType + " is not assignable to " + fieldType));
                            } else {
                                locals.put(name, new VariableInfo(fieldType, true));
                            }
                        } else {
                            locals.put(name, new VariableInfo(fieldType, false));
                        }
                    } catch (ClassNotFoundException ex) {
                        errorMessages.add(new Message(ctx, "Could not resolve type " + ctx.typeQualifier().getText() + "."));
                    }
                }
                
                return super.visitVariableDeclaration(ctx); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Object visitProceedStatement(DejainParser.ProceedStatementContext ctx) {
                return returnTypeClass;
            }
            
            @Override
            public Object visitReturnStatement(DejainParser.ReturnStatementContext ctx) {
                Class<?> expressionType = validateExpression(ctx.expression(), errorMessages);
                if(!returnTypeClass.isAssignableFrom(expressionType))
                    errorMessages.add(new Message(ctx, "" + expressionType + " is not assignable to " + returnTypeClass));
                return null;
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
    
    public static class MethodCodeGenerator {
        private static class VariableInfo {
            public int index;
            public Class<?> type;

            public VariableInfo(int index, Class<?> type) {
                this.index = index;
                this.type = type;
            }
        }
        
        public MethodNode methodNode;
        private Class<?> returnType;
        private HashMap<String, VariableInfo> localNameToIndexMap = new HashMap<>();
        private Label start;
        private Label end;

        public MethodCodeGenerator(MethodNode methodNode, Class<?> returnType) {
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
        
        public int declareVariable(String name, String desc, Class<?> type) {
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

        private Class<?> getVariableType(String name) {
            return localNameToIndexMap.get(name).type;
        }

        private Class<?> getReturnType() {
            return returnType;
        }
    }
    
    private Class<?> treeToCode(ParserRuleContext ctx, MethodCodeGenerator generator, InsnList originalIl, boolean asExpression) {
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
                        generator.methodNode.visitJumpInsn(Opcodes.GOTO, afterProceed);
                    else
                        generator.methodNode.instructions.add(insn);
                    
//                    if(isReturn(insn.getOpcode()))
//                        originalIlCopy.set(insn, new JumpInsnNode(Opcodes.GOTO, new LabelNode(afterProceed)));
                }
                
//                methodNode.instructions.add(originalIlCopy);
                generator.methodNode.visitLabel(afterProceed);
                
                if(asExpression) {
                    Type returnType = Type.getReturnType(generator.methodNode.desc);

                    try {
                        return classResolver.resolveType(returnType.getClassName());
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(ASMCompiler.class.getName()).log(Level.SEVERE, null, ex);
                        return null;
                    }
                } else {
                    generator.methodNode.visitInsn(Opcodes.POP);
                    return void.class;
                }
            }

            @Override
            public Class<?> visitVariableDeclaration(DejainParser.VariableDeclarationContext ctx) {
                try {
                    String name = ctx.id.getText();
                    Class<?> type = classResolver.resolveType(ctx.typeQualifier().getText());
                    String descriptor = Type.getDescriptor(type);
                    int index = generator.declareVariable(name, descriptor, type);
                    generator.methodNode.visitLocalVariable(name, name, name, null, null, index);
                    return type; //To change body of generated methods, choose Tools | Templates.
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ASMCompiler.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                
                return null;
            }
            
            @Override
            public Class<?> visitBinarySum(DejainParser.BinarySumContext ctx) {
                if(asExpression) {
                    Class<?> resultType = ctx.first.accept(this);

                    for(int i = 0; i < ctx.rest.getChildCount(); i++) {
                        Class<?> lhsResultType = resultType;

                        ParserRuleContext rhsCtx = (ParserRuleContext) ctx.rest.getChild(i);

                        Class<?> rhsResultType = rhsCtx.accept(this);

                        switch(ctx.binarySumOperator(i - 1).operator.getType()) {
                            case DejainLexer.PLUS:
                                if(lhsResultType.equals(String.class)) {
                                    if(!rhsResultType.equals(String.class))
                                        generator.methodNode.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/Object", "toString", "()Ljava/lang/String;", false);
                                    generator.methodNode.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/String", "concat", "(Ljava/lang/String;)Ljava/lang/String;", false);
                                } else if(rhsResultType.equals(String.class)) {
                                    // Not supported
                                } else {
                                    switch(lhsResultType.getSimpleName()) {
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
                                break;
                            case DejainLexer.MINUS:
                                switch(lhsResultType.getSimpleName()) {
                                    case "short":
                                        generator.methodNode.visitInsn(Opcodes.ISUB);
                                        break;
                                    case "int":
                                        generator.methodNode.visitInsn(Opcodes.ISUB);
                                        break;
                                    case "long":
                                        generator.methodNode.visitInsn(Opcodes.LSUB);
                                        break;
                                    case "float":
                                        generator.methodNode.visitInsn(Opcodes.FSUB);
                                        break;
                                    case "double":
                                        generator.methodNode.visitInsn(Opcodes.DSUB);
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
            public Class<?> visitLookup(DejainParser.LookupContext ctx) {
                String id = ctx.identifier().getText();
                
                if(generator.isVariable(id)) {
                    int index = generator.getVariableIndex(id);
                    Class<?> type = generator.getVariableType(id);
                    int loadOpcode = getLoad(type);
                    generator.methodNode.visitVarInsn(loadOpcode, index);
                } else {
                    // I field
                }
                
                return super.visitLookup(ctx); //To change body of generated methods, choose Tools | Templates.
            }
            
            @Override
            public Class<?> visitStringLiteral(DejainParser.StringLiteralContext ctx) {
                String str = ctx.STRING().getText().substring(1, ctx.STRING().getText().length() - 1);
                generator.methodNode.visitLdcInsn(str);
                
                return String.class;
            }

            @Override
            public Class<?> visitIntegerLiteral(DejainParser.IntegerLiteralContext ctx) {
                int i = Integer.parseInt(ctx.INTEGER().getText());
                generator.methodNode.visitLdcInsn(i);
                
                return int.class;
            }
            
            @Override
            public Class<?> visitReturnStatement(DejainParser.ReturnStatementContext ctx) {
                treeToCode(ctx.expression(), generator, originalIl, true);
                
//                Type returnType = Type.getReturnType(generator.methodNode.desc);                    
//                String returnTypeDescriptor = returnType.getDescriptor();
                int returnCode = getReturn(generator.getReturnType());
                generator.methodNode.visitInsn(returnCode);
                
//                switch(returnTypeDescriptor) {
//                    case "V":
//                        generator.methodNode.visitInsn(Opcodes.RETURN);
//                    case "J":
//                        generator.methodNode.visitInsn(Opcodes.LRETURN);
//                    case "D":
//                        generator.methodNode.visitInsn(Opcodes.DRETURN);
//                    case "F":
//                        generator.methodNode.visitInsn(Opcodes.FRETURN);
//                    case "I": case "Z": case "B": case "C": case "S":
//                        generator.methodNode.visitInsn(Opcodes.IRETURN);
//                    default:
//                        generator.methodNode.visitInsn(Opcodes.ARETURN);
//                }
                
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
    
    private static int getReturn(Class<?> type) {
        String typeDescriptor = Type.getDescriptor(type);
        switch(typeDescriptor) {
            case "V": return Opcodes.RETURN;
            case "J": return Opcodes.LRETURN;
            case "D": return Opcodes.DRETURN;
            case "F": return Opcodes.FRETURN;
            case "I": case "Z": case "B": case "C": case "S":
                return Opcodes.IRETURN;
            default: return Opcodes.ARETURN;
        }
    }

    private static int getLoad(Class<?> type) {
        String typeDescriptor = Type.getDescriptor(type);
        switch(typeDescriptor) {
            case "V": return -1;
            case "J": return Opcodes.LLOAD;
            case "D": return Opcodes.DLOAD;
            case "F": return Opcodes.FLOAD;
            case "I": case "Z": case "B": case "C": case "S":
                return Opcodes.ILOAD;
            default: return Opcodes.ALOAD;
        }
    }
}
