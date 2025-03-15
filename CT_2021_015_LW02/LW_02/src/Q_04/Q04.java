package Q_04;

import java.util.Scanner;
public class Q04 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Body weight:");
        int BW=scan.nextInt();
        double output=BW*19;
        System.out.println("Calories:"+output);
    }
}
