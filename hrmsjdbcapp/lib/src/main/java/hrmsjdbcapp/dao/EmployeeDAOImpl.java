package hrmsjdbcapp.dao;

import java.sql.CallableStatement;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import hrmsjdbcapp.exceptions.EmployeeNotFoundException;
import hrmsjdbcapp.model.Employee;
import hrmsjdbcapp.utility.DBConnectionUtils;
import lombok.ToString;


@ToString

public class EmployeeDAOImpl implements EmployeeDAO {

	private static Set<Employee> set = new TreeSet<Employee>();

	@Override
	public Employee addEmployee(Employee employee) {
		Employee emp = new Employee();
		try {
			PreparedStatement preparedStatement=DBConnectionUtils.getDBConnection()
					.prepareStatement("insert into employee_master(id,name,salary,dateofbirth) values(?,?,?,?);");
			//Setting the parameters
			preparedStatement.setInt(1, employee.getId());
			preparedStatement.setString(2, employee.getName());
			preparedStatement.setDouble(3, employee.getSalary());
			preparedStatement.setDate(4, Date.valueOf(employee.getDateOfBirth()));
			int rs = preparedStatement.executeUpdate();
			if(rs>0) {
				return employee;
			}
		} catch (SQLException e) {    
			e.printStackTrace();
		}        
		return emp;
	}

	@Override
	public Employee getEmployeeById(Integer id) throws EmployeeNotFoundException {
		Employee emp = new Employee();
		try {
			PreparedStatement preparedStatement=DBConnectionUtils.getDBConnection()
					.prepareStatement("select * from employee_master where id=?;");
			//Setting the parameters
			preparedStatement.setInt(1, id);
			ResultSet rs = preparedStatement.executeQuery();
			if(rs.next()) {

				emp.setId(rs.getInt(1));
				emp.setName(rs.getString(2));
				emp.setSalary(rs.getDouble(3));
				emp.setDateOfBirth(rs.getDate(4).toLocalDate());
			}
			else {
				throw new EmployeeNotFoundException("Employee with id " + id + " is not present");
			}
		} catch (SQLException e) {    
			throw new EmployeeNotFoundException("Employee with id " + id + " is not present");
		}        
		return emp;
	}

	@Override
	public Employee updateEmployee(Employee employee,Integer id) throws EmployeeNotFoundException{
		try {
			PreparedStatement ps = DBConnectionUtils.getDBConnection().prepareStatement("Update employee_master set name = ?,salary = ?,dateofbirth = ? where id = ?;");
			ps.setString(1, employee.getName());
			ps.setDouble(2, employee.getSalary());
			ps.setDate(3, Date.valueOf(employee.getDateOfBirth()));
			ps.setInt(4, id);
			int up = ps.executeUpdate();
			if(up <= 0) {
				throw new EmployeeNotFoundException("Employee with id " + id + " is not present");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return employee;
	}

	@Override
	public String deleteEmployee(Integer id) throws EmployeeNotFoundException {
		try {
			PreparedStatement ps = DBConnectionUtils.getDBConnection().prepareStatement("delete from employee_master where id = ?");
			ps.setInt(1, id);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new EmployeeNotFoundException("Employee with id " + id + " do not exists"); 

		}
		return "Deletion successful";
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> employeeList = new ArrayList<Employee>();
		//Get Connection Object
		//Create Statement
		//Execute Query
		try {
			Statement staement = DBConnectionUtils.getDBConnection().createStatement();
			ResultSet rs= staement.executeQuery("select * from employee_master;");
			while(rs.next()) {
				Employee emp = new Employee();
				emp.setId(rs.getInt(1));
				emp.setName(rs.getString("name"));
				emp.setSalary(rs.getDouble("salary"));
				emp.setDateOfBirth(rs.getDate("dateofbirth").toLocalDate());
				employeeList.add(emp);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return employeeList;
	}

	@Override
	public void insertAll(Employee emp) {
		try {
			CallableStatement con = DBConnectionUtils.getDBConnection().prepareCall("call inserttable(?,?,?,?)");
			con.setInt(1, emp.getId());
			con.setString(2, emp.getName());
			con.setDouble(3, emp.getSalary());
			con.setDate(4, Date.valueOf(emp.getDateOfBirth()));
			int num = con.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
