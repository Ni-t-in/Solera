package assignment3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Student implements Comparable<Student>{
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
	@Override
	public int compareTo(Student o1) {
		if(this.getCgpa() > o1.getCgpa()) {
			return -1;
		}
		else if(this.getCgpa() == o1.getCgpa()){
			if(this.getFname().compareTo(o1.getFname()) < 0) {
				return 1;
			}
			else if(this.getId() < o1.getId()) {
				return 1;
			}
		}
		return 0;
	} 
}

public class DecreasingSortMain {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students");
		int size = sc.nextInt();
		Student[] array = new Student[size];
		int id = 0;
		String fname = "";
		double cgpa = 0.0;
		System.out.println("Enter the data of student in following order seperated by space\nid firstname cgpa");
		for(int i = 0; i < size; i++) {
			id = sc.nextInt();
			fname = sc.next();
			cgpa = sc.nextDouble();
			array[i] = new Student(id,fname,cgpa);
		}
		
		Arrays.sort(array);
		
		for(Student x : array) {
			System.out.println(x.getFname());
		}
	}

}
