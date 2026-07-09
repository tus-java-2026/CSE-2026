package weekOne;

import java.util.Scanner;
public class SpeedLimitCheckerApp {

	public static void main(String[] args) {
//		The application should:
//			•	Ask the user to enter the speed of a vehicle in km/h.
//			•	Validate the input: speed must be between 0 and 250.
//			•	Determine the category based on the speed:
//			    >120: “Over Speed Limit – Fined”
//			    100–120: “Over Speed Limit – Warning”
//			    60–99: “Normal Speed”
//			    30–59: “Cautious Driving”
//			    <30: “Too Slow – Hazardous”
//			•	Display the corresponding message.
//			•	Ask the user if they want to check another speed ('y' or 'n').
//			•	Repeat the process until the user chooses to stop.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the speed of the vehicle in (km/h):" );
		
		double speed = sc.nextDouble();
		
		if (speed >0 && speed <= 250)
		{
			if (speed > 120) {
				System.out.println("Over speed limit - Warning");
				} else if (speed <= 100) {
				System.out.println("Normal speed");
			} else if (speed >= 60) {
	    System.out.println("Catious Driving");
		} 		else if (speed > 30) {
		System.out.println("Too Slow – Hazardous");
		} 
		}
		else
			
		{ 
			if (speed >=250)
			{			System.out.println("Invalid speed input");
		}
		
		
	}
	}
}







