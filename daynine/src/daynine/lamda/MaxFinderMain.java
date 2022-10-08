package daynine.lamda;

import java.util.ArrayList;
import java.util.List;

public class MaxFinderMain {

	public static void main(String[] args) {
		MaxFinder find = new MaxFinderImpl();
		int result = find.maximum(10,20);
		System.out.println(result);
		
		MaxFinder max = (num1, num2) -> num1>num2?num1:num2;
		System.out.println(max instanceof FunctionalInterface);
		
		int maxi = max.maximum(10, 20);
		System.out.println(maxi);
		
		List<String> currencies = new ArrayList<String>();
		currencies.add("USD");
		currencies.add("INR");
		currencies.add("CAD");
		currencies.add("YEN");
		currencies.add("AUD");
		currencies.add("NIT");
		
		currencies.forEach(c -> System.out.println(c));
		

	}

}
