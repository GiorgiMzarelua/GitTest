import java.awt.Color;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class Nim extends GraphicsProgram{
	public static final int N_COINS = 11; 
	public static final int COIN_SIZE = 25; 
	public static final int COIN_SEP = 10;
    public void run(){
    	addBalls();
    }

	private void addBalls() {
		for(int i = 0; i < N_COINS; i++){
			GOval ball = new GOval (COIN_SIZE, COIN_SIZE);
			double x = i * COIN_SIZE + i * COIN_SEP;
			double y = getHeight() / 2 - COIN_SIZE / 2;
			ball.setFilled(true);
			ball.setColor(Color.GRAY);
			add(ball, x, y);
		}
	}
}
