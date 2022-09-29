package calculator.exception;

@SuppressWarnings("serial")
public class Equation_Incomplete extends Exception {
	
	public Equation_Incomplete() {
		super();
	}
	
	public Equation_Incomplete(String errorMessage) {
		super(errorMessage);
	}
	
}
