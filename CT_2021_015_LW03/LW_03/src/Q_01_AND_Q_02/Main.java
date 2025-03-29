package Q_01_AND_Q_02;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter the temperature celsius:");
        double celsius=scan.nextDouble();

        Temperature temp=new Temperature();
        temp.setcelsius(celsius);
        System.out.println("the celsius is convert in to fahrenheit:"+temp.toFahrenheit());
    }


}
