package dejain;

import javassist.CtClass;

public interface SystemInterceptor {
    ClassInterceptor interceptClass(CtClass klass);
}
