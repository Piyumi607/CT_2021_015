package Q02;
import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a num between(0-4):");
        int number=scan.nextInt();
        String color;
        switch (number){
            case 0:
                color="Magenta";
                break;
            case 1:
                color="Cyan";
                break;
            case 2:
                color="Red";
                break;
            case 3:
                color="Blue";
                break;
            case 4:
                color="Green";
                break;
            default:
                color=null;
                break;

        }

        if(color==null){
            System.out.println("Invalid Selection");
        }
        else{
            System.out.println("You are selected:"+color);
        }
    }
}
