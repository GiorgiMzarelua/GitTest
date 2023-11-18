import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class test extends JFrame implements ActionListener {
    private Timer timer;
    private int ballX, ballY, ballXDir, ballYDir;
    private int paddleX, paddleY;
    private int paddleWidth = 80;
    private int ballDiameter = 20;
    private int brickRowCount = 5;
    private int brickColumnCount = 10;
    private int brickWidth = 60;
    private int brickHeight = 20;
    private int[][] bricks;

    public test() {
        setTitle("Breakout Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setResizable(false);
        setLocationRelativeTo(null);

        // Make JFrame focusable
        setFocusable(true);
        requestFocusInWindow();

        addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                movePaddle(e);
            }
        });

        initGame();
    }

    public void initGame() {
        ballX = 350;
        ballY = 250;
        ballXDir = -1;
        ballYDir = -2;

        paddleX = 350;
        paddleY = 520;

        bricks = new int[brickRowCount][brickColumnCount];
        for (int i = 0; i < brickRowCount; i++) {
            for (int j = 0; j < brickColumnCount; j++) {
                bricks[i][j] = 1;
            }
        }

        timer = new Timer(5, this);
        timer.start();
    }

    public void paint(Graphics g) {
        // Background
        g.setColor(Color.black);
        g.fillRect(1, 1, 800, 600);

        // Drawing bricks
        for (int i = 0; i < brickRowCount; i++) {
            for (int j = 0; j < brickColumnCount; j++) {
                if (bricks[i][j] == 1) {
                    g.setColor(Color.white);
                    g.fillRect(j * brickWidth + 80, i * brickHeight + 50, brickWidth, brickHeight);
                }
            }
        }

        // Drawing paddle
        g.setColor(Color.blue);
        g.fillRect(paddleX, paddleY, paddleWidth, 8);

        // Drawing the ball
        g.setColor(Color.yellow);
        g.fillOval(ballX, ballY, ballDiameter, ballDiameter);

        if (ballY > 570) {
            timer.stop();
            g.setColor(Color.red);
            g.drawString("Game Over", 360, 300);
        }

        g.dispose();
    }

    public void movePaddle(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT && paddleX <= 720) {
            paddleX += 20;
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT && paddleX >= 0) {
            paddleX -= 20;
        }
        repaint();
    }

    public void actionPerformed(ActionEvent e) {
        ballX += ballXDir;
        ballY += ballYDir;

        if (ballX <= 0 || ballX >= 780) {
            ballXDir = -ballXDir;
        }

        if (ballY <= 0 || ballY >= 570) {
            ballYDir = -ballYDir;
        }

        if (ballX >= paddleX && ballX <= paddleX + paddleWidth && ballY >= paddleY && ballY <= paddleY + 8) {
            ballYDir = -ballYDir;
        }

        for (int i = 0; i < brickRowCount; i++) {
            for (int j = 0; j < brickColumnCount; j++) {
                int brickX = j * brickWidth + 80;
                int brickY = i * brickHeight + 50;
                int brickWidth = 60;
                int brickHeight = 20;

                if (bricks[i][j] == 1 && ballX >= brickX && ballX <= brickX + brickWidth && ballY >= brickY && ballY <= brickY + brickHeight) {
                    bricks[i][j] = 0;
                    ballYDir = -ballYDir;
                }
            }
        }

        repaint();
    }

    public static void main(String[] args) {
        test game = new test();
        game.setVisible(true);
    }
}