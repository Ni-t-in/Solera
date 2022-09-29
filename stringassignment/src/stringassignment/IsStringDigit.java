package stringassignment;

import java.util.Scanner;

public class IsStringDigit {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of string you want to enter");
		int size = sc.nextInt();
		String[] array = new String[size];
		System.out.println("Enter the Strings seperated by space");
		for(int j = 0; j < size; j++) {
			array[j] = sc.next();
		}
		for(String x : array) {
			int count = 0;
			int length = x.length();
			for(int i = 0; i < x.length(); i++) {
				char a = x.charAt(i);
				if(!Character.isDigit(a)) {
					count++;
				}
			}
			if(count == 0) {
				System.out.println("It contains digit only");
			}
			else if(count == length) {
				System.out.println("It contains string only");
			}
			else {
				System.out.println("It contains both string as well as digits");
			}
		}

	}

}
