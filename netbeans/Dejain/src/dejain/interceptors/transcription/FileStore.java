package dejain.interceptors.transcription;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FileStore implements Store {
	private int nextId;
	private String filePath;

	public FileStore(int seedId, String filePath) {
		nextId = seedId;
		this.filePath = filePath;
	}

	@Override
	public void put(Invocation invocation) {
		try {
			FileOutputStream fileOutput = new FileOutputStream(filePath, true);
			BufferedOutputStream bufferedOutput = new BufferedOutputStream(fileOutput);
			ObjectOutputStream objectOutput = new ObjectOutputStream(bufferedOutput);
			
			objectOutput.writeObject(invocation);
			
			objectOutput.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Object allocateId(Object obj) {
		return nextId++;
	}
}
