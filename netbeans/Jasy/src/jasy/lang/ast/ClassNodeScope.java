package jasy.lang.ast;

import java.util.List;
import java.util.Optional;
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
        
        Type t = Type.getType(field.get().desc);
//        t.getClassName()
        return field.map(f -> 
            NameTypeAST.fromDescriptor(field.get().desc)).orElse(null);
    }
}
