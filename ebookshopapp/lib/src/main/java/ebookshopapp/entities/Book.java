package ebookshopapp.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.ToString.Exclude;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "book_master")
@NamedQueries({
	@NamedQuery(name="getAllBooks",query = "Select book from Book book")
})
public class Book {
	@Id
	@Column(name = "book_id")
	private Integer bookId;
	@Column(name = "title")
	private String bookTitle;
	@Column(name = "price")
	private Double price;
	@Column(name = "author")
	private String author;
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "books")   //Owing side
	@Exclude
	private Set<Order> orders = new HashSet<>();
	
	public void addOrder(Order order) {
		this.orders.add(order);
	}
}
