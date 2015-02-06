package jasy;

import javassist.expr.ConstructorCall;
import javassist.expr.FieldAccess;
import javassist.expr.MethodCall;
import javassist.expr.NewExpr;

public interface BodyInterceptor {
    void fieldAccess(FieldAccess fieldAccess);
    void methodCall(MethodCall methodCall);
    void constructorCall(ConstructorCall constructorCall);
    void newExpr(NewExpr newExpr);
    void close();
}
