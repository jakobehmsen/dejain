package dejain.runtime.asm;

import dejain.runtime.javassist.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Optional;
import javassist.CtClass;
import org.objectweb.asm.tree.ClassNode;

public class ClassTransformerSequence implements ClassTransformer {
    private Hashtable<String, HashSet<ClassTransformer>> classToAppliedTransformersMap = new Hashtable<>();
    private ArrayList<ClassTransformer> transformers = new ArrayList<>();
    
    public void addTransformer(ClassTransformer transformer) {
        transformers.add(transformer);
    }

    @Override
    public ClassAction resolve(ClassNode classNode) {
        for(ClassTransformer transformer: transformers) {
            HashSet<ClassTransformer> appliedTransformers = classToAppliedTransformersMap.get(classNode.name);
            
            if(appliedTransformers == null) {
                appliedTransformers = new HashSet<>();
                classToAppliedTransformersMap.put(classNode.name, appliedTransformers);
            }
            
            if(!appliedTransformers.contains(transformer)) {
//                System.out.println("appliedTransformers=" + appliedTransformers);
//                System.out.println("Hasn't applied transformer " + transformer);
                ClassAction a = transformer.resolve(classNode);
                if(a != null) {
                    appliedTransformers.add(transformer);
                    return a;
                }
            } else {
//                System.out.println("Has already applied transformer " + transformer);
            }
        }
        
//        // No transformers could be applied; register all as applied
//        System.out.println("No transformers could be applied; register all as applied");
//        HashSet<ClassTransformer> appliedTransformers = classToAppliedTransformersMap.get(classNode);
//        appliedTransformers.addAll(transformers);
        
        return null;
        
//        Optional<ClassAction> firstAction = transformers.stream()
//            .map(t -> t.resolve(ctClasss)).filter(a -> a != null).findFirst();
//        return firstAction.isPresent() ? firstAction.get() : null;
    }
}
