package dejain.lang.ast;

import dejain.lang.ASMCompiler;
import dejain.lang.ASMCompiler.Region;
import dejain.lang.ClassResolver;
import java.lang.reflect.Method;
import java.util.Hashtable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.beanutils.MethodUtils;

public class InvocationAST extends AbstractAST implements ExpressionAST {
    public ExpressionAST target;
    public TypeAST declaringClass;
    public String methodName;
    public List<ExpressionAST> arguments;
    public TypeAST resultType;

    public InvocationAST(Region region, ExpressionAST target, TypeAST declaringClass, String methodName, List<ExpressionAST> arguments, TypeAST resultType) {
        super(region);
        
        this.target = target;
        this.declaringClass = declaringClass;
        this.methodName = methodName;
        this.arguments = arguments;
        this.resultType = resultType;
    }

    public static InvocationAST newStatic(Region region, TypeAST declaringClass, String methodName, List<ExpressionAST> arguments) {
        return new InvocationAST(region, null, declaringClass, methodName, arguments, null);
    }

    public static InvocationAST newInstance(Region region, ExpressionAST target, String methodName, List<ExpressionAST> arguments) {
        return new InvocationAST(region, target, null, methodName, arguments, null);
    }

    @Override
    public void resolve(Scope thisClass, TypeAST expectedResultType, ClassResolver resolver, List<ASMCompiler.Message> errorMessages) {
        if(target != null)
            target.resolve(thisClass, expectedResultType, resolver, errorMessages);
        else
            declaringClass.resolve(thisClass, expectedResultType, resolver, errorMessages);
        
        arguments.forEach(a -> a.resolve(thisClass, expectedResultType, resolver, errorMessages));
        
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
        return resultType;
    }

    @Override
    public void accept(CodeVisitor visitor) {
        visitor.visitInvocation(this);
    }
}
