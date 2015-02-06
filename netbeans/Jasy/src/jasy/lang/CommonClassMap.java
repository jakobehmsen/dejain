package jasy.lang;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.jar.JarInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.ZipEntry;

public class CommonClassMap implements ClassMap {
    
    private PackageInfo rootPackage = new PackageInfo();
    
    public void addFromPath(String path) {
        if(path.endsWith(".jar"))
            addFromJar(path);
        else
            addFromDirectory(path);
    }
    
    @Override
    public Set<String> getClassNames(String packageName) {
//        PackageInfo p = getPackage(packageName, false);
//        return p.classNames;
        return rootPackage.getPackage(packageName).getClassNames();
    }
    
//    private PackageInfo getPackage(String packageName, boolean allocate) {
//        PackageInfo p = rootPackage;
//        
//        for(String packageNamePart: packageName.split("\\.")) {
//            System.out.println("packageNamePart=" + packageNamePart);
//            System.out.println("p.packageNameToPackagesMap=" + p.packageNameToPackagesMap);
//            PackageInfo newP = p.packageNameToPackagesMap.get(packageNamePart);
//            
//            if(newP == null && allocate) {
//                newP = new PackageInfo();
//                p.packageNameToPackagesMap.put(packageNamePart, newP);
//            }
//            
//            p = newP;
//        }
//        
//        return p;
//    }
    
