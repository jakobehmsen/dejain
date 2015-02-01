package dejain.lang.ast;

import java.util.Collections;
import java.util.Hashtable;
import java.util.Map;
import org.objectweb.asm.tree.ClassNode;

public class Transformation<T> {
    private Transformation parent;
    private T target;
    private Map<String, Object> variables;

    public Transformation(T target) {
        this.target = target;
        this.variables = new Hashtable<String, Object>();
    }

    public Transformation(T target, Map<String, Object> variables) {
        this.target = target;
        this.variables = variables;
    }

    public T getTarget() {
        return target;
    }
    
    public Object getVariableValue(String name) {
        Object v = variables.get(name);
        if(v == null && parent != null)
            return parent.getVariableValue(name);
        return v;
    }

    public void putVariableValue(String name, Object value) {
        variables.put(name, value);
    }
    
    public <R> Transformation<R> inner(R target) {
        return inner(target, Collections.emptyMap());
    }
    
    public <R> Transformation<R> inner(R target, Map<String, Object> variables) {
        Transformation t = new Transformation<>(target, variables);
        t.parent = this;
        return t;
    }
}
