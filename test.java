/*
 * File: Breakout.java
 * -------------------
 * Name:
 * Section Leader:
 * 
 * This file will eventually implement the game of Breakout.
 */

import acm.graphics.*;
import acm.program.*;
import acm.util.*;

import java.applet.*;
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
	private static final int PADDLE_Y_OFFSET = 60;

/** Number of bricks per row */
	private static final int NBRICKS_PER_ROW = 10;

/** Number of rows of bricks */
	private static final int NBRICK_ROWS = 10;

/** Separation between bricks */
	private static final int BRICK_SEP = 4;

/** Width of a brick */
	private static final int BRICK_WIDTH =
	  (WIDTH - (NBRICKS_PER_ROW - 1) * BRICK_SEP) / NBRICKS_PER_ROW;

/** Height of a brick */
	private static final int BRICK_HEIGHT = 8;

/** Radius of the ball in pixels */
	private static final int BALL_RADIUS = 10;

/** Offset of the top brick row from the top */
	private static final int BRICK_Y_OFFSET = 70;

/** Number of turns */
	private static final int NTURNS = 3;
	
	private static final GRect PADDLE = new GRect(PADDLE_WIDTH, PADDLE_HEIGHT);
	
	private static final GOval BALL = new GOval(2 * BALL_RADIUS, 2 * BALL_RADIUS);
	
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
	private static final int PAUSE_TIME = 10;
	
	private static final double SPEED = 3.0;

/* Method: run() */
/** Runs the Breakout program. */
	public void run() {
		addMouseListeners();
		setUp();
		ballMovement();
	}
	
    public void ballMovement() {
	    int nBricks = 100;
	    int nTurns = NTURNS;
	    GObject collider = getCollidingObject();
	    ballFalling();
        double vx = rgen.nextDouble(1.0, SPEED);
        double vy = -Math.sqrt(9 - vx * vx);
        if(rgen.nextBoolean(0.5)){
        	vy = -vy;
        }
	    while(nBricks > 0 && nTurns > 0){
			if(BALL.getX() <= -vx){
				BALL.move(vx, vy);
				vx = -vx;
			}
			if(BALL.getX() + 2 * BALL_RADIUS + vx >= getWidth()){
				BALL.move(vx, vy);
				vx = -vx;
			}
			if(BALL.getY() <= -vy){
				BALL.move(vx, vy);
				vy = - vy;
			}
			if(BALL.getY() + 2 * BALL_RADIUS  + vy >= getHeight()){
				ballFalling();
				nTurns--;
			}
            collider = getCollidingObject();
            if(collider != null){
            	vy = -vy;
            }
			if(collider != null && collider != PADDLE){
				remove(getElementAt(BALL.getX(), BALL.getY()));
				nBricks--;
			}
			if(BALL.getX() > vx && BALL.getX() + 2 * BALL_RADIUS + vx < getWidth() && BALL.getY() > vy && BALL.getY() + 2 * BALL_RADIUS + vy < getHeight()){
				BALL.move(vx,  vy);
				pause(PAUSE_TIME);
			}
	    }
	}

	private GObject getCollidingObject() {
		if(getElementAt(BALL.getX(), BALL.getY()) != null){
            return getElementAt(BALL.getX(), BALL.getY());
		}
		else if(getElementAt(BALL.getX(), BALL.getY() + 2 * BALL_RADIUS) != null){
			return getElementAt(BALL.getX(), BALL.getY() + 2 * BALL_RADIUS);
		}
		else if(getElementAt(BALL.getX() + 2 * BALL_RADIUS, BALL.getY() + 2 * BALL_RADIUS) != null){
			return getElementAt(BALL.getX() + 2 * BALL_RADIUS, BALL.getY() + 2 * BALL_RADIUS);
		}
		else if(getElementAt(BALL.getX() + 2 * BALL_RADIUS, BALL.getY()) != null){
			return getElementAt(BALL.getX() + 2 * BALL_RADIUS, BALL.getY());
		}
		else{
			return null;
		}
	}

	private void ballFalling() {
		BALL.setLocation(getWidth() / 2 - BALL_RADIUS, getHeight() / 2 - BALL_RADIUS);
		while((BALL.getY() <= getHeight()) && (getElementAt(BALL.getX(), BALL.getY()) != null) && getElementAt(BALL.getX() + 2 * BALL_RADIUS, BALL.getY()) != null && getElementAt(BALL.getX(), BALL.getY() + 2 * BALL_RADIUS) != null && getElementAt(BALL.getX() + 2 * BALL_RADIUS, BALL.getY() + 2 * BALL_RADIUS) != null){
			BALL.move(0,SPEED);
			pause(PAUSE_TIME);
		}
	}

	private void setUp(){
	    for(int i = 0; i < NBRICK_ROWS; i++){
		drawColumns(i);
	    }
	    drawPaddle();
	    drawBall();
    }

    private void drawBall() {
		BALL.setFilled(true);
		BALL.setColor(Color.BLACK);
		add(BALL, getWidth() / 2 - BALL_RADIUS, getHeight() / 2 - BALL_RADIUS);
	}

	private void drawColumns(int i) {
	    for(int j = 0; j < NBRICKS_PER_ROW; j++){
	    	GRect brick = new GRect(BRICK_SEP * (j + 1) + j * BRICK_WIDTH, BRICK_Y_OFFSET + i* BRICK_HEIGHT + i * BRICK_SEP, BRICK_WIDTH, BRICK_HEIGHT);
	    	brick.setFilled(true);
	    	if(i >= 0 && i < 2){
	    		brick.setColor(Color.RED);
	    	}
	    	if(i >= 2 && i < 4){
	    		brick.setColor(Color.ORANGE);
	    	}
	    	if(i >= 4 && i < 6){
	    		brick.setColor(Color.YELLOW);
	    	}
	    	if(i >= 6 && i < 8){
	    		brick.setColor(Color.GREEN);
	    	}
	    	if(i >= 8 && i < 10){
	    		brick.setColor(Color.CYAN);
	    	}
	    	add(brick);
	    }
    }

	private void drawPaddle() {
		PADDLE.setFilled(true);
		PADDLE.setColor(Color.BLACK);
		add(PADDLE, APPLICATION_WIDTH / 2 - PADDLE_WIDTH / 2, APPLICATION_HEIGHT - PADDLE_Y_OFFSET - PADDLE_HEIGHT);		
	}
    
	public void mouseMoved(MouseEvent e) {
		if (e.getX() >= 0 && e.getX() <= getWidth() - PADDLE_WIDTH) {
			PADDLE.setLocation(e.getX(), getHeight() - PADDLE_Y_OFFSET );
		}
	}
}