    public void addFromJar(String path) {
        String cacheDir = "cache";
        if(!Files.exists(Paths.get(cacheDir))) {
            try {
                Files.createDirectory(Paths.get(cacheDir));
            } catch (IOException ex) {
                Logger.getLogger(CommonClassMap.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        String cachePath = cacheDir + "/" + Paths.get(path).getFileName().getName(0);
        
//        String cachePath = path.substring(path.lastIndexOf("\\") + 1) + "cache";
//        URL cachePathUrl = ClassLoader.getSystemClassLoader().getResource("");
//        
//        System.out.println("cachePathUrl=" + cachePathUrl);
//        System.out.println(cachePathUrl.getPath());
//        System.out.println(cachePathUrl.getFile());
//        String cachePath = cachePathUrl.getFile().substring(0);
        System.out.println("cachePath=" + cachePath);
        File cacheFile = new File(cachePath);
        try {
            System.out.println(new File(".").getCanonicalPath());
        } catch (IOException ex) {
            Logger.getLogger(CommonClassMap.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(cacheFile.exists()) {
//            try{
//            try(DataInputStream cacheInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(cacheFile)))) {
//                System.out.println("Reading jar cache " + cachePath);
//                while(cacheInputStream.available() != 0) {
//                    String className = cacheInputStream.readUTF();
//                    addFromClassPath(className);
//                }
//            } catch (IOException ex) {
//                Logger.getLogger(ClassMap.class.getName()).log(Level.SEVERE, null, ex);
//            }
                
                long start = System.currentTimeMillis();
//                byte[] cacheContents = java.nio.file.Files.readAllBytes(Paths.get(cacheFile.getCanonicalPath()));
                long end = System.currentTimeMillis();
//                System.out.println("Read byte[] from " + cacheFile.getCanonicalPath() + " in " + (end - start) + "ms");
                try(ObjectInputStream cacheInputStream = new ObjectInputStream(new BufferedInputStream(new FileInputStream(cacheFile)))) {
//                try(ObjectInputStream cacheInputStream = new ObjectInputStream(new ByteArrayInputStream(cacheContents))) {
                    System.out.println("Reading jar cache " + cachePath);
                    start = System.currentTimeMillis();
                    PackageInfo cachedPackage = (PackageInfo)cacheInputStream.readObject();
                    end = System.currentTimeMillis();
                    System.out.println("PackageInfo from byte[] in " + (end - start) + "ms");
                    start = System.currentTimeMillis();
                    rootPackage.merge(cachedPackage);
                    end = System.currentTimeMillis();
                    System.out.println("Loaded cached package in " + (end - start) + "ms");
//                    System.out.println("Reading jar cache " + cachePath);
//                    start = System.currentTimeMillis();
//                    ArrayList<String> cachedClassNames = (ArrayList<String>)cacheInputStream.readObject();
//                    end = System.currentTimeMillis();
//                    System.out.println("Read ArrayList<String> (" + cachedClassNames.size() + ") from byte[] in " + (end - start) + "ms");
//                    start = System.currentTimeMillis();
//                    for(String cachedClassName: cachedClassNames)
//                        addFromClassPath(cachedClassName);
//                    end = System.currentTimeMillis();
//                    System.out.println("Loaded cached names from ArrayList<String> in " + (end - start) + "ms");
//                while(cacheInputStream.available() != 0) {
//                    String className = cacheInputStream.readUTF();
//                    addFromClassPath(className);
//                }
                } catch (IOException | ClassNotFoundException ex) {
                    Logger.getLogger(CommonClassMap.class.getName()).log(Level.SEVERE, null, ex);
                }
//            } catch (IOException ex) {
//                Logger.getLogger(ClassMap.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            } catch (IOException ex) {
//                Logger.getLogger(ClassMap.class.getName()).log(Level.SEVERE, null, ex);
//            }
        } else {
//            try(DataOutputStream cacheOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(path)))) {
//                try(JarInputStream jarInputStream = new JarInputStream(new BufferedInputStream(new FileInputStream(path)))) {
//                    ZipEntry entry;
//                    while((entry = jarInputStream.getNextEntry()) != null) {
//                        String className = entry.getName();
//                        if(className.endsWith(".class")) {
//                            addFromClassPath(className);
//                            cacheOutputStream.writeUTF(className);
//                        }
//                    }
//                } catch (IOException ex) {
//                    Logger.getLogger(ClassMap.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            } catch (IOException ex) {
//                Logger.getLogger(ClassMap.class.getName()).log(Level.SEVERE, null, ex);
//            }
            System.out.println("Reading jar " + path + " - caching into " + cacheFile);
            try(ObjectOutputStream cacheOutputStream = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(cacheFile)))) {
//                ArrayList<String> cachedClassNames = new ArrayList<>();
                PackageInfo p = PackageInfo.fromJar(path);
                cacheOutputStream.writeObject(p);
                rootPackage.merge(p);
                
//                try(JarInputStream jarInputStream = new JarInputStream(new BufferedInputStream(new FileInputStream(path)))) {
//                    ZipEntry entry;
//                    while((entry = jarInputStream.getNextEntry()) != null) {
//                        String className = entry.getName();
//                        if(className.endsWith(".class")) {
//                            addFromClassPath(className);
////                            cacheOutputStream.writeUTF(className);
////                            cachedClassNames.add(className);
//                        }
//                    }
//                } catch (IOException ex) {
//                    Logger.getLogger(ClassMap.class.getName()).log(Level.SEVERE, null, ex);
//                }
                
//                cacheOutputStream.writeObject(cachedClassNames);
            } catch (IOException ex) {
                Logger.getLogger(CommonClassMap.class.getName()).log(Level.SEVERE, null, ex);
            }
        }   
    }
    
    public void addFromDirectory(String path) {
        File filePath = new File(path);

        if(filePath.isDirectory()) {
            for(String f: filePath.list()) {
                if(f.endsWith(".class"))
                    addFromClassPath(f);
            }
        }
    }

    public void addFromClassPath(String classPath) {
//        int packageEnd = classPath.lastIndexOf("/");
//        String packageName = packageEnd != -1 ? classPath.substring(0, packageEnd).replace("/", ".") : "";
//        try {
//            String className = classPath.substring(packageEnd + 1, classPath.length() - 6);
//            addClassName(packageName, className);
//        } catch(StringIndexOutOfBoundsException e) {
//            e.printStackTrace();
//        }
        addClassName(classPath.substring(0, classPath.lastIndexOf(".")).replace("/", "."));
    }

    public void addClassName(String qualifiedClassName) {
        int packageEnd = qualifiedClassName.lastIndexOf(".");
        String packageName = packageEnd != -1 ? qualifiedClassName.substring(0, packageEnd) : "";
        try {
            String className = qualifiedClassName.substring(packageEnd + 1);
            addClassName(packageName, className);
        } catch(StringIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }

    public void addClassName(String packageName, String className) {
        rootPackage.addClassName(packageName, className);
    }
    
    public static CommonClassMap createDefault() {
        CommonClassMap classMap = new CommonClassMap();
        
        long javaRTJarStart = System.currentTimeMillis();
        String javaRTJar = System.getProperty("java.home") + "/lib/rt.jar";
        classMap.addFromJar(javaRTJar);
        long javaRTJarEnd = System.currentTimeMillis();
        System.out.println("javaRTJar " + (javaRTJarEnd - javaRTJarStart) + "ms");
        
        String[] classPaths = System.getProperty("java.class.path").split(";");
        for(String cp: classPaths)
            classMap.addFromPath(cp);
        
        return classMap;
    }
}
