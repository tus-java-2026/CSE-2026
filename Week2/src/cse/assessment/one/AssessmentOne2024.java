package cse.assessment.one;

import java.util.Scanner;

public class AssessmentOne2024 {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		 allowedToVote();
		//question2(); 
		//question3();	
	}
	
	
	private static void allowedToVote() {

		int age;
		boolean citizenship;

		System.out.println("Check if you can vote: " );


		System.out.print("Enter your age : ");
		age = sc.nextInt();

		System.out.print("Enter your citizenship(True/False): ");
		citizenship = sc.nextBoolean();


		if(age == 18  && citizenship)
		{
			System.out.println("you are elegible to vote!");

		}
		else {

			System.out.println("you are not elegible to vote!");
		}
		sc.close();

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



//Switch statement//

//public static void myCalculator(int x, String string, int y) {
//
//	switch (string) {
//	case "+":
//		System.out.println(x + " plus " + y + " is " + (x+y));
//		break;
//	case "-":
//		System.out.println(x + " minus " + y + " is " + (x-y));
//		break;
//	case "*":
//		System.out.println(x + " times " + y + " is " + (x*y));
//		break;               
//	case "/":
//		System.out.println(x + " divided by " + y + " is " + (x/y));
//		break;
//
//	default:
//		System.out.println("Invalid Operation");
//
//	}
//
//}

//QUESTION 3//


public static void question3() {
	System.out.print("Enter a character: ");
	char inputChar = sc.next().charAt(0);
	myChar(inputChar);
}


public static void myChar(char inputChar) {
	if (Character.isDigit(inputChar)) {
		System.out.println("You entered a digit");
	}else if(Character.isLetter(inputChar)){
		inputChar = Character.toLowerCase(inputChar);
		if(inputChar == 'a' || inputChar == 'e' || inputChar == 'i' || inputChar == 'o' || inputChar == 'u')  {
			System.out.println("You entered a vowel");
		}
		else {
			System.out.println("You entered a consonant");
		}
	} else {
		System.out.println("You entered a special  character");
	}

}
}

//import java.util.Scanner;
//
//public class CharacterCheck {
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter a single character: ");
//        char ch = sc.next().charAt(0);
//
//        myChar(ch);
//
//        sc.close();
//    }
//
//    public static void myChar(char ch) {
//
//        ch = Character.toLowerCase(ch);
//
//        if (Character.isDigit(ch)) {
//            System.out.println("You entered a digit");
//        } 
//        else if (Character.isLetter(ch)) {
//
//            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//                System.out.println("You entered a vowel");
//            } 
//            else {
//                System.out.println("You entered a consonant");
//            }
//
//        } 
//        else {
//            System.out.println("You entered a special character");
//        }
//    }
//}
//
//
//





