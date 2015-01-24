package dejain;

import java.util.function.Function;

public class ProxyClassLoader extends ClassLoader {
    private Function<String, byte[]> bytesFunction;
    
    public ProxyClassLoader(Function<String, byte[]> bytesFunction) {
        this.bytesFunction = bytesFunction;
    }

    @Override
    public Class<?> loadClass(String name) throws ClassNotFoundException {
        try {
            return findClass(name);
        } catch(ClassNotFoundException e) {
            return super.loadClass(name);
        }
    }
    
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        System.out.println("Loading " + name);
        byte[] bytes = bytesFunction.apply(name);
        return bytes != null 
            ? defineClass(name, bytes, 0, bytes.length)
            : super.findClass(name);
    }
}
