package opsjdbcapp.exceptions;

@SuppressWarnings("serial")
public class OrderNotFoundException extends Exception{

	public OrderNotFoundException() {
		super();
	}

	public OrderNotFoundException(String message) {
		super(message);
	}
	
}
