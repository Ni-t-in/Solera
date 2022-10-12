package ebookshopapp.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
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
@NamedQueries({
	@NamedQuery(name = "getAllCustomer", query = "select customer from Customer customer")
})
@Table(name = "customer_master")
public class Customer {
	
	@Id
	@Column(name = "customer_id")
	private Integer customerId;
	@Column(name = "customer_name")
	private String customerName;
	@Column(name = "contact")
	private Long contactNumber;
	
	@OneToMany(mappedBy = "customer")
    @Exclude
    private Set<Order> orders;
	
}
