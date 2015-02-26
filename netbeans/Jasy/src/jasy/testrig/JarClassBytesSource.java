package jasy.testrig;

import jasy.lang.ClassBytesSource;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Hashtable;
import java.util.jar.JarFile;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JarClassBytesSource implements ClassBytesSource {
    private String jarPath;
    private Hashtable<String, byte[]> nameToBytes;
    
    public static byte[] getBytes(InputStream is) throws IOException {
        int len;
        int size = 1024;
        byte[] buf;

        if (is instanceof ByteArrayInputStream) {
            size = is.available();
            buf = new byte[size];
            is.read(buf, 0, size);
        } else {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            buf = new byte[size];
            while ((len = is.read(buf, 0, size)) != -1) {
                bos.write(buf, 0, len);
            }
            buf = bos.toByteArray();
        }
        return buf;
    }

    public JarClassBytesSource(String jarPath) {
        try {
            this.jarPath = jarPath;
            
            nameToBytes = new Hashtable<>();
            JarFile jarFile = new JarFile(jarPath);
            
            jarFile.stream().forEach(entry -> {
                String className = entry.getName();
                if (className.endsWith(".class") && !className.startsWith("java/")) {
                    try {
                        InputStream entryInputStream = jarFile.getInputStream(entry);
                        
                        className = className.substring(0, className.length() - 6).replace("/", ".");

                        byte[] classBytes = getBytes(entryInputStream);
                        
                        nameToBytes.put(className, classBytes);
                    } catch (IOException ex) {
                        Logger.getLogger(JarClassBytesSource.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            });
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
