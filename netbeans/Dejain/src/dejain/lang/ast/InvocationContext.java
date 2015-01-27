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
    public Method method;

    private InvocationContext(Region region, ExpressionContext target, TypeContext declaringClass, String methodName, List<ExpressionContext> arguments) {
        super(region);
        
        this.target = target;
        this.declaringClass = declaringClass;
        this.methodName = methodName;
        this.arguments = arguments;
    }

    public static InvocationContext newStatic(Region region, TypeContext declaringClass, String methodName, List<ExpressionContext> arguments) {
        return new InvocationContext(region, null, declaringClass, methodName, arguments);
    }

    public static InvocationContext newInstance(Region region, ExpressionContext target, String methodName, List<ExpressionContext> arguments) {
        return new InvocationContext(region, target, null, methodName, arguments);
    }

    @Override
    public void resolve(ClassResolver resolver, List<ASMCompiler.Message> errorMessages) {
        if(target != null)
            target.resolve(resolver, errorMessages);
        else
            declaringClass.resolve(resolver, errorMessages);
        
        arguments.forEach(a -> a.resolve(resolver, errorMessages));
        
        Class<?>[] parameterTypes = arguments.stream().map(a -> a.resultType()).toArray(size -> new Class<?>[size]);
            
        if(target != null) {
            method = MethodUtils.getAccessibleMethod(target.resultType(), methodName, parameterTypes);
        } else {
            method = MethodUtils.getAccessibleMethod(declaringClass.getType(), methodName, parameterTypes);
        }
        
        if(method == null) {
            errorMessages.add(new ASMCompiler.Message(getRegion(), "Could not resolve method " + methodName + "."));
        }
    }

    @Override
    public Class<?> resultType() {
        return method.getReturnType();
    }

    @Override
    public void accept(CodeVisitor visitor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
