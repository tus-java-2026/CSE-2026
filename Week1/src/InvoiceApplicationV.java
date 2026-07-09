package weekOne;
import java.util.Scanner;

public class InvoiceApplicationV {

	public static void main(String[] args) {
	
		System.out.println("Welcome to the Invoice Total Calculator");
        System.out.println();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter subtotal: ");
        double subtotal = sc.nextDouble();

        System.out.print("Enter discount percent: ");
        double discountPercent = sc.nextDouble();

        double discountAmount = subtotal * discountPercent;
        double total = subtotal - discountAmount;

        System.out.println();
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Discount percent: " + discountPercent);
        System.out.println("Discount amount: " + discountAmount);
        System.out.println("Total: " + total);

        sc.close();

    }
}