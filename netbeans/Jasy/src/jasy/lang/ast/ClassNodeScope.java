package jasy.lang.ast;

import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldNode;

public class ClassNodeScope implements Scope {
    private ClassNode c;

    public ClassNodeScope(ClassNode c) {
        this.c = c;
    }

    @Override
    public TypeAST getFieldType(String fieldName) {
        Optional<FieldNode> field = ((List<FieldNode>)c.fields).stream().filter(f -> f.name.equals(fieldName)).findFirst();
//        FieldNode f2 = field.get();
        
        if(field.isPresent()) {
            try {
                Type t = Type.getType(field.get().desc);
                String cn = t.getClassName();
                
                Class<?> c;
                switch(cn) {
                    case "boolean": c = boolean.class; break;
                    case "byte": c = byte.class; break;
                    case "short": c = short.class; break;
                    case "int": c = int.class; break;
                    case "long": c = long.class; break;
                    case "float": c = float.class; break;
                    case "double": c = double.class; break;
                    case "char": c = char.class; break;
                    default: c = Class.forName(t.getClassName());
                }
                
//                Class<?> c = Class.forName(t.getClassName());
                return new NameTypeAST(null, c);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ClassNodeScope.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return null;
        
//        Type t = Type.getType(field.get().desc);
////        t.getClassName()
//        return field.map(f -> 
//            NameTypeAST.fromDescriptor(field.get().desc)).orElse(null);
////        t.getClassName()
//        return field.map(f -> 
//            NameTypeAST.fromDescriptor(field.get().desc)).orElse(null);
    }
}
