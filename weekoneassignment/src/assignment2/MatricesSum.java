package assignment2;

public class MatricesSum {

	public static void main(String[] args) {
		int[][] arrayOne = new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int[][] arrayTwo = new int[][] {{4,5,6,4},{5,2,3,8},{9,40,11,112},{13,144,15,16}};
		
		for(int i = 0; i < arrayOne.length; i++) {
			for(int j = 0; j < arrayOne[0].length; j++) {
				System.out.print(arrayOne[i][j] + arrayTwo[i][j] + " ");
			}
			System.out.println();
		}
	}

}
