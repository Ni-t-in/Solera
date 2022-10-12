package jpawithgradle.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import jpawithgradle.entities.Book;

public class BookDAOImpl implements BookDAO{
	
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpawithgradle");
	private EntityManager em = emf.createEntityManager();
	
	@Override
	public List<Book> getAllBooks() {
		TypedQuery<Book> tq = em.createNamedQuery("getAllBooks", Book.class);
		List<Book> lst = tq.getResultList();
		return lst;
	}

	@Override
	public List<Book> getBookByAuthor(String author) {
		TypedQuery<Book> tq = em.createNamedQuery("getBookByAuthor", Book.class);
		tq.setParameter("author", author);
		List<Book> lst = tq.getResultList();
		return lst;
	}

	@Override
	public Book getBookById(Long id) {
		em.getTransaction().begin();
		Book book = em.find(Book.class, id);
		em.getTransaction().commit();
		return book;
	}

	@Override
	public void addBook(Book book) {
		//Inserting data in database using persist method of EntityManager
		em.getTransaction().begin();
		em.persist(book);
		em.getTransaction().commit();
		
	}

	@Override
	public String deleteBookById(Long id) {
		em.getTransaction().begin();
		Book book = em.find(Book.class, id);
		if(book != null) {
			em.remove(book);
		}
		else {
			return "No book with such id";
		}
		em.getTransaction().commit();
		return "Book Deleted successfully";
		
	}

	@Override
	public Book getBookByTitle(String title) {
		TypedQuery<Book> tq = em.createNamedQuery("getBookByTitle", Book.class);
		tq.setParameter("bookTitle", title);
		Book book = tq.getSingleResult();
		return book;
	}

	@Override
	public String updateBook(Book book) {
		TypedQuery<Book> tq = em.createNamedQuery("updateBook", Book.class);
		if(book.getAuthor() != null) {
			tq.setParameter("author", book.getAuthor());
		}
		if(book.getBookTitle() != null) {
			tq.setParameter("bookTitle", book.getBookTitle());
		}
		
		return "Book updated successfully";
	}

}
