package jpawithgradle.service;

import java.util.List;
import jpawithgradle.entities.Book;

public interface BookService {

	public List<Book> getAllBooks();
    public List<Book> getBookByAuthor(String author);
    public String deleteBookById(Long id);
    public Book getBookById(Long id);
    public void addBook(Book book);
    public Book getBookByTitle(String title);
    public String updateBook(Book book);
	
}
