package jpawithgradle.ui;

import jpawithgradle.entities.Book;
import jpawithgradle.service.BookService;
import jpawithgradle.service.BookServiceImpl;

public class BookMain {

	public static void main(String[] args) {
		

		BookService bookService = new BookServiceImpl();
		Book book = new Book();
		book.setId(6l);
		book.setBookTitle("The Demon King");
		book.setAuthor("Nitin");
//		System.out.println(bookService.deleteBookById(4l));
		bookService.updateBook(book);
		System.out.println(bookService.getAllBooks());
//		System.out.println(bookService.getBookByTitle("King of Hell"));
		

	}

}
