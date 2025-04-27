package Q01;
import java.util.Scanner;
public class Q01 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter First integer:");
        int num1= scan.nextInt();
        System.out.println("Enter Second integer:");
        int num2= scan.nextInt();
        System.out.println("Enter Third integer:");
        int num3= scan.nextInt();

        int smallest=num1;
        if (num2<smallest){
            smallest=num2;
        }
        if(num3<smallest){
            smallest=num3;
        }

        System.out.println("Smallest Value:"+smallest);
    }
}
