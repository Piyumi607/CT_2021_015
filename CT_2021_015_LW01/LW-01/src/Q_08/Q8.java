package Q_08;
import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String word = scanner.nextLine();
        int length=word.length();
        int index=word.indexOf("!");
        System.out.println(word.substring(0,index));
        System.out.println(word.substring(index+1,length));
    }
}
