package opsjdbcapp.service;

import opsjdbcapp.dao.OrderDAO;
import opsjdbcapp.dao.OrderDAOImpl;
import opsjdbcapp.model.Customer;
import opsjdbcapp.model.Order;
import opsjdbcapp.model.Product;

public class ServiceDAOImpl implements ServiceDAO {

	@Override
	public String addProduct(Product product) {
		OrderDAO prod = new OrderDAOImpl();
		return prod.addProduct(product);
	}

	@Override
	public String addCustomer(Customer customer) {
		OrderDAO cust = new OrderDAOImpl();
		return cust.addCustomer(customer);
	}

	@Override
	public String placeOrder(Order order) {
		OrderDAO ord = new OrderDAOImpl();
		return ord.placeOrder(order);
	}

	@Override
	public String getOrderByOrderId(Integer orderId) {
		OrderDAO get = new OrderDAOImpl();
		return get.getOrderByOrderId(orderId);
	}

	@Override
	public String updateOrder(Integer orderId, Integer prodId) {
		OrderDAO up = new OrderDAOImpl();
		return up.updateOrder(orderId, prodId);
	}

	@Override
	public String deleteOrder(Integer OrderId) {
		OrderDAO del = new OrderDAOImpl();
		return del.deleteOrder(OrderId);
	}

}
