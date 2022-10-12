package jpaassociationandmapping.onetoonebi;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "address_bi")
public class AddressBi {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer adressId;
	private String street;
	private String city;
	private String state;
	private String zipCode;
	@OneToOne(mappedBy = "address") //inverse side
	private StudentBi student;
}
