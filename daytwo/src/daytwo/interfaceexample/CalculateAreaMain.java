package daytwo.interfaceexample;

public class CalculateAreaMain {
	public static void main(String[] args) {
		CalculateArea cal = new CalculateAreaImpl();
		CalculateAreaImpl call = new CalculateAreaImpl();
		System.out.println(cal.calculateArea(10, 5));
		System.out.println(cal.calculatePerimeter(10, 5));
		call.displayChild();
		CalculateArea.displayParent();
		System.out.println(call instanceof CalculateAreaImpl);
	}
}
