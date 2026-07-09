
		/* Write a program called IfLogicalOps. Take in two integer values from the user; 
		 * store in num1 and num2. Using one if statement, determine if 
		 
		a. Both numbers are negative 
		b. Both numbers are positive
		 c. At least one of the numbers is 0 
		d. At least one of the numbers is negative*/

	// start program//
		package excercisesB;

		import java.util.Scanner;
		
		public class IfLogicalOps {

			public static void main(String[] args) {
	// scanner object to take input from user
				
Scanner sc = new Scanner(System.in);   // scanner object to take input from user

 
//int num1, num2; // we can declare variables separately or in the same line as below
 System.out.print("Enter num1: ");
 int num1 = sc.nextInt();
 
 System.out.print("Enter num2: ");
  int num2 = sc.nextInt();
 
 if (num1 < 0 && num2 < 0) {
	 System.out.println("Both numbers are negative");
	 
	 
 } else if (num1 > 0 && num2 > 0) {
	 System.out.println("Both numbers are positive");
	 System.out.println();
	 
 } else if (num1 == 0 || num2 == 0) {
	 System.out.println("At least one of the numbers is 0");
	 
 } else if (num1 < 0 || num2 > 0) {
	 System.out.println("At least one of the numbers is negative");
 } else {
	 System.out.println("Error: Invalid numbers");
	 
 }

			}
			
			
				
				
}
