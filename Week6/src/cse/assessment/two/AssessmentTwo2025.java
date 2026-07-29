package cse.assessment.two;

import java.util.Scanner;

public class AssessmentTwo2025 {

    static Scanner sc = new Scanner(System.in);
    static final int STARTING_HP = 10;

    public static void main(String[] args) {

        System.out.println("Assessment Two CSE 2025");

        String choice = "y";

        while (choice.equalsIgnoreCase("y")) {

            System.out.println("Select the exercise: ");
            System.out.println("1 - Print start patter");
            System.out.println("2 - Reverse a Number");
            System.out.println("3 - Draw Pyramid");
            System.out.println("4 - Exit");

            int option = sc.nextInt();

            switch (option) {

            case 1:
                duelGame();
                break;

            case 2:
                reverseNumber();
                break;

            case 3:
                drawPyramid();
                break;

            case 4:
                System.out.println("Exit");
                choice = "n";
                break;

            default:
                System.out.println("Invalid Choice!");
            }

            if (!choice.equalsIgnoreCase("n")) {
                System.out.println("Do you want to go back to main menu? (y/n)");
                choice = sc.next();
            }
        }

    }

    public static void duelGame() {

        System.out.println("\n--- Welcome to Dice Duel Game App---");

        System.out.print("Enter name for Player 1: ");
        String player1 = sc.next();

        System.out.print("Enter name for Player 2: ");
        String player2 = sc.next();

        int hp1 = STARTING_HP;
        int hp2 = STARTING_HP;

        // Player 1 attacks
        System.out.println("\n" + player1 + " attacks!");

        int attackRoll = rollDice();
        int defendRoll = rollDice();

        System.out.println(player1 + " rolled: " + attackRoll);
        System.out.println(player2 + " defended with: " + defendRoll);

        if (attackRoll > defendRoll) {
            hp2 = hp2 - attackRoll;
            System.out.println(player2 + " takes " + attackRoll + " damage. HP now: " + hp2);
        } else {
            System.out.println("Attack blocked!");
        }

        // Player 2 attacks
        System.out.println("\n" + player2 + " attacks!");

        attackRoll = rollDice();
        defendRoll = rollDice();

        System.out.println(player2 + " rolled: " + attackRoll);
        System.out.println(player1 + " defended with: " + defendRoll);

        if (attackRoll > defendRoll) {
            hp1 = hp1 - attackRoll;
            System.out.println(player1 + " takes " + attackRoll + " damage. HP now: " + hp1);
        } else {
            System.out.println("Attack blocked!");
        }

        System.out.println("\n--- Final Result ---");
        System.out.println(player1 + " HP: " + hp1);
        System.out.println(player2 + " HP: " + hp2);

        if (hp1 > hp2) {
            System.out.println(player1 + " wins!");
        } else if (hp2 > hp1) {
            System.out.println(player2 + " wins!");
        } else {
            System.out.println("It's a draw!");
        }

    }

    public static void reverseNumber() {

        System.out.println("\n--- Welcome to Reverse a Number App---");
        System.out.print("Enter a number: ");

        int number = sc.nextInt();
        int reversed = 0;

        while (number != 0) {

            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number = number / 10;

        }

        System.out.println("Reversed number: " + reversed);

    }

    public static void drawPyramid() {

        System.out.println("\n--- Welcome to Pyramid Drawing App---");

        System.out.print("Enter pyramid height: ");
        int height = sc.nextInt();

        System.out.print("Enter a symbol: ");
        char symbol = sc.next().charAt(0);

        for (int i = 1; i <= height; i++) {

            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print(symbol);
            }

            System.out.println();

        }

    }

    public static int rollDice() {

        return (int) (Math.random() * 6) + 1;

    }

}