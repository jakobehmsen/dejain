package dejain.examples.example1;

import dejain.lang.ClassMap;
import dejain.lang.ClassResolver;
import dejain.lang.PackageInfo;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
//        PackageInfo pa = new PackageInfo();
//        PackageInfo pa2 = PackageInfo.fromJar("C:\\Program Files\\Java\\jdk1.8.0_25\\jre/lib/rt.jar");
//        
//        pa.merge(pa2);
        
//        List<PackageInfo> packages = PackageInfo.getPackages();
//        ClassMap classMap = ClassMap.createDefault();
//        ClassResolver cr = new ClassResolver(classMap);
//        cr.importPackage("java.lang");
//        String objectClassName = cr.resolveClassName("Object");
//        String stringClassName = cr.resolveClassName("String");
//        List<String> piClassNames = pi.getClassNames();
        
//        URL c = ClassLoader.getSystemClassLoader().getResource("cache");
        
        Person p1 = new Person();
        Person p2 = new Person();
        
//        URL r = ClassLoader.getSystemClassLoader().getResource("");
        
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(p1);
        persons.add(p2);
//        persons.forEach(x -> System.out.println(x));
        
        String r1 = p2.toString();
        String r2 = p2.anotherMethod();
//        Object i = p2.getClass().getMethod("someMethod").invoke(p2);
        
        new String();
    }
}
