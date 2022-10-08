package dayten.project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class OrderDemo {

	public static void main(String[] args) {
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
        
        Predicate<Order> predicate = o -> (o.getAmount() > 10000);
        
        orderList.stream().filter(predicate).forEach(System.out :: println);
        System.out.println("------------*-------------");
        orderList.stream().filter(o -> (o.getAmount() > 10000)).limit(2).forEach(System.out :: println);
        System.out.println("------------*-------------");
        orderList.stream().filter(o -> (o.getAmount() > 10000)).skip(2).forEach(System.out :: println);
        System.out.println("------------*-------------");
        List<Integer> list = Arrays.asList(1,12,2,45,21,35,48,454,6565,32121,78,996,1145,33,15);
        list.stream().filter(o -> (o > 30)).limit(5).forEach(System.out :: println);
        System.out.println("------------*-------------");
        list.stream().filter(o -> (o > 50)).skip(5).forEach(System.out :: println);
        System.out.println("------------*-------------");
        list.stream().sorted().forEach(System.out :: println);
        System.out.println("------------*-------------");
        orderList.stream().filter(o -> (o.getAmount() > 5000)).sorted(Comparator.comparing(Order :: getCurrency)).forEach(System.out :: println);
        
	}

}
