package cisco.java.FileHandling;

import java.io.File;
import java.io.FileReader;

public class FileReaderDemo {

	public static void main(String[] args) {

		char[] array = new char[45];
		
		try {
			// Step 1 : Creates a reader using the FileReader
			FileReader input = new FileReader("/Users/sagodava/Desktop/Assignment");
			
	
			input.read(array);
			
			System.out.println("Data in the file");
			System.out.println(array);
			
		
			input.close();
		}
		catch(Exception e) {
			e.getStackTrace();
		}

	}

}
