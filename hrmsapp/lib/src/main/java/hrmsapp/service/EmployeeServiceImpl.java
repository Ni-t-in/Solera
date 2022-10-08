package hrmsapp.service;

import hrmsapp.dao.EmployeeDAO;
import hrmsapp.dao.EmployeeDAOImpl;
import hrmsapp.exceptions.EmployeeNotFoundException;
import hrmsapp.model.Employee;

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

	@Override
	public Employee updateEmployee(Employee employee) throws EmployeeNotFoundException {
		EmployeeDAO employeeDao = new EmployeeDAOImpl();
		return employeeDao.updateEmployee(employee, null);
	}

	@Override
	public String deleteEmployee(Integer id) throws EmployeeNotFoundException {
		EmployeeDAO employeeDao = new EmployeeDAOImpl();
		return employeeDao.deleteEmployee(id);
	}

}
