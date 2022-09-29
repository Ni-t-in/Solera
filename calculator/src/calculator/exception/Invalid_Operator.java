package calculator.exception;

@SuppressWarnings("serial")
public class Invalid_Operator extends Exception {
	
	public Invalid_Operator() {
		super();
	}
	
	public Invalid_Operator(String errorMessage) {
		super(errorMessage);
	}
	
}
