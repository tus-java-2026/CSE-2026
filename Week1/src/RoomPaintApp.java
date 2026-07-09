package weekOne;

import java.util.Scanner;

public class RoomPaintApp {

	public static void main(String[] args) {
		
	
//The application should:
//		•	Ask the user to enter the height, width, and length of a room in meters.
//		•	Calculate the surface area of the four walls using the formula: 2 * height * (length + width).
//		•	Calculate how many liters of paint are needed (1 liter covers 10 square meters). Round up (Math.ceil()).
//		•	Calculate and display the total cost if each liter of paint costs €14.50.

			
				Scanner input =new Scanner(System.in);
				
				
				double height = input.nextDouble();
				System.out.println("Enter room height (m) : " );
				
				double widht = input.nextDouble();
				System.out.println("Enter the width : (m) " );
				
				double lenght = input.nextDouble();
				System.out.println("Enter the lenght: (m) " );
				
				double surfaceArea = 2 * height*(lenght + widht);
				double paintRequired =  Math.ceil(surfaceArea/10);
				double cost = paintRequired * 14.50 ;
				
				System.out.println();
		        System.out.printf("Surface area of the four walls: %.2f square meters%n", surfaceArea);
		        System.out.printf("Paint required: %.0f liters%n", paintRequired);
		        System.out.printf("Total cost: €%.2f%n", cost);

		        input.close();
		    }
}






				
					
