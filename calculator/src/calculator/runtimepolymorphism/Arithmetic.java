package calculator.runtimepolymorphism;

import calculator.exception.Zero_Division;

public class Arithmetic extends Operation{

	@Override
	public double addition(double numOne, double numTwo) {
		return numOne + numTwo;
	}

	@Override
	public double subtraction(double numOne, double numTwo) {
		return numOne - numTwo;
	}

	@Override
	public double division(double numOne, double numTwo) throws Zero_Division {
		if(numTwo == 0) {
			throw new Zero_Division("Division by zero");
		}
		return numOne / numTwo;
	}

	@Override
	public double multiplication(double numOne, double numTwo) {
		return numOne * numTwo;
	}

	@Override
	public double modulus(double numOne, double numTwo) {
		return numOne % numTwo;
	}
	
}
