package assignment2;

import java.util.Scanner;

public class CheckValid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row for first matrix");
		int i = sc.nextInt();
		System.out.println("Enter column for first matrix");
		int j = sc.nextInt();
		int[][] first = new int[i][j];
		System.out.println("Enter the numbers seperated by space");
		for(int x = 0; x < i; x++) {
			for(int y = 0; y < j; y++) {
				first[x][y] = sc.nextInt();
			}
		}
		System.out.println("Enter row for second matrix");
		int m = sc.nextInt();
		System.out.println("Enter column for second matrix");
		int n = sc.nextInt();
		int[][] second = new int[m][n];
		System.out.println("Enter the numbers seperated by space");
		for(int x = 0; x < m; x++) {
			for(int y = 0; y < n; y++) {
				second[x][y] = sc.nextInt();
			}
		}
		
		if(i != m || j != n) {
			System.out.println("Addition is not possible for given matrices");
		}
		else {
			for(int x = 0; x < m; x++) {
				for(int y = 0; y < n; y++) {
					System.out.print(first[x][y] + second[x][y] + " ");
				}
				System.out.println();
			}
		}
	}

}
