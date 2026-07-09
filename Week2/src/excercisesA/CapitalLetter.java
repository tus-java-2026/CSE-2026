package excercisesA;

import java.util.Scanner;
public class CapitalLetter {

	public static void main(String[] args) {
		
		/*1.	Write a program called CapitalLetter. Take in a letter (char) from the user. 
		 * Using methods from the Character wrapper class, determine if the letter entered was a capital letter or not.
		 *  If the letter is a capital letter output “Capital letter entered”; 
		 *  if a lowercase letter, output “Lowercase letter entered”; otherwise output an error 
		 *  (include the offending character in the error message).
		 */
		
		// initialize variable
		
		char x;
		
		System.out.print("Enter a letter (a-z A-Z) : ") ;
		
		// scanner to take in user input
		Scanner sc = new Scanner(System.in);
		
		// take in the first character of the user input
		 x = sc.next().charAt(0);
		
		 // check if the character is a letter(using if/else statements)
		
		if (Character.isUpperCase(x)) {
		    System.out.println("Capital letter entered");
		}
		    else if (Character.isLowerCase(x)) {
		    	System.out.println("LowerCase entered");
		    	
		    }
		    else { // if the character is not a letter, output an error message
		    	System.out.println("Error: " + x + " is not a letter");
		    }
		
	}
}
