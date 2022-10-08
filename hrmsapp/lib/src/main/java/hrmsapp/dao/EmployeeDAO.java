package hrmsapp.dao;

import hrmsapp.exceptions.EmployeeNotFoundException;
import hrmsapp.model.Employee;

public interface EmployeeDAO {

	//create
	public Employee addEmployee(Employee employee);
	
	//retrieve
	public Employee getEmployeeById(Integer id) throws EmployeeNotFoundException;
	
	//Update
	public Employee updateEmployee(Employee employee,Integer id) throws EmployeeNotFoundException;
	
	//delete
	public String deleteEmployee(Integer id) throws EmployeeNotFoundException;
}
