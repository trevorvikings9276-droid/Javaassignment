import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        // Create Scanner for reading user input
        Scanner scanner = new Scanner(System.in);

        // Generate a random number between 1 and 50 using Math.random()
        // Math.random() returns a double from 0.0 (inclusive) to 1.0 (exclusive)
        // Multiply by 50 to get range 0.0-49.99, cast to int and add 1 for 1-50
        int secretNumber = (int) (Math.random() * 50) + 1;

        // Variable to store the user's guess
        int guess = 0;

        // Counter to track the number of attempts
        int attempts = 0;

        System.out.println("I have chosen a number between 1 and 50. Guess it!");

        // while loop continues as long as the guess is not equal to the secret number
        while (guess != secretNumber) {
            attempts++; // Increment attempt counter

            // Prompt the user for a guess
            System.out.print("Guess #" + attempts + ": ");
            guess = scanner.nextInt();

            // Compare the guess with the secret number and provide hints
            if (guess > secretNumber) {
                System.out.println("Too high!"); // Guess is above the secret number
            } else if (guess < secretNumber) {
                System.out.println("Too low!");  // Guess is below the secret number
            } else {
                // Guess is correct - the loop will exit on the next condition check
                System.out.println("Correct! The number was " + secretNumber + ".");
                System.out.println("You took " + attempts + " attempts.");
            }
        }

        // Close the scanner
        scanner.close();
    }
}
