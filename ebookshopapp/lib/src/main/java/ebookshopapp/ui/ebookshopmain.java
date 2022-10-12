package ebookshopapp.ui;

import java.util.ArrayList;
import java.util.List;

import ebookshopapp.dao.EBookShopDAO;
import ebookshopapp.dao.EBookShopDAOImpl;
import ebookshopapp.entities.Book;
import ebookshopapp.entities.Customer;

public class ebookshopmain {

	public static void main(String[] args) {
		
		EBookShopDAO dao = new EBookShopDAOImpl();
		
//		Book book = new Book();
//		book.setAuthor("Hemant Singh");
//		book.setBookTitle("My Normal Life");
//		book.setBookId(1);
//		book.setPrice(25000d);
//		dao.addBook(book);
//		Book book1 = new Book();
//		book1.setAuthor("Shailendra Sahu");
//		book1.setBookTitle("Life sucks");
//		book1.setBookId(2);
//		book1.setPrice(5000000d);
//		dao.addBook(book1);
//		Book book2 = new Book();
//		book2.setAuthor("Aniket Gupta");
//		book2.setBookTitle("How to duble salary");
//		book2.setBookId(3);
//		book2.setPrice(40000d);
//		dao.addBook(book2);
//		Book book3 = new Book();
//		book3.setAuthor("Shailendra Sahu");
//		book3.setBookTitle("Life sucks part-2");
//		book3.setBookId(4);
//		book3.setPrice(5d);
//		dao.addBook(book3);
		
//		Customer customer = new Customer();
//		customer.setCustomerName("Aniket Gupta");
//		customer.setContactNumber(8329357963l);
//		customer.setCustomerId(1);
//		dao.addCustomer(customer);
//		
//		Customer customer1 = new Customer();
//		customer1.setCustomerName("Mohit Kumar");
//		customer1.setContactNumber(1234567891l);
//		customer1.setCustomerId(2);
//		dao.addCustomer(customer1);
		
//		List<Integer> lst = new ArrayList<>();
//		lst.add(1);
//		lst.add(3);
//		
//		dao.placeOrder(1, lst);
//		
//		List<Integer> lst1 = new ArrayList<>();
//		lst1.add(2);
//		lst1.add(4);
//		
//		dao.placeOrder(2, lst1);
		
		dao.getOrderList(2);
		
	}

}
