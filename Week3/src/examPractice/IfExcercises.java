package examPractice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IfExcercises {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

		// call method
		//ifmonth();
		//iflargerOfTwoNumbers();
		//ifGrade();
		//temperature(); 
		//ifLargest();
		ternaryOperator();

	}

	

	//private static void ifmonth() {
	//Scanner sc = new Scanner(System.in);

	//		final int JAN = 1, Fab=2, March= 3, April=4, May=5, June=6, July=7, Aug=8, Sept=9, Oct=10, Nov11, Dec=12;
	//		
	//		 try {
	//
	//	            System.out.print("Enter month (1-12): ");
	//	            int month = sc.nextInt();
	//
	//	            if (month == JAN) {
	//	                System.out.println("January");
	//	            } else if (month == Fab) {
	//	                System.out.println("February");
	//
	//	            } else if (month == March) {
	//	                System.out.println("March");
	//
	//	            } else if (month == April) {
	//	                System.out.println("April");
	//
	//	            } else if (month == May) {
	//	                System.out.println("May");
	//	            } else {
	//	            	System.out.println("Entery is out of range:" + month);
	//	            
	//	            }
	//		 }
	//
	//		 catch (InputMismatchException e){
	//			 System.out.println("Invalid entry. Please enter a whole number from 1 to 12.");

	// QUESTION 2 (nested if)

	//private static void iflargerOfTwoNumbers() {

	//			System.out.print("enter first number:");
	//			int x = sc.nextInt();
	//
	//			System.out.print(" Enter second number: ");
	//			int y = sc.nextInt();
	//
	//			if (x >= 0 && y >= 0) {
	//
	//			if (x > y) {
	//					System.out.println(x + " is > " + y);
	//				} else if (y > x) {
	//					System.out.println(y + " is > " + x);
	//				} else  {
	//					System.out.println(x + " is = " + y);
	//				}
	//
	//			} else {
	//				System.out.println("Negative values are not allowed");
	//				
	//				
	//				
	//simple if statement	:
	//		System.out.print("enter first number:");
	//		int x = sc.nextInt();
	//
	//		System.out.print(" Enter second number: ");
	//		int y = sc.nextInt();
	//
	//		if (x < 0 || y < 0) {
	//
	//			System.out.println("Negative values are not allowed; " + x + " " + y);
	//		} else if (x > y) {
	//			System.out.println(x + " is > " + y);
	//		}else if (y > x) {
	//			System.out.println(y + " is > " + y);
	//		}else {
	//			System.out.println(x + " is = " + y);
	//
	//			sc.close();
	//		}
	//	}
	//
	//
	//	// Question 3
	//
	//	private static void ifGrade() {
	//
	//		System.out.print("Enter mark : ");
	//		int grade = sc.nextInt();
	//
	//		if (grade < 0 || grade > 100 ) {
	//			System.out.println("Error in input: " + grade +" . Valid values are 0..100");
	//		} else if  (grade >= 70 ) {
	//			System.out.println("A");
	//		}else if  (grade >= 60 ){
	//			System.out.println("B");
	//		} else if  (grade >= 50 ) {
	//			System.out.println("C");
	//		}
	//		else if  (grade >= 40 ) {
	//			System.out.println("D");
	//		} else {
	//			System.out.println("Fail");	
	//		}
	//
	//	}


	//  question 4

	//	private static void temperature(){
	//
	//		try {
	//			System.out.print("Enter temprature : ");
	//			int tempt = sc.nextInt();
	//
	//			if (tempt >= -10 && tempt <= 2) {
	//				System.out.println("Very cold");
	//
	//			} else if (tempt >= 3 && tempt <=9) {
	//				System.out.println("Cold");
	//
	//			}else if  (tempt >= 10 && tempt <=14){
	//				System.out.println("Mild");
	//
	//			} else if  (tempt >= 15 && tempt <=20) {
	//				System.out.println("Warm");
	//
	//			} else if  (tempt >= 21 && tempt <=27) {
	//				System.out.println("Very warm");
	//
	//			} else  if(tempt >= 28 && tempt <=31) {
	//				System.out.println("Hot");	
	//
	//			} else {
	//				System.out.println("Extreme temprature");
	//
	//			}
	//		}
	//		catch (InputMismatchException e) {
	//			System.out.println("Exception caught...");



	//Question 5
//	private static void ifLargest()  {
//		try {	
//			System.out.print("Enter first number: ");
//			int num1 = sc.nextInt();
//
//			System.out.print("Enter second number: ");
//			int num2 = sc.nextInt();
//
//			System.out.print("Enter third number: ");
//			int num3 = sc.nextInt();
//
//			if (num1 > num2 ) {
//
//				if (num1 > num3) {
//					System.out.println("Largest number is :" + num1);
//				}else { 
//					System.out.println(" Largest number is :" + num3);
//
//				}	
//
//			} else {
//
//				if (num2 > num3) {
//					System.out.println("Largest number is : " + num2);
//				} else {
//					System.out.println("Largest number is :" + num3);
//
//
//				}
//			}
//		}catch (InputMismatchException e) {
//			System.out.println("Exception cought...");
//			System.out.println(e); // this is for to print the ecxeption
			
	//	sc.close();	

//		}
//	}




	// question 6:// ternaryOperator is a short way of write a simple if- else statement.

	private static void ternaryOperator() {
		
		
		//System.out.println("I'm Happy !");
		
		boolean isHappy = true;
		
		String mood = isHappy ? " I'm Happy!" : " I'm Said";
		
		
		System.out.println(mood);
		
   	System.out.print("Enter x :");
   	int x =sc.nextInt();
   	
   	System.out.print(" Enter y ");
   	int y=sc.nextInt();
   	
		int minval = x<y ? x : y;
				
			System.out.println("minval == " + minval);
		}
		
	}
	
		

	















