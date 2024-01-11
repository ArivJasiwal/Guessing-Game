import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int randomNumber = (int) (Math.random() * 101); 
        int guess;

        System.out.print("Guess a number from 0 to 100: ");
        guess = scanner.nextInt();

        while (guess != randomNumber) {
            if (guess < randomNumber) {
                System.out.println("Too low!");
            } else {
                System.out.println("Too high!");
            }
            System.out.print("Try again: ");
            guess = scanner.nextInt();
        }

        System.out.println("You got it! The number was " + randomNumber);
    }
}
