package daynine.functionalinterface;

public interface VisualInformation {

	public default void printInfo(String message) {
		System.out.println("Hello I am parent class");
	}
	
}
