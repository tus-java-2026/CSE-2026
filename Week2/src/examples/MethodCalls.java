package examples;

import java.util.Scanner;

public class MethodCalls {
	
	static Scanner sc = new Scanner(System.in);


	public static void main(String[] args) {
		int a = 3;
		int b = 5;
		int sum = a+b;
		System.out.println(sum);
		
		int c =6;
		int d = 7;
		int sum2 = add (c,d);
		
		System.out.println(sum2);
		
		System.out.println(add (7,9));
		
		int mult = mutiplyThree(2,5,4);
				System.out.println(mult);
		System.out.println(mutiplyThree(2,5,4));
		
		System.out.println("Hina");
		System.out.println("Thiago");		
		
	System.out.println(add(2,5));
	System.out.println();
			
	}
	
public static int add(int a, int b) {
	int sum = a+b;
	return sum;
}
	//public: available
	//static : belong to a class, not gonna to change its static.
	
	public static int add(int a, int b, int c) { // method overloading
		return a+b+c;
	}
		
	// method to take 3 numbers and multiply them...
	public static int mutiplyThree(int a, int b , int c) {
		return a*b*c;
		}

	
	public static void printName(String name) {
		System.out.println("your name is : " + name);
	}
				
	public static void show () {
		System.out.println("What is your name?");
		String name = sc.next();
					
		System.out.println("your name is " +name);
	}

		
		}
	

