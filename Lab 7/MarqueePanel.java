import javax.swing.*;
import java.awt.*;

public class MarqueePanel extends JPanel {
    private JLabel marqueeLabel;
    private int xPosition; 
    private final int moveDistance = 10;

    public MarqueePanel(String marqueeStr) {
        this.marqueeLabel = new JLabel(marqueeStr);
        this.marqueeLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        this.xPosition = getWidth();
        add(marqueeLabel);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(100);
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
            xPosition = getWidth();
        }
        marqueeLabel.setLocation(xPosition, 0);
    }
}

