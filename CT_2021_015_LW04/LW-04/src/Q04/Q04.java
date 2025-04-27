package Q04;
import java.util.Scanner;
public class Q04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the year:");
        int year= scan.nextInt();
        boolean isLeapYear=false;
        if(year%4==0){
            if(year%400==0||year%100!=0){
                isLeapYear=true;
            }
        }
        if(isLeapYear){
            System.out.println("The given year("+year+")"+"is leap year");
        }
        else{
            System.out.println("The given year("+year+")"+"is not leap year");
        }
    }

}
