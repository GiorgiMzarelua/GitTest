
import acm.graphics.*;
import acm.program.*;
import acm.util.*;
import java.awt.*;
import java.awt.event.*;

public class test extends GraphicsProgram {

	/** Width and height of application window in pixels */
	public static final int APPLICATION_WIDTH = 400;
	public static final int APPLICATION_HEIGHT = 600;

	/** Dimensions of game board (usually the same) */
	private static final int WIDTH = APPLICATION_WIDTH;
	private static final int HEIGHT = APPLICATION_HEIGHT;

	/** Dimensions of the paddle */
	private static final int PADDLE_WIDTH = 60;
	private static final int PADDLE_HEIGHT = 10;

	/** Offset of the paddle up from the bottom */
	private static final int PADDLE_Y_OFFSET = 50;

	/** Number of bricks per row */
	private static final int NBRICKS_PER_ROW = 10;

	/** Number of rows of bricks */
	private static final int NBRICK_ROWS = 10;

	/** Separation between bricks */
	private static final int BRICK_SEP = 4;

	/** Width of a brick */
	private static final int BRICK_WIDTH = (WIDTH - (NBRICKS_PER_ROW - 1) * BRICK_SEP) / NBRICKS_PER_ROW;

	/** Height of a brick */
	private static final int BRICK_HEIGHT = 8;

	/** Radius of the ball in pixels */
	private static final int BALL_RADIUS = 10;

	/** Offset of the top brick row from the top */
	private static final int BRICK_Y_OFFSET = 70;

	/** Number of turns */
	private static final int NTURNS = 3;

	private static final int DELAY = 10;

	private GRect paddle;
	private GOval ball;
	private double vx;
	private double vy;
	private boolean finishGame = false;
	private int allBricks = NBRICK_ROWS * NBRICKS_PER_ROW;
	private RandomGenerator rgen = RandomGenerator.getInstance();

	/* Method: run() */
	/** Runs the Breakout program. */
	public void run() {
		int turnsLeft = NTURNS;
		// Bricks should be created at first so after losing a heart removed
		// bricks will be remembered
		createBricks();
		while (turnsLeft > 0 && !finishGame) {
			createInstruments();
			letsPlay();
			// Reset paddle and ball after losing a heart
			if (turnsLeft >= 1) {
				removePaddleAndBall();
				// User has no hearts left
			} else {
				removeAll();
			}
			turnsLeft--;
		}
		// User lost a game
		if (!finishGame) {
			stopGame();
		}
	}

	private boolean gameRunning = true;

	private void createInstruments() {
		createPaddle();
		createBall();
	}

	private void removePaddleAndBall() {
		remove(paddle);
		remove(ball);
	}

	// Check wall collisions
	private void checkWalls() {
		if (ball.getX() + vx < 0 || ball.getX() + BALL_RADIUS * 2 + vx > WIDTH) {
			vx = -vx;
		}

		if (ball.getY() + vy < 0) {
			vy = -vy;
		}
		// Ball touched a south wall so user should lose one heart
		if (ball.getY() + BALL_RADIUS * 2 + vy > HEIGHT) {
			gameRunning = false;
		}
	}

	// Run the game
	private void letsPlay() {
		waitForClick();
		gameRunning = true;
		while (gameRunning) {
			ball.move(vx, vy);
			pause(DELAY);
			checkWalls();
			// Collider for touches between ball and brick
			GObject collider = getCollidingObject();
			// Collider for touches between ball and paddle
			GObject colliderPad = getCollidingObjectPaddle();
			// Ball touched a brick
			if (collider != null && collider != paddle) {
				vy = -vy;
				allBricks--;
				// Check the number of bricks. If there are no bricks left, user
				// won the game
				if (allBricks == 0) {
					youWon();
					finishGame = true;
					break;
				}
				remove(collider);

				// Ball touched a paddle
			} else if (colliderPad == paddle && colliderPad != null) {
				vy = -vy;
				// This trick solves a minor bug when the ball sticks to the
				// paddle
				ball.move(0, -4);
			}
		}
	}

	// Ball movement at first randomized
	private void ballRandMove() {
		vy = 4.0;
		vx = rgen.nextDouble(1.0, 3.0);
		if (rgen.nextBoolean(0.5)) {
			vx = -vx;
		}
	}

