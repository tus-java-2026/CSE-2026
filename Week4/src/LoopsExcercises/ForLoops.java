package LoopsExcercises;

import java.util.Scanner;
public class ForLoops {


	//private static final int NUM_INPUTS = 3; // constant

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		//forHeaderTesting();       //2 (a,b,c,d)
		//forSmallestLargest();     //3
		//forHistogram();             //4
		//forAverage();             //5
		//forSequence();            //6
		//forSumEvenNumbers();      //7
		twelveDaysOfChristmas();  //8


	}


	private static void twelveDaysOfChristmas() {



		for (int day = 1; day <= 3; day++) {

			System.out.println();

			// First switch - print the day
			switch (day) { 
			
			case 1:
				System.out.println("On the first day of Christmas,");
				break;
			case 2:
				System.out.println("On the second day of Christmas,");
				break;
			case 3:
				System.out.println("On the third day of Christmas,");


			} 

				System.out.println("My true love sent to me:");

				// Second switch - print the gifts
				switch (day) {

				case 3:
					System.out.println("\tthree fence hens,");

				case 2:
					System.out.println("\ttwo turtle doves, and ");

				case 1:
					System.out.println("\tA partridge in a pear tree.");

				
				}

				System.out.println();
			}
		}

	}


	//	private static void forSumEvenNumbers() {
	//
	//
	//		int from =0;
	//		int to =0;
	//		int total = 0;
	//		
	//
	//
	//			System.out.print("From --> ");
	//			from =sc.nextInt();
	//
	//			System.out.print(" To --> ");
	//			to = sc.nextInt();
	//
	//				if (from % 2 != 0 || to % 2 != 0) {
	//					
	//			        System.out.println( from + "; " + to);
	//			    } else {
	//
	//			        for (int i = from + 2; i < to; i = i + 2) {
	//			            total = total + i;
	//			        }
	//
	//			        System.out.println("The total is " + total);
	//			    }
	//			}
	//}
	//
	//

	//	private static void forSequence() {
	//
	//		int square;
	//		int total = 0;
	//
	//		for (int i = 1; i <= 10; i++) {
	//
	//			square = i * i; // for square
	//
	//			System.out.print(square);
	//
	//			total = total + square; // for total
	//
	//		        if (i < 10) {
	//		            System.out.print(", ");
	//		        }
	//		}
	//	}
	//}




	//	private static void forAverage() {
	//
	//		int n = 0;
	//		double sum = 0.0;
	//		double num = 0.0;
	//
	//		System.out.print("how many values --> ");
	//		n = sc.nextInt();
	//
	//		for (int i =1; i<= n ; i++) {
	//			System.out.print("Enter a value --> ");
	//
	//			num = sc.nextDouble();
	//
	//			sum = sum + num; // accumulate into running total
	//
	//		}
	//
	//		// Check if n is greater than 0 before dividing
	//
	//		if (n > 0) {		
	//			double avg = sum / n; // total sum / count of n
	//
	//
	//			System.out.print("Average is : " + avg);
	//			avg = sc.nextDouble();
	//		} 
	//		System.out.println("no numbers entered.");
	//
	//	}	
	//}
	//






	//	private static void forHistogram() {
	//
	//		int rows;
	//		int cols;
	//		char ch;
	//
	//		System.out.print("Enter number of rows --> ");
	//		rows =sc.nextInt();
	//
	//		System.out.print("Enter number of cols --> ");
	//		cols =sc.nextInt();
	//
	//		System.out.print("Enter the character to use (==/*) --> ");
	//		ch = sc.next().charAt(0);
	//
	//		for (int i = 1; i <=rows; i++ ) {
	//
	//			for (int j = 1; j <=cols; j++ ) {
	//
	//
	//				System.out.print(ch);
	//			}
	//
	//			System.out.println();
	//		}
	//	}
	//
	//
	//
	//}
	//
	//


	//	private static void forSmallestLargest() {
	//
	//	    System.out.print("Enter n --> ");
	//	    int n = sc.nextInt();
	//
	//	    if (n <= 0) {
	//	        System.out.println("n was invalid.");
	//	        return;
	//	    }
	//
	//	    // Read the first number
	//	    System.out.print("Enter a number --> ");
	//	    int num = sc.nextInt();
	//
	//	    int largest = num;
	//	    int smallest = num;
	//
	//	    // Read the remaining numbers
	//	    for (int i = 2; i <= n; i++) {
	//
	//	        System.out.print("Enter a number --> ");
	//	        num = sc.nextInt();
	//
	//	        if (num > largest) {
	//	            largest = num;
	//	        }
	//
	//	        if (num < smallest) {
	//	            smallest = num;
	//	        }
	//	    }
	//
	//	    System.out.println("The smallest number entered is: " + smallest);
	//	    System.out.println("The largest number entered is: " + largest);
	//	}
	//}
	//	


	//	private static void forHeaderTesting() {

	//for (initialization; condition; update/increment section) {}

	//	
	//		
	//		int num;
	//		int sum = 0;
	//		//int j = 1;
	//		
	//			//for (int i=0; ; i++) {       //a.omit termination
	//		    //for (; j <=NUM_INPUTS; j++) {  //b.omit initialization
	//		
	//			//for (int k=1; k <=NUM_INPUTS;) {   //c.omit increment
	//
	//		
	//		for (;;) {                // d.if omit all 3 section?
	//			
	//	System.out.print("Enter a number (-1 to end) --> ");
	//			num = sc.nextInt();
	//			
	//			if (num == -1)
	//
	//			break;
	//
	//			sum = sum+num;
	//			
	//		}
	//
	//		System.out.println("Sum is "  + sum );
	//
	//		sc. close();			
	//
	//	}
	//
	//}








