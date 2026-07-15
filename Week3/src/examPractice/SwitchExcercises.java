package examPractice;

import java.util.Scanner;

public class SwitchExcercises {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		//switchOnAString(); 
		//switchMethod();
		//switchChar();
		//switchSquareOrCube();
		//switchVowelOrConstant();
		switchDaysInMonths();
	}

	private static void switchDaysInMonths() {


		System.out.print("Enter year: ");
		int year = sc.nextInt();

		System.out.print("Enter month (1..12): ");
		final int month = sc.nextInt();

		switch (month) {

		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("Number of days: 31");
			break;

		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("Number of days: 30 ");
			break;

		case 2:
			// for calculating leap year using if/else statement

			if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
				System.out.println("Number of days: 29");
			} else {
				System.out.println("Number of days: 28");
			}
			break;

		default:
			System.out.println("Invalid month number");
		}
	}

}


//	private static void switchVowelOrConstant() {
//
//		System.out.print("Enter a letter: ");
//		char ch = Character.toLowerCase(sc.next().charAt(0));
//
//		switch (ch) {
//		case 'a':
//		case 'e':
//		case 'i':
//		case 'o':
//		case 'u':
//
//			System.out.println(ch +  " is a vowel");
//			break;
//
//		default: // can we use if/else statement in default condition?
//			if (ch >= 'a' && ch <= 'z') {
//				System.out.println(ch + " is a consonant");
//			} else {
//				System.out.println(ch + " is invalid input.Please enter a character");
//
//			}
//		}
//	}
//}







//	private static void switchSquareOrCube() {
//
//
//		System.out.print("Enter a number (1..10): ");
//		int n = sc.nextInt();
//
//
//		if (n < 1 || n > 10) { // why use if?
//			System.out.println("Number is out of range");
//			return;
//		}
//
//		switch (n % 2) { // ?
//
//		case 0:
//			System.out.println("Square of " + n + " is " + (n * n));
//			break;
//
//		case 1:
//			System.out.println("Cube of " + n + " is " + (n * n * n));
//			break;
//		}
//	}
//}


//	private static void switchChar() {
//		
//		System.out.print("Enter number1: ");
//		double num1=sc.nextDouble();
//		
//		System.out.print("Enter number2: ");
//		double num2 =sc.nextDouble();
//
//		System.out.print("Enter a char: ");
//		char operator = sc.next().charAt(0);
//
//
//double result;
//	switch (operator) {
//		case '+':
//			result = num1 + num2;
//			System.out.println("The sum of two numbers is :" + result);
//			break;  
//		case '-':
//			result = num1 - num2;
//			System.out.println("The sub of two numbers is :" + result);
//			break;
//		case '*':
//			result = num1 * num2;	
//			System.out.println("The multi of two numbers is :" + result);
//			break;
//		case '/':
//			result= num1 / num2;
//			System.out.println("The division of two numbers is :" + result);
//			break;
//		default:
//			System.out.println("Invalid mathmetical operator");
//
//		}
//	}
//}
//	


//
//	private static void switchMethod() {
//
//		final int JANUARY= 1; 
//		final int FEBRUARY = 2;
//		final int MARCH = 3;
//		final int APRIL = 4;
//		final int MAY = 5;
//		final int JUNE = 6;
//
//		System.out.print("Enter a month (1-6): ");
//		int month = sc.nextInt();
//
//		switch(month) {
//		case JANUARY:
//			System.out.println("January");
//			break;
//
//		case FEBRUARY:
//			System.out.println("February");
//			break;
//
//		case MARCH:
//			System.out.println("March");
//			break;
//		case APRIL:
//			System.out.println("April");
//			break;
//		case MAY:
//			System.out.println("May");
//			break;
//		case JUNE:
//			System.out.println("June");
//
//			break;
//		default:
//			System.out.println("Invalid month");







//private static void switchOnAString() {
//
//	System.out.print( "Enter a name: ");
//	String name = sc.next();
//	name = name.toUpperCase();
//
//
//
//	switch (name) { 
//
//	case "JOHN":
//		System.out.println("Male");
//		break;
//	case "MARY":
//		System.out.println("Female");
//		break;
//
//	default:
//		System.out.println("its an error");
//	}
//}
//}
//
//





