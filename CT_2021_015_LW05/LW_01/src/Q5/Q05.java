package Q5;
import java.util.Scanner;
public class Q05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word:");
        String word = scanner.nextLine();

        if (isPalindrome(word)) {
            System.out.println("The given word is a palindrome.");
        } else {
            System.out.println("The given word is not a palindrome.");
        }

        scanner.close();
    }

    public static boolean isPalindrome(String word) {
        String reverseWord = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reverseWord += word.charAt(i);
        }
        return word.equalsIgnoreCase(reverseWord);
    }
}
