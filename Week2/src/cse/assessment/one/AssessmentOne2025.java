package cse.assessment.one;
import java.util.Scanner;


public class AssessmentOne2025 {

	static Scanner sc = new Scanner(System.in);
	
	private static final int correct_PIN = 1234;
	
	public static void main(String[] args) {
		//Uncomment lines to run each question separately. 

		System.out.println("Q1 – PIN Verification");
		verifyPIN();

		//System.out.println("Q2 – Password Strength Checker");
		//passwordStrengthTest();

//		System.out.println("Q3 – Program Eligibility Check");
//		programEligibilityCheck();

	}




	//Code other methods here

	private static void verifyPIN() {

		
		int attempt = 3;
		int enteredPIN;

		while (attempt > 0) {

			System.out.print("Enter your PIN (only numbers allowed): ");
			enteredPIN = sc.nextInt();

			if (enteredPIN == correct_PIN) {
				System.out.println("PIN correct, access granted.");
				return;
			} else {
				attempt = attempt - 1;

				if (attempt > 0) {
					System.out.println("Incorrect PIN, try again." + attempt + " attempt(s) left.");
					
				}
			}
		}

		System.out.println("Card Blocked.");
	}
}

	//Code other methods here

//	private static void passwordStrengthTest() {
//
//
//		System.out.print("Enter your password: ");
//		String password = sc.nextLine();
//
//		int i = 0;
//		boolean hasUpper = false;
//		boolean hasLower = false;
//		boolean hasDigit = false;
//
//		while (i < password.length()) {
//			char letter = password.charAt(i);
//			if (Character.isUpperCase(letter)) {
//				hasUpper = true;
//			} else if (Character.isLowerCase(letter)) {
//				hasLower = true;
//			} else if (Character.isDigit(letter)) {
//				hasDigit = true;
//			}
//			i++;
//		}
//
//		if (hasUpper && hasLower && hasDigit) {
//			System.out.println("Strong Password.");
//		} else {
//			System.out.println("Weak Password.");
//		}
//
//	}
//
//
//
//	//Code other methods here
//	private static void programEligibilityCheck() {
//
//		int age ;
//		double gpa ;
//		boolean hasResearch;
//		boolean hasleadership;
//
//
//			System.out.println("Enter your age: ");
//			age = sc.nextInt();
//
//			System.out.println("Enter your gpa: ");
//			gpa = sc.nextDouble();
//
//			System.out.println("Do you have Research experince? : ");
//			hasResearch = sc.nextBoolean();
//
//			System.out.println(" Have have you held a Leadership role ? :");
//			hasleadership= sc.nextBoolean();
//
//
//			boolean result = checkProgramEligibility(age, gpa, hasResearch, hasleadership);
//			if (result) 
//			{ 
//				System.out.println("You are eligible");
//			
//			}
//			else 
//			{
//			System.out.println("You are not eligible");
//			}
//	}
//private static boolean checkProgramEligibility(int age, double gpa, boolean hasResearch, boolean hasleadership) 
//{
//		if ( age >= 18 && gpa >= 3.5 )
//		{
//			//System.out.println("Candidate is eligible");
//			return true;
//		}
//
//	else if (age >= 16 && gpa >= 3.0 && hasResearch && hasleadership) {
//		//System.out.println("Candidate is eligible");
//		return true;
//	} else {
//		//System.out.println("Candidate is eligible");
//		return false;
//	}
//	}
//}
//
//
//	
//
//
//
//
