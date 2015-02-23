package jasy.lang.ast;

import jasy.lang.ASMCompiler.Message;
import jasy.lang.ASMCompiler.Region;
import jasy.lang.ClassResolver;
import java.util.List;
import org.objectweb.asm.Opcodes;

public interface AST {
    Region getRegion();
    void setRegion(Region region);
    void resolve(Scope thisClass, TypeAST expectedResultType, ClassResolver resolver, ClassLoader classLoader, List<Message> errorMessages);
    
    public static class Util {
        public static int getAccessModifier(int accessModifier, boolean isStatic) {
            if(isStatic)
                return accessModifier | Opcodes.ACC_STATIC;

            return accessModifier;
        }
    }
}
