import javax.swing.*;
import java.awt.*;

public class MarqueePanel extends JPanel {
    private JLabel marqueeLabel;
    private int xPosition; // Current x position of the marquee label
    private final int moveDistance = 1; // Distance to move in each step

    public MarqueePanel(String marqueeStr) {
        this.marqueeLabel = new JLabel(marqueeStr);
        this.marqueeLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        this.xPosition = getWidth(); // Start the label from the right
        add(marqueeLabel);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(1); // Adjust the sleep time as needed
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    moveLabel();
                }
            }
        });
        thread.start();
    }

    private void moveLabel() {
        xPosition -= moveDistance;
        if (xPosition < -marqueeLabel.getWidth()) {
            xPosition = getWidth(); // Reset the position when it goes out of the frame
        }
        marqueeLabel.setLocation(xPosition, 0);
    }
}

