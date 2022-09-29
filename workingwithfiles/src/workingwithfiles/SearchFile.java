package workingwithfiles;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Scanner;

public class SearchFile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter search directory");
		String path = sc.nextLine();
		System.out.println("Enter extension of the file");
		String ext = sc.nextLine();
		listFiles(path,ext);
	}
	
	public static void listFiles(String path,String ext) {
		GetFiles files = new GetFiles(ext);
		File dir = new File(path);
		
		if(!dir.isDirectory()) {
			System.out.println("Folder does not exists : " + path);
			return;
		}
		
		String[] list = dir.list(files);
		
		if(list.length == 0) {
			System.out.println("There are not files of " + ext + " type extension");
		}
		else {
			for(String file : list) {
				String temp = new StringBuffer(path).append(File.separatorChar).append(file).toString();
				System.out.println("File : " + temp);
			}
		}
	}
	
	public static class GetFiles implements FilenameFilter{
		private String ext;
		
		public GetFiles(String ext) {
			this.ext = ext;
		}

		@Override
		public boolean accept(File dir, String name) {
			if(name.lastIndexOf('.') > 0) {
				int lstIndex = name.lastIndexOf('.');
				String str = name.substring(lstIndex);
				if(str.equalsIgnoreCase(this.ext)) {
					return true;
				}
			}
			else if(name.lastIndexOf('.') == 0 && name.equalsIgnoreCase(this.ext)) {
				return true;
			}
			return false;
		}
	}

}
