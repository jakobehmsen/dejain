package dejain.lang.ast;

import dejain.lang.ASMCompiler.Message;
import dejain.lang.ASMCompiler.Region;
import dejain.lang.ClassResolver;
import java.util.Hashtable;
import java.util.List;
import org.objectweb.asm.Opcodes;

public interface AST {
    Region getRegion();
    void setRegion(Region region);
    void resolve(Scope thisClass, TypeAST expectedResultType, ClassResolver resolver, List<Message> errorMessages);
    
    public static class Util {
        public static int getAccessModifier(int accessModifier, boolean isStatic) {
            if(isStatic)
                return accessModifier | Opcodes.ACC_STATIC;

            return accessModifier;
        }
    }
}
