import javax.swing.*;
import java.awt.*;


class FirstGuiApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Combined App");
        frame.setLayout(new BorderLayout());

        DateTimePanel dateTimePanel = new DateTimePanel();
        MarqueePanel marqueePanel = new MarqueePanel(" Made By Mostafa Roshdy ");
        RandomBallPanel ballPanel = new RandomBallPanel(); 

        frame.add(dateTimePanel, BorderLayout.NORTH);
        frame.add(marqueePanel, BorderLayout.CENTER);
        frame.add(ballPanel, BorderLayout.SOUTH);

        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

  

