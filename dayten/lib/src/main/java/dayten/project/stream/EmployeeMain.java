package dayten.project.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department marketing = new Department(1,"Marketing");
        Department finance = new Department(2,"Finance");
        Department informationTech = new Department(3,"IT");
        Department operations = new Department(4,"Operations");
        
        Employee emp1 =new Employee(1,"Rakesh",marketing,15000.00);
        Employee emp2 =new Employee(2,"Rajesh",finance,15500.00);
        Employee emp3 =new Employee(3,"Ram",marketing,25000.00);
        Employee emp4 =new Employee(4,"Raja",operations,15500.00);
        Employee emp5 =new Employee(5,"Kumar",marketing,45000.00);
        Employee emp6 =new Employee(6,"Sita",finance,65500.00);
        Employee emp7 =new Employee(7,"Geeta",informationTech,35000.00);
        Employee emp8 =new Employee(8,"Neeta",operations,11500.00);
        
        List<Employee> empList = new ArrayList<Employee>();
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.add(emp4);
        empList.add(emp5);
        empList.add(emp6);
        empList.add(emp7);
        empList.add(emp8);
        
        Map<Department, List<Employee>> groupedEmployee = empList.stream().collect(Collectors.groupingBy(Employee :: getDepartment));
        System.out.println(groupedEmployee);
        
        System.out.println("-----------*----------------");
        
        Map<Double,List<Employee>> groupBySalary = empList.stream().collect(Collectors.groupingBy(Employee :: getSalary));
        System.out.println(groupBySalary);
        
        System.out.println("-----------------*------------");
        
        DoubleSummaryStatistics summaryStats = empList.stream().collect(Collectors.summarizingDouble(e -> e.getSalary()));
        System.out.println(summaryStats);
        
        List<Integer> number = Arrays.asList(2,2,2,2,2,2,2,2);
        System.out.println(number.stream().allMatch(x -> x==5));
        System.out.println(number.stream().anyMatch(x -> x>2));
        System.out.println(number.stream().allMatch(x -> x==2));
        System.out.println(number.stream().noneMatch(x -> x>2));

	}

}
