package workingwithfiles;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Scanner;

public class TextFileHandler {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter letter to find countries and capitals that start with that letter");
		String input = sc.next();
		File file = new File("C:\\Users\\Nitin.Mankar\\CountriesCapitals.txt");
		FileInputStream fis;
		HashMap <String,String> map = new HashMap<String,String>();
		try {
			fis = new FileInputStream(file);
			int i = 0;
			while((i = fis.read()) != -1) {
				StringBuffer country = new StringBuffer("");
				country.append((char)i);
				StringBuffer capital = new StringBuffer("");

				while((i = fis.read()) != -1) {
					if((char)i == ':') break;
					country.append((char)i);
				}

				fis.read();
				while((i = fis.read()) != -1) {
					if((char)i == '\n') break;
					capital.append((char)i);
				}
				String cap = capital.toString();
				String cnt = country.toString();
				map.put(cnt, cap);
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		
//		for(String key : map.keySet()) {
//			System.out.print(key + " " + map.get(key) + "\n");
//		}
		
		input = input.toUpperCase();
		WriteData wd = new WriteData(map);
		wd.getCountries(input.charAt(0));

	}

}
