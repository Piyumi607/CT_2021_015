package Q_02;
import javax.swing.*;
import java.util.Scanner;

public class Q2 {

        public static void main(String[]args){
            Scanner Scanner =new Scanner(System.in) ;
            String firstName,lastName;
            System.out.println("Enter your FistName");
            firstName= Scanner.next();
            System.out.println("Enter your LastName");
            lastName=Scanner.next();

            JFrame myWindow;
            myWindow = new JFrame();
            myWindow.setSize(300, 400);
            myWindow.setTitle(firstName+" "+lastName);
            myWindow.setVisible(true);


        }


    }
