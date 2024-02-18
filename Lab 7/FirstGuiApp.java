import javax.swing.*;
import java.util.Date;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class FirstGuiApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Combined App");
        frame.setLayout(new BorderLayout());

        DateTimePanel dateTimePanel = new DateTimePanel();
        MarqueePanel marqueePanel = new MarqueePanel(" Made By Mostafa Roshdy ");

        frame.add(dateTimePanel, BorderLayout.NORTH);
        frame.add(marqueePanel, BorderLayout.CENTER);

        frame.setSize(1920, 1080);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}


