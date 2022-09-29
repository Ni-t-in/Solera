/**
 * 
 */
package dayone.helloworld;

import java.time.LocalDate;

/**
 * @author Nitin.Mankar
 * this class is hello world program to display hello world message
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		Adress add = new Adress();
		
		emp.setDateOfBirth(LocalDate.now());
		emp.setEmpId(1);
		emp.setName("Mukesh");
		emp.setSalary(600000.0d);
		
		add.setAdressId(69);
		add.setCity("Indore");
		add.setState("Madhya Pradesh");
		add.setCountry("India");
		add.setPinCode(454775);
		
		Employee empTwo = new Employee(1,"Mukku",600000.0,LocalDate.now());
		Adress addTwo = new Adress(433,"Chennai","Tamil Nadu","India",12345);
		
		System.out.println(emp + "\n" + empTwo);
		System.out.println(add + "\n" + addTwo);
		
		String by = "4^6";
		String[] ab = by.split("^");
		System.out.println(ab[0] + " " + ab[2]);
		
	}

}
