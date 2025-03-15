package Q_07;
import java.util.Scanner;
public class Q07 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter weight(kg):");
        int weight=scan.nextInt();
        System.out.println("Enter height(cm):");
        int height= scan.nextInt();
        Double BMI= (Double) (weight/Math.pow((height/100.0),2));
        System.out.println("BMI is:"+BMI);
    }
}
