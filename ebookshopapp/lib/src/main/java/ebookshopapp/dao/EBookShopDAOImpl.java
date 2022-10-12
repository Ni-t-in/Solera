package ebookshopapp.dao;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import ebookshopapp.entities.Book;
import ebookshopapp.entities.Customer;
import ebookshopapp.entities.Order;

public class EBookShopDAOImpl implements EBookShopDAO {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("ebookshopapp");
	EntityManager em = emf.createEntityManager();
	
	@Override
	public String addBook(Book book) {
		em.getTransaction().begin();
		em.persist(book);
		em.getTransaction().commit();
		return "Book " + book.getBookTitle() + " added sucessfully.";
	}

	@Override
	public String addCustomer(Customer customer) {
		em.getTransaction().begin();
		em.persist(customer);
		em.getTransaction().commit();
		return "Customer  " + customer.getCustomerName() + " added successfully.\nOrder id : " + customer.getCustomerId() + " .";
	}

	@Override
	public String placeOrder(Integer customerId,List<Integer> books) {
		Customer custo1 = em.find(Customer.class, customerId);
		Order order1 = new Order();
		Set<Book> bookSet = new HashSet<>();
		for(int id : books) {
			Book book1 = em.find(Book.class, id);
			bookSet.add(book1);
			book1.addOrder(order1);
			em.persist(book1);
		}
		
		order1.setBooks(bookSet);
		order1.setCustomer(custo1);
		order1.setOrderDate(new Date());
		
		em.getTransaction().begin();
		em.persist(order1);
		em.getTransaction().commit();
		
		return "Order placed sucessfully.\nOder id : " + order1.getOrderId() + " .";
	}

	@Override
	public void getOrderList(Integer customerId) {
		Customer custo1 = em.find(Customer.class, customerId);
		for(Order order : custo1.getOrders()) {
			System.out.println("Order Id : " + order.getOrderId() + "\n" + order.getBooks());
			System.out.println();
		}
	}

	@Override
	public void getAllBook() {
		TypedQuery<Book> tq = em.createNamedQuery("getAllBooks", Book.class);
		List<Book> lst = tq.getResultList();
		System.out.println(lst);
	}

	@Override
	public void getAllCustomer() {
		TypedQuery<Customer> tq = em.createNamedQuery("getAllCustomer", Customer.class);
		List<Customer> lst = tq.getResultList();
		System.out.println(lst);
	}
	
}
