package daynine.lamda;

public class PrintInformationImpl implements PrintInformation{

	@Override
	public void printMessage(String message) {
		System.out.println("Good morning " + message);
		
	}
	
	public void display() {
		System.out.println("Hello");
	}

	
	

}
