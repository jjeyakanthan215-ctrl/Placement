import java.util.Scanner;
public class guess {
    public static void main(String[] args) {
        System.out.println("Guess a number between 1 and 10:");
        Scanner sc = new Scanner(System.in);
        int number = 7;
        int guess;
        
        do {
            guess = sc.nextInt();
            if (guess < number) {
                System.out.println("Too low! Try again:");
            } else if (guess > number) {
                System.out.println("Too high! Try again:");
            }
            }while (guess != number);{
                System.out.println("Congratulations! You guessed the number.");
        }
    }
}
