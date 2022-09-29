package daythree.string;

import java.util.Arrays;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		e1.setEmpId(1);
		e2.setEmpId(1);
		
		System.out.println(e1.equals(e2));
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		Arrays.sort(arr);
		
		int[] newArr = Arrays.copyOf(arr,arr.length);

	}

}
