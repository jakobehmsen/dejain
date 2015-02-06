package jasy.interceptors.transcription;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Hashtable;

public class ConstructorInvocation implements Invocation {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Constructor<?> constructor;
	private Object[] argsForInvocation;
	private Argument[] argsForPersistence;
	
	public ConstructorInvocation(Constructor<?> constructor, Object[] argsForInvocation, Argument[] argsForPersistence) {
		this.constructor = constructor;
		this.argsForInvocation = argsForInvocation;
		this.argsForPersistence = argsForPersistence;
	}
	
	public static ConstructorInvocation fromTransientCreation(Constructor<?> constructor, Object[] args) {
		Argument[] argsForPersistence = Message.getArgumentsForPersistence(args);
		
		return new ConstructorInvocation(constructor, args, argsForPersistence);
	}

	@Override
	public void load(Hashtable<Object, Object> objectTable) {
		argsForInvocation = new Object[argsForPersistence.length];
		
		for(int i = 0; i < argsForPersistence.length; i++) {
			Argument argForPersistence = argsForPersistence[i];
			argsForInvocation[i] = argForPersistence.resolve(objectTable);
		}
	}

	@Override
	public Object send(Hashtable<Object, Object> objectTable)
			throws IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, InstantiationException {
		Object instance = constructor.newInstance(argsForInvocation);
		
		return instance;
	}
	
	private void readObject(ObjectInputStream inputStream) throws ClassNotFoundException, IOException {
		Class<?> constructorDeclaringClass = (Class<?>)inputStream.readObject();
		Class<?>[] constructorParameters = (Class<?>[])inputStream.readObject();
		
		try {
			constructor = constructorDeclaringClass.getConstructor(constructorParameters);
			constructor.setAccessible(true);
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
		
		argsForPersistence = (Argument[])inputStream.readObject();
	}

	private void writeObject(ObjectOutputStream outputStream) throws IOException {
		outputStream.writeObject(constructor.getDeclaringClass());
		outputStream.writeObject(constructor.getParameterTypes());
		outputStream.writeObject(argsForPersistence);
	}
}
