package jasy.runtime.javassist;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Optional;
import javassist.CtClass;

public class ClassTransformerSequence implements ClassTransformer {
    private Hashtable<CtClass, HashSet<ClassTransformer>> classToAppliedTransformersMap = new Hashtable<>();
    private ArrayList<ClassTransformer> transformers = new ArrayList<>();
    
    public void addTransformer(ClassTransformer transformer) {
        transformers.add(transformer);
    }

    @Override
    public ClassAction resolve(CtClass ctClass) {
        for(ClassTransformer transformer: transformers) {
            HashSet<ClassTransformer> appliedTransformers = classToAppliedTransformersMap.get(ctClass);
            
            if(appliedTransformers == null) {
                appliedTransformers = new HashSet<>();
                classToAppliedTransformersMap.put(ctClass, appliedTransformers);
            }
            
            if(!appliedTransformers.contains(transformer)) {
                ClassAction a = transformer.resolve(ctClass);
                if(a != null) {
                    appliedTransformers.add(transformer);
                    return a;
                }
            }
        }
        
        return null;
        
//        Optional<ClassAction> firstAction = transformers.stream()
//            .map(t -> t.resolve(ctClasss)).filter(a -> a != null).findFirst();
//        return firstAction.isPresent() ? firstAction.get() : null;
    }
}
