package daynine.lamda;

public class LamdaMain {

	public static void main(String[] args) {
		
		//Old method
		PrintInformation pii = new PrintInformationImpl();
		
		pii.printMessage("Hello, How are you");
		pii.printInfo();
		pii.printInformation();
		
		//Lamda function
		
		PrintInformation pi = (c) -> System.out.println(c + "Hello Nitin");
		pi.printMessage("Hii ");

	}

}
