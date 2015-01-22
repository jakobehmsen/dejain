package dejain.runtime.javassist;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.function.Consumer;
import javassist.CtClass;

public class CommonClassTransformer implements ClassTransformer {
    private ArrayList<Predicate<CtClass>> predicates = new ArrayList<>();
    private ArrayList<Consumer<CtClass>> actions = new ArrayList<>();
    
    public void addPredicate(Predicate<CtClass> predicate) {
        predicates.add(predicate);
    }
    
    public void addAction(Consumer<CtClass> action) {
        actions.add(action);
    }

    @Override
    public ClassAction resolve(CtClass ctClasss) {
        boolean allPredicatesMatch = predicates.stream().allMatch(p -> p.test(ctClasss));
        
        if(allPredicatesMatch)
            return c -> actions.forEach(a -> a.accept(c));
        
        return null;
    }
}
