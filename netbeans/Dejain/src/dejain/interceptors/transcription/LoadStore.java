package dejain.interceptors.transcription;

import java.util.Hashtable;

public class LoadStore implements Store {
    private Hashtable<Object, Object> map;

    public LoadStore(Hashtable<Object, Object> map) {
        this.map = map;
    }

    @Override
    public void put(Invocation invocation) { }

    @Override
    public Object allocateId(Object obj) {
        int id = map.size();
        map.put(id, obj);
        return id;
    }

    public Object get(Object id) {
        return map.get(id);
    }
}
