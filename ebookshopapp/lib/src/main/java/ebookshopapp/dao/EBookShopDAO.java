package ebookshopapp.dao;

import java.util.List;

import ebookshopapp.entities.Book;
import ebookshopapp.entities.Customer;

public interface EBookShopDAO {
	
	public String addBook(Book book);
	public String addCustomer(Customer customer);
	public String placeOrder(Integer customerId,List<Integer> books);
	public void getOrderList(Integer customerId);
	public void getAllBook();
	public void getAllCustomer();
	
}
