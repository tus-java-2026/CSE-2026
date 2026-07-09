package excercisesB;

public class Operators {

	public static void main(String[] args) {
		
//		int x= 0, w =0, y = 0,z = 0;
//		x=4;
//		System.out.println(++ x);
//		System.out.println(x++);
//		System.out.println(x);
//		System.out.println(--x);
//		System.out.println(x--);
//		System.out.println( x);
		
	/* the output for this code	is 5, 5, 6, 5, 5, 4 because the pre-increment operator (++) 
		increases the value of x by 1 before it is used in the expression, 
		while the post-increment operator (++) increases the value of x by 1 after it is used in the expression.
		The same applies to the pre-decrement operator (--) and post-decrement operator (--)*/

		int  w = 20,x = 10, y = 5, z = 0;
		System.out.println(w ==x && y != z);
		System.out.println(w == x || y != z);
		System.out.println(!(w == x+z));
	}

}

 /*the output for this code is false, true, true because the first expression evaluates to false since w is not equal to x 
and y is not equal to z. The second expression evaluates to true since w is equal to x or y is not equal to z. 
The third expression evaluates to true since w is not equal to x+z, and the negation operator (!) negates the result.*/