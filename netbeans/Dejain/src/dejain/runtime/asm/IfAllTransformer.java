package dejain.runtime.asm;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class IfAllTransformer<T> implements CompositeTransformer<T> {
    private ArrayList<Function<T, Runnable>> transformers = new ArrayList<>();
    
    @Override
    public void addTransformer(Function<T, Runnable> transformer) {
        transformers.add(transformer);
    }

    @Override
    public Runnable apply(T obj) {
        List<Runnable> applicableTransformers = 
            transformers.stream()
                .map(t -> t.apply(obj))
                .filter(tr -> tr != null)
                .collect(Collectors.toList());
        
        return applicableTransformers.size() == transformers.size()
            ? () -> applicableTransformers.forEach(t -> t.run())
            : null;
    }
}
