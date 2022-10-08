package hrmsapp.dao;

import java.util.Set;
import java.util.TreeSet;

import hrmsapp.exceptions.EmployeeNotFoundException;
import hrmsapp.model.Employee;
import lombok.ToString;

@ToString

public class EmployeeDAOImpl implements EmployeeDAO {

	private static Set<Employee> set = new TreeSet<Employee>();
	
	@Override
	public Employee addEmployee(Employee employee) {
		set.add(employee);
		return null;
	}

	@Override
	public Employee getEmployeeById(Integer id) throws EmployeeNotFoundException {
		for(Employee emp : set) {
			if(emp.getId() == id) {
				return emp;
			}
		}
		throw new EmployeeNotFoundException("Employee with id " + id + " do not exists"); 
	}

	@Override
	public Employee updateEmployee(Employee employee,Integer id) throws EmployeeNotFoundException{
		Employee empOne = null;
		boolean found = false;
		for(Employee emp : set) {
			if(emp.getId() == id) {
				found = true;
				empOne = emp;
			}
		}
		
		if(found == false) {
			throw new EmployeeNotFoundException("Employee with id " + id + " do not exists");
		}
		else {
			if(employee.getAddress() != null) empOne.setAddress(employee.getAddress());
			if(employee.getDateOfBirth() != null) empOne.setDateOfBirth(employee.getDateOfBirth());
			if(employee.getId() != null) empOne.setId(employee.getId());
			if(employee.getName() != null) empOne.setName(employee.getName());
			if(employee.getSalary() != null) empOne.setSalary(employee.getSalary());
		}
		return empOne;
	}

	@Override
	public String deleteEmployee(Integer id) throws EmployeeNotFoundException {
		for(Employee emp : set) {
			if(emp.getId() == id) {
				set.remove(emp);
			}
		}
		throw new EmployeeNotFoundException("Employee with id " + id + " do not exists"); 
	}

}
