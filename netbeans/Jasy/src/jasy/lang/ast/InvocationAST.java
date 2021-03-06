package jasy.lang.ast;

import jasy.lang.ASMCompiler;
import jasy.lang.ASMCompiler.Region;
import jasy.lang.ClassResolver;
import java.util.List;

public class InvocationAST extends AbstractAST implements ExpressionAST {
    public AST target; // Either ExpressionAST or TypeAST
//    public TypeAST declaringClass;
    public String methodName;
    public List<ExpressionAST> arguments;
//    public TypeAST resultType;

    public InvocationAST(Region region, AST target, /*TypeAST declaringClass, */String methodName, List<ExpressionAST> arguments/*, TypeAST resultType*/) {
        super(region);
        
        this.target = target;
//        this.declaringClass = declaringClass;
        this.methodName = methodName;
        this.arguments = arguments;
//        this.resultType = resultType;
    }

    public static InvocationAST newStatic(Region region, TypeAST declaringClass, String methodName, List<ExpressionAST> arguments) {
//        return new InvocationAST(region, null, declaringClass, methodName, arguments, null);
        return null;
    }

    public static InvocationAST newInstance(Region region, ExpressionAST target, String methodName, List<ExpressionAST> arguments) {
//        return new/ InvocationAST(region, target, null, methodName, arguments, null);
        return null;
    }

    @Override
    public void resolve(Scope thisClass, TypeAST expectedResultType, ClassResolver resolver, ClassLoader classLoader, List<ASMCompiler.Message> errorMessages) {
        if(target != null)
            target.resolve(thisClass, expectedResultType, resolver, classLoader, errorMessages);
//        else
//            declaringClass.resolve(thisClass, expectedResultType, resolver, errorMessages);
        
        arguments.forEach(a -> a.resolve(thisClass, expectedResultType, resolver, classLoader, errorMessages));
        
//        Class<?>[] parameterTypes = arguments.stream().map(a -> a.resultType()).toArray(size -> new Class<?>[size]);
//        
//        Method method;
//        
//        if(target != null) {
//            method = MethodUtils.getAccessibleMethod(target.resultType(), methodName, parameterTypes);
//        } else {
//            method = MethodUtils.getAccessibleMethod(declaringClass.getType(), methodName, parameterTypes);
//        }
//        
//        if(method == null) {
//            errorMessages.add(new ASMCompiler.Message(getRegion(), "Could not resolve method " + methodName + "."));
//        } else {
//            resultType = method.getReturnType();
//        }
    }

    @Override
    public TypeAST resultType() {
//        return resultType;
        return null;
    }

    @Override
    public <T> T accept(CodeVisitor<T> visitor) {
        return visitor.visitInvocation(this);
    }
}
