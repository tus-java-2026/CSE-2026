package cse.assessment.one;

import java.util.Scanner;

public class AssessmentOne2024 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

		//question1();
		question2(); 
		//question3();	
	}

	public static void question2()
	{
		System.out.println("please enter two whole numbers and get some operations");
		System.out.print("enter number1:");
		int num1 = sc.nextInt();
		System.out.print("enter number2: ");
		int num2 = sc.nextInt();
		System.out.print("which opperation you want (+,-,*,/) ?: ");
		String op = sc.next();



		if (op.equals("/") && num2 == 0 ) {
			System.out.println("can not devide by zero");
		}else {

			myCalculator(num1,op, num2);
		}

	}

	private static void myCalculator(int num1, String op, int num2) {

		if (op.equals("+")) {
			System.out.println(num1 + " plus " + num2 + " is " + (num1 + num2));
		} 
		else if (op.equals("-")) {
			System.out.println(num1 + " minus " + num2 + " is " + (num1 - num2));
		} 
		else if (op.equals("*")) {
			System.out.println(num1 + " times " + num2 + " is " + (num1 * num2));
		} 
		else if (op.equals("/")) {
			System.out.println(num1 + " divided by " + num2 + " is " + (num1 / num2));
		} 
		else {
			System.out.println("Invalid Operation");
		}
	}


}





