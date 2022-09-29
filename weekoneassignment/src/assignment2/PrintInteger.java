package assignment2;

public class PrintInteger {

	public static void main(String[] args) {
		/**
		 * You need to print integers till 20, which loop construct is the best for this?
		 * Ans : All loops are best to print numbers till 20.
		 */
		int i = 0;
		
		while(i <= 20) {
			System.out.println(i++);
		}
		
		i = 0;
		
		for(int j = i; j <= 20; j++) {
			System.out.println(j);
		}
		
		do {
			System.out.println(i++);
		}while(i <= 20);
	}

}
