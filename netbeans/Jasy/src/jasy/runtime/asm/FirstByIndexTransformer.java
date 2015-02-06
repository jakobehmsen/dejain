package jasy.runtime.asm;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Optional;
import java.util.function.Function;

public class FirstByIndexTransformer<T, R> implements CompositeTransformer<T> {
    private ArrayList<Function<T, Runnable>> transformers = new ArrayList<>();
    private Function<T, R> indexFunction;
    private Hashtable<R, HashSet<Function<T, Runnable>>> indexToAppliedTransformersMap = new Hashtable<>();

    public FirstByIndexTransformer(Function<T, R> indexFunction) {
        this.indexFunction = indexFunction;
    }
    
    @Override
    public void addTransformer(Function<T, Runnable> transformer) {
        transformers.add(transformer);
    }

    @Override
    public Runnable apply(T obj) {
        R index = indexFunction.apply(obj);
        
        Optional<Function<T, Runnable>> firstTransformer = transformers.stream()
            .filter(t -> canBeApplied(index, t))
            .findFirst();
        
        if(firstTransformer.isPresent()) {
            HashSet<Function<T, Runnable>> appliedTransformers = 
                indexToAppliedTransformersMap.get(index);
            if(appliedTransformers == null) {
                appliedTransformers = new HashSet<>();
                indexToAppliedTransformersMap.put(index, appliedTransformers);
            }
            Function<T, Runnable> t = firstTransformer.get();
            appliedTransformers.add(t);
            return t.apply(obj);
        }
        
        return null;
    }
    
    private boolean canBeApplied(R index, Function<T, Runnable> transformer) {
        HashSet<Function<T, Runnable>> appliedTransformers = 
            indexToAppliedTransformersMap.get(index);
        
        return 
            appliedTransformers == null || 
            !appliedTransformers.contains(transformer);
    }
}
