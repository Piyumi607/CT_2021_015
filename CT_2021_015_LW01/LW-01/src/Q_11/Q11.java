package Q_11;
import java.util.Scanner;
public class Q11 {
    public static void main(String[] args) {
            Scanner name = new Scanner(System.in);
            String firstName, middleName, lastName;
            System.out.println("Enter your FistName:");
            firstName = name.next();
            System.out.println("Enter your MiddleName:");
            middleName = name.next();
            System.out.println("Enter your LastName:");
            lastName = name.next();
            System.out.println(lastName + "," + firstName + " " + middleName.substring(0, 1)+".");
        }
    }


