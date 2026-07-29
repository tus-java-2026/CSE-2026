package Patterns;

public class DiffStylePatterns {
	
	
	/*| Pattern        | Inner loop                          |
| -------------- | ----------------------------------- |
| Left Pyramid   | `j <= i`                            |
| Right Pyramid  | `j <= i`                            |
| Full Pyramid   | `j <= (2 * i - 1)`                  |
| Inverted Left  | `j <= i` (count `i` down)           |
| Inverted Right | `j <= i` (count `i` down)           |
| Inverted Full  | `j <= (2 * i - 1)` (count `i` down) |

}*/


	// LEFT HALF PYRAMID
	for (int i = 1; i <= height; i++) {

		for (int j = 1; j <= i; j++) {
			System.out.print(symbol);
		}

		System.out.println();
	}

		//INVERTED LEFT PYRAMID/REVERSE

		for (int i = height; i >= 1; i--) {

			for (int j = 1; j <= i; j++) {
				System.out.print(symbol);
			}

			System.out.println();
		}
		
			//RIGHT HALF PYRAMID
			for (int i = 1; i <= height; i++) {

				for (int j = 1; j <= height - i; j++) {
					System.out.print(" ");
				}

				for (int j = 1; j <= i; j++) {
					System.out.print(symbol);
				}

				System.out.println();

				//INVERTED RIGHT PYRAMID
				for (int i = height; i >= 1; i--) {

					for (int j = 1; j <= height - i; j++) {
						System.out.print(" ");
					}

					for (int j = 1; j <= i; j++) {
						System.out.print(symbol);
					}

					System.out.println();
						
				}
				// FULL CENTERED PYRAMID
				for (int i = 1; i <= height; i++) {

				    for (int j = 1; j <= height - i; j++) {
				        System.out.print(" ");
				    }

				    for (int j = 1; j <= (2 * i - 1); j++) {
				        System.out.print(symbol);
				    }

				    System.out.println();
				}
				
				
				
				//DIAMOND
				
				// Upper Half
				for (int i = 1; i <= height; i++) {

				    for (int j = 1; j <= height - i; j++) {
				        System.out.print(" ");
				    }

				    for (int j = 1; j <= (2 * i - 1); j++) {
				        System.out.print(symbol);
				    }

				    System.out.println();
				}

				// Lower Half
				for (int i = height - 1; i >= 1; i--) {

				    for (int j = 1; j <= height - i; j++) {
				        System.out.print(" ");
				    }

				    for (int j = 1; j <= (2 * i - 1); j++) {
				        System.out.print(symbol);
				    }

				    System.out.println();
				}
