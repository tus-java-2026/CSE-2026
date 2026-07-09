package excercisesA;

import java.util.Scanner;
public class AssignmentTests {
	public static void main(String[] args) {
		
		
		/*1.	Write a program called AssignmentTests. Declare and initialize an integer x to 0. 
		 * Take in the x value from the user. Evaluate x, if x is between 1 and 5 inclusive 
		 * output the square of x; if x is between 6 and 10 inclusive output the cube of x; if x is less than or equal to 0
		 *  or greater than 10 then flag an error.
		 */
		
		
		// initialize variables
		int x =0;
		
		System.out.print("Enter integer :") ;
		
		Scanner sc = new Scanner(System.in);
		//int x = sc.nextInt(); (no need to declare the varible seperately)
		
		x = sc.nextInt();
		
		if (x >= 1 && x <= 5) {
			System.out.println("Input valuerange 1 ..5 : " + x*x);
		} else if (x >= 6 && x <= 10) {
			System.out.println("Input value range 6 ..10 : " + x*x*x);
		} else  {
			System.out.println("Error: x must be between 1 and 10 inclusive.");
		}
		sc.close();
	}

}
