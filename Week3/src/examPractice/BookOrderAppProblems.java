package examPractice;

import java.util.Scanner;


//1.Code a statement that declares a class named BookOrderApp that has public access.

public class BookOrderAppProblems {


	public static void main(String[] args) {
//2.	Code a statement that declares an integer named quantity and assigns an initial value of zero to it.

		      int quantity = 0;

//4.	Given a double variable named total and an integer variable named quantity, code a statement that divides the total by the quantity, assigns the value to another variable named price, and retains the decimal places in the result.


double total = 0;




//5.	Code a statement that declares a string variable named cityStateZip and 
//then assigns a value that joins three string variables named city, state, 
//and zip and two string literals that separate the city and state by a comma and
//a space and the state and zip by a space.


  
  
  String city = null;
  String state = null;
  String Zip = null;
  
  String cityStateZip = city + "," + state + " " + Zip;




  //6.	Code a string that, when displayed on the console, will look like this:
		//Fresno
		//CA
		//93720
  String name = "Fresno";
  System.out.println(name);
  String role = "CA";
  System.out.println(role);
  int ph =93720;
  System.out.println(ph);


//7.	Code a statement that imports all of the classes in the java.io package.

//import java.io package;

//8.	Code a statement that creates an instance of a class named BookOrder 
//and assigns it to a variable named bookOrder. Pass arguments named 
//code, price, and quantity to the constructor of this class.

 
   int code;
   int price;
   BookOrderAppProblems BookOrderAppProblems = new BookOrderAppProblems();

//9.	Code a statement that prints a variable named total to the console,
//followed by a new line character.
 
 System.out.println(total);


//10.	Given a Scanner variable named sc, code a statement that returns 
 //the value the user enters at the console as a String object and stores it
 //in a variable named city.
 Scanner sc = new Scanner(System.in);
  
 String City;
 System.out.print("Eneter City name: ");
 System.out.println();


//11.	Code an if/else statement that determines whether the value of a 
 //numeric variable named quantity is equal to 1, 2, 3, or more.
 //If it’s equal to 1, the statement should set a variable named shipping to 4.95.
// If it’s equal to 2, the statement should set the shipping variable to 7.95. 
 //If it’s equal to 3, it should set this variable to 9.95. 
 //And if it’s more than 3, it should set this variable to 10.95. 
 //Assume that all variables have already been declared and initialized.

 
 double shipping;
 if (quantity == 1) {
	    shipping = 4.95;
	}
	else if (quantity == 2) {
	    shipping = 7.95;
	}
	else if (quantity == 3) {
	    shipping = 9.95;
	}
	else {
	    shipping = 10.95;
	}


//12.	Code an if/else statement that determines if a string variable named 
 //state is equal to “CA”. If it is, the statement should set a variable named
 //taxPct to .0775. Otherwise, it should set this variable to zero.

 if ("named" == "CA") {
 System.out.println("2taxPact to .0775");
 } else {
	 System.out.println("zero");
	}

//13.Code a while statement that will continue executing while a variable
 //named multiplier is not equal to 1. The code within the while loop should 
 //start by subtracting 1 from the multiplier variable. Then, it should multiply a
 //numeric variable named number by the multiplier variable and store the 
 //result in the number variable. Assume that both variables have already been 
 //declared and initialized.

 int number;
int multiplier = 0;
number = sc.nextInt();
while ( multiplier != 1) {
	multiplier = multiplier - 1;
	number=	number * multiplier;
}
	
	
}
	}


