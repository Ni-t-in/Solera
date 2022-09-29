package daytwo.interfaceexample;

public interface CalculateArea {
	
	public int calculateArea(int length,int breadth);
	
	static void displayParent() {
		System.out.println("Hii I am Interface");
	}
	
	default int calculatePerimeter(int length, int breadth) {
		return 2 * (length + breadth);
	}
}

// In JAVA 8 we can define method in interface also using default access modifier earlier it was not possible