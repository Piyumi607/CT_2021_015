package Q3;
import java.util.Scanner;
public class Q03 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N;
        System.out.println("Enter N:");
        N= scanner.nextInt();

        for (int i=1;i<=10;i++){
            int result=N*i;
            System.out.println("Result Is:"+N+"*"+i+"="+result);
        }
    }
}
