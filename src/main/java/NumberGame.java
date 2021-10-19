import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        System.out.println("Hello and Welcome to the Number Guessing Game!");
        System.out.println("What is your name?: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Nice to meet you " + name);
    }
}
