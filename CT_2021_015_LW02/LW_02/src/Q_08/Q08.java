package Q_08;
import java.util.Scanner;
public class Q08 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Input r: ");
        int r= scan.nextInt();
        double v= (4.0/3)*(Math.PI*Math.pow(r,3));
        System.out.println("volume of a sphere: " + v);
    }
}
