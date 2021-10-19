import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        System.out.println("Hello and Welcome to the Number Guessing Game!");
        System.out.println("What is your name?: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Nice to meet you " + name);

        System.out.println("Would you like to start the game?:");
        System.out.println("\t1.Yes");
        System.out.println("\t2.No");
        int gameStart = scanner.nextInt();

        while (gameStart != 1) {
            System.out.println("Would you like to start the game?:");
            System.out.println("\t1.Yes");
            System.out.println("\t2.No");
            gameStart = scanner.nextInt();
        }

        Random random = new Random();
        int number = random.nextInt(20) + 1;
        System.out.println("Guess a Number Below 20:");
        int guess = scanner.nextInt();

        int attempts = 0;
        boolean hasWon = false;
        boolean shouldFinish = false;

        while (!shouldFinish) {
            attempts++;

            if (attempts < 5) {
                if (guess == number) {
                    hasWon = true;
                    shouldFinish = true;
                }
                else if (guess > number) {
                    System.out.println("Guess lower");
                    guess = scanner.nextInt();
                }
                else {
                    System.out.println("Guess Higher");
                    guess = scanner.nextInt();
                }
            }
            else {
                shouldFinish = true;
            }
        }
        if (hasWon) {
            System.out.println("Congrats. You guessed " + attempts + " times.");
        }
        else {
            System.out.println("Game Over");
            System.out.println("The Number was: " + number);
        }

    }
}
