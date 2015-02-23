package jasy.lang;

public interface ClassBytesTransformer {
    void initialize(ClassLoader classLoader);
    byte[] transform(ClassLoader classLoader, byte[] classBytes);
}
