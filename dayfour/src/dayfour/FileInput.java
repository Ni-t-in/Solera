package dayfour;

import java.io.File;
import java.io.FileInputStream;

public class FileInput {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\Nitin.Mankar\\input.txt");

		FileInputStream fis;
		
		try {
			fis = new FileInputStream(file);
			int i = 0;
			while((i = fis.read()) != -1) {
				System.out.print((char)i);
			}
			fis.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
