package hrmsjdbcapp.ui;

import java.time.LocalDate;

import hrmsjdbcapp.dao.EmployeeDAO;
import hrmsjdbcapp.dao.EmployeeDAOImpl;
import hrmsjdbcapp.exceptions.EmployeeNotFoundException;
import hrmsjdbcapp.model.Employee;
import hrmsjdbcapp.service.EmployeeService;
import hrmsjdbcapp.service.EmployeeServiceImpl;

public class HRMSMainApp {

	public static void main(String[] args) {
		
//		EmployeeService empImpl = new EmployeeServiceImpl();
////		empImpl.addEmployee(emp);
//		Employee update = new Employee();
//		update.setName("Radhe");
//		update.setSalary(1000d);
//		update.setDateOfBirth(LocalDate.of(1990, 01, 3));
//		
//		try {
//			empImpl.updateEmployee(update,2);
//		} catch (EmployeeNotFoundException e) {
//			e.printStackTrace();
//		}
//		
//		System.out.println(empImpl.getAllEmployees());
		
		Employee m = new Employee();
		m.setDateOfBirth(LocalDate.of(2000, 5, 8));
		m.setId(1);
		m.setName("Nitin");
		m.setSalary(5000.56);
		
		EmployeeDAO amp = new EmployeeDAOImpl();
		amp.insertAll(m);
		
		System.out.println(amp.getAllEmployees());

	}

}
