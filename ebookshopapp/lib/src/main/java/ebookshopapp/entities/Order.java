package ebookshopapp.entities;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

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
@Table(name = "order_master")
public class Order {
	@Id
    @Column(name = "order_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Integer orderId;
    @Temporal(TemporalType.DATE)
    @Column(name = "order_date")
    private Date orderDate;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "book_orders", joinColumns = { @JoinColumn(name = "order_id") }, inverseJoinColumns = {
    @JoinColumn(name = "book_id") })
    @Exclude
    private Set<Book> books;
    
    @ManyToOne(cascade = CascadeType.ALL)//Owning side
    @JoinColumn(name = "customer_id")
    @Exclude
    private Customer customer;
    
}
