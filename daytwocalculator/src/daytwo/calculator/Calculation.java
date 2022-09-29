package daytwo.calculator;

public class Calculation implements Calculator {

	@Override
	public void addition(int numone, int numtwo) {
		System.out.println(numone + numtwo);
	}

	@Override
	public void subtraction(int numone, int numtwo) {
		System.out.println(numone - numtwo);
	}

	@Override
	public void division(int numone, int numtwo) {
		System.out.println(numone / numtwo);
	}

	@Override
	public void multiplication(int numone, int numtwo) {
		System.out.println(numone * numtwo);
	}

	@Override
	public void modulus(int numone, int numtwo) {
		System.out.println(numone % numtwo);
	}
	
}
