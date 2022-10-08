package hrmsjdbcapp.service;

import java.util.List;

import hrmsjdbcapp.dao.EmployeeDAO;
import hrmsjdbcapp.dao.EmployeeDAOImpl;
import hrmsjdbcapp.exceptions.EmployeeNotFoundException;
import hrmsjdbcapp.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public Employee addEmployee(Employee employee) {
		EmployeeDAO employeeDao = new EmployeeDAOImpl();
		Employee dummy =  employeeDao.addEmployee(employee);
		return dummy;
	}

	@Override
	public Employee getEmployeeById(Integer id) throws EmployeeNotFoundException {
		EmployeeDAO employeeDao = new EmployeeDAOImpl();
		return employeeDao.getEmployeeById(id);
	}

	public Employee updateEmployee(Employee employee,Integer id) throws EmployeeNotFoundException {
		EmployeeDAO employeeDao = new EmployeeDAOImpl();
		return employeeDao.updateEmployee(employee, id);
	}

	@Override
	public String deleteEmployee(Integer id) throws EmployeeNotFoundException {
		EmployeeDAO employeeDao = new EmployeeDAOImpl();
		return employeeDao.deleteEmployee(id);
	}

	@Override
	public List<Employee> getAllEmployees() {
		EmployeeDAO employeeDao = new EmployeeDAOImpl();
		return employeeDao.getAllEmployees();
	}

}
