package dejain.runtime.asm;

import java.util.function.Function;
import java.util.function.Predicate;

public interface CompositeTransformer<T> extends Function<T, Runnable> {
    void addTransformer(Function<T, Runnable> transformer);
    default void addPredicate(Predicate<T> predicate) {
        addTransformer(obj -> predicate.test(obj) ? () -> { } : null);
    }
}
