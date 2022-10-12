package jpaassociationandmapping.manytomany;

import java.util.Date;
import java.util.Set;



import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.ToString.Exclude;



/*
* Order is the owning entity, owning entity
* should have @JoinTable
*/
@Entity
@Table(name = "order_master")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Order {
    @Id
    @Column(name = "order_id")
    private Integer orderId;
    @Temporal(TemporalType.DATE)
    @Column(name = "order_date")
    private Date orderDate;
    @ManyToMany(cascade = CascadeType.ALL)
    /*
     * Columns order_id and product_id implicitly be composite primary key of the
     * join table
     */
    @JoinTable(name = "product_orders", joinColumns = { @JoinColumn(name = "order_id") }, inverseJoinColumns = {
    @JoinColumn(name = "product_id") })
    @Exclude
    private Set<Product> products;
}
