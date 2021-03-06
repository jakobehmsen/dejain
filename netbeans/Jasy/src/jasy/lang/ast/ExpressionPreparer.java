package jasy.lang.ast;

import jasy.lang.ClassResolver;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import org.objectweb.asm.Label;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.commons.GeneratorAdapter;
import org.objectweb.asm.commons.Method;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.InsnList;

public class ExpressionPreparer implements CodeVisitor<PreparedExpressionAST> {
    private Scope thisClass;
    private ClassResolver classResolver;
    private ClassLoader classLoader;
    private Hashtable<String, ParameterInfo> parameters;
    private Hashtable<String, TypeAST> variables;
    private boolean asExpression;

    public ExpressionPreparer(Scope thisClass, ClassResolver classResolver, ClassLoader classLoader, Hashtable<String, ParameterInfo> parameters, Hashtable<String, TypeAST> variables, boolean asExpression) {
        this.thisClass = thisClass;
        this.classResolver = classResolver;
        this.classLoader = classLoader;
        this.parameters = parameters;
        this.variables = variables;
        this.asExpression = asExpression;
    }

    @Override
    public PreparedExpressionAST visitReturn(ReturnAST ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PreparedExpressionAST visitMetaCode(MetaCodeAST ctx) {
        PreparedAST body = MethodAST.toCode(thisClass, ctx.body, classResolver, classLoader, parameters, variables);
        return new PreparedExpressionAST() {
            @Override
            public TypeAST resultType() {
                // After execution, leaves the stack as it was pre execution
                return new NameTypeAST(null, void.class);
            }

            @Override
            public void generate(Transformation<ClassNode> c, MethodCodeGenerator generator, InsnList originalIl, Label ifFalseLabel) {
                body.generate(c, generator, originalIl);
            }
        };
    }

    @Override
    public PreparedExpressionAST visitBlock(BlockAST ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PreparedExpressionAST visitStringLiteral(StringLiteralAST ctx) {
        return new PreparedExpressionAST() {
            @Override
            public TypeAST resultType() {
                return new NameTypeAST(ctx.getRegion(), String.class);
            }

            @Override
            public void generate(Transformation<ClassNode> c, MethodCodeGenerator generator, InsnList originalIl, Label ifFalseLabel) {
                if (asExpression) {
                    generator.methodNode.push(ctx.value);
                }
            }
        };
    }

    @Override
    public PreparedExpressionAST visitIntLiteral(IntLiteralAST ctx) {
        return new PreparedExpressionAST() {
            @Override
            public TypeAST resultType() {
                return new NameTypeAST(ctx.getRegion(), int.class);
            }

            @Override
            public void generate(Transformation<ClassNode> c, MethodCodeGenerator generator, InsnList originalIl, Label ifFalseLabel) {
                //                    System.out.println("visitIntLiteral");
                if (asExpression) {
                    generator.methodNode.push(ctx.value);
                }
            }
        };
    }
    
    private PreparedExpressionAST typeCast(PreparedExpressionAST expression, TypeAST to) {
        return new PreparedExpressionAST() {
            @Override
            public TypeAST resultType() {
                return to;
            }

            @Override
            public void generate(Transformation<ClassNode> c, MethodCodeGenerator generator, InsnList originalIl, Label ifFalseLabel) {
                expression.generate(c, generator, originalIl, ifFalseLabel);
                generator.methodNode.cast(Type.getType(expression.resultType().getDescriptor()), Type.getType(to.getDescriptor()));
            }
        };
    }

    @Override
    public PreparedExpressionAST visitBinaryExpression(BinaryExpressionAST ctx) {
        PreparedExpressionAST lhsTmp = ctx.lhs.accept(this);
        PreparedExpressionAST rhsTmp = ctx.rhs.accept(this);
        TypeAST resultTypeRaw = null;
        if (lhsTmp.resultType().getDescriptor().equals("Ljava/lang/String;") || rhsTmp.resultType().getDescriptor().equals("Ljava/lang/String;")) {
            switch (ctx.operator) {
                case BinaryExpressionAST.OPERATOR_ADD:
                    if (!lhsTmp.resultType().getDescriptor().equals("Ljava/lang/String;")) {
                        lhsTmp = expressionAsString(lhsTmp);
                    }
                    if (!rhsTmp.resultType().getDescriptor().equals("Ljava/lang/String;")) {
                        rhsTmp = expressionAsString(rhsTmp);
                    }
                    resultTypeRaw = new NameTypeAST(ctx.getRegion(), String.class);
                    break;
            }
        } else if (lhsTmp.resultType().derivesFrom(new NameTypeAST(null, CodeAST.class)) || rhsTmp.resultType().derivesFrom(new NameTypeAST(null, CodeAST.class))) {
            switch (ctx.operator) {
                case BinaryExpressionAST.OPERATOR_ADD:
                    if (!lhsTmp.resultType().derivesFrom(new NameTypeAST(null, CodeAST.class))) {
                        lhsTmp = expressionAsStatement(lhsTmp);
                    }
                    if (!rhsTmp.resultType().derivesFrom(new NameTypeAST(null, CodeAST.class))) {
                        rhsTmp = expressionAsStatement(rhsTmp);
                    }
                    resultTypeRaw = new NameTypeAST(ctx.getRegion(), CodeAST.class);
                    break;
            }
        } else {
            switch (ctx.operator) {
                case BinaryExpressionAST.OPERATOR_ADD:
                case BinaryExpressionAST.OPERATOR_SUB:
                case BinaryExpressionAST.OPERATOR_MULT:
                case BinaryExpressionAST.OPERATOR_DIV:
                case BinaryExpressionAST.OPERATOR_REM:
                    Class<?> type = Reduction.typeOf(lhsTmp.resultType().getSimpleName(), rhsTmp.resultType().getSimpleName());
                    
                    if(type != null) {
                        resultTypeRaw = new NameTypeAST(ctx.getRegion(), type);
                        
                        if(!lhsTmp.resultType().equals(resultTypeRaw))
                            lhsTmp = typeCast(lhsTmp, resultTypeRaw);
                        if(!rhsTmp.resultType().equals(resultTypeRaw))
                            rhsTmp = typeCast(rhsTmp, resultTypeRaw);
                    }
                    
                    break;
                case BinaryExpressionAST.OPERATOR_LT:
                case BinaryExpressionAST.OPERATOR_LTE:
                case BinaryExpressionAST.OPERATOR_GT:
                case BinaryExpressionAST.OPERATOR_GTE:
                case BinaryExpressionAST.OPERATOR_EQ:
                case BinaryExpressionAST.OPERATOR_NE:
                    resultTypeRaw = new NameTypeAST(ctx.getRegion(), boolean.class);
                    break;
            }
        }
        
        TypeAST resultType = resultTypeRaw;
        
        if(resultType == null)
            new String();
        
        PreparedExpressionAST lhs = lhsTmp;
        PreparedExpressionAST rhs = rhsTmp;
        return new PreparedExpressionAST() {
            @Override
            public TypeAST resultType() {
                return resultType;
            }

            @Override
            public void generate(Transformation<ClassNode> c, MethodCodeGenerator generator, InsnList originalIl, Label ifFalseLabel) {
                lhs.generate(c, generator, originalIl);
                rhs.generate(c, generator, originalIl);
                switch (ctx.operator) {
                    case BinaryExpressionAST.OPERATOR_ADD:
                        {
                            switch (resultType().getSimpleName(c.getTarget().name)) {
                                case "String":
                                    generator.methodNode.invokeVirtual(Type.getType("java/lang/String"), new Method("concat", "(Ljava/lang/String;)Ljava/lang/String;"));
                                    break;
                                case "CodeAST":
                                    generator.methodNode.invokeInterface(Type.getType("jasy/lang/ast/CodeAST"), new Method("concat", "(Ljasy/lang/ast/CodeAST;)Ljasy/lang/ast/CodeAST;"));
                                    break;
                                case "byte":
                                case "short":
                                case "int":
                                case "long":
                                case "float":
                                case "double":
                                    generator.methodNode.math(GeneratorAdapter.ADD, Type.getType(resultType().getDescriptor()));
                                    break;
                            }
                            break;
                        }
                    case BinaryExpressionAST.OPERATOR_SUB:
                        {
                            switch (resultType().getSimpleName(c.getTarget().name)) {
                                case "byte":
                                case "short":
                                case "int":
                                case "long":
                                case "float":
                                case "double":
                                    generator.methodNode.math(GeneratorAdapter.SUB, Type.getType(resultType().getDescriptor()));
                                    break;
                            }
                            break;
                        }
                    case BinaryExpressionAST.OPERATOR_MULT:
                        {
                            switch (resultType().getSimpleName(c.getTarget().name)) {
                                case "byte":
                                case "short":
                                case "int":
                                case "long":
                                case "float":
                                case "double":
                                    generator.methodNode.math(GeneratorAdapter.MUL, Type.getType(resultType().getDescriptor()));
                                    break;
                            }
                            break;
                        }
                    case BinaryExpressionAST.OPERATOR_DIV:
                        {
                            switch (resultType().getSimpleName(c.getTarget().name)) {
                                case "byte":
                                case "short":
                                case "int":
                                case "long":
                                case "float":
                                case "double":
                                    generator.methodNode.math(GeneratorAdapter.DIV, Type.getType(resultType().getDescriptor()));
                                    break;
                            }
                            break;
                        }
                    case BinaryExpressionAST.OPERATOR_REM:
                        {
                            switch (resultType().getSimpleName(c.getTarget().name)) {
                                case "byte":
                                case "short":
                                case "int":
                                case "long":
                                case "float":
                                case "double":
                                    generator.methodNode.math(GeneratorAdapter.REM, Type.getType(resultType().getDescriptor()));
                                    break;
                            }
                            break;
                        }
                    case BinaryExpressionAST.OPERATOR_LT:
                    case BinaryExpressionAST.OPERATOR_LTE:
                    case BinaryExpressionAST.OPERATOR_GT:
                    case BinaryExpressionAST.OPERATOR_GTE:
                    case BinaryExpressionAST.OPERATOR_EQ:
                    case BinaryExpressionAST.OPERATOR_NE:
                        {
                            // Derive opposite mode
                            int mode;
                            
                            switch(ctx.operator) {
                                case BinaryExpressionAST.OPERATOR_LT:
                                    mode = GeneratorAdapter.GE;
                                    break;
                                case BinaryExpressionAST.OPERATOR_LTE:
                                    mode = GeneratorAdapter.GT;
                                    break;
                                case BinaryExpressionAST.OPERATOR_GT:
                                    mode = GeneratorAdapter.LE;
                                    break;
                                case BinaryExpressionAST.OPERATOR_GTE:
                                    mode = GeneratorAdapter.LT;
                                    break;
                                case BinaryExpressionAST.OPERATOR_EQ:
                                    mode = GeneratorAdapter.NE;
                                    break;
                                case BinaryExpressionAST.OPERATOR_NE:
                                    mode = GeneratorAdapter.EQ;
                                    break;
                                default:
                                    mode = -1;
                            }
                            
                            if(ifFalseLabel != null) {
                                generator.methodNode.ifCmp(Type.getType(resultType.getDescriptor()), mode, ifFalseLabel);
                            } else {
                                Label ifOppositeTrue = new Label();
                                Label end = new Label();
                                generator.methodNode.ifCmp(Type.getType(resultType.getDescriptor()), mode, ifOppositeTrue);
                                generator.methodNode.push(true);
                                generator.methodNode.goTo(end);
                                generator.methodNode.visitLabel(ifOppositeTrue);
                                generator.methodNode.push(false);
                                generator.methodNode.visitLabel(end);
                            }
                            break;
                        }
                }
            }
        };
    }

    private PreparedExpressionAST expressionAsString(PreparedExpressionAST ctx) {
        switch (ctx.resultType().getSimpleName()) {
            case "int":
                return createInvocation(new NameTypeAST(null, Integer.class), "toString", Arrays.asList(ctx));
            default:
                return createInvocation(ctx, "toString", Collections.emptyList());
        }
    }

    private PreparedExpressionAST expressionAsStatement(PreparedExpressionAST ctx) {
        switch (ctx.resultType().getSimpleName()) {
            case "int":
                return createInvocation(new NameTypeAST(null, Integer.class), "toString", Arrays.asList(ctx));
            default:
                return createInvocation(ctx, "toString", Collections.emptyList());
        }
    }
    
    private PreparedExpressionAST toExpression(ExpressionAST expression) {
        return MethodAST.toExpression(thisClass, expression, classResolver, classLoader, parameters, variables);
    }
    
    private PreparedExpressionAST toExpression(ExpressionAST expression, boolean asExpression) {
        return MethodAST.toExpression(thisClass, expression, classResolver, classLoader, parameters, variables, asExpression);
    }

    @Override
    public PreparedExpressionAST visitInvocation(InvocationAST ctx) {
//        PreparedExpressionAST target = ctx.target != null ? ctx.target.accept(this) : null;
//        Object target = ctx.target instanceof ExpressionAST ? ((ExpressionAST)ctx.target).accept(this) : ctx.target;
        Object target = getPreparedTarget(ctx.target);
        List<PreparedExpressionAST> arguments = ctx.arguments.stream()
            .map(a -> toExpression(a))
            .collect(Collectors.toList());
        return createInvocation(target, ctx.methodName, arguments);
    }

    private PreparedExpressionAST createInvocation(Object target, String methodName, List<PreparedExpressionAST> arguments) {
        Type tmpTargetType = null;
        List<java.lang.reflect.Method> ms;
        if (target instanceof PreparedExpressionAST) {
            ms = getCompatibleMethodsWith(((NameTypeAST) ((PreparedExpressionAST)target).resultType()).getType(classLoader), false, methodName, arguments);
        } else {
            ms = getCompatibleMethodsWith(((NameTypeAST) target).getType(classLoader), true, methodName, arguments);
        }
        java.lang.reflect.Method tmpMethod = ms.get(0);
        if (target instanceof PreparedExpressionAST) {
            tmpTargetType = Type.getType(((PreparedExpressionAST)target).resultType().getDescriptor());
        }
        TypeAST tmpCastType = null;
        if (tmpMethod.getGenericReturnType() instanceof TypeVariable) {
            TypeVariable rtv = (TypeVariable) tmpMethod.getGenericReturnType();
            TypeAST typeArgument = ((PreparedExpressionAST)target).resultType().getTypeArgument(rtv.getName());
            tmpCastType = typeArgument;
        }
        Type targetType = tmpTargetType;
        TypeAST castType = tmpCastType;
        java.lang.reflect.Method method = tmpMethod;
        Type[] argumentTypes = Arrays.asList(method.getParameterTypes()).stream().map((java.lang.Class<?> pt) -> Type.getType(pt)).toArray((int size) -> new Type[size]);
        return new PreparedExpressionAST() {
            @Override
            public TypeAST resultType() {
                return castType == null ? new NameTypeAST(null, method.getReturnType()) : castType;
            }

            @Override
            public void generate(Transformation<ClassNode> c, MethodCodeGenerator generator, InsnList originalIl, Label ifFalseLabel) {
                if (target instanceof PreparedExpressionAST) {
                    ((PreparedExpressionAST)target).generate(c, generator, originalIl);
                }
                arguments.forEach(a -> 
                    a.generate(c, generator, originalIl));
                Type returnType = /*castType != null ? castType : */ Type.getType(method.getReturnType());
                Method asmMethod = new Method(methodName, returnType, argumentTypes);
                if (target instanceof PreparedExpressionAST) {
                    if (method.getDeclaringClass().isInterface()) {
                        generator.methodNode.invokeInterface(targetType, asmMethod);
                    } else {
                        generator.methodNode.invokeVirtual(targetType, asmMethod);
                    }
                } else {
                    generator.methodNode.invokeStatic(Type.getType(((NameTypeAST) target).getDescriptor()), asmMethod);
                }
                if (asExpression && castType != null) {
                    generator.methodNode.checkCast(Type.getType(castType.getDescriptor()));
                }
                Class<?> voidClass = void.class;
                if (!asExpression && method.getReturnType() != voidClass) {
                    generator.methodNode.pop();
                }
            }
        };
    }

    private List<java.lang.reflect.Method> getCompatibleMethodsWith(Class<?> c, boolean staticOnly, String name, List<PreparedExpressionAST> arguments) {
        return Arrays.asList(c.getMethods()).stream().filter((m) -> methodIsCompatibleWith(m, staticOnly, name, arguments)).collect(Collectors.toList());
    }

    private boolean methodIsCompatibleWith(java.lang.reflect.Method m, boolean staticOnly, String name, List<PreparedExpressionAST> arguments) {
        if ((!staticOnly || Modifier.isStatic(m.getModifiers())) && m.getName().equals(name) && m.getParameterCount() == arguments.size()) {
            for (int i = 0; i < m.getParameterCount(); i++) {
                Class<?> pt = m.getParameterTypes()[i];
                PreparedExpressionAST a = arguments.get(i);
                if (!parameterTypeIsCompatibleWith(pt, a)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public PreparedExpressionAST visitFieldSet(FieldSetAST ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PreparedExpressionAST visitLongLiteral(LongLiteralAST ctx) {
        return new PreparedExpressionAST() {
            @Override
            public TypeAST resultType() {
                return new NameTypeAST(ctx.getRegion(), long.class);
            }

            @Override
            public void generate(Transformation<ClassNode> c, MethodCodeGenerator generator, InsnList originalIl, Label ifFalseLabel) {
                if (asExpression) {
                    generator.methodNode.push(ctx.value);
                }
            }
        };
    }

    @Override
    public PreparedExpressionAST visitFloatLiteral(FloatLiteralAST ctx) {
        return new PreparedExpressionAST() {
            @Override
            public TypeAST resultType() {
                return new NameTypeAST(ctx.getRegion(), float.class);
            }

            @Override
            public void generate(Transformation<ClassNode> c, MethodCodeGenerator generator, InsnList originalIl, Label ifFalseLabel) {
                if (asExpression) {
                    generator.methodNode.push(ctx.value);
                }
            }
        };
    }

    @Override
    public PreparedExpressionAST visitDoubleLiteral(DoubleLiteralAST ctx) {
        return new PreparedExpressionAST() {
            @Override
            public TypeAST resultType() {
                return new NameTypeAST(ctx.getRegion(), double.class);
            }

            @Override
            public void generate(Transformation<ClassNode> c, MethodCodeGenerator generator, InsnList originalIl, Label ifFalseLabel) {
                if (asExpression) {
                    generator.methodNode.push(ctx.value);
                }
            }
        };
    }

    @Override
    public PreparedExpressionAST visitMetaExpression(MetaExpressionAST ctx) {
        // Assumed, body is an expression
        PreparedExpressionAST expressionRaw = toExpression(ctx.body, asExpression);
        TypeAST resultTypeRaw = expressionRaw.resultType();
        if (!ExpressionAST.class.isAssignableFrom(((NameTypeAST) resultTypeRaw).getType(classLoader))) {
            if(CodeAST.class.isAssignableFrom(((NameTypeAST) resultTypeRaw).getType(classLoader))) {
                resultTypeRaw = new NameTypeAST(null, CodeAST.class);
            } else {
                // Implicitly convert to literal
                Class<?> literalClass;
                switch (resultTypeRaw.getSimpleName()) {
                    case "String":
                        literalClass = StringLiteralAST.class;
                        break;
                    case "int":
                        literalClass = IntLiteralAST.class;
                        break;
                    case "long":
                        literalClass = LongLiteralAST.class;
                        break;
                    default: {
                        literalClass = null;
                    }
                }

                resultTypeRaw = new NameTypeAST(null, ExpressionAST.class);

                if(literalClass != null)
                    expressionRaw = new NewAST(null, new NameTypeAST(null, literalClass), Arrays.asList(new NullAST(null), ctx.body)).accept(this);
            }
        }
        PreparedExpressionAST expression = expressionRaw;
        TypeAST resultType = resultTypeRaw;
        return new PreparedExpressionAST() {
            @Override
            public TypeAST resultType() {
                return resultType;
            }

            @Override
            public void generate(Transformation<ClassNode> c, MethodCodeGenerator generator, InsnList originalIl, Label ifFalseLabel) {
                if (asExpression) {
                    expression.generate(c, generator, originalIl);
                }
            }
        };
    }

    @Override
    public PreparedExpressionAST visitThis(ThisAST ctx) {
        return new PreparedExpressionAST() {
            @Override
            public TypeAST resultType() {
                return new ThisTypeAST(ctx.getRegion(), thisClass);
            }

            @Override
            public void generate(Transformation<ClassNode> c, MethodCodeGenerator generator, InsnList originalIl, Label ifFalseLabel) {
                generator.methodNode.loadThis();
            }
        };
    }

    @Override
    public PreparedExpressionAST visitFieldGet(FieldGetAST ctx) {
//        PreparedExpressionAST target = ctx.target != null ? ctx.target.accept(this) : null;
//        Object target = ctx.target instanceof ExpressionAST ? ((ExpressionAST)ctx.target).accept(this) : ctx.target;
        Object target = getPreparedTarget(ctx.target);
        boolean isStatic = target instanceof TypeAST;
//        String fieldName = ((StringLiteralAST)ctx.fieldName).value;
        String fieldName = ((StringLiteralAST)((LookupAST)ctx.fieldName).name).value;
        TypeAST fieldType = target instanceof PreparedExpressionAST 
            ? ((PreparedExpressionAST)target).resultType().getFieldType(classLoader, fieldName) 
            : ((TypeAST)target).getFieldType(classLoader, fieldName) /*from declared class instead*/ ;
        return new PreparedExpressionAST() {
            @Override
            public TypeAST resultType() {
                return fieldType;
            }

            @Override
            public void generate(Transformation<ClassNode> c, MethodCodeGenerator generator, InsnList originalIl, Label ifFalseLabel) {
                if (asExpression) {
                    if(isStatic) {
                        generator.methodNode.getStatic(
                            Type.getType(((TypeAST)target).getDescriptor(c.getTarget().name)), 
                            fieldName, 
                            Type.getType(fieldType.getDescriptor(c.getTarget().name))
                        );
                    } else {
                        ((PreparedExpressionAST)target).generate(c, generator, originalIl);
                        generator.methodNode.getField(
                            Type.getType(((PreparedExpressionAST)target).resultType().getDescriptor(c.getTarget().name)), 
                            fieldName, 
                            Type.getType(fieldType.getDescriptor(c.getTarget().name))
                        );
                    }
                }
            }
        };
    }
    
    private Object getPreparedTarget(AST target) {
        if(target instanceof ExpressionAST) {
            if(target instanceof AmbiguousNameAST) {
                return getPreparedAmbigousName((AmbiguousNameAST)target);
            }
            
//            return ((ExpressionAST)target).accept(this);
            return getAsExpression((ExpressionAST)target);
        }
        
        // Assumed to be a TypeAST
        return target;
    }
    
    private Object getPreparedAmbigousName(AmbiguousNameAST ctx) {
        ExpressionAST firstNamePartAsExpression = namePartAsExpression(classLoader, (LookupAST)ctx.nameParts.get(0));
        AST target = null;
            
        int nameIndex = 0;
        
        if(firstNamePartAsExpression != null) {
            target = firstNamePartAsExpression;
            nameIndex++;
        } else {
            target = null;
            String className = "";
            
            // Attempt to identify a class with the shortest possible name
            while(nameIndex < ctx.nameParts.size()) {
                // Attempt to resolve start as class reference
                LookupAST namePart = (LookupAST)ctx.nameParts.get(nameIndex);
                if(nameIndex > 0)
                    className += ".";
                className += ((StringLiteralAST)namePart.name).value;
                className = classResolver.resolveClassName(className);
                
                try {
                    target = new NameTypeAST(null, Class.forName(className, true, classLoader));
                } catch (ClassNotFoundException ex) {
                    
                } catch (SecurityException ex) {
                    ex.printStackTrace();
                }
                
                nameIndex++;
                
                if(target != null)
                    break;
            }
        }
            
        if(nameIndex < ctx.nameParts.size()) {
            // The rest are assumed to field gets

            for(; nameIndex < ctx.nameParts.size(); nameIndex++) {
                LookupAST namePart = (LookupAST)ctx.nameParts.get(nameIndex);
//                String name = ((StringLiteralAST)namePart.name).value;
                target = new FieldGetAST(namePart.getRegion(), target, namePart);
            }
        }
        
        if(target instanceof ExpressionAST)
            return getAsExpression((ExpressionAST)target);
//            return ((ExpressionAST)target).accept(this);
            
        return target;
    }
    
    private ExpressionAST namePartAsExpression(ClassLoader classLoader, LookupAST namePart) {
        String firstNamePart = ((StringLiteralAST)namePart.name).value;
        
        if(parameters.containsKey(firstNamePart)) {
            // Is parameter
            return namePart;
        } else if(variables.containsKey(firstNamePart)) {
            // Is variable
            return namePart;
        } else if(thisClass.getFieldType(classLoader, firstNamePart) != null) {
            // If field
            return namePart;
        }
        
        return null;
    }

    @Override
    public PreparedExpressionAST visitVariableDeclaration(VariableDeclarationAST ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PreparedExpressionAST visitLookup(LookupAST ctx) {
//        String name = ((StringLiteralAST)ctx.name).value;
        String name = ((StringLiteralAST)ctx.name).value;
                    
        if (parameters.containsKey(name)) {
            TypeAST resultType = parameters.get(name).type;
            return new PreparedExpressionAST() {
                @Override
                public TypeAST resultType() {
                    return resultType;
                }

                @Override
                public void generate(Transformation<ClassNode> c, MethodCodeGenerator generator, InsnList originalIl, Label ifFalseLabel) {
                    int ordinal = parameters.get(name).index;
                    switch (resultType.getSimpleName()) {
                        case "boolean":
                        case "byte":
                        case "short":
                        case "int":
                            generator.methodNode.visitVarInsn(Opcodes.ILOAD, ordinal);
                            break;
                        case "long":
                            generator.methodNode.visitVarInsn(Opcodes.LLOAD, ordinal);
                            break;
                        case "float":
                            generator.methodNode.visitVarInsn(Opcodes.FLOAD, ordinal);
                            break;
                        case "double":
                            generator.methodNode.visitVarInsn(Opcodes.DLOAD, ordinal);
                            break;
                        default:
                            generator.methodNode.visitVarInsn(Opcodes.ALOAD, ordinal);
                            break;
                    }
                }
            };
        } else if (variables.containsKey(name)) {
            TypeAST resultType = variables.get(name);
            return new PreparedExpressionAST() {
                @Override
                public TypeAST resultType() {
                    return resultType;
                }

                @Override
                public void generate(Transformation<ClassNode> c, MethodCodeGenerator generator, InsnList originalIl, Label ifFalseLabel) {
                    int varId = generator.getVariableId(name);
                    generator.methodNode.loadLocal(varId);
                }
            };
        } else {
            return new FieldGetAST(ctx.getRegion(), new ThisAST(ctx.getRegion()), ctx).accept(this);
        }
    }

    @Override
    public PreparedExpressionAST visitVariableAssignment(VariableAssignmentAST ctx) {
        PreparedExpressionAST value = getAsExpression(ctx.value);
        return new PreparedExpressionAST() {
            @Override
            public TypeAST resultType() {
                return value.resultType();
            }

            @Override
            public void generate(Transformation<ClassNode> c, MethodCodeGenerator generator, InsnList originalIl, Label ifFalseLabel) {
                value.generate(c, generator, originalIl);
                if (asExpression) {
                    generator.methodNode.dup();
                }
                int varId = generator.getVariableId(ctx.name);
                TypeAST type = generator.getVariableType(ctx.name);
                generator.methodNode.storeLocal(varId);
            }
        };
    }

    private PreparedExpressionAST getAsExpression(ExpressionAST ctx) {
        return toExpression(ctx,true);
    }

    @Override
    public PreparedExpressionAST visitRootExpression(RootExpressionAST ctx) {
        return ctx.accept(this);
    }

    @Override
    public PreparedExpressionAST visitQuote(QuoteAST ctx) {
        ExpressionAST quotedAST = MethodAST.quote(thisClass, ctx.ast, variables);
        return quotedAST.accept(this);
    }

    @Override
    public PreparedExpressionAST visitNull(NullAST ctx) {
        return new PreparedExpressionAST() {
            // Should be able to tell whi
            public List<TypeAST> bestMatches(List<TypeAST> types) {
                // Can be used to resolve method?
                // E.g. for the invocation myMethod(null),
                // there are the methods: myMethod(Object obj) and myMethod(String str)
                // then the most general matches are returned?
                // One match means unambigous resolution
                //
                // Or the most specific one?
                // http://docs.oracle.com/javase/specs/jls/se5.0/html/expressions.html#15.12.2.5
                return null;
            }

            public boolean canReturnAs(TypeAST type) {
                return true; // If non primitive
            }

            @Override
            public boolean canBeArgumentFor(ClassLoader classLoader, Class<?> parameterType) {
                return !parameterType.isPrimitive();
            }

            @Override
            public TypeAST resultType() {
                return new NameTypeAST(null, Object.class); // Result type should be expected result in the outer context
            }

            @Override
            public void generate(Transformation<ClassNode> c, MethodCodeGenerator generator, InsnList originalIl, Label ifFalseLabel) {
                generator.methodNode.visitInsn(Opcodes.ACONST_NULL);
            }
        };
    }

    @Override
    public PreparedExpressionAST visitArray(ArrayAST ctx) {
        // Support for meta code
        // Meta code is should leave the stack as it was
        List<PreparedExpressionAST> elements = ctx.elements.stream().map((e) -> e.accept(this)).collect(Collectors.toList());
        return new PreparedExpressionAST() {
            @Override
            public TypeAST resultType() {
                try {
                    //                        return NameTypeAST.fromDescriptor("[" + ctx.type.getDescriptor());
                    String desc = ctx.type.getDescriptor();
//                    Class arrayClass = Class.forName("[" + desc.replace("/", "."));
//                    Class arrayClass = classLoader.loadClass("[" + desc.replace("/", "."));
                    Class arrayClass = Class.forName("[" + desc.replace("/", "."), true, classLoader);
                    return new NameTypeAST(null, arrayClass);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(MethodAST.class.getName()).log(Level.SEVERE, null, ex);
                    return null;
                }
            }

            @Override
            public void generate(Transformation<ClassNode> c, MethodCodeGenerator generator, InsnList originalIl, Label ifFalseLabel) {
                int length = (int) elements.stream().filter((jasy.lang.ast.PreparedExpressionAST e) -> ((NameTypeAST) e.resultType()).getType(classLoader) != void.class).count();
                generator.methodNode.push(length);
                generator.methodNode.newArray(Type.getType(ctx.type.getDescriptor()));
                int arrayIndex = 0;
                for (PreparedExpressionAST e : elements) {
                    if (((NameTypeAST) e.resultType()).getType(classLoader) != void.class) {
                        generator.methodNode.dup();
                        generator.methodNode.push(arrayIndex);
                        arrayIndex++;
                    }
                    e.generate(c, generator, originalIl);
                    if (((NameTypeAST) e.resultType()).getType(classLoader) != void.class) {
                        generator.methodNode.arrayStore(Type.getType(ctx.type.getDescriptor()));
                    }
                }
            }
        };
    }

    @Override
    public PreparedExpressionAST visitNew(NewAST ctx) {
        List<PreparedExpressionAST> arguments = ctx.arguments.stream()
            .map(e -> {
                if(e == null)
                    new String(); 
                return getAsExpression(e);
            })
            .collect(Collectors.toList());
        return new PreparedExpressionAST() {
            @Override
            public TypeAST resultType() {
                return ctx.c;
            }

            @Override
            public void generate(Transformation<ClassNode> c, MethodCodeGenerator generator, InsnList originalIl, Label ifFalseLabel) {
                generator.methodNode.newInstance(Type.getType(ctx.c.getDescriptor()));
                generator.methodNode.dup();
                arguments.forEach((a) -> a.generate(c, generator, originalIl));
                List<Constructor<?>> cs = getCompatibleConstructorsWith(((NameTypeAST) ctx.c).getType(classLoader), arguments);
                if (cs.isEmpty()) {
                    cs = getCompatibleConstructorsWith(((NameTypeAST) ctx.c).getType(classLoader), arguments);
                }
                Constructor<?> constructor = cs.get(0);
                Type[] argumentTypes = Arrays.asList(constructor.getParameterTypes()).stream().map((java.lang.Class<?> pt) -> Type.getType(pt)).toArray((int size) -> new Type[size]);
                Method mConstructor = new Method("<init>", Type.VOID_TYPE, argumentTypes);
                generator.methodNode.invokeConstructor(Type.getType(ctx.c.getDescriptor()), mConstructor);
                if (!asExpression) {
                    generator.methodNode.pop();
                }
            }
        };
    }

    private List<Constructor<?>> getCompatibleConstructorsWith(Class<?> c, List<PreparedExpressionAST> arguments) {
        return Arrays.asList(c.getConstructors()).stream().filter((cons) -> 
            constructorIsCompatibleWith(cons, arguments)).collect(Collectors.toList());
    }

    private boolean constructorIsCompatibleWith(Constructor<?> cons, List<PreparedExpressionAST> arguments) {
        if (cons.getParameterCount() == arguments.size()) {
            for (int i = 0; i < cons.getParameterCount(); i++) {
                Class<?> pt = cons.getParameterTypes()[i];
                PreparedExpressionAST a = arguments.get(i);
                if (!parameterTypeIsCompatibleWith(pt, a)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    private boolean parameterTypeIsCompatibleWith(Class<?> pt, PreparedExpressionAST a) {
        return a.canBeArgumentFor(classLoader, pt);
    }

    @Override
    public PreparedExpressionAST visitTypecast(TypecastAST ctx) {
        PreparedExpressionAST expression = ctx.expression.accept(this);
        return new PreparedExpressionAST() {
            @Override
            public TypeAST resultType() {
                return ctx.type;
            }

            @Override
            public void generate(Transformation<ClassNode> c, MethodCodeGenerator generator, InsnList originalIl, Label ifFalseLabel) {
                expression.generate(c, generator, originalIl);
                generator.methodNode.checkCast(Type.getType(ctx.type.getDescriptor()));
            }
        };
    }

    @Override
    public PreparedExpressionAST visitGetClass(GetClassAST ctx) {
        return new PreparedExpressionAST() {
            @Override
            public TypeAST resultType() {
                // Should be generic
                return new NameTypeAST(null, Class.class);
            }

            @Override
            public void generate(Transformation<ClassNode> c, MethodCodeGenerator generator, InsnList originalIl, Label ifFalseLabel) {
                generator.methodNode.push(Type.getType(ctx.t.getDescriptor()));
            }
        };
    }

    @Override
    public PreparedExpressionAST visitInject(InjectAST ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PreparedExpressionAST visitInjectionBlock(InjectionBlockAST ctx) {
        List<PreparedAST> injections = ctx.injections.stream().map((jasy.lang.ast.InjectAST i) -> MethodAST.toCode(thisClass, i, classResolver, classLoader, parameters, variables)).collect(Collectors.toList());
        return new PreparedExpressionAST() {
            @Override
            public TypeAST resultType() {
                return new NameTypeAST(null, List.class, new TypeAST[]{new NameTypeAST(null, CodeAST.class)});
            }

            @Override
            public void generate(Transformation<ClassNode> c, MethodCodeGenerator generator, InsnList originalIl, Label ifFalseLabel) {
//                generator.methodNode.newInstance(Type.getType(ArrayList.class));
//                generator.methodNode.dup();
//                generator.methodNode.invokeConstructor(Type.getType(ArrayList.class), new Method("<init>", Type.VOID_TYPE, new Type[0]));
//                injections.forEach((i) -> i.generate(c, generator, originalIl));
                
                generator.beginInjection();
                
                int injectionListIndex = generator.getInjectionListIndex();
                
                generator.methodNode.newInstance(Type.getType(ArrayList.class));
                generator.methodNode.dup();
                generator.methodNode.invokeConstructor(Type.getType(ArrayList.class), new Method("<init>", Type.VOID_TYPE, new Type[0]));
                generator.methodNode.storeLocal(injectionListIndex);
                
                injections.forEach((i) -> i.generate(c, generator, originalIl));
                
                generator.methodNode.loadLocal(injectionListIndex);
                
                generator.endInjection();
            }
        };
    }

    @Override
    public PreparedExpressionAST visitWhile(WhileAST ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PreparedExpressionAST visitIfElse(IfElseAST ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PreparedExpressionAST visitBoolean(BooleanLiteralAST ctx) {
        return new PreparedExpressionAST() {
            @Override
            public TypeAST resultType() {
                return new NameTypeAST(null, boolean.class);
            }

            @Override
            public void generate(Transformation<ClassNode> c, MethodCodeGenerator generator, InsnList originalIl, Label ifFalseLabel) {
                generator.methodNode.push(ctx.value);
                if(ifFalseLabel != null) {
                    generator.methodNode.ifZCmp(GeneratorAdapter.EQ, ifFalseLabel);
                }
            }
        };
    }

    @Override
    public PreparedExpressionAST visitUnary(UnaryExpression ctx) {
        PreparedExpressionAST operand = ctx.operand.accept(this);
        
        TypeAST resultType = operand.resultType();
        
        return new PreparedExpressionAST() {
            @Override
            public TypeAST resultType() {
                return resultType;
            }

            @Override
            public void generate(Transformation<ClassNode> c, MethodCodeGenerator generator, InsnList originalIl, Label ifFalseLabel) {
                operand.generate(c, generator, originalIl, ifFalseLabel);
                
                switch(ctx.operator) {
                    case UnaryExpression.OPERATOR_SIGN_POS:
                        break;
                    case UnaryExpression.OPERATOR_SIGN_NEG:
                        generator.methodNode.math(GeneratorAdapter.NEG, Type.getType(resultType.getDescriptor()));
//                        switch(resultType.getSimpleName()) {
//                            case "byte":
//                            case "short":
//                            case "int":
//                                generator.methodNode.visitInsn(Opcodes.INEG);
//                                break;
//                            case "long":
//                                generator.methodNode.visitInsn(Opcodes.LNEG);
//                                break;
//                            case "float":
//                                generator.methodNode.visitInsn(Opcodes.FNEG);
//                                break;
//                            case "double":
//                                generator.methodNode.visitInsn(Opcodes.DNEG);
//                                break;
//                        }
                        
                        break;
                    case UnaryExpression.OPERATOR_BIN_COMP:
                        switch(resultType.getSimpleName()) {
                            case "byte":
                            case "short":
                            case "int":
                                generator.methodNode.push(-1);
                                generator.methodNode.visitInsn(Opcodes.IXOR);
                                break;
                            case "long":
                                generator.methodNode.push((long)-1);
                                generator.methodNode.visitInsn(Opcodes.LXOR);
                                break;
                        }
                        
                        break;
                    case UnaryExpression.OPERATOR_LOG_COMP:
                        switch(resultType.getSimpleName()) {
                            case "boolean":
                                if(ifFalseLabel != null) {
                                    generator.methodNode.ifZCmp(GeneratorAdapter.NE, ifFalseLabel);
                                } else {
                                    ifFalseLabel = new Label();
                                    Label end = new Label();
                                    generator.methodNode.ifZCmp(GeneratorAdapter.NE, ifFalseLabel);
                                    generator.methodNode.push(true);
                                    generator.methodNode.goTo(end);
                                    generator.methodNode.visitLabel(ifFalseLabel);
                                    generator.methodNode.push(false);
                                    generator.methodNode.visitLabel(end);
                                }
                                
                                break;
                        }
                        
                        break;
                }
            }
        };
    }

    @Override
    public PreparedExpressionAST visitIncDec(IncDecExpression ctx) {
        String variableName = ((StringLiteralAST)((LookupAST)ctx.operand).name).value;
        TypeAST resultType = variables.get(variableName);
        
        return new PreparedExpressionAST() {
            @Override
            public TypeAST resultType() {
                return resultType;
            }
            
            private void generateOperation(MethodCodeGenerator generator, int varId) {
                switch(ctx.operator) {
                    case IncDecExpression.OPERATOR_INC:
                        switch(resultType.getSimpleName()) {
                            case "byte":
                            case "short":
                            case "int":
                                generator.methodNode.iinc(varId, 1);
                                break;
                            case "long":
                                generator.methodNode.loadLocal(varId);
                                generator.methodNode.push((long)1);
                                generator.methodNode.visitInsn(Opcodes.LADD);
                                generator.methodNode.storeLocal(varId);
                                break;
                            case "float":
                                generator.methodNode.loadLocal(varId);
                                generator.methodNode.push((float)1);
                                generator.methodNode.visitInsn(Opcodes.FADD);
                                generator.methodNode.storeLocal(varId);
                                break;
                            case "double":
                                generator.methodNode.loadLocal(varId);
                                generator.methodNode.push((double)1);
                                generator.methodNode.visitInsn(Opcodes.DADD);
                                generator.methodNode.storeLocal(varId);
                                break;
                        }
                        break;
                    case IncDecExpression.OPERATOR_DEC:
                        switch(resultType.getSimpleName()) {
                            case "byte":
                            case "short":
                            case "int":
                                generator.methodNode.iinc(varId, -1);
                                break;
                            case "long":
                                generator.methodNode.loadLocal(varId);
                                generator.methodNode.push((long)1);
                                generator.methodNode.visitInsn(Opcodes.LSUB);
                                generator.methodNode.storeLocal(varId);
                                break;
                            case "float":
                                generator.methodNode.loadLocal(varId);
                                generator.methodNode.push((float)1);
                                generator.methodNode.visitInsn(Opcodes.FSUB);
                                generator.methodNode.storeLocal(varId);
                                break;
                            case "double":
                                generator.methodNode.loadLocal(varId);
                                generator.methodNode.push((double)1);
                                generator.methodNode.visitInsn(Opcodes.DSUB);
                                generator.methodNode.storeLocal(varId);
                                break;
                        }
                        break;
                }
            }

            @Override
            public void generate(Transformation<ClassNode> c, MethodCodeGenerator generator, InsnList originalIl, Label ifFalseLabel) {
                int varId = generator.getVariableId(variableName);
                
                if(ctx.timing == IncDecExpression.TIMING_PRE)
                    generateOperation(generator, varId);
                
                if(asExpression)
                    generator.methodNode.loadLocal(varId);
                
                if(ctx.timing == IncDecExpression.TIMING_POST)
                    generateOperation(generator, varId);
            }
        };
    }

    @Override
    public PreparedExpressionAST visitAmbiguousName(AmbiguousNameAST ctx) {
//        // May not be a valid expression!!!
//        // Otherwise, is, functionally, a field get - possibly recursive
//        
//        ExpressionAST firstNamePartAsExpression = namePartAsExpression(classLoader, ctx.nameParts.get(0));
//        AST target;
//        
//        if(firstNamePartAsExpression != null) {
//            target = firstNamePartAsExpression;
//        } else {
//            // Attempt to resolve start as class reference
//            
//            String className = ((StringLiteralAST)ctx.nameParts.get(0).name).value;
//            className = classResolver.resolveClassName(className);
//            try {
////                target = new NameTypeAST(null, Class.forName(className));
////                target = new NameTypeAST(null, classLoader.loadClass(className));
//                target = new NameTypeAST(null, Class.forName(className, true, classLoader));
//            } catch (ClassNotFoundException ex) {
//                Logger.getLogger(ExpressionPreparer.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
