package LoopsExcercises;

import java.util.Scanner;

public class DoWhileLoops {

	//static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		//largestNumber();
		//squares(); 
		skip7();
	}

	private static void skip7() {
		// TODO Auto-generated method stub
		
		int i=1;

		do {
			
		     if (i == 7 )
		     {
		    	 i++;
		    	 continue;
		     }
		    System.out.println(i);
			i++;
			
		} while (i <= 10);
		
	}

//	private static void squares() {
//
//
//		int sq;
//		int sum = 0;
//		int i=0;
//
//		do {
//			System.out.print("Enter number:");
//			int num = sc.nextInt();
//
//		
//			sq = num*num; //it will always hold largest value of the given numbers;
//			sum = sum + sq;
//
//			i++;
//		} while (i < 5);
//         
//        System.out.println("sum of the squares:" +sum);
//	}
}

//	private static void largestNumber() {
//
//	    int num;
//	    int largest = 0;
//	    int i = 0;
//
//	    do {
//	    	    System.out.print("Enter number:");
//	        num = sc.nextInt();
//
//	        if (num > largest) {
//	            largest = num; //it will always hold largest value of the given numbers;
//	        }
//
//	        i++;
//
//	    } while (i < 5);
//
//	    System.out.println("Largest number is: " + largest);
//	}
//}
//
//
//

