package Q_06;
import javax.swing.*;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter window width (W): ");
        int width = scanner.nextInt();
        System.out.println("Enter window height (H): ");
        int height = scanner.nextInt();
        System.out.println("Enter window title: ");
        String W_title = scanner.next();


        JFrame myWindow;
        myWindow = new JFrame();
        myWindow.setSize(width, height);
        myWindow.setTitle(W_title);
        myWindow.setVisible(true);
    }

}
