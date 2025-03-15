package Q_03;
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        String firstName, middleName, lastName;
        System.out.println("Enter your FistName:");
        firstName = Scanner.next();
        System.out.println("Enter your MiddleName:");
        middleName = Scanner.next();
        System.out.println("Enter your LastName:");
        lastName = Scanner.next();

        System.out.println(firstName+" "+ middleName.substring(0,1)+"."+ lastName);

    }
}


