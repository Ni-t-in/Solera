package dayfour;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReaderWriter {

	public static void main(String[] args) {
		File fileTwo = new File("C:\\Users\\Nitin.Mankar\\writer.txt");
		
		FileWriter fw;
		FileReader fr;
		
		try {
			fw = new FileWriter(fileTwo);
			fw.write("Hello everyone\nToday is the day");
			fw.close();
			
			fr = new FileReader(fileTwo);
			int i = 0;
			while((i = fr.read()) != -1) {
				System.out.print((char)i);
			}
			fr.close();
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
