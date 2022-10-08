package daynineproject.stream;

public class LazyOrder {

	public static void main(String[] args) {
		
		Order order = new Order();
		order.setAmount(11111.111);
		order.setCurrency("INR"); //Eager operation
		
		System.out.println(order);
		
		System.out.println(new Order("USD",1111.11)); //Lazy operation
		

	}

}
