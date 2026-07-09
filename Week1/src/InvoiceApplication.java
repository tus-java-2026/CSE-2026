package weekOne;
import java.util.Scanner;

public class InvoiceApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		double Subtotal = 100;
//		double discountPercent = 0.2;
//		double discountAmount = Subtotal * discountPercent;
//		double total = Subtotal - discountPercent;
//		
//		// welcome the user to the program
//		
//		System.out.println("Welcome to the Invoice Total Calculator");
//        System.out.println(); //print a blank line
//        
//        // Display the discount amount and total
//
//        System.out.println("Subtotal: " + Subtotal);
//        System.out.println("Discount percent: " + discountPercent);
//        System.out.println("Discount amount: " + discountAmount);
//        System.out.println("Total: " + total);
//    }
//	
//}

		double subtotal;
		double discountPercent;
		double discountAmount;
		double total;
		
		System.out.println("Welcome to the Invoice Total Calculator");
        System.out.println();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter subtotal: ");
        subtotal = sc.nextDouble();

        System.out.print("Enter discount percent: ");
        discountPercent = sc.nextDouble();

        discountAmount = subtotal * discountPercent;
        total = subtotal - discountAmount;

        System.out.println();
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Discount percent: " + discountPercent);
        System.out.println("Discount amount: " + discountAmount);
        System.out.println("Total: " + total);

        sc.close();

    }
}

// other version of the code//

//package weekOne;
//import java.util.Scanner;
//
//public class InvoiceApplication
//{
//    public static void main(String[] args)
//    {       
//       
//        double subtotal = 100;
//        double discountPercent= 0.2;
//        double discountAmount = subtotal * discountPercent;
//        double total = subtotal - discountAmount;
//        // welcome the user to the program
//        System.out.println("Welcome to the Invoice Total Calculator");
//        System.out.println();  // print a blank line   
//            // display the discount amount and total
//        System.out.println("Subtotal:           "+subtotal); 
//        System.out.println("Discount percent:   "+discountPercent); 
//        System.out.println("Discount amount:    "+discountAmount);
//        System.out.println("Total:              "+total);
//    }
//}




	
