package workingwithfiles;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;

public class WriteData {
	private HashMap<String,String> map;
	
	public WriteData(HashMap<String,String> map) {
		this.map = map;
	}
	
	public void getCountries(char start) {
		
		File file = new File("C:\\Users\\Nitin.Mankar\\LexicalCountries.txt");
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		FileOutputStream fos;
		try {
			fos = new FileOutputStream(file);
			for(String key : map.keySet()) {
				if(key.charAt(0) == start) {
					StringBuffer stb = new StringBuffer("");
					stb.append(key + " : " + map.get(key) + "\n");
					String data = stb.toString();
					byte[] array = data.getBytes();
					fos.write(array);
				}
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
}
