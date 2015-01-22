package dejain;

import javassist.expr.ConstructorCall;
import javassist.expr.FieldAccess;
import javassist.expr.MethodCall;
import javassist.expr.NewExpr;

public class DefaultBodyInterceptor implements BodyInterceptor {
    @Override
    public void fieldAccess(FieldAccess fieldAccess) { }

    @Override
    public void methodCall(MethodCall methodCall) { }

    @Override
    public void constructorCall(ConstructorCall constructorCall) { }

    @Override
    public void newExpr(NewExpr newExpr) { }

    @Override
    public void close() { }
}
