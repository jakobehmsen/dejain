package dejain.lang.ast;

import dejain.lang.ASMCompiler.Message;
import dejain.lang.ClassResolver;
import dejain.lang.CommonClassResolver;
import java.util.List;

public interface Context {
    void resolve(ClassResolver resolver, List<Message> errorMessages);
}
