/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jasy.lang;

import jasy.lang.antlr4.JasyBaseVisitor;
import jasy.lang.antlr4.JasyLexer;
import jasy.lang.antlr4.JasyParser;
import jasy.lang.antlr4.JasyParser.AnnotationContext;
import jasy.lang.antlr4.JasyParser.InvocationContext;
import jasy.lang.antlr4.JasyParser.LookupContext;
import jasy.lang.antlr4.JasyParser.MetaBlockContext;
import jasy.lang.antlr4.JasyParser.ProgramContext;
import jasy.lang.antlr4.JasyParser.StatementContext;
import jasy.lang.ast.BinaryExpressionAST;
import jasy.lang.ast.BlockAST;
import jasy.lang.ast.ClassAST;
import jasy.lang.ast.ExpressionAST;
import jasy.lang.ast.FieldAST;
import jasy.lang.ast.FieldSelectorAST;
import jasy.lang.ast.LiteralAST;
import jasy.lang.ast.MemberAST;
import jasy.lang.ast.MethodAST;
import jasy.lang.ast.MethodSelectorAST;
import jasy.lang.ast.ModuleAST;
import jasy.lang.ast.ReturnAST;
import jasy.lang.ast.MetaExpressionAST;
import jasy.lang.ast.CodeAST;
import jasy.lang.ast.CodeVisitor;
import jasy.lang.ast.RootExpressionAST;
import jasy.lang.ast.FieldGetAST;
import jasy.lang.ast.FieldSetAST;
import jasy.lang.ast.InjectAST;
import jasy.lang.ast.IntLiteralAST;
import jasy.lang.ast.InvocationAST;
import jasy.lang.ast.LongLiteralAST;
import jasy.lang.ast.LookupAST;
import jasy.lang.ast.MemberVisitor;
import jasy.lang.ast.MetaCodeAST;
import jasy.lang.ast.MetaScope;
import jasy.lang.ast.NameTypeAST;
import jasy.lang.ast.QuoteAST;
import jasy.lang.ast.StringLiteralAST;
import jasy.lang.ast.ThisAST;
import jasy.lang.ast.TypeAST;
import jasy.lang.ast.VariableAssignmentAST;
import jasy.lang.ast.VariableDeclarationAST;
import jasy.runtime.asm.ClassTransformer;
import jasy.runtime.asm.ClassTransformerSequence;
import jasy.runtime.asm.CommonClassTransformer;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
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
import org.objectweb.asm.commons.GeneratorAdapter;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.ClassNode;
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
    
    private JasyParser createParser(InputStream sourceCode) throws IOException {
        CharStream charStream = new ANTLRInputStream(sourceCode);
        JasyLexer lexer = new JasyLexer(charStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        return new JasyParser(tokenStream);
    }
    
//    public ExpressionAST compileExpression(InputStream sourceCode) throws IOException {
//        DejainParser parser = createParser(sourceCode);
//        
//        DejainParser.ExpressionContext expression = parser.expression();
//        
//        MetaProcessing mp = new MetaProcessing();
//        return getExpression(expression, mp);
//    }
    
    public ModuleAST compile(InputStream sourceCode) throws IOException {
        ArrayList<ClassAST> classes = new ArrayList<>();
        
        JasyParser parser = createParser(sourceCode);
        
        JasyParser.ProgramContext program = parser.program();
        
        Hashtable<String, TypeAST> patternVariables = new Hashtable<>();
        MetaScope metaScope = new MetaScope(patternVariables);
        MetaProcessing mp = new MetaProcessing(patternVariables);
        
        program.accept(new JasyBaseVisitor<Object>() {
            @Override
            public Object visitClassTransformer(JasyParser.ClassTransformerContext ctx) {
                List<jasy.lang.ast.AnnotationAST> annotations = ctx.annotations().annotation().stream()
                    .map(aCtx -> new jasy.lang.ast.AnnotationAST(new Region(aCtx), aCtx.PLUS() != null, new NameTypeAST(new Region(aCtx), aCtx.typeQualifier().getText())))
                    .collect(Collectors.toList());
                
                try {
                    if(ctx.variableId != null) {
                        String variableName = ctx.variableId.getText();
                        Region r = new Region(ctx.variableId);
                        Class<?> c = ClassNode.class;
                        NameTypeAST t = new NameTypeAST(r, c);
                        patternVariables.put(variableName, t);
                    }
                } catch(Exception e) {
                    e.toString();
                }
                
                Integer accessModifer = null;
                if(ctx.accessModifier() != null)
                    accessModifer = getAccessModifier(ctx.accessModifier(), null);
                
                NameTypeAST type = ctx.typeQualifier() != null ? new NameTypeAST(new Region(ctx), ctx.typeQualifier().getText()) : null;
                
                ArrayList<MemberAST> members = new ArrayList<>();
                
                if(ctx.members != null) {
                    for(JasyParser.ClassTransformerMemberDefinitionContext memberCtx: ctx.members.classTransformerMemberDefinition()) {
                        boolean isAdd = memberCtx.PLUS() != null;
                        String variableId = memberCtx.variableId != null ? memberCtx.variableId.getText() : null;
                        memberCtx.member.accept(new JasyBaseVisitor<Object>() {
                            @Override
                            public Object visitClassTransformerMemberField(JasyParser.ClassTransformerMemberFieldContext ctx) {
                                if(variableId != null) {
                                    String variableName = variableId;
                                    Region r = new Region(ctx);
                                    Class<?> c = List.class;
//                                    NameTypeAST t = new NameTypeAST(r, c);
//                                    NameTypeAST t = NameTypeAST.fromDescriptor(Type.getDescriptor(c), new TypeAST[]{NameTypeAST.fromDescriptor(Type.getDescriptor(FieldNode.class))});
                                    NameTypeAST t = new NameTypeAST(null, c, new TypeAST[]{new NameTypeAST(null, FieldNode.class)});
                                    patternVariables.put(variableName, t);
                                }
                                
                                Integer accessModifier = ctx.accessModifier() != null ? getAccessModifier(ctx.accessModifier(), null) : null;
                                boolean isStatic = ctx.modStatic() != null;
                                TypeAST fieldType = ctx.typeQualifier() != null ? new NameTypeAST(new Region(ctx), ctx.typeQualifier().getText()) : null;
                                String name = ctx.identifier() != null ? ctx.identifier().getText() : null;
                                
                                ExpressionAST value = null;
                                
                                if(ctx.value != null) {
                                    MetaProcessing mp = new MetaProcessing(patternVariables);
                                    value = getExpression(ctx.value, mp);
                                }
                                
                                FieldAST field = new FieldAST(new Region(ctx), variableId, isAdd, new FieldSelectorAST(accessModifier, isStatic, fieldType, name), value);
                                
                                members.add(field);
                                
                                return null;
                            }
                            
                            @Override
                            public Object visitClassTransformerMemberMethod(JasyParser.ClassTransformerMemberMethodContext ctx) {
                                Integer accessModifier = ctx.accessModifier() != null ? getAccessModifier(ctx.accessModifier(), null) : null;
                                boolean isStatic = ctx.modStatic() != null;
                                TypeAST returnType = new NameTypeAST(new Region(ctx), ctx.typeQualifier().getText());
                                String name = ctx.identifier().getText();
                                List<TypeAST> parameterTypes = ctx.parameters().parameter().stream()
                                    .map(pCtx -> new NameTypeAST(new Region(ctx), pCtx.typeQualifier().getText()))
                                    .collect(Collectors.toList());
                                
                                CodeAST body;
//                                List<jasy.lang.ast.CodeAST> body = null;
                                if(ctx.body.block() != null) {
                                    // TODO: Wrap into meta block, that returns the block quoted
                                    List<jasy.lang.ast.CodeAST> statements = getStatements(ctx.body.block().statements(), mp);
                                    CodeAST bodyBlock = new BlockAST(new Region(ctx.body), statements);
                                    body = new ReturnAST(new Region(ctx.body), new QuoteAST(new Region(ctx.body), bodyBlock));
                                    
//                                    body = getStatements(ctx.body.block().statements(), mp);
                                } else {
                                    List<jasy.lang.ast.CodeAST> statements = getStatements(ctx.body.metaBlock().statements(), mp);
                                    body = new BlockAST(new Region(ctx.body), statements);
                                }
                                
                                MethodAST method = new MethodAST(new Region(ctx), isAdd, new MethodSelectorAST(accessModifier, isStatic, returnType, name, parameterTypes), body, mp);
                                
                                members.add(method);
                                
                                return null;
                            }
                        });
                    }
                }
                
                String variableId = ctx.variableId != null ? ctx.variableId.getText() : null;
                
                classes.add(new ClassAST(new Region(ctx), variableId, annotations, accessModifer, type, members));
                
                return null;
            }
        });
        
        ModuleAST moduleCtx = new ModuleAST(new Region(program), classes);
        
//        processMeta(moduleCtx);
        
        return moduleCtx;
    }
    
    public static class MetaProcessing {
        public int generatorCount;
        public MetaScope metaScope;

        public MetaProcessing(Hashtable<String, TypeAST> patternVariables) {
            metaScope = new MetaScope(patternVariables);
        }
    }

    private List<jasy.lang.ast.CodeAST> getStatements(JasyParser.StatementsContext ctx, MetaProcessing mp) {
        return ctx.statement().stream()
            .map(sCtx -> getStatement(sCtx, mp))
            .collect(Collectors.toList());
    }
    
    private jasy.lang.ast.CodeAST getStatement(ParserRuleContext ctx, MetaProcessing mp) {
        jasy.lang.ast.CodeAST r = ctx.accept(new JasyBaseVisitor<jasy.lang.ast.CodeAST>() {
            @Override
            public CodeAST visitStatement(JasyParser.StatementContext ctx) {
                if(ctx.nonDelimitedStatement() != null)
                    return ctx.nonDelimitedStatement().accept(this);
                if(ctx.delimitedStatement() != null)
                    return ctx.delimitedStatement().accept(this);
                if(ctx.metaBlock() != null)
                    return ctx.metaBlock().accept(this);
                
                return null;
            }

            @Override
            public CodeAST visitDelimitedStatement(JasyParser.DelimitedStatementContext ctx) {
                if(ctx.expression() != null) {
                    ExpressionAST expression = getExpression(ctx.expression(), mp);
                    return new RootExpressionAST(new Region(ctx), expression);
                }
                
                return ctx.getChild(0).accept(this);
            }
            
            @Override
            public CodeAST visitReturnStatement(JasyParser.ReturnStatementContext ctx) {
                ExpressionAST expression = getExpression(ctx.expression(), mp);
                
                return new ReturnAST(new Region(ctx), expression);
            }

            @Override
            public CodeAST visitVariableDeclaration(JasyParser.VariableDeclarationContext ctx) {
                String type = ctx.typeQualifier().getText();
                String name = ctx.identifier().getText();
                
                ExpressionAST value;
                if(ctx.expression() != null)
                    value = getExpression(ctx.expression(), mp);
                else
                    value = null;
                
                return new VariableDeclarationAST(new Region(ctx), name, new NameTypeAST(new Region(ctx.typeQualifier()), type), value);
            }

            @Override
            public CodeAST visitMetaBlock(JasyParser.MetaBlockContext ctx) {
                List<CodeAST> statements = getStatements(ctx.statements(), mp);
                
                return new MetaCodeAST(null, new BlockAST(null, statements));
            }

            @Override
            public CodeAST visitInjectStatement(JasyParser.InjectStatementContext ctx) {
                ExpressionAST expression = getExpression(ctx.expression(), mp);
                
                return new InjectAST(new Region(ctx), expression);
            }
        });
        
        return r;
    }

    private ExpressionAST getExpression(ParserRuleContext ctx, MetaProcessing mp) {
        return ctx.accept(new JasyBaseVisitor<ExpressionAST>() {
            @Override
            public ExpressionAST visitStringLiteral(JasyParser.StringLiteralContext ctx) {
                String value = ctx.getText().substring(1, ctx.getText().length() - 1);
                value = value.replace("\\\\", "\\").replace("\\\"", "\"");
                return new StringLiteralAST(new Region(ctx), value);
            }

            @Override
            public ExpressionAST visitIntegerLiteral(JasyParser.IntegerLiteralContext ctx) {
                int value = Integer.parseInt(ctx.getText());
                return new IntLiteralAST(new Region(ctx), value);
            }

            @Override
            public ExpressionAST visitLongLiteral(JasyParser.LongLiteralContext ctx) {
                String valueStr = ctx.getText().substring(0, ctx.getText().length() - 1);
                long value = Long.parseLong(valueStr);
                return new LongLiteralAST(new Region(ctx), value);
            }

            @Override
            public ExpressionAST visitLeafExpression(JasyParser.LeafExpressionContext ctx) {
                ExpressionAST result = ctx.getChild(0).accept(this);
                
                for(int i = 0; i < ctx.leafExpressionChain().getChildCount(); i++) {
                    if(ctx.leafExpressionChain().getChild(i) instanceof ParserRuleContext) {
                        ParserRuleContext chainCtx = (ParserRuleContext)ctx.leafExpressionChain().getChild(i);

                        switch(chainCtx.getRuleIndex()) {
                            case JasyParser.RULE_lookup:
                                LookupContext lookupCtx = (LookupContext)chainCtx;
                                String fieldName = lookupCtx.identifier().getText();
                                result = new FieldGetAST(new Region(chainCtx), result, fieldName);
                                break;
                            case JasyParser.RULE_invocation:
                                InvocationContext invocationCtx = (InvocationContext)chainCtx;
                                String methodName = invocationCtx.identifier().getText();
                                List<ExpressionAST> arguments = invocationCtx.arguments().expression().stream()
                                    .map(eCtx -> getExpression(eCtx, mp)).collect(Collectors.toList());
                                result = new InvocationAST(new Region(chainCtx), result, null, methodName, arguments, null);
                                break;
                        }
                    }
                }
                
                return result;
            }

            @Override
            public ExpressionAST visitAdditiveExpression(JasyParser.AdditiveExpressionContext ctx) {
                ExpressionAST result = ctx.first.accept(this);
                // Derive 
                
                for(int i = 1; i < ctx.multiplicativeExpression().size(); i++) {
                    ExpressionAST lhs = result;
                    ExpressionAST rhs = ctx.multiplicativeExpression(i).accept(this);

                    int operator;

                    switch(ctx.additiveOperator(i - 1).operator.getType()) {
                        case JasyLexer.PLUS:
                            operator = BinaryExpressionAST.OPERATOR_ADD;
                            break;
                        case JasyLexer.MINUS:
                            operator = BinaryExpressionAST.OPERATOR_SUB;
                            break;
                        default:
                            operator = -1;
                    }

                    result = new BinaryExpressionAST(new Region(lhs.getRegion().start, rhs.getRegion().end), operator, lhs, rhs);
                }
                
                return result;
            }
            
            @Override
            public ExpressionAST visitMetaExpression(JasyParser.MetaExpressionContext ctx) {
//                ArrayList<CodeAST> body = new ArrayList<>();
                ExpressionAST body = null;
                
                if(ctx.expression() != null) {
                    // only support expressions for now
                    ExpressionAST exprCtx = getExpression(ctx.expression(), mp);
//                    body.add(new ReturnAST(new Region(ctx), exprCtx));
                    body = exprCtx;
                } else {
                    // Not possible; only expressions are supported here!!!
//                    body.addAll(getStatements(ctx.statements(), mp));
                }
                
//                return new MetaExpressionAST(new Region(ctx), ASMCompiler.this, body, mp);
                return new MetaExpressionAST(new Region(ctx), body);
            }

            @Override
            public ExpressionAST visitLookup(JasyParser.LookupContext ctx) {
                String name = ctx.getText();
                return new LookupAST(new Region(ctx), name);
//                boolean isVariable = false;
//                
//                
//                
//                if(isVariable) {
//                    // What to do?...
//                } else {
//                    return new FieldGetAST(new Region(ctx), new ThisAST(new Region(ctx)), name);
//                }
                
//                return super.visitLookup(ctx); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public ExpressionAST visitVariableAssignment(JasyParser.VariableAssignmentContext ctx) {
                if(ctx.ASSIGN_OP() != null) {
                    String name = ctx.identifier().getText();
                    ExpressionAST value = getExpression(ctx.value, mp);

                    return new VariableAssignmentAST(new Region(ctx), name, value);
                } else
                    return ctx.relationalExpression().accept(this);
            }

            @Override
            public ExpressionAST visitQuotedExpression(JasyParser.QuotedExpressionContext ctx) {
                CodeAST code = null;
                
                if(ctx.delimitedStatement() != null)
                    code = getStatement(ctx.delimitedStatement(), mp);
                else if(ctx.nonDelimitedStatement() != null)
                    code = getStatement(ctx.nonDelimitedStatement(), mp);
                else if(ctx.block() != null) {
                    List<CodeAST> statements = getStatements(ctx.block().statements(), mp);
                    code = new BlockAST(new Region(ctx.block()), statements);
                } else if(ctx.expression() != null)
                    code = getExpression(ctx.expression(), mp);
                
                return new QuoteAST(new Region(ctx), code);
            }
        });
    }
    
    public ClassTransformer compile(InputStream sourceCode, ArrayList<Message> errorMessages) throws IOException {
        CharStream charStream = new ANTLRInputStream(sourceCode);
        JasyLexer lexer = new JasyLexer(charStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        JasyParser parser = new JasyParser(tokenStream);
        
        JasyParser.ProgramContext program = parser.program();
        
        ClassTransformerSequence classTransformers = new ClassTransformerSequence();
        
        validateProgram(program, errorMessages);
        
        program.accept(new JasyBaseVisitor<Object>() {
            @Override
            public Object visitClassTransformer(JasyParser.ClassTransformerContext ctx) {
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
    
    private String getMethodDescriptor(JasyParser.TypeQualifierContext returnType, JasyParser.ParametersContext paramsCtx) throws ClassNotFoundException {
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
    
    private static int getAccessModifier(JasyParser.AccessModifierContext ctx, JasyParser.ModStaticContext statCtx) {
        int mod = Opcodes.ACC_PRIVATE;
        
        if(ctx != null) {
            switch(((TerminalNode)ctx.getChild(0)).getSymbol().getType()) {
                case JasyLexer.ACC_MOD_PRIVATE:
                    mod = Opcodes.ACC_PRIVATE;
                    break;
                case JasyLexer.ACC_MOD_PROTECTED:
                    mod = Opcodes.ACC_PROTECTED;
                    break;
                case JasyLexer.ACC_MOD_PUBLIC:
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
            end = new Position(ctx.getStop() != null ? ctx.getStop() : ctx.getStart());
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
        
        public Region getRegion() {
            return region;
        }
        
        public String getText() {
            return text;
        }

        @Override
        public String toString() {
            return "" + region.start + "-" + region.end + ": " + text;
        }
    }
    
    private void validateProgram(ProgramContext ctx, ArrayList<Message> errorMessages) {
        ctx.accept(new JasyBaseVisitor<Object>() {
            @Override
            public Object visitClassTransformer(JasyParser.ClassTransformerContext ctx) {
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
        ctx.accept(new JasyBaseVisitor<Object>() {
            HashMap<String, VariableInfo> locals = new HashMap<>();

            @Override
            public Object visitVariableDeclaration(JasyParser.VariableDeclarationContext ctx) {
                String name = ctx.id.getText();
                if(locals.containsKey(name))
                    errorMessages.add(new Message(ctx, "Variable " + name + " is already declared in method " + methodName + "."));
                else {
                    try {
                        Class<?> fieldType = classResolver.resolveType(ctx.typeQualifier().getText());
                        
                        if(ctx.expression() != null) {
                            Class<?> expressionType = validateExpression(ctx.expression(), errorMessages);
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
            public Object visitProceedStatement(JasyParser.ProceedStatementContext ctx) {
                return returnTypeClass;
            }
            
            @Override
            public Object visitReturnStatement(JasyParser.ReturnStatementContext ctx) {
                Class<?> expressionType = validateExpression(ctx.expression(), errorMessages);
                if(!returnTypeClass.isAssignableFrom(expressionType))
                    errorMessages.add(new Message(ctx, "" + expressionType + " is not assignable to " + returnTypeClass));
                return null;
            }
        });
    }
    
    private static Class<?> validateExpression(ParserRuleContext ctx, ArrayList<Message> errorMessages) {
        return ctx.accept(new JasyBaseVisitor<Class<?>>() {
            @Override
            public Class<?> visitStringLiteral(JasyParser.StringLiteralContext ctx) {
                return String.class;
            }

            @Override
            public Class<?> visitIntegerLiteral(JasyParser.IntegerLiteralContext ctx) {
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
