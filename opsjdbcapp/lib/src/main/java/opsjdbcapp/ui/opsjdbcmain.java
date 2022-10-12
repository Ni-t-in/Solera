package opsjdbcapp.ui;

import opsjdbcapp.dao.OrderDAO;
import opsjdbcapp.dao.OrderDAOImpl;
import opsjdbcapp.model.Customer;
import opsjdbcapp.model.Order;
import opsjdbcapp.model.Product;
import opsjdbcapp.service.ServiceDAO;
import opsjdbcapp.service.ServiceDAOImpl;

public class opsjdbcmain {

	public static void main(String[] args) {
		
		ServiceDAO add = new ServiceDAOImpl();
//		
//		Product prod = new Product(2,"Jalebi",10f,"Sweet");
//		
//		System.out.println(add.addProduct(prod));
//		
//		Customer cust = new Customer(3,"Viplav",8889598871l);
//		
//		System.out.println(add.addCustomer(cust));
		
//		Order ord = new Order(3,3,3,2f);
		
//		System.out.println(add.placeOrder(ord));
		
		System.out.println(add.getOrderByOrderId(3));
		
//		System.out.println(add.updateOrder(1, 3));
		
//		System.out.println(add.getOrderByOrderId(1));
		

	}

}
