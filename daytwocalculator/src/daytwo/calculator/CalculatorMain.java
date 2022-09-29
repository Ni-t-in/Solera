package daytwo.calculator;

import java.util.Scanner;

public class CalculatorMain {
	public static void options() {
		System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Modulus\n6.Exit");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculator operation = new Calculation();
		do {
			options();
			System.out.println("Enter your selection");
			int selection = sc.nextInt();
			if (selection == 6) Calculator.exit();
			System.out.println("Enter first number");
			int numone = sc.nextInt();
			System.out.println("Enter second number");
			int numtwo = sc.nextInt();
			switch(selection) {
			case 1:
				operation.addition(numone, numtwo);
				break;
			case 2:
				operation.subtraction(numone, numtwo);
				break;
			case 3:
				operation.multiplication(numone, numtwo);
				break;
			case 4:
				operation.division(numone, numtwo);
				break;
			case 5:
				operation.modulus(numone, numtwo);
				break;
			default:
				System.out.println("You have chosen wrong option");
			}
		}while(true);

	}

}
