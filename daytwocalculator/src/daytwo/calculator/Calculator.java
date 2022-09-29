package daytwo.calculator;

public interface Calculator {
	public void addition(int numone, int numtwo);
	public void subtraction(int numone, int numtwo);
	public void division(int numone, int numtwo);
	public void multiplication(int numone,int numtwo);
	public void modulus(int numone, int numtwo);
	public static void exit() {
		System.exit(0);
	}
}
