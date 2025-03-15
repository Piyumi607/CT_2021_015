package Q_03;
import java.util.Scanner;
public class Q03 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter value in Celsius:");
        int c=scan.nextInt();
        double output=(1.8*c)+32;
        System.out.println("Fahrenheit Value:"+output);
    }
}
