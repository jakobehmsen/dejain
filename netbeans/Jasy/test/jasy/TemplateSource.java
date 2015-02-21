package jasy;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TemplateSource {
    public static class SourceCode {
        public final Map<String, String> argumentMap;
        public final String src;

        public SourceCode(Map<String, String> argumentMap, String src) {
            this.argumentMap = argumentMap;
            this.src = src;
        }
    }
    
    public static List<SourceCode> expand(String templaceSrc, Map<String, String>... argumentMaps) {
        ArrayList<SourceCode> srcs = new ArrayList<>();
        
        for(Map<String, String> argumentMap: argumentMaps) {
            String src = templaceSrc;
            
            for(Map.Entry<String, String> entry: argumentMap.entrySet()) {
                String name = entry.getKey();
                String value = entry.getValue();

                src = src.replace("<<" + name + ">>", value);
            }
            
            srcs.add(new SourceCode(argumentMap, src));
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
