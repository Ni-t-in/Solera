package hrmsjdbcapp.comparators;

import java.util.Comparator;

import hrmsjdbcapp.model.Employee;

public class SalaryComparator implements Comparator<Employee>{
	

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.getSalary() > o2.getSalary()) {
			return -1;
		}
		else if(o1.getSalary() < o2.getSalary()) {
			return 1;
		}
		return 0;
	}

}
