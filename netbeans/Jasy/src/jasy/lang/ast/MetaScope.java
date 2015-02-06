package jasy.lang.ast;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldNode;

public class MetaScope implements Scope {
    private Hashtable<String, TypeAST> variables;

    public MetaScope(Hashtable<String, TypeAST> variables) {
        this.variables = variables;
    }

    @Override
    public TypeAST getFieldType(String fieldName) {
        return variables.get(fieldName);
    }

    public void addFields(ClassNode c) {
        for(Map.Entry<String, TypeAST> variable: variables.entrySet()) {
            c.fields.add(new FieldNode(Opcodes.ACC_PUBLIC, variable.getKey(), variable.getValue().getDescriptor(), null, null));
        }
    }

    public Set<String> getFieldNames() {
        return variables.keySet();
    }
}
