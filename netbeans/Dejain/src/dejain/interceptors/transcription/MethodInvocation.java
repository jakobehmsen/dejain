package dejain.interceptors.transcription;

import java.lang.reflect.InvocationTargetException;
import java.util.Hashtable;

public class MethodInvocation implements Invocation {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Object receiverId;
	private Message message;
	
	public MethodInvocation(Object receiverId, Message message) {
		this.receiverId = receiverId;
		this.message = message;
	}

	@Override
	public void load(Hashtable<Object, Object> objectTable) {
		message.load(objectTable);
	}

	@Override
	public Object send(Hashtable<Object, Object> objectTable) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Object receiver = objectTable.get(receiverId);
		return message.sendTo(receiver);
	}
}
