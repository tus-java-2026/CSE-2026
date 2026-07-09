package excercisesA;

public class AlgebraicExpression {

	public static void main(String[] args) {
		
 /*1.Write a program called AlgebraicExpression. This program is based on the expression y=ax3 + 7. 
 * Initialise x to 2 and a to 3. Using parentheses where needed ensure y evaluates to the following:31 (the normal evaluation).  
 * Show also that by changing the position of the brackets a result of 108 and 66 can be achieved.
		 
 2.	Look up the Math.pow function and use it to evaluate the above expression. */



int x = 2;
int a = 3;
int y ;
  
System.out.println("Evaluating \" y = ax^3 + 7 \" where x == 2 and a == 3");
// \" means to print the double quotes in the output

System.out.println();// blank line for readability
y = a *x*x* x+ 7;
System.out.println("a *x*x* x+ 7 sets y to : " + y);

y = a *(x* x* x)+ 7;
System.out.println("y = a * x * x * x + 7 sets y to : " + y);

y = a *x* x*( x+ 7);
System.out.println("y = a *x* x*( x+ 7) sets y to : " + y);

y = (a *x)* x*( x+ 7);
System.out.println("(a *x)* x*( x+ 7) sets y to : " + y);

y = a *x* (x* x+ 7);
System.out.println("y = a *x* (x* x+ 7) sets y to : " + y);

y = (a *x)*x* x+ 7;
System.out.println("y = (a *x)*x* x+ 7 sets y to : " + y);

double yPower = a * Math.pow(x, 3) + 7;

System.out.println("y = a*x^3 + 7  sets y to : " + y);


	}

	
	}

	

