package dejain.lang.ast;

import java.util.Map;

public class Transformation<T> {
    private T target;
    private Map<String, String> variables;

    public Transformation(T target, Map<String, String> variables) {
        this.target = target;
        this.variables = variables;
    }

    public T getTarget() {
        return target;
    }
    
    public String getVariableValue(String name) {
        return variables.get(name);
    }
    
    public <R> Transformation<R> inner(R target) {
        return new Transformation<>(target, variables);
    }
}
