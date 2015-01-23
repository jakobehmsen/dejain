package dejain.lang.ast;

import dejain.lang.ASMCompiler.Message;
import dejain.lang.CommonClassResolver;
import java.util.List;

public interface Context {
    void resolve(CommonClassResolver resolver, List<Message> errorMessages);
}
