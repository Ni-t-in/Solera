package assignment2;

public class TwoDArray {

	public static void main(String[] args) {
		int[][] array = new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[0].length; j++) {
				if(array[i][j] % 2 != 0) System.out.println(array[i][j]);
			}
		}
	}

}
