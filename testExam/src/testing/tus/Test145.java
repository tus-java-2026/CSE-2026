import java.util.Scanner;

public class AssessmentTwo2026 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;

        do {

            printMenu();
            choice = sc.nextInt();

            switch (choice) {

            case 1:
                fizzBuzzCounter();
                break;

            case 2:
                coinFlipStreak();
                break;

            case 3:
                drawRobotFace();
                break;

            case 4:
                System.out.println("Goodbye!");
                break;

            default:
                System.out.println("Invalid Choice!");

            }

        } while (choice != 4);

    }

    public static void printMenu() {
        System.out.println("Assessment 2 CSE 2026");
        System.out.println("Select  exercise: ");
        System.out.println("1-FizzBuzz Counter");
        System.out.println("2-Coin Flip Streak");
        System.out.println("3-Draw Robot");
        System.out.println("4-Exit");
        System.out.print("Choice: ");
    }

    public static void fizzBuzzCounter() {

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        for (int i = 1; i <= number; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }

        }

    }

    public static void coinFlipStreak() {

        int heads = 0;
        int flips = 0;

        while (heads < 3) {

            int coin = (int) (Math.random() * 2);

            flips++;

            if (coin == 0) {
                System.out.println("Heads");
                heads++;
            } else {
                System.out.println("Tails");
                heads = 0;
            }

        }

        System.out.println();
        System.out.println("You got 3 Heads in a row!");
        System.out.println("Total flips = " + flips);

    }

    public static void drawRobotFace() {

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= 8; j++) {

                if (i == 1 || i == 5) {

                    System.out.print("#");

                } else if (i == 2) {

                    if (j == 1 || j == 8)
                        System.out.print("#");
                    else if (j == 3 || j == 6)
                        System.out.print("O");
                    else
                        System.out.print(" ");

                } else if (i == 3) {

                    if (j == 1 || j == 8)
                        System.out.print("#");
                    else if (j == 4 || j == 5)
                        System.out.print("-");
                    else
                        System.out.print(" ");

                } else if (i == 4) {

                    if (j == 1 || j == 8)
                        System.out.print("#");
                    else if (j >= 3 && j <= 6)
                        System.out.print("-");
                    else
                        System.out.print(" ");

                }

            }

            System.out.println();

        }

    }

}
