package assignment3;

import java.util.Scanner;

public class Substring {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string of which you want to make substring");
		String word = sc.nextLine();
		System.out.println("Enter the starting index and ending index seperated by space");
		int start = sc.nextInt();
		int end = sc.nextInt();
		System.out.printf("The substring of given string is %s",word.substring(start, end));
	}
}
