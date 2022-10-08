package hrmsjdbcapp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Address {
	
	private Integer id;
	private Integer houseNo;
	private String state;
	private String city;
	private String country;
	private Long zipCode;
	
}
