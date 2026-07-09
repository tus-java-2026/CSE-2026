package excercisesA;

import java.util.Scanner;
public class AsciiValues {
	

	public static void main(String[] args) {
		/*Write a program called AsciiValues that loops until the user types in ‘x’ (a char). 
		For each character input, output the character itself e.g. 
		 * A but also its numeric Ascii value i.e. 65 (is the Ascii value for A).
		 */

//initialize variables//
		
		Scanner sc = new Scanner(System.in);
		char userInput;
		//int asciiValue;
		
// print out the prompt for the user to enter a character//
		
		System.out.print("Enter a character: ");
		 userInput = sc.next().charAt(0);
		 
// loop until the user types in 'x'//
		 
		 while (userInput != 'x') {
			int asciiValue =  userInput;
			 System.out.println("Ascii value of " +  userInput + " is " + asciiValue);
			 
	            System.out.print("Enter character:");
	            userInput = sc.next().charAt(0);
			 
				}


	}

}
