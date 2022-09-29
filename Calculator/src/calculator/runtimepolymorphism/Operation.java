package calculator.runtimepolymorphism;

import calculator.exception.Zero_Division;

public abstract class Operation {
	
	public abstract double addition(double numOne, double numTwo);
	public abstract double subtraction(double numOne, double numTwo);
	public abstract double division(double numOne, double numTwo) throws Zero_Division;
	public abstract double multiplication(double numOne, double numTwo);
	public abstract double modulus(double numOne, double numTwo);
	
}
