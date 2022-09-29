package stringassignment;

import java.util.HashMap;
import java.util.Scanner;

public class CountVowelConstant {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String sentence = sc.nextLine();
		sentence = sentence.toUpperCase();

		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		
		for(int i = 0; i < sentence.length(); i++) {
			char word = sentence.charAt(i);
			
			if(word == ' ') continue;
			
			if(!map.containsKey(word)) {
				map.put(word, 1);
			}
			else {
				map.put(word, map.get(word)+1);
			}
		}
		char[] vowels = new char[] {'A','E','I','O','U'}; 
		System.out.println("Vowels");
		for(int i = 0; i < vowels.length; i++) {
			if(map.containsKey(vowels[i]) && map.get(vowels[i]) != 0) {
				System.out.println(vowels[i] + " : " + map.get(vowels[i]));
				map.put(vowels[i], 0);
			}
		}
		
		System.out.println("Consonants");
		for(Character c : map.keySet()) {
			if(map.containsKey(c) && map.get(c) != 0) {
				System.out.println(c + " : " + map.get(c));
			}
		}

	}

}
