package daynineproject.function;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionDemo<I> {

	public static void main(String[] args) {
		
		Function <String,Integer> func = x -> x.length();
		Integer apply = func.apply("Solera");
		System.out.println(apply);
		
		Function <Integer,Integer> func2 = x -> x*2;
		Integer apply1 = func.andThen(func2).apply("Solera");
		System.out.println(apply1);
		
		FunctionDemo obj = new FunctionDemo();
		List<String> list = Arrays.asList("Ram","Mohan","Sohan","Shyam");
		
		Map<String,Integer> map = obj.convertListToMap(list,x->((String) x).length());
		System.out.println(map);

	}

	private <S,I> Map<S,I> convertListToMap(List<S> list, Function<S,I> func) {
		
		Map<S,I> map = new HashMap<>();
		for(S s : list){
			map.put(s, func.apply(s));
		}
		return map;
	}

}
