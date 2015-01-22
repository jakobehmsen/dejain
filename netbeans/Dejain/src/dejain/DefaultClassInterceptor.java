package dejain;

import javassist.CtConstructor;
import javassist.CtMethod;

public class DefaultClassInterceptor implements ClassInterceptor {
    @Override
    public BodyInterceptor constructor(CtConstructor constructor) {
        return new DefaultBodyInterceptor();
    }

    @Override
    public BodyInterceptor method(CtMethod method) {
        return new DefaultBodyInterceptor();
    }

    @Override
    public void close() { }
}
