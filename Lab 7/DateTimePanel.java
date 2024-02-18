import javax.swing.*;
import java.util.Date;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DateTimePanel extends JPanel implements Runnable {
    private Thread th;
    private JLabel timeLabel;

    public DateTimePanel() {
        timeLabel = new JLabel();
        timeLabel.setHorizontalAlignment(JLabel.CENTER);
        add(timeLabel);

        th = new Thread(this);
        th.start();
    }

    public void run() {
        while (true) {
            Date d = new Date();
            timeLabel.setText(d.toString());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

