package dejain.interceptors.transcription;

import java.util.Hashtable;


public class LiteralArgument implements Argument {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Object obj;

	public LiteralArgument(Object obj) {
		this.obj = obj;
	}

	@Override
	public Object resolve(Hashtable<Object, Object> objectTable) {
		return obj;
	}
}
