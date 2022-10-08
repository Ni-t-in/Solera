package daynineproject.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


public class PredicateDemo {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);
		evaluate(list,(c)->c%2==0);
		Predicate<Integer> predicate = (c) -> c%2 != 0;
		evaluate(list,predicate);

	}

	private static void evaluate(List<Integer> list, Predicate<Integer> predicate) {
		for(Integer x : list) {
			if(predicate.test(x)) {
				System.out.println(x);
			}
		}
		
	}

}
