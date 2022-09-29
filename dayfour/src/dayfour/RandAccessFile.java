package dayfour;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandAccessFile {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\Nitin.Mankar\\RandomAccess.txt");
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		String word = "If you can dream it you can achieve it";
		
		int position = 0;
		int size = 10;
		fileWrite(file,position ,word);
		fileRead(file,position,size);

	}
	
	private static void fileRead(File file, int position, int size) {
		RandomAccessFile raf;
		try {
			raf = new RandomAccessFile(file,"r");
			raf.seek(position);
			byte[] data = new byte[size];
			raf.read(data);
			System.out.println(new String(data));
			raf.close();
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

	private static void fileWrite(File file,int position,String word) {
		RandomAccessFile raf;
		try {
			raf = new RandomAccessFile(file,"rw");
			raf.seek(position);
			raf.write(word.getBytes());
			raf.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
