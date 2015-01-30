package dejain.lang.ast;

import dejain.lang.ASMCompiler.Message;
import dejain.lang.ASMCompiler.Region;
import dejain.lang.ClassResolver;
import dejain.lang.CommonClassResolver;
import java.util.List;
import org.objectweb.asm.Opcodes;

public interface Context {
    Region getRegion();
    void resolve(ClassContext thisClass, TypeContext expectedResultType, ClassResolver resolver, List<Message> errorMessages);
    
    public static class Util {
        public static int getAccessModifier(int accessModifier, boolean isStatic) {
            if(isStatic)
                return accessModifier | Opcodes.ACC_STATIC;

            return accessModifier;
        }
    }
}
