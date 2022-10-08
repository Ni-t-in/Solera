package daynineproject.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import daynineproject.order.Order;

public class StreamDemo {
	public static void main(String[] args) {
		
		Stream<Integer> streamInteger = Stream.of(10,20,30);
		streamInteger.forEach(System.out :: println);
		
		List<String> values = Arrays.asList("Hii","Hello","Bye");
		Stream<String> streamString = values.stream();
		
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
        
        System.out.println(orderList);
        System.out.println("-------------*------------------");
        orderList.stream().forEach(System.out :: println);

	}
}
