package calculator.exception;

@SuppressWarnings("serial")
public class Zero_Division extends Exception{
	
	public Zero_Division() {
		super();
	}
	
	public Zero_Division(String errorMessage) {
		super(errorMessage);
	}
	
}
