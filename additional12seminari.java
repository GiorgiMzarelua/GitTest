import java.awt.Color;

import acm.graphics.GLabel;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;
public class additional12seminari extends GraphicsProgram{
	private static final int RADIUS = 50;
	private static final int NUM_EXPERIMENTS = 10;
	private static final int PAUSE_TIME = 1000;
	private RandomGenerator rgen = RandomGenerator.getInstance();
    public void run(){
    	int RED = 0;
    	int GREEN = 0;
    	for(int i = 0; i < NUM_EXPERIMENTS; i++){ 
    		GOval ball = drawCircle(RED, GREEN);
    		remove(ball);
    		pause(PAUSE_TIME);
    	}
    }
    
	private GOval drawCircle(int RED, int GREEN) {
		GOval circle = new GOval(getWidth() / 2 - RADIUS, getHeight() / 2 - RADIUS, 2 * RADIUS, 2 * RADIUS);
		int k = rgen.nextInt(0, 1);
		circle.setFilled(true);
		if(k == 0){
			circle.setColor(Color.RED);
			RED++;
		}
		else{
			circle.setColor(Color.GREEN);
			GREEN++;
		}
		add(circle);
		if(k == 0){
			drawHeads();
		}
		else{
			drawTails();
		}
		return circle;
	}
	private void drawTails() {
		double x = getWidth() / 2 - 15;
		double y = getHeight() / 2;
		add(new GLabel("TAILS", x, y));
		
	}
	private void drawHeads() {
		double x = getWidth() / 2 - 20;
		double y = getHeight() / 2;
		add(new GLabel("HEADS", x, y));
	}
}
