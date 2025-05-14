package Q6;
import java.util.Scanner;
import java.util.Random;
public class Q06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int guess;
        int attempts=0;
        int secretNumber = rand.nextInt(100) + 1;
        System.out.println("Welcome to the number guessing game!");
        do{
            System.out.println("Enter your guess(1-100)");
            guess=input.nextInt();
            attempts++;
            
            if(guess>secretNumber){
                System.out.println("Higher");
            }
            else if(guess<secretNumber){
                System.out.println("Lower");
            }
            else{
                System.out.println("Congratulations! you guessed the secret number correctly in"+attempts+"attempts");
            }
        }while (guess!=secretNumber);
    }
}
