package jasy.lang;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.jar.JarInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.ZipEntry;

public class PackageInfo implements Serializable {
    private byte[] content;
    private ArrayDeque<PackageInfo> pendingMerges = new ArrayDeque<>();
    
    private Set<String> classNames = new HashSet<>();
    private Map<String, PackageInfo> packageNameToPackagesMap = new HashMap<>();
    
    private void ensureLoaded() {
        if(content != null) {
            try(ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(content))) {
                classNames = (HashSet<String>)ois.readObject();
                packageNameToPackagesMap = (HashMap<String, PackageInfo>)ois.readObject();
            } catch (IOException | ClassNotFoundException ex) {
                Logger.getLogger(PackageInfo.class.getName()).log(Level.SEVERE, null, ex);
            }
            content = null;
        }
        
        while(pendingMerges.size() > 0) {
            PackageInfo packageInfo = pendingMerges.removeFirst();
            packageInfo.ensureLoaded();
            
            this.classNames.addAll(packageInfo.classNames);
            for (Map.Entry<String, PackageInfo> entry : packageInfo.packageNameToPackagesMap.entrySet()) {
                PackageInfo p = packageNameToPackagesMap.get(entry.getKey());
                if (p == null) {
                    p = new PackageInfo();
                    packageNameToPackagesMap.put(entry.getKey(), p);
                }
                p.merge(entry.getValue());
            }
        }
    }

    public static PackageInfo fromJar(String path) {
        PackageInfo p = new PackageInfo();
        System.out.println("Reading jar " + path);
        try (final JarInputStream jarInputStream = new JarInputStream(new BufferedInputStream(new FileInputStream(path)))) {
            ZipEntry entry;
            while ((entry = jarInputStream.getNextEntry()) != null) {
                String className = entry.getName();
                if (className.endsWith(".class")) {
                    p.addFromClassPath(className);
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(CommonClassMap.class.getName()).log(Level.SEVERE, null, ex);
        }
        return p;
    }

    public void merge(PackageInfo packageInfo) {
        pendingMerges.add(packageInfo);
//        this.classNames.addAll(packageInfo.classNames);
//        for (Map.Entry<String, PackageInfo> entry : packageInfo.packageNameToPackagesMap.entrySet()) {
//            PackageInfo p = packageNameToPackagesMap.get(entry.getKey());
//            if (p == null) {
//                p = new PackageInfo();
//                packageNameToPackagesMap.put(entry.getKey(), p);
//            }
//            p.merge(entry.getValue());
//        }
    }

    public void addFromClassPath(String classPath) {
        int packageEnd = classPath.lastIndexOf("/");
        String packageName = packageEnd != -1 ? classPath.substring(0, packageEnd).replace("/", ".") : "";
        try {
            String className = classPath.substring(packageEnd + 1, classPath.length() - 6);
            addClassName(packageName, className);
        } catch (StringIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }

    public void addClassName(String packageName, String className) {
        PackageInfo p = getPackage(packageName, true);
        p.classNames.add(className);
    }
    
    public PackageInfo getPackage(String packageName) {
        return getPackage(packageName, false);
    }

    private PackageInfo getPackage(String packageName, boolean allocate) {
        ensureLoaded();
        
        PackageInfo p = this;
        for (String packageNamePart : packageName.split("\\.")) {
            if(packageNamePart.length() > 0) {
                p.ensureLoaded();
                PackageInfo newP = p.packageNameToPackagesMap.get(packageNamePart);
                if (newP == null) {
                    if(allocate) {
                        newP = new PackageInfo();
                        p.packageNameToPackagesMap.put(packageNamePart, newP);
                    } else {
                        throw new RuntimeException("Could not resolve package '" + packageName + "'.");
                    }
                }
                p = newP;
            }
        }
        return p;
    }

    public Set<String> getClassNames() {
        ensureLoaded();
        
        return classNames;
    }
        
    private void writeObject(ObjectOutputStream stream) throws IOException {
        ByteArrayOutputStream aos = new ByteArrayOutputStream();
        try(ObjectOutputStream oos = new ObjectOutputStream(aos)) {
            oos.writeObject(classNames);
            oos.writeObject(packageNameToPackagesMap);
        } catch (IOException ex) {
            Logger.getLogger(PackageInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
        stream.writeObject(aos.toByteArray());
    }

    private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException {
        content = (byte[])stream.readObject();
        pendingMerges = new ArrayDeque<>();
    }
}
