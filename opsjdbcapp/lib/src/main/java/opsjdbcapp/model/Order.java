package opsjdbcapp.model;

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
public class Order {
	Integer orderId;
	Integer prodId;
	Integer custId;
	Float quantity;
//	Integer custId;
//	Integer prodId;
//	Float quantity;
//	Float amount;
//	
//	Order(Integer cId,Integer pId,Float qty,Float amt){
//		this.custId = cId;
//		this.prodId = pId;
//		this.quantity = qty;
//		this.amount = amt;
//	}
}
