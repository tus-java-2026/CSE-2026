package breakcontinue;

import java.util.Scanner;

public class BreakContinueTesting {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		loops();
		//normalBreak();
		//labelledBreak();
		//normalContinue();
		//labelledContinue();


	}

/*	private static void labelledContinue() {
		outer: 
			for (int i = 1; i <= 3; i++) {

				System.out.println("i == " + i);

				for (int j = 1; j <= 5; j++) {

					if (j == 3) {

						continue outer;

					}
					System.out.println("\tj == " + j);
				} 

				System.out.println();
			}
	}
}



//private static void normalContinue() {


//	 for (int i = 1; i <= 3; i++) {

//    System.out.println("i == " + i);
//
//    for (int j = 1; j <= 5; j++) {

//   if (j == 3) {

//   	continue ;
//   }
//   System.out.println("\tj == " + j);
//	        } 

//      System.out.println();
//        }
//	    }
//	}







//private static void labelledBreak() {
// outer:

// for (int i = 1; i <= 3; i++) {

//      System.out.println("i == " + i);

//    for (int j = 1; j <= 5; j++) {

//      System.out.println("\tj == " + j);

//     if (j == 2) {

//      break outer;
//}

	private static void normalBreak() {

		            for (int i = 1; i <= 3; i++) {

		            	System.out.println("i == " + i);

		            	for (int j = 1; j <= 5; j++) {

		            		System.out.println("\tj == " + j);

		            		if (j == 2){
	                break; {




  System.out.println();

	                }
		            		}
		            	}
		            	*/
	







	private static void loops() {

		for (int i =1; i<=3; i++) { // inner loop 

			System.out.println("i == " + i);

			for (int j = 1; j <= 5; j++) {

				System.out.println("\t j == " + j); // \t add one tab before text
			}

			System.out.println();
  }
	}

	}
