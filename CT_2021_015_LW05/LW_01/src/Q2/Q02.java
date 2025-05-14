package Q2;
import java.util.Scanner;
public class Q02 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num;
        do{
            System.out.println("Enter a num:");
            num=scanner.nextInt();

            if(num>=0){
                int digit=digitCount(num);
                System.out.println("The no has"+digit+" digit");
            }

        }while (num>=0);

    }
    public static int digitCount(int num){
        int count=0;
        while (num>0){
            num=num/10;
            count ++;
        }
        return count;
    }
}
