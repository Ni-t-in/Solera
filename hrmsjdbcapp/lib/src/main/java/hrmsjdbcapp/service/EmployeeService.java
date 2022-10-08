package hrmsjdbcapp.service;

import java.util.List;

import hrmsjdbcapp.exceptions.EmployeeNotFoundException;
import hrmsjdbcapp.model.Employee;

public interface EmployeeService {
		//create
		public Employee addEmployee(Employee employee);
		
		//retrieve
		public Employee getEmployeeById(Integer id) throws EmployeeNotFoundException;
		
		//Update
		public Employee updateEmployee(Employee employee,Integer id) throws EmployeeNotFoundException;
		
		//delete
		public String deleteEmployee(Integer id) throws EmployeeNotFoundException;
		
		//retrieve all
		public List<Employee> getAllEmployees();
		
}
