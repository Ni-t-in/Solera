package hrmsapp.ui;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import hrmsapp.comparators.SalaryComparator;
import hrmsapp.dao.EmployeeDAOImpl;
import hrmsapp.model.Address;
import hrmsapp.model.Employee;

public class HRMSMainApp {

	public static void main(String[] args) {
		Address add = new Address();
		add.setId(1);
		add.setHouseNo(433);
		add.setCity("Indore");
		add.setState("Madhya Pradesh");
		add.setCountry("INDIA");
		add.setZipCode(454775l);
		
		Employee emp = new Employee();
		emp.setId(1);
		emp.setName("Ram");
		emp.setSalary(1500000.00);
		emp.setDateOfBirth(LocalDate.of(1999, 5, 6));
		emp.setAddress(add);
		
		
		Address addOne = new Address();
		addOne.setId(2);
		addOne.setHouseNo(434);
		addOne.setCity("Indore");
		addOne.setState("Madhya Pradesh");
		addOne.setCountry("INDIA");
		addOne.setZipCode(454775l);
		
		Employee empOne = new Employee();
		empOne.setId(2);
		empOne.setName("Mohan");
		empOne.setSalary(6500000.00);
		empOne.setDateOfBirth(LocalDate.of(1999, 3, 8));
		empOne.setAddress(addOne);
		
		Address addTwo = new Address();
		addTwo.setId(3);
		addTwo.setHouseNo(435);
		addTwo.setCity("Indore");
		addTwo.setState("Madhya Pradesh");
		addTwo.setCountry("INDIA");
		addTwo.setZipCode(454775l);
		
		Employee empTwo = new Employee();
		empTwo.setId(3);
		empTwo.setName("Ganga Thrasher");
		empTwo.setSalary(10000000.00);
		empTwo.setDateOfBirth(LocalDate.of(1999, 10, 2));
		empTwo.setAddress(addTwo);
		
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(emp);
		empList.add(empOne);
		empList.add(empTwo);
		
		EmployeeDAOImpl man = new EmployeeDAOImpl();
		man.addEmployee(emp);
		man.addEmployee(empOne);
		man.addEmployee(empTwo);
		
		Collections.sort(empList,new SalaryComparator());
		
		System.out.println(empList);
		

	}

}
