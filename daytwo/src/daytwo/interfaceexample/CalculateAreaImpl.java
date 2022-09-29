package daytwo.interfaceexample;

public class CalculateAreaImpl implements CalculateArea {
	
	@Override
	public int calculateArea(int length, int breadth) {
		return length * breadth;
	}
	public void displayChild() {
		System.out.println("Hii I am implementation");
	}
}
