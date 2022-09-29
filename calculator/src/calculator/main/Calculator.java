package calculator.main;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import calculator.exception.Equation_Incomplete;
import calculator.exception.Invalid_Operator;
import calculator.exception.Invalid_Value;
import calculator.exception.Zero_Division;
import calculator.runtimepolymorphism.Arithmetic;
import calculator.runtimepolymorphism.Expression_Evaluator;

public class Calculator {

	public static void main(String[] args) throws Equation_Incomplete, NumberFormatException, Zero_Division, Invalid_Operator, Invalid_Value {

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] value = input.split(" ");

		if(checkValid(value[value.length-1])) {
			throw new Equation_Incomplete("Incomplete Equation : Unused operator \""+ value[value.length-1] + "\" at end of equation");
		}

		preCalculation(value);

		checkValidation(value);

		double result = Calculation(value);

		System.out.println(result);

	}



	private static void checkValidation(String[] value) throws Invalid_Value, Invalid_Operator {
		Pattern pat = Pattern.compile("[0-9]");
		Pattern patDup = Pattern.compile("[/+/*///%/-]");
		for(int i = 0; i < value.length; i++) {
			Matcher mat = pat.matcher(value[i]);
			Matcher matDup = patDup.matcher(value[i]);
			if(i%2 == 0 && !mat.find()) {
				throw new Invalid_Value("Input entered \"" + value[i] + "\" is not a valid value");
			}
			else if(i%2 != 0 && !matDup.find()) {
				throw new Invalid_Operator("Operator \"" + value[i] + "\" is not a valid operator");
			}
		}	
	}

	public static double Calculation(String[] elements) throws NumberFormatException, Zero_Division {

		Arithmetic arith = new Arithmetic();
		Pattern operators = Pattern.compile("[/+/*///%/-]");
		double digit = 0;
		for(int i = 0; i < elements.length; i++) {
			Matcher match = operators.matcher(elements[i]);
			if(match.matches()) {
				if(checkValid(elements[i+1])) continue;
				switch(elements[i]) {
				case "+":
					digit = arith.addition(digit, Double.parseDouble(elements[++i]));
					break;
				case "-":
					digit = arith.subtraction(digit, Double.parseDouble(elements[++i]));
					break;
				case "/":
					digit = arith.division(digit, Double.parseDouble(elements[++i]));
					break;
				case "*":
					digit = arith.multiplication(digit, Double.parseDouble(elements[++i]));
					break;
				case "%":
					digit = arith.modulus(digit, Double.parseDouble(elements[++i]));
					break;
				}
			}
			else {
				if(!match.matches()) digit = Double.parseDouble(elements[i]);
			}
		}

		return digit;
	}

	public static boolean checkValid(String dot) {
		Pattern operators = Pattern.compile("[/+/*///%/-]");
		Matcher match = operators.matcher(dot);

		if(match.matches()) return true;

		return false;
	}

	public static void preCalculation(String[] input) {
		Pattern pat = Pattern.compile("[sqrt|log|^|abs|sin|cos|tan|cosec|sec|cot]");

		for(int i = 0; i < input.length; i++) {
			Matcher mat = pat.matcher(input[i]);
			if(mat.find()) performOperation(input,i);
		}
	}

	public static void performOperation(String[] input, int idx) {
		Expression_Evaluator eval = new Expression_Evaluator();
		Pattern pat = Pattern.compile("[/^]");
		Matcher mat = pat.matcher(input[idx]);
		if(mat.find()) {
			input[idx] = eval.square(input[idx]);
		}
		else if(input[idx].equals("cosec")) {
			input[idx] = eval.cosec(input[idx]);
		}
		else {
			String init = input[idx];
			if(init.length() >= 3) {
				init = input[idx].substring(0, 3);
			}
			switch(init) {
			case "sqr":
				input[idx] = eval.sqroot(input[idx]);
				break;
			case "log":
				input[idx] = eval.logarithmic(input[idx]);
				break;
			case "abs":
				input[idx] = eval.absolute(input[idx]);
				break;
			case "sin":
				input[idx] = eval.sine(input[idx]);
				break;
			case "cos":
				input[idx] = eval.cosec(input[idx]);
				break;
			case "tan":
				input[idx] = eval.tangent(input[idx]);
				break;
			case "sec":
				input[idx] = eval.sec(input[idx]);
				break;
			case "cot":
				input[idx] = eval.cot(input[idx]);
				break;
			}
		}

	}
}
