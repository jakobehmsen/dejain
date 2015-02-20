package jasy;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class TemplateSource {
    public static List<String> combine(String templaceSrc, Map<String, String>... argumentMaps) {
        ArrayList<String> srcs = new ArrayList<>();
        
        for(Map<String, String> argumentMap: argumentMaps) {
            String src = templaceSrc;
            
            for(Map.Entry<String, String> entry: argumentMap.entrySet()) {
                String name = entry.getKey();
                String value = entry.getValue();

                src = src.replace("<<" + name + ">>", value);
            }
            
            srcs.add(src);
        }
        
        return srcs;
    }
    
    public static <K, V, E extends Map.Entry<K, V>> E entry(K key, V value) {
        return (E)new AbstractMap.SimpleImmutableEntry<>(key, value);
    }
    
    public static <K, V, E extends Map.Entry<K, V>> Map<K, V> map(E... entries) {
        Hashtable<K, V> map = new Hashtable<>();
        
        for(E entry: entries)
            map.put(entry.getKey(), entry.getValue());
        
        return map;
    }
}
