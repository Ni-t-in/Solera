package dayten.project.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import dayten.project.Order;

public class MapDemo {

	public static void main(String[] args) {
		
		List<String> words = Arrays.asList("Hero","Zero","Kuro");
		words.stream().map(str -> str.length()).forEach(System.out :: println);
		System.out.println("--------------*-------------");
		List<Integer> counts = words.stream().map(str -> str.length()).collect(Collectors.toList());
		System.out.println(counts);
		System.out.println("--------------*-------------");
		counts.forEach(System.out :: println);
		
		Order order1= new Order("AUD",150000.00);
        Order order2 = new Order("INR",5000.00);
        Order order3 = new Order("USD",150000.00);
        Order order4 = new Order("EUR",25000.00);
        Order order5 = new Order("AUD",8000.00);
        Order order6 = new Order("EUR",50000.00);
        
        List<Order> orderList = new ArrayList<Order> ();
        orderList.add(order1);
        orderList.add(order2);
        orderList.add(order3);
        orderList.add(order4);
        orderList.add(order5);
        orderList.add(order6);
        
        System.out.println("--------------*-------------");
        orderList.stream().filter(o -> (o.getCurrency().equals("AUD"))).map(Order :: getAmount).forEach(System.out :: println);
        System.out.println("--------------*-------------");
        List<Double> amount = orderList.stream().filter(o -> (o.getCurrency().equals("AUD"))).map(Order :: getAmount).collect(Collectors.toList());
        System.out.println(amount);
        System.out.println("--------------*-------------");
        Double total = orderList.stream().filter(o -> o.getCurrency().equals("AUD")).map(Order :: getAmount).reduce(0.0,(x,y) -> x+y);
        System.out.println(total);
        System.out.println("--------------*-------------");
        System.out.println(orderList.stream().filter(o -> o.getCurrency().equals("EUR")).min(Comparator.comparing(Order :: getAmount)));
        System.out.println("--------------*-------------");
        System.out.println(orderList.stream().filter(o -> o.getCurrency().equals("EUR")).max(Comparator.comparing(Order :: getAmount)));
        System.out.println("--------------*-------------");
        System.out.println(orderList.stream().filter(o -> o.getCurrency().equals("EUR")).count());
	}

}
