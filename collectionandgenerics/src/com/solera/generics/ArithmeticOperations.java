package com.solera.generics;

import java.util.List; 
import java.util.Vector;

import com.solera.exceptions.IndexOutOfBoundsException; 

public class ArithmeticOperations 
{ 

	public static <T extends Number> Number add(T t1, T t2) 
	{ return (t1.doubleValue() + t2.doubleValue()); } 

	public static <T extends Number> Number add(List<? extends Number> list) 
	{ 
		double d = 0; 
		for (int i = 0; i < list.size(); i++) 
			d += list.get(i).doubleValue(); 

		return d; 
	} 

	public static void dumpList(List<?> list) 
	{ 
		System.out.println("List dump with unbounded wildcard:"); 
		for (int i = 0; i < list.size(); i++) 
			System.out.println(list.get(i)); 
	} 
	
	public static float add(float f1,float f2)
	{
		return f1 + f2;
	}
	
	public static float subtract(float f1,float f2)
	{
		return f1 - f2;
	}
	
	 public static <T> T[] swap(T [] list, int firstPos, int secondPos) throws IndexOutOfBoundsException {
		
		 if(firstPos > list.length || firstPos < 0 || secondPos > list.length || secondPos < 0 ) {
			 throw new IndexOutOfBoundsException("Index out of bound for given index");
		 }
		 
		T num = list[firstPos];
		T num1 = list[secondPos];
		list[firstPos] = num1;
		list[secondPos] = num;
		return list;
	 }

	
	public static void main(String[] args) 
	{ 

		Integer i1 = 34, i2 = 43; 
		System.out.println("Add with generic method: " + 
				ArithmeticOperations.add(i1, i2)); 
		Float f1 = 12.56f, f2 = 3.6778f; 
		System.out.println("Add with generic method: " + 
				ArithmeticOperations.add(f1, f2)); 
		// Adding 2 integers through a list
		Vector<Number> l = new Vector<Number>(); 
		l.add(34); 
		l.add(43);
		l.add(99);
		l.add(64);
		System.out.println("Add with upper bounded wildcard: " + 
				ArithmeticOperations.add(l));
		ArithmeticOperations.dumpList(l); 
	} 
}
