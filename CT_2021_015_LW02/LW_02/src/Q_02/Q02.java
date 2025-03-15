package Q_02;
import java.util.Scanner;
public class Q02 {
    public static void main(String[] args) {
    Scanner Scanner =new Scanner(System.in);
        System.out.println("Enter value in Centimeter:");
        float value= Scanner.nextFloat();
        float outputInch=(float) (value/2.54);
        float outputFeet=(float)(outputInch/12);
        System.out.println("Inch Value:"+outputInch);
        System.out.println("Feet Value:"+outputFeet);
    }
}
