package jpawithgradle.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "book_master")  //Table name in db for this entity(optional)
@NamedQueries({
@NamedQuery(name="getAllBooks",query="SELECT book FROM Book book"),
@NamedQuery(name="getBookByAuthor",query="SELECT book FROM Book book where book.author=:author"),
@NamedQuery(name="getBookByTitle",query="SELECT book FROM Book book where book.bookTitle=:bookTitle"),
@NamedQuery(name="updateBook",query="Update Book book set author=:author,bookTitle=:bookTitle where book.id=:id")})
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "book_id") //Column name in db for this variable(optional)
	private Long id;
	@Column(name = "title")
	private String bookTitle;
	@Column(name = "author")
	private String author;
	@Column(name = "price")
	private Double price;
	
	
}
