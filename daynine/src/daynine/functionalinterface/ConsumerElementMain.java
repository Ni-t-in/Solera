package daynine.functionalinterface;

import java.util.Arrays;
import java.util.List;

public class ConsumerElementMain {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,34,5,6,7);
		ConsumerElement<Integer> consumer = (x) -> System.out.println(x);
		
		displayInfo(list,consumer);
	

	}

	private static <T> void displayInfo(List<T> list, ConsumerElement<T> consumer) {
		for(T t : list) {
			consumer.acceptElement(t);
		}
	}

}
