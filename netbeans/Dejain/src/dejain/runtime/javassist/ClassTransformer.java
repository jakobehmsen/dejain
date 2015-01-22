package dejain.runtime.javassist;

import javassist.CtClass;

public interface ClassTransformer {
    ClassAction resolve(CtClass ctClasss);
}
