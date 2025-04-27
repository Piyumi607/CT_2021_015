package Q03;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the 10 power:");
        int power = scan.nextInt();
        String massage;

        switch (power) {
            case 6:
                massage = "Million";
                break;
            case 9:
                massage = "Billion";
                break;
            case 12:
                massage = "Trillion";
                break;
            case 15:
                massage = "Quadrillion";
                break;
            case 18:
                massage = "Quintillion";
                break;
            case 21:
                massage = "Sextillion";
                break;
            case 30:
                massage = "Nonillion";
                break;
            case 100:
                massage = "Googol";
                break;
            default:
                massage = null;
                break;
        }
        if (massage == null) {
            System.out.println("Invalid value");
        } else {
            System.out.println("your selection:" + massage);
        }
    }
}
