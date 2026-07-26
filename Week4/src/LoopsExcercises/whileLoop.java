package LoopsExcercises;


import java.util.Scanner;

public class whileLoop {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// thirdOrderPolynomial();
		// whileAverage();
		//whileGrades();
		//whileHistogram();
		//whileLargestSmallest();
		//whileSales();
		//whileSquares();
		whileAverageSentinel();
	}

	private static void whileAverageSentinel() {
	

		    int number;
		    int total = 0;
		    int count = 0;
		    double average;
		    System.out.print("Please enter a number (-1 to exit) --> ");
		    number = sc.nextInt();

		    while (number != -1) {

		        total = total + number;

		        count++;

		        System.out.print("Please enter a number (-1 to exit) --> ");
		        number = sc.nextInt();
		    }

		    if (count == 0) {
		        System.out.println("No numbers entered...");
		    }
		    else {
		        average = (double) total / count;
		        System.out.println("Average is " + average);
		    }
		}
	}


//	private static void whileSquares() {
//		
//
//		    int i = 1;
//		    int square;
//		    int total = 0;
//
//		    while (i <= 5) {
//
//		        square = i * i;
//
//		        System.out.println(square);
//
//		        total = total + square;
//
//		        i++;
//		    }
//
//		    System.out.println("Total is " + total);
//		}
//		
//	}


//	private static void whileSales() {
//
//		double sales;
//		double salary;
//
//		System.out.print("Enter sales (-1 to end) --> ");
//		sales = sc.nextDouble();
//
//		while (sales >= -1) {
//
//			salary = 3000 + (sales * 0.09);
//
//			System.out.println("Salary is : " + salary + " Euro");
//			
//			System.out.print("Enter sales (-1 to end) --> ");
//			sales = sc.nextDouble();
//			
//			
//		}
//	}
//}
//
//




//	private static void whileLargestSmallest() {
//
//		    System.out.print("Enter n --> ");
//		    int n = sc.nextInt();
//
//		    if (n < 0) {   // cater the negative numbers
//		        System.out.println("n was invalid: " + n);
//		        return;
//		    }
//
//		    int i = 1;
//		    
//		    System.out.print("Enter a number -->");
//		    int num = sc.nextInt();
//
//		    int largest = num;
//		    int smallest = num;
//
//		    while (i <= n) {
//
//		        System.out.print("Enter a number --> ");
//		        num = sc.nextInt();
//
//		        if (num > largest) {
//		            largest = num;
//		        }
//
//		        if (num < smallest) {
//		            smallest = num;
//		        }
//
//		        i++;
//		    }
//
//		    System.out.println("Largest is --> " + largest);
//		    System.out.println("Smallest is --> " + smallest);
//		}	
//	}
//		





//	private static void whileHistogram() {
//	
//	System.out.print("Enter number of rows -->");
//
//	int rows = sc.nextInt(); //3
//
//	System.out.print("Enter number of columns -->");
//	int cols = sc.nextInt(); //4
//
//	int i = 1;
//
//	while (i <= rows) {      // (rows == 3 || cols  == 4)
//		                       // System.print.ln("***")
//
//	    int j = 1;
//	    
//	    while (j <= cols) {
//
//	        System.out.print("*");
//	       
//	        j++;
//	        
//	    }
//
//	    System.out.println();
//
//	    i++;
//	}
//	}
//}

//	private static void whileGrades() {
//
//
//	    int a=0,b=0,c=0,d=0,e=0,f=0;
//
//	    String grade="";
//
//	    while(!grade.equals("x"))
//	    {
//	        grade=sc.next().toLowerCase();
//
//	        switch(grade)
//	        {
//	            case "a": a++; break;
//	            case "b": b++; break;
//	            case "c": c++; break;
//	            case "d": d++; break;
//	            case "e": e++; break;
//	            case "f": f++; break;
//	        
//	            default:
//	                System.out.println("Letter entered was not in range!");
//	        }
//	    }
//
//	    System.out.println("Number of A's = " + a);
//	    System.out.println("Number of B's = " + b);
//	    System.out.println("Number of C's = " + c);
//	    System.out.println("Number of D's = " + d);
//	    System.out.println("Number of E's = " + e);
//	    System.out.println("Number of F's = " + f);
//	}
//}

//	private static void whileHistogram() {
//
//	}
//
//	private static void whileAverage() {
//
//		int i = 0;
//		int n = 0;
//		double sum = 0.0;
//		double num = 0.0;
//
//		System.out.print("how many numbers in the sequence? : ");
//		n = sc.nextInt();
//
//		// Loop until we reach n inputs
//		while (i < n) {
//			System.out.print("please enter a number: ");
//			num = sc.nextDouble();
//
//			sum = sum + num; // accumulate into running total
//			i++; // increment loop counter
//		}
//
//		// Check if n is greater than 0 before dividing
//
//		if (n > 0) {
//			double avg = sum / n; // total sum / count of n
//
//			System.out.println("Average is : " + avg);
//		} else {
//			System.out.println("no numbers entered.");
//		}
//	}
//}

//1st one//

//	private static void thirdOrderPolynomial() {
//
//		double a,b,c,d,x,fx;
//
//
//		System.out.print("Enter coefficient a: ");
//		a = sc.nextDouble();
//
//		System.out.print("Enter coefficient b: ");
//		b = sc.nextDouble();
//
//		System.out.print("Enter coefficient c: ");
//		c = sc.nextDouble();
//
//		System.out.print("Enter coefficient d: ");
//		d = sc.nextDouble();
//
//		char choice = 'y';
//
//		while (choice == 'y')
//		{
//
//			System.out.print("Enter value for x: ");
//			x = sc.nextDouble();
//
//			fx = a * x * x * x     //(the formula is fx = ax3 + bx2 + cx + d. 
//
//					+ b * x * x
//					+ c * x
//					+ d;
//			System.out.println("The value of the polynomial at "
//			        + x + " is " + fx);
//			
//			System.out.print("Do you wish to continue (y/n): ");
//			choice = sc.next().charAt(0);
//			
//			
//
//		}
//		
//		
//	}
//
//}
