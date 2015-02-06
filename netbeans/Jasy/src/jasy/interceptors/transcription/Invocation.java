package jasy.interceptors.transcription;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.Hashtable;

public interface Invocation extends Serializable {
	void load(Hashtable<Object, Object> objectTable);
	Object send(Hashtable<Object, Object> objectTable) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException;
}
