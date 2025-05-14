package Q4;
import java.util.Scanner;
public class Q04 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter Row:");
        int row=scanner.nextInt();
        int space=row-1;
        int asterisks=1;

        for(int i=0;i<row;i++){
            for(int j=0;j<space;j++){
                System.out.print(" ");
            }
            for(int k=0;k<asterisks;k++){
                System.out.print("*");
            }
            System.out.println();
            asterisks +=2;
            space--;
        }
    }

}
