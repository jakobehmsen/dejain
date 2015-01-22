package dejain.interceptors.transcription;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Hashtable;

public class Message implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Method method;
	private Object[] argsForInvocation;
	private Argument[] argsForPersistence;
	
	private Message(Method method, Object[] argsForInvocation, Argument[] argsForPersistence) {
		this.method = method;
		this.argsForInvocation = argsForInvocation;
		this.argsForPersistence = argsForPersistence;
	}
	
	public static Message fromTransientMessage(Method method, Object[] args) {
		Argument[] argsForPersistence = getArgumentsForPersistence(args);
		
		return new Message(method, args, argsForPersistence);
	}
	
	public static Argument[] getArgumentsForPersistence(Object[] args) {
		int argCount = args != null ? args.length : 0;
		Argument[] argsForPersistence = new Argument[argCount];
		
		for(int i = 0; i < argCount; i++) {
			Object arg = args[i];
			Argument argForPersistence;
			if(arg instanceof Arguable) {
				argForPersistence = ((Arguable)arg).toArgument();
			} else {
				argForPersistence = new LiteralArgument(arg);
			}
			
			argsForPersistence[i] = argForPersistence;
		}
		
		return argsForPersistence;
	}
	
	private void readObject(ObjectInputStream inputStream) throws ClassNotFoundException, IOException {
		Class<?> methodDeclaringClass = (Class<?>)inputStream.readObject();
		String methodName = inputStream.readUTF();
		Class<?>[] methodParameters = (Class<?>[])inputStream.readObject();
		
		try {
			method = methodDeclaringClass.getMethod(methodName, methodParameters);
			method.setAccessible(true);
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
		
		argsForPersistence = (Argument[])inputStream.readObject();
	}

	private void writeObject(ObjectOutputStream outputStream) throws IOException {
		outputStream.writeObject(method.getDeclaringClass());
		outputStream.writeUTF(method.getName());
		outputStream.writeObject(method.getParameterTypes());
		outputStream.writeObject(argsForPersistence);
	}

	public Object sendTo(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		return method.invoke(obj, argsForInvocation);
	}

	public void load(Hashtable<Object, Object> objectTable) {
		argsForInvocation = new Object[argsForPersistence.length];
		
		for(int i = 0; i < argsForPersistence.length; i++) {
			Argument argForPersistence = argsForPersistence[i];
			argsForInvocation[i] = argForPersistence.resolve(objectTable);
		}
	}
}
