
		
//  calculateSum(), calculateProduct(), calculateDifference(), calculateQuotient()//
//	
// a. in main(), get in two int values from the user, namely x and y.
		
// b. pass x and y down to calculateSum()
//	
// c.in calculateSum() add x and y together and return the total back to main().
//		
//	d. in main(), output the sum. Include the values of x and y in the output (see output).
//		
//	e. in main(), invoke calculateProduct(), passing down x and y and receiving back the product of the two; output the product in main() including the values of x and y.
//		
//	f. in main(), invoke calculateProduct(), passing down x and y and receiving back the product of the two; output the product in main() including the values of x and y.
//	
//	f.	in main(), invoke calculateDifference(), passing down x and y and receiving back the difference of the two i.e. x-y; output the difference in main() including the values of x and y.
//		
//	g.	in main(), invoke calculateQuotient(), passing down x and y and receiving back the quotient of the two i.e. x/y; output the quotient in main() including the values of x and y.

//		Sample Output Enter x : 10 Enter y : 2
//		The sum of 10 and 2 is 12
//		The product of 10 and 2 is 20
		
		
package method;

import java.util.Scanner;

public class MethodExcercises1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x;
		int y;
		int sum; 
		int calculateProduct; 
		int calculateDifference;
		int calculateQuotient;
		
		System.out.print("Enter x: ");
		x = sc.nextInt();
		System.out.print("Enter y : ");
		y = sc.nextInt();
		
		sum = (x + y);
		System.out.println("the sum of " + x + " and " + y + " is " + sum);
		
		calculateProduct = (x * y);
		System.out.println("the product of " + x + " and " + y + " is " + calculateProduct);
	
		calculateDifference = (x - y);
		System.out.println("the difference of " + x + " and " + y + " is " + calculateDifference);
		
		calculateQuotient = x / y;
		System.out.println("the quotient of " + x + " and " + y + " is " + calculateQuotient);
		

	}

	

}


