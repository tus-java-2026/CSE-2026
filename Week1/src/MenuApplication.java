package weekOne;

import java.util.Scanner;

public class MenuApplication {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		The program should do the following:
//			•	Show a simple menu with three options:
//			    1. Say Hello
//			    2. Show your name
//			    3. Exit
//			•	Ask the user to enter a number between 1 and 3.
//			•	Use if-else statements to perform the corresponding action.
//			•	If the user enters 3, print a goodbye message and end the loop.
//			•	Otherwise, after completing the action, ask if the user wants to continue (y/n).
//			•	Keep repeating as long as the user enters 'y'.
		
		
		char continueChoice;
		do {
			
		System.out.println("1. Say Hello");
		System.out.println("2. Show your name");
		System.out.println("3. Exit");
		System.out.println("Enter numbner of your choice: ");
		
		
		int input = sc.nextInt();
		
	if (input == 1) {
		System.out.println("Hello" );
		
	} else if (input == 2) {
		System.out.println("Enter you name : ");
		
		String name = sc.next();
		System.out.println("your name is: " + name);
		
	 } 
    else if (input == 3) {
        System.out.println("Goodbye!");
        break;
    } 
    else {
        System.out.println("Invalid choice!");
    }


     System.out.print("Do you want to continue? (y/n): ");
     continueChoice = sc.next().charAt(0);

 } while (continueChoice == 'y');

 sc.close();
}
}


		
	
				

	


