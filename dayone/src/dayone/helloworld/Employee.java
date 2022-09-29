package dayone.helloworld;

import java.time.LocalDate;

public class Employee {

	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int empId, String name, double salary, LocalDate dateOfBirth) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.dateOfBirth = dateOfBirth;
	}
	private int empId;
	private String name;
	private double salary;
	private LocalDate dateOfBirth;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + ", dateOfBirth=" + dateOfBirth
				+ "]";
	}
	
	
}
