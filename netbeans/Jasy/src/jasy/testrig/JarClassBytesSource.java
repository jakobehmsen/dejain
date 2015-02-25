package jasy.testrig;

import jasy.lang.ClassBytesSource;
import jasy.lang.CommonClassMap;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Hashtable;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.JarInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JarClassBytesSource implements ClassBytesSource {
    private String jarPath;
    private Hashtable<String, byte[]> nameToBytes;

    public JarClassBytesSource(String jarPath) {
        try {
            this.jarPath = jarPath;
            
            nameToBytes = new Hashtable<>();
            JarFile jarFile = new JarFile(jarPath);
            try (final JarInputStream jarInputStream = new JarInputStream(new BufferedInputStream(new FileInputStream(jarPath)))) {
                JarEntry entry;
                while ((entry = jarInputStream.getNextJarEntry()) != null) {
                    String className = entry.getName();
                    if (className.endsWith(".class") && !className.startsWith("java/")) {
                        InputStream entryInputStream = jarFile.getInputStream(entry);
                        
                        className = className.substring(0, className.length() - 6).replace("/", ".");
                        
                        byte[] classBytes = new byte[entryInputStream.available()];
                        entryInputStream.read(classBytes);
                        
                        nameToBytes.put(className, classBytes);
                    }
                }
            } catch (IOException ex) {
                Logger.getLogger(CommonClassMap.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (IOException ex) {
            Logger.getLogger(JarClassBytesSource.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void initialize(ClassLoader classLoader) {
    }

    @Override
    public byte[] getBytes(ClassLoader classLoader, String className) {
        return nameToBytes.get(className);
    }
}
