import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    static Scanner sc = new Scanner(System.in);

    public static int startGame() {
        Random random = new Random();
        int number = random.nextInt(100) + 1; 
        int attempts = 0;
        int maxAttempts = 7;

        System.out.println("\nI have chosen a number between 1 and 100.");
        System.out.println("You have " + maxAttempts + " attempts.");

        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");

            if (!sc.hasNextInt()) {
                System.out.println("Please enter a valid number.");
                sc.next(); 
                continue;
            }

            int guess = sc.nextInt();
            attempts++;

            if (guess == number) {
                System.out.println("Correct! You guessed the number in " + attempts + " attempts.");
                return maxAttempts - attempts + 1;
            } else if (guess > number) {
                System.out.println("The Number is too high.");
            } else {
                System.out.println("The Number is too low.");
            }
        }

        System.out.println("You have used all attempts.");
        System.out.println("The correct number was: " + number);
        return 0;
    }

    public static void main(String[] args) {

        int totalScore = 0;
        int rounds = 0;
        String choice;

        do {
            int score = startGame();
            totalScore += score;
            rounds++;

            System.out.print("\nDo you want to play again? (Y/N): ");
            choice = sc.next().toLowerCase();

        } while (choice.equals("yes"));

        System.out.println("\nGame Summary");
        System.out.println("Rounds played: " + rounds);
        System.out.println("Total score: " + totalScore);
        System.out.println("Thank you for playing!");
    }
}
