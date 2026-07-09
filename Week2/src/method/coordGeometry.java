package method;

import java.util.Scanner;

public class coordGeometry {

	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		func_coordGeometry();// call the method/fun and close the main
	}

	// how function will work to calculate the distance?
	public static void func_coordGeometry() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter x1: ");
		double x1 = sc.nextDouble();

		System.out.print("Enter y1: ");
		double y1 = sc.nextDouble();

		System.out.print("Enter x2: ");
		double x2 = sc.nextDouble();

		System.out.print("Enter y2: ");
		double y2 = sc.nextDouble();

		// formula to caculate dfistyance
		double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

		System.out.println("The distance between the two points is: " + distance);
	}
}