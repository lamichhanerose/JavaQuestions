package logicalThinking;

import java.util.Random;
import java.util.Scanner;

public class NumberGussesing {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        do {
            playGame(scanner, random);

            System.out.print("Do you want to play again? (yes/no): ");
        } while (scanner.next().equalsIgnoreCase("yes"));

        System.out.println("Thanks for playing!");
        scanner.close();
    }


    private static void playGame(Scanner scanner, Random random) {
        int numberToGuess = random.nextInt(100) ;
        int attempts = 0;
        int maxAttempts = 5;

        System.out.println("Welcome to Number Guessing game");
        System.out.println(
            "There is number between 1 to 100 you have 5 chances to guess the number ");


        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            attempts++;

            if (userGuess == numberToGuess) {
                System.out.println("Congratulations your answer " + numberToGuess + " is correct");
                return;
            } else {
                System.out.println(
                    "Wrong guess. The number is " + ((userGuess < numberToGuess) ? "greater"
                        : "less") + " than your guess.");
            }

        }
        System.out.println("Sorry your attempt has been finished " + " Correct answer is " + numberToGuess);

    }
}
