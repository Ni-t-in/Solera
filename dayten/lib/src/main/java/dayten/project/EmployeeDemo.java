package dayten.project;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeDemo {

	public static void main(String[] args) {
		Employee e = new Employee(11, "Jyotika", 15500.00, "Marketing");
        Employee e1 = new Employee(12, "Nidhi", 25500.00, "IT");
        Employee e2 = new Employee(13, "Suman", 11500.00, "Finance");
        Employee e3 = new Employee(14, "Payas", 12500.00, "IT");
        Employee e4 = new Employee(15, "Aparna", 5500.00, "Marketing");
        Employee e5 = new Employee(16, "Anjali", 7500.00, "Operations");
        Employee e6 = new Employee(17, "Aditya", 19500.00, "Finance");
        Employee e7 = new Employee(18, "Ayush", 18500.00, "IT");


       List<Employee> listOfEmployee = new ArrayList<Employee>();
        listOfEmployee.add(e);
        listOfEmployee.add(e1);
        listOfEmployee.add(e2);
        listOfEmployee.add(e3);
        listOfEmployee.add(e4);
        listOfEmployee.add(e5);
        listOfEmployee.add(e6);
        listOfEmployee.add(e7);
        
        List<Double> salaryIT = listOfEmployee.stream().filter(o -> o.getDepartment().equals("IT")).map(o -> o.getSalary()*1.10).collect(Collectors.toList());
        System.out.println(salaryIT);
        
        
        List<Employee> inc = listOfEmployee.stream().filter(o -> o.getDepartment().equals("IT")).map(emp -> {emp.setSalary(emp.getSalary()*1.10);return emp;}).collect(Collectors.toList());
        inc.forEach(System.out :: println);
	}

}
