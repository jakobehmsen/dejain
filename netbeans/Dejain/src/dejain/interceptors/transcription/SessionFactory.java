package dejain.interceptors.transcription;

import java.util.Hashtable;

public class SessionFactory {
    private Store store;

    public SessionFactory(Store store) {
        this.store = store;
    }

    public Session createSession() {
        return new Session(store);
    }

    public static SessionFactory current = new SessionFactory(new LoadStore(new Hashtable<Object, Object>()));
}
