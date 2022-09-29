package dayfour;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriter {

	public static void main(String[] args) {
		String data = "Hii I am Nitin\nI am working at Solera";
		File file = new File("C:\\Users\\Nitin.Mankar\\Bufferedwrite.txt");
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		FileWriter fw;
		BufferedWriter bw;
		try {
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			
			bw.write(data);
			bw.close();
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
