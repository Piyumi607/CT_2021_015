package Q_10;
import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter  word:");
            String input = scanner.nextLine();

            int length = input.length();
            int middleIndex = length / 2;
            System.out.print("Middle character is:");
            System.out.println(input.substring(middleIndex, middleIndex + 1));

    }

}
