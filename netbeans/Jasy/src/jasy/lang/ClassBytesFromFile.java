package jasy.lang;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Hashtable;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;

public class ClassBytesFromFile implements ClassBytesSource {
    private static ThreadLocal<Hashtable<String, byte[]>> classBytesCacheMap = new ThreadLocal<Hashtable<String, byte[]>>() {
        @Override
        protected Hashtable<String, byte[]> initialValue() {
            return new Hashtable<String, byte[]>();
        }   
    };

    @Override
    public void initialize(ClassLoader classLoader) {
        
    }

    @Override
    public byte[] getBytes(ClassLoader classLoader, String name) {
        try {
            byte[] cacheBytesCache = classBytesCacheMap.get().get(name);

            if(cacheBytesCache == null) {
                String s = new java.io.File("build/test/classes/" + name.replace(".", "/") + ".class").getCanonicalFile().toString();
                InputStream classStream = new FileInputStream("build/test/classes/" + name.replace(".", "/") + ".class"); //classUrl.openStream();
                ClassReader classReader = new ClassReader(classStream);
                ClassWriter classWriter = new ClassWriter(ClassWriter.COMPUTE_MAXS);
                classReader.accept(classWriter, 0);
                cacheBytesCache = classWriter.toByteArray();

                classBytesCacheMap.get().put(name, cacheBytesCache);
            }

            return cacheBytesCache;
        } catch (IOException ex) {
            Logger.getLogger(ClassBytesFromFile.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
}
