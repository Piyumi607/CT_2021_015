package Q_06;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Born year: ");
        int born_year= scan.nextInt();
        Date date=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy");
        int age= Integer.parseInt(sdf.format(date))-born_year;
        System.out.println("You were born in "+ born_year+" " +"and will be (are)"+" " +
                age+ " " +"this year");
    }
}
