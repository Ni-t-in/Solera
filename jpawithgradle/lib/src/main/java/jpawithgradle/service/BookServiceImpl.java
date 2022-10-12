package jpawithgradle.service;

import java.util.List;

import jpawithgradle.dao.BookDAO;
import jpawithgradle.dao.BookDAOImpl;
import jpawithgradle.entities.Book;

public class BookServiceImpl implements BookService {

	private BookDAO bookDAO = new BookDAOImpl();
	
	@Override
	public List<Book> getAllBooks() {
		return bookDAO.getAllBooks();	
	}

	@Override
	public List<Book> getBookByAuthor(String author) {
		return bookDAO.getBookByAuthor(author);
	}

	@Override
	public Book getBookById(Long id) {
		return bookDAO.getBookById(id);
	}

	@Override
	public void addBook(Book book) {
		bookDAO.addBook(book);
	}

	@Override
	public String deleteBookById(Long id) {
		return bookDAO.deleteBookById(id);
	}

	@Override
	public Book getBookByTitle(String title) {
		return bookDAO.getBookByTitle(title);
	}

	@Override
	public String updateBook(Book book) {
		return bookDAO.updateBook(book);
	}

}
