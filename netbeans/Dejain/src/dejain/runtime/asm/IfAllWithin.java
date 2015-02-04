package dejain.runtime.asm;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class IfAllWithin<T, R> implements Function<T, Runnable> {
    private Function<T, List<R>> objectsFunction;
    private Predicate<R> filter;
    private BiFunction<T, R, Runnable> transformer;

    public IfAllWithin(Function<T, List<R>> objectsFunction, Predicate<R> filter, BiFunction<T, R, Runnable> transformer) {
        this.objectsFunction = objectsFunction;
        this.filter = filter;
        this.transformer = transformer;
    }
    
    @Override
    public Runnable apply(T obj) {
        List<R> objects = objectsFunction.apply(obj);
        List<R> applicableObjects = objects.stream()
                .filter(filter)
                .collect(Collectors.toList());
        
        List<Runnable> tranformations = applicableObjects.stream()
            .map(o -> 
                transformer.apply(obj, o)).collect(Collectors.toList());
        
        return applicableObjects.size() == objects.size()
            ? () -> tranformations.forEach(r -> r.run())  //() -> applicableObjects.forEach(o -> transformer.accept(obj, o))
            : null;
    }
}
