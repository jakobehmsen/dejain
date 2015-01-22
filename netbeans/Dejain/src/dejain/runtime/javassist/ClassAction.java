package dejain.runtime.javassist;

import javassist.CtClass;

public interface ClassAction {
    void perform(CtClass ctClass);
}
