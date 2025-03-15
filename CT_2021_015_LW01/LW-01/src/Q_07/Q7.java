package Q_07;
import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Q7 {
    public static void main(String[] args) {
        Date today;
        SimpleDateFormat sdf;
        today = new Date( );
        sdf = new SimpleDateFormat("HH:mm:ss a");

        JFrame myWindow;
        myWindow = new JFrame();
        myWindow.setSize(600, 600);
        myWindow.setTitle(sdf.format(today));
        myWindow.setVisible(true);
    }

}
