

/*Write a program called Modulus. Take in two integer values from the user;
 *  store in x and y. Using the modulus operator (%), determine if x is a multiple of y.
 */
package excercisesB;

import java.util.Scanner;

public class Modulus {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
	int x; 
	int y;
	
    
		System.out.print("Enter integer x: " );
	     x =sc.nextInt();
	     System.out.print("Enter integer y: " );
	     y =sc.nextInt();
	     
	
	     if ( y == 0) /* we can also do this program only one if/else statement which is the very simple 
	    	           without using exception handling */
	     {
	             System.out.println("This is not a valid input. y cannot be zero.");
	     }
	     else if (x%y == 0)
	     {
	        	 //System.out.println("Its an Error");
	             System.out.println(x + " is  a multiple of " + y);
	     } 
	    else {
	    	System.out.println(x + " is not a multiple of " + y);
	    }
	          
	}
}




	


	
	


