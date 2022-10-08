package hrmsapp.model;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode

public class Employee implements Comparable{
	
	private Integer id;
	private String name;
	private LocalDate dateOfBirth;
	private Double salary;
	private Address address;
	
	@Override
	public int compareTo(Object o) {
		if(this.id == ((Employee)o).getId()) {
			return 0;
		}
		else if(this.id > ((Employee)o).getId()) {
			return 1;
		}
		else {
			return -1;
		}
	} 
}
