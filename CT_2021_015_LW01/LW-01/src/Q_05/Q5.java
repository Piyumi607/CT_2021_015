package Q_05;
import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;
public class Q5 {
    public static void main(String[] args) {
        Date today;
        SimpleDateFormat sdf;
        today = new Date( );
        sdf = new SimpleDateFormat("EEEE,MMMM dd,yyyy");
        System.out.println(sdf.format(today));
    }

}
