package dayfive.patternsmatching;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternImplementation {

	public static void main(String[] args) {
		
		Pattern pt = Pattern.compile("[aeiou]");
		String sleep = "My name is Nitin Mankar";
		int vowels = 0;
		for(int i = 0; i < sleep.length(); i++) {
			String cha = sleep.substring(i,i+1);
			Matcher mtch = pt.matcher(cha);
			if(mtch.matches()) vowels++;
		}
//		System.out.println(vowels);
		
		String by = "45^6";
		String ab = by.replace("^"," ");
		String[] br = ab.split(" ");
		System.out.println(br[0]);
	}
}