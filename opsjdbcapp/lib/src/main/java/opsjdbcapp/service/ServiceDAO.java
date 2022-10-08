package opsjdbcapp.service;

import opsjdbcapp.model.Customer;
import opsjdbcapp.model.Order;
import opsjdbcapp.model.Product;

public interface ServiceDAO {
	
	public String addProduct(Product product);
	
	public String addCustomer(Customer customer);
	
	public String placeOrder(Order order);
	
	public String getOrderByOrderId(Integer orderId);
	
	public String updateOrder(Integer orderId, Integer prodId);
	
	public String deleteOrder(Integer OrderId);
	
}
