package dejain.runtime.asm;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class IfAnyWithin<T, R> implements Function<T, Runnable> {
    private Function<T, List<R>> objectsFunction;
    private Function<R, Runnable> transformer;

    public IfAnyWithin(Function<T, List<R>> objectsFunction, Function<R, Runnable> transformer) {
        this.objectsFunction = objectsFunction;
        this.transformer = transformer;
    }
    
    @Override
    public Runnable apply(T obj) {
        List<R> objects = objectsFunction.apply(obj);
        List<Runnable> applicableTransformers = 
            objects.stream()
                .map(o -> transformer.apply(o))
                .filter(tr -> tr != null)
                .collect(Collectors.toList());
        
        return applicableTransformers.size() > 0
            ? () -> applicableTransformers.forEach(t -> t.run())
            : null;
    }
}
