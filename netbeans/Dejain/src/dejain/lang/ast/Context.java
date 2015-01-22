package dejain.lang.ast;

import dejain.lang.ASMCompiler.Message;
import dejain.lang.ClassResolver;
import java.util.List;

public interface Context {
    void resolve(ClassResolver resolver, List<Message> errorMessages);
}
