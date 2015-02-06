package jasy.interceptors.transcription;

import java.util.Hashtable;


public class LookupArgument implements Argument {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Object id;

	public LookupArgument(Object id) {
		this.id = id;
	}

	@Override
	public Object resolve(Hashtable<Object, Object> objectTable) {
		return objectTable.get(id);
	}
}
