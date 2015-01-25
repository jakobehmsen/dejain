package dejain;

import java.util.function.Function;
import java.util.function.Predicate;

public class ProxyClassLoader extends ClassLoader {
    private Predicate<String> nameFilter;
    private Function<String, byte[]> bytesFunction;
    
    public ProxyClassLoader(Predicate<String> nameFilter, Function<String, byte[]> bytesFunction) {
        this.nameFilter = nameFilter;
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
        if(nameFilter.test(name)) {
            byte[] bytes = bytesFunction.apply(name);
            return defineClass(name, bytes, 0, bytes.length);
        } else {
            return super.findClass(name);
        }
    }
}
