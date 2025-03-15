package Q_05;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter value in Fahrenheit:");
        int F=scan.nextInt();
        double output=(9/5)*(F-32);
        System.out.println("Celsius Value:"+output);
    }
}
