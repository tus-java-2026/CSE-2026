package cse.assessment.two;

import java.util.Scanner;

public class AssessmentTwo2024 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		//question1();
		//question2();
		//question3();
		question4();

	}

	/* private static void question1() {



	// System.out.println("---Question 1---");
	//  System.out.print("Enter a positive integer: ");


	// int num = sc.nextInt();

	// int sum = sumOfOddNumbers(num);

	//  System.out.println("The sum of the first " + num + " odd numbers is: " + sum);

	//  }

	// public static int sumOfOddNumbers(int num) {

	//  int sum = 0;


	// for (int i = 1; i <= num; i++) {
	//   sum = (2 * i)-1;

	//  }

	//  return sum;
	//  }
	//}





	private static void question2() {
		
	System.out.println("---Question2---");
	System.out.println("setup range for question game: ");
	System.out.println("enter a: ");
	int start = sc. nextInt();
	System.out.println("enter b: ");
	int end = sc.nextInt();
	guessingGame (start,end);
	
	}

	public static void guessingGame(int start, int end) {  
       
        int numberToGuess = (int) (Math.random() * (end - start +1)) + start;
        System.out.println("COMMENT THIS PRINT AFTER -> generated number: " + numberToGuess);
        int attempts = 0;
        int guess;
        boolean correct = false;

        System.out.println("Guess the number between " + start +" and "  + end);
        while (!correct) {
            guess = sc.nextInt();
            attempts++;
            if (guess > numberToGuess) {
                System.out.print("Too high! Try again: ");
            } else if (guess < numberToGuess) {
                System.out.print("Too low! Try again: ");
            } else {
                correct = true;
                break;
            }
        }
        System.out.println("Correct! You guessed the number in " + attempts + " attempts.");
    }
	
		
		
		
	}
		
		
		private static void question3() {			
			System.out.println("---Question3---");
			System.out.print("enter a string: ");
			str1 = sc.next();
			System.out.print("the number of vowels is: ");
			str2 =sc.nextInt();
			System.out.print(" the number of consonant is: ");
			countVowelsAndConsonant (String str) 
			}

		
		public static void countVowelsAndConsonant(String str) ) {  
			public static void countVowels(String str) {
		        int vowelCount = 0;
		        int consonants = 0;
		        String vowels = "aeiouAEIOU";
		        for (int i = 0; i < str.length(); i++) {
		        	char c = str.charAt(i);
		            if (Character.isLetter(c)) {
		                if (vowels.indexOf(c) != -1) {
		                    vowelCount++;
		                } else {
		                    consonants++;
		                }
		            }
		        }
		        System.out.println("The number of vowels is: " + vowelCount);
		        System.out.println("The number of consonants is: " + consonants);
		    }
			     	
	}*/

	private static void question4() {
	
			System.out.println("---Question 4---");
			System.out.print("Enter the number of columns: ");
	        int n = sc.nextInt();
	        printNumberPyramid(n);
	        
		}
		
		public static void printNumberPyramid(int n) {
			// Print the increasing part of the pattern
			int num=1;
	        for (int i = 1; i <= n; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print(num + " ");
	                num++;
	            }
	            System.out.println();
	        }        
	        
	    }

	}
		
		
		
		
	
	

