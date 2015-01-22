package dejain.runtime.asm;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.function.Consumer;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.tree.ClassNode;

public class CommonClassTransformer implements ClassTransformer {
    private ArrayList<Predicate<ClassNode>> predicates = new ArrayList<>();
    private ArrayList<Consumer<ClassNode>> actions = new ArrayList<>();
    
    public void addPredicate(Predicate<ClassNode> predicate) {
        predicates.add(predicate);
    }
    
    public void addAction(Consumer<ClassNode> action) {
        actions.add(action);
    }

    @Override
    public ClassAction resolve(ClassNode classNode) {
        boolean allPredicatesMatch = predicates.stream().allMatch(p -> p.test(classNode));
        
        if(allPredicatesMatch)
            return c -> actions.forEach(a -> 
                a.accept(c));
        
        return null;
    }
}
