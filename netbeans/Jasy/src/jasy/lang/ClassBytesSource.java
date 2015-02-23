package jasy.lang;

public interface ClassBytesSource {
    void initialize(ClassLoader classLoader);
    byte[] getBytes(ClassLoader classLoader, String className);
    default ClassBytesSource andThen(ClassBytesTransformer transformer) {
        ClassBytesSource self = this;
//        return (cl, cn) -> transformer.transform(cl, this.getBytes(cl, cn));
        return new ClassBytesSource() {
            @Override
            public void initialize(ClassLoader classLoader) {
                transformer.initialize(classLoader);
            }

            @Override
            public byte[] getBytes(ClassLoader classLoader, String className) {
                byte[] bytes = self.getBytes(classLoader, className);
                return bytes != null ? transformer.transform(classLoader, bytes) : bytes;
            }
        };
    }
}
