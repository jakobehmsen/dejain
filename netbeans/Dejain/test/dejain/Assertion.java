package dejain;

import java.util.function.Predicate;

public class Assertion {
    public static <T> Predicate<T> is(T other) {
        return x -> x.equals(other);
    }
    
    public static <T> Predicate<T> isNull() {
        return x -> x == null;
    }
}
