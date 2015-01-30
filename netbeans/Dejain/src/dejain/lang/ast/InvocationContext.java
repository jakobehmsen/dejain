package dejain.lang.ast;

import dejain.lang.ASMCompiler;
import dejain.lang.ASMCompiler.Region;
import dejain.lang.ClassResolver;
import java.lang.reflect.Method;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.beanutils.MethodUtils;

public class InvocationContext extends AbstractContext implements ExpressionContext {
    public ExpressionContext target;
    public TypeContext declaringClass;
    public String methodName;
    public List<ExpressionContext> arguments;
    public TypeContext resultType;

    public InvocationContext(Region region, ExpressionContext target, TypeContext declaringClass, String methodName, List<ExpressionContext> arguments, TypeContext resultType) {
        super(region);
        
        this.target = target;
        this.declaringClass = declaringClass;
        this.methodName = methodName;
        this.arguments = arguments;
        this.resultType = resultType;
    }

    public static InvocationContext newStatic(Region region, TypeContext declaringClass, String methodName, List<ExpressionContext> arguments) {
        return new InvocationContext(region, null, declaringClass, methodName, arguments, null);
    }

    public static InvocationContext newInstance(Region region, ExpressionContext target, String methodName, List<ExpressionContext> arguments) {
        return new InvocationContext(region, target, null, methodName, arguments, null);
    }

    @Override
    public void resolve(ClassContext thisClass, TypeContext expectedResultType, ClassResolver resolver, List<ASMCompiler.Message> errorMessages) {
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
    public TypeContext resultType() {
        return resultType;
    }

    @Override
    public void accept(CodeVisitor visitor) {
        visitor.visitInvocation(this);
    }
}
