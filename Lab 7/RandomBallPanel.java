import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class RandomBallPanel extends JPanel implements Runnable {
    private final int BALL_SIZE = 50; 
    private Image ballImage;
    private int ballX, ballY;
    private int ballSpeedX, ballSpeedY;

    public RandomBallPanel() {
        setPreferredSize(new Dimension(400, 500)); 
        setBackground(Color.GREEN);

        ballImage = new ImageIcon("src/ball.png").getImage();
        ballX = getWidth() / 2 - BALL_SIZE / 2;
        ballY = getHeight() / 2 - BALL_SIZE / 2;
        generateRandomSpeed();
        Thread thread = new Thread(this);
        thread.start();
        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                handleResize();
            }
        });
    }

    private void generateRandomSpeed() {
        Random random = new Random();
        ballSpeedX = random.nextInt(6) - 3;
        ballSpeedY = random.nextInt(6) - 3;
    }

    private void handleResize() {
        ballX = getWidth() / 2 - BALL_SIZE / 2;
        ballY = getHeight() / 2 - BALL_SIZE / 2;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (ballImage != null) {
            g.drawImage(ballImage, ballX, ballY, BALL_SIZE, BALL_SIZE, this);
        }
    }

    @Override
    public void run() {
        while (true) {
            ballX += ballSpeedX;
            ballY += ballSpeedY;

            if (ballX < 0 || ballX + BALL_SIZE > getWidth()) {
                ballSpeedX = -ballSpeedX;
            }
            if (ballY < 0 || ballY + BALL_SIZE > getHeight()) {
                ballSpeedY = -ballSpeedY;
            }

            repaint();

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
