
// QUESTION:1
/* - Write a method to perform the following operations on a given string: "JavaProgramming".
 * 
1.	Find and print the length of the string.
2.	Print the character at index 5.
3.	Extract and print the substring from index 4 to 9.
4.	Convert the string to uppercase and print it.
5.	Check if the string contains the substring "Prog" and print the result.
6.	Replace the substring "Java" with "Python" and print the new string.*/

package method;
import java.util.Scanner;

public class StringExercises {

	public static void main(String[] args) {
		stringMethodExercise();
		stringConstantPoolExercise();
		stringComparisonsExercise();
		stringImmutabilityExercise();
		stringFormattingExercise();

	}


	public static void stringMethodExercise() {


		String text = "JavaProgramming";

		System.out.println("Length: " + text.length());

		System.out.println("Character at index 5: " + text.charAt(5));

		System.out.println("Substring from index 4 to 9: " + text.substring(4, 9));

		System.out.println("Uppercase: " + text.toUpperCase());

		System.out.println("Contains 'Prog': " + text.contains("Prog"));

		System.out.println("Replaced substring: " + text.replace("Java", "Python"));

		System.out.println();
	}

//QUESTION:2
	/*. - Write a method to demonstrate the concept of the string constant pool. Create two strings using string literals 
	and two strings using the new keyword. 
	Compare them using the == operator and the equals method and print the results.*/

	public static void stringConstantPoolExercise() {
		String str1= "Hello" ;
		String str2 = "Hello";

		String str3 = new String("Hello");
		String str4 = new String ("Hello");

		System.out.println("str1 == str2 :" + (str1 == str2));
		System.out.println("str1 == str3 :" + (str1 == str3));
		System.out.println("str3 == str4 :" + (str3 == str4));


		System.out.println("str1.equals (str2) :"  +str1.equals (str2));
		System.out.println("str1.equals (str3) :"  +str1.equals (str3));
		System.out.println("str3.equals (str4) :"  +str3.equals (str4));

		System.out.println();
	}

	//QUESTION 3
	/* Write a method to compare two strings lexicographically. Prompt the user to input two strings, 
	 * then compare them using compareTo, equals, and equalsIgnoreCase methods. Print the results of each comparison.
	 */

	public static void stringComparisonsExercise() {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first string: ");

		String firstString = sc.nextLine();


		System.out.print("Enter the second string: ");
		String secondString = sc.nextLine();

		int result = firstString.compareTo(secondString);

		if(result< 0) {

			System.out.println("The first string is lexicographically less than the second string.");
		}
		else if (result > 0){
			System.out.println("The first string is lexicographically greater than the second string.");
		} else {

			System.out.println("Both strings are lexicographically equal.");
		}


		//print them

		System.out.println("The strings are equals using equals: " + firstString.equals(secondString));
		System.out.println("The strings are equals using IgnoringCase : " +firstString.equalsIgnoreCase(secondString));

		System.out.println();

	}
	
// QUESTION 4
	/*. Write a method that demonstrates the immutability of strings.
	 *  Create a string and attempt to modify it by appending more text to it. 
	 *  Then, print the original string to show that it hasn't changed. Finally, assign the modified string to a new variable 
	 *  and print both strings.

	 */
	public static void 	stringImmutabilityExercise() {

//		Scanner sc = new Scanner(System.in);
//
//		String str = "Hello";
//
//		System.out.println("Original string :" + str);
//
//		str = str+ ", world!";
//		System.out.println(" original sting after modification attempt: " + str);
//
//		System.out.println();

// another way to do this
		
		String original = "Hello";

        String modified = original + ", World!";

        System.out.println("Original string: " + original);
        System.out.println("Modified string: " + modified);
        System.out.println("Original string after modification attempt: " + original);

        System.out.println();
          
    }
	// QUESTION 5
	/*  – Create a method to demonstrate the the following string formatting techniques: use the following variables:
       double price = 123456.789;
        int number = 42;
        double negativePrice = -123.456;
•	Left justify a string.
•	Right justify a number with two decimal places.
•	Print multiple values with specific formatting.
•	Use the + flag to show a sign for a number.
•	Use the 0 flag to pad a number with leading zeros.
•	Enclose negative number in parentheses.
•	A Positive number with decimal separator.
•	Scientific notation (e lowercase).
•	Scientific notation (E uppercase).*/


	public static void stringFormattingExercise() {
		
		 double price = 123456.789;
	        int number = 42;
	        double negativePrice = -123.456;
	        
	        System.out.printf("Left Justified String: %-10s%n", "Total:");//left

	        System.out.printf("Right Justified Number: %10.2f%n", price);//right

	        System.out.printf("Formatted Multiple Values: %-10s %10.2f%n", "Total:", price);//multiple values

	        System.out.printf("Number with Sign: %+d%n", number); //+sign

	        System.out.printf("Number with Leading Zeros: %010d%n", number);//leading 0

	        System.out.printf("Negative Number in Parentheses: %(,.2f%n", negativePrice);//-num in ()

	        System.out.printf("Positive Number with Decimal Separators: %,.2f%n", price);//positive num with decimal

	        System.out.printf("Scientific Notation lowercase: %.2e%n", price);//notation lcase

	        System.out.printf("Scientific Notation uppercase: %.2E%n", price);//uppercase
	        
		
	}
	
		
	}