	// Draw bricks
	private void createBricks() {
		int x = (WIDTH - (NBRICKS_PER_ROW - 1) * BRICK_SEP - NBRICKS_PER_ROW * BRICK_WIDTH) / 2;
		int y = BRICK_Y_OFFSET;

		for (int i = 0; i < NBRICK_ROWS; i++) {
			for (int j = 0; j < NBRICKS_PER_ROW; j++) {
				Color color = Color.red;
				if (i == 2 || i == 3)
					color = Color.orange;
				if (i == 4 || i == 5)
					color = Color.yellow;
				if (i == 6 || i == 7)
					color = Color.green;
				if (i == 8 || i == 9)
					color = Color.cyan;

				GRect brick = new GRect(x, y, BRICK_WIDTH, BRICK_HEIGHT);
				brick.setFilled(true);
				brick.setColor(color);
				add(brick);

				x += BRICK_WIDTH + BRICK_SEP;
			}

			x = (WIDTH - (NBRICKS_PER_ROW - 1) * BRICK_SEP - NBRICKS_PER_ROW * BRICK_WIDTH) / 2;
			y += BRICK_HEIGHT + BRICK_SEP;
		}
	}

	// Method to check if the ball touched a brick. We need to check all 4
	// coordinates of a square in which our ball is located so all the possible
	// variants would be checked
	private GObject getCollidingObject() {
		double x = ball.getX();
		double y = ball.getY();

		GObject topL = getElementAt(x, y);
		GObject topR = getElementAt(x + 2 * BALL_RADIUS, y);
		GObject botL = getElementAt(x, y + 2 * BALL_RADIUS);
		GObject botR = getElementAt(x + 2 * BALL_RADIUS, y + 2 * BALL_RADIUS);

		if (topL != null) {
			return topL;
		} else if (topR != null) {
			return topR;
		} else if (botL != null) {
			return botL;
		} else if (botR != null) {
			return botR;
		} else {
			return null;
		}
	}

	// Method to check if the ball touched a paddle. We only need to check
	// bottom left and bottom right coordinates of ball. This is the only cases
	// when the ball reflects from the paddle
	private GObject getCollidingObjectPaddle() {
		double x = ball.getX();
		double y = ball.getY();

		GObject botL = getElementAt(x, y + 2 * BALL_RADIUS);
		GObject botR = getElementAt(x + 2 * BALL_RADIUS, y + 2 * BALL_RADIUS);

		if (botL != null) {
			return botL;
		} else if (botR != null) {
			return botR;
		} else {
			return null;
		}
	}

	// Creating a paddle
	private void createPaddle() {
		paddle = new GRect(PADDLE_WIDTH, PADDLE_HEIGHT);
		paddle.setFilled(true);
		paddle.setColor(Color.black);
		add(paddle, (WIDTH - PADDLE_WIDTH) / 2, HEIGHT - PADDLE_Y_OFFSET);
		addMouseListeners();
	}

	// Creating a ball
	private void createBall() {
		ball = new GOval(BALL_RADIUS * 2, BALL_RADIUS * 2);
		ball.setFilled(true);
		ball.setColor(Color.black);
		add(ball, WIDTH / 2 - BALL_RADIUS, HEIGHT / 2 - BALL_RADIUS);
		ballRandMove();
	}

	// Mouse moves a paddle
	public void mouseMoved(MouseEvent e) {
		if (e.getX() >= 0 && e.getX() <= WIDTH - PADDLE_WIDTH) {
			paddle.setLocation(e.getX(), HEIGHT - PADDLE_Y_OFFSET);
		}
	}

	// Player lost a game
	private void stopGame() {
		removeAll();
		GLabel gameOver = new GLabel("GAME OVER!");
		gameOver.setFont("SansSerif-bold-36");
		gameOver.setColor(Color.RED);
		double x = (getWidth() - gameOver.getWidth()) / 2;
		double y = (getHeight() + gameOver.getAscent()) / 2;
		add(gameOver, x, y);
	}

	// Player won a game
	private void youWon() {
		removeAll();
		GLabel winMessage = new GLabel("YOU WON!");
		winMessage.setFont("SansSerif-bold-36");
		winMessage.setColor(Color.GREEN);
		double x = (getWidth() - winMessage.getWidth()) / 2;
		double y = (getHeight() + winMessage.getAscent()) / 2;
		add(winMessage, x, y);
	}
}