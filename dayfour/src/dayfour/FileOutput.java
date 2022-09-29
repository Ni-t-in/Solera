package dayfour;

import java.io.File;
import java.io.FileOutputStream;

public class FileOutput {

	public static void main(String[] args) {
		String word = "Hey Everyone \nI am Nitin Mankar";
		File fileOne = new File("C:\\Users\\Nitin.Mankar\\output.txt");
		
		FileOutputStream fos;
		
		try {
			fos = new FileOutputStream(fileOne);
			byte[] array = word.getBytes();
			
			fos.write(array);
			fos.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
