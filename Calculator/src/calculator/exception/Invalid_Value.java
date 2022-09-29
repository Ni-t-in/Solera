package calculator.exception;

@SuppressWarnings("serial")
public class Invalid_Value extends Exception {
	
	public Invalid_Value() {
		super();
	}
	
	public Invalid_Value(String errorMessage) {
		super(errorMessage);
	}
	
}
