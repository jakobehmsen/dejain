package dejain.lang.ast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class Transformation<T> {
    private Transformation parent;
    private T target;
    private Hashtable<String, Object> variable;

    public Transformation(T target) {
        this.target = target;
        this.variable = new Hashtable<String, Object>();
    }

//    public Transformation(T target, Map<String, Object> variables) {
//        this.target = target;
//        this.variables = variables;
//    }

    public T getTarget() {
        return target;
    }
    
    public Object getVariableValue(String name) {
        Object v = variable.get(name);
        if(v == null && parent != null)
            return parent.getVariableValue(name);
        return v;
    }

    public void putVariableValue(String name, Object value) {
        variable.put(name, value);
    }
    
//    public <R> Transformation<R> inner(R target) {
//        return inner(target, Collections.emptyMap());
//    }
    
    public <R> Transformation<R> inner(R target) {
        Transformation t = new Transformation<>(target);
        t.parent = this;
        return t;
    }
}
