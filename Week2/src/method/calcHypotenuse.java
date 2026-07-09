
package method;

import java.util.Scanner;

public class calcHypotenuse {

	    public static void main(String[] args) {
	        func_hypotenus();// call the method/fun and close the main
	    }
	    
// how function will work to calculate the distance?
	    public static void func_hypotenus() {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a: ");
	        double a = sc.nextDouble();

	        System.out.print("Enter b: ");
	        double b = sc.nextDouble();
	        
// formula to caculate hypo
	        double h = Math.sqrt(Math.pow(a,2) + Math.pow(b, 2));

	        System.out.println("The hypotenus of this: " + h);
	    }
	}