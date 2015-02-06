package jasy;

import javassist.CtConstructor;
import javassist.CtMethod;

public interface ClassInterceptor {
    BodyInterceptor constructor(CtConstructor constructor);
    BodyInterceptor method(CtMethod method);
    void close();
}
