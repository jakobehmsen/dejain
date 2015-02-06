package jasy.interceptors.transcription;

import java.io.Serializable;
import java.util.Hashtable;

public interface Argument extends Serializable {
	Object resolve(Hashtable<Object, Object> objectTable);
}
