package jasy.lang;

public interface ClassBytesSourcePredicate {
    boolean test(ClassLoader classLoader, String className);
    default ClassBytesSource ifTrue(ClassBytesSource source) {
//        return (cl, cn) -> test(cl, cn) ? source.getBytes(cl, cn) : null;
        
        return new ClassBytesSource() {
            @Override
            public void initialize(ClassLoader classLoader) {
                source.initialize(classLoader);
            }

            @Override
            public byte[] getBytes(ClassLoader classLoader, String className) {
                return test(classLoader, className) ? source.getBytes(classLoader, className) : null;
            }
        };
    }
}
