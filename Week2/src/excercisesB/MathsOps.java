
/*Write a program called MathsOps. Take in two integer values from the user; 
store in num1 and num2. Using “good” variable names/indentation,  calculate the sum, product, difference and quotient 
of the two numbers. Output your results. In the format: The sum of 3 and 5 is 8 (assuming 3 and 5 are typed in). 
Ensure that you do not divide by 0 (as this will cause an exception i.e. a runtime error)*/



package excercisesB;

import java.util.Scanner;

public class MathsOps {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int num1, num2;
		int sum;
		int product;
		int differance;
		int quotient;
		
	System.out.print("Enter num1: ");
	num1= sc.nextInt();
	
	System.out.print("Enter num2: ");
	num2= sc.nextInt();

		sum = num1 + num2;
		product= num1 * num2;
		differance= num1 - num2;
		//quotient= num1 / num2;
		
		System.out.println("My sum is: " + sum);

		System.out.println("Productt of my numnbers is " + product);

		System.out.println("The diffrence of " + num1 + " and " + num2 + " is " +  differance);
		
		if (num2 != 0) {
			quotient = num1 / num2;
			System.out.println("The quotient of " + num1 + " and " + num2 + " is " + quotient);
		}
		
	else {
		System.out.println("Error: quotient can not divide by zero.");
	}
}
}
