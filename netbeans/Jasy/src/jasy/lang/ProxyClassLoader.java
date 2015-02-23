package jasy.lang;

public class ProxyClassLoader extends ClassLoader {
    private ClassBytesSource bytesFunction;
    
    public ProxyClassLoader(ClassBytesSource bytesFunction) {
        this.bytesFunction = bytesFunction;
        bytesFunction.initialize(this);
    }

    @Override
    public Class<?> loadClass(String name) throws ClassNotFoundException {
        try {
            return findClass(name);
        } catch(ClassNotFoundException e) {
//            return super.loadClass(name);
            return getParent().loadClass(name);
        }
    }
    
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        byte[] bytes = bytesFunction.getBytes(this, name);
        
        Class<?> superType = super.getClass();
        if(bytes != null) {
            return defineClass(name, bytes, 0, bytes.length);
        } else {
            throw new ClassNotFoundException(name);
//            getParent().l
//            return getParent().findClass(name);
        }
    }
}
