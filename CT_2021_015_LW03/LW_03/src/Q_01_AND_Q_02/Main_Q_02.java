package Q_01_AND_Q_02;
import java.util.Scanner;

public class Main_Q_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the temperature fahrenheit:");
        double fahrenheit=scan.nextDouble();

        Temperature temp1=new Temperature();
        temp1.setFahrenheit(fahrenheit);
        System.out.println("the fahrenheit is convert in to celsius :"+temp1.tocelsius());


    }

}
