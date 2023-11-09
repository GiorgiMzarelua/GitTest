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
    		int k = rgen.nextInt(0, 1);
    		GOval ball = drawCircle(k);
    		if(k == 0){
    			RED++;
    			GLabel HT = drawHeads();
    			GLabel numOfReds = drawRedNumber(RED);
    			pause(PAUSE_TIME / 2);
        		remove(ball);
        		remove(HT);
        		remove(numOfReds);
    		}
    		else{
    			GREEN++;
    			GLabel HT = drawTails();
    			GLabel numOfGreens = drawGreenNumber(GREEN);
    			pause(PAUSE_TIME / 2);
        		remove(ball);
        		remove(HT);
        		remove(numOfGreens);
    		}
    		pause(PAUSE_TIME / 2);
    	}
    }
    
	private GLabel drawGreenNumber(int GREEN) {
		double x = getWidth() - 100;
		double y = 35;
		GLabel z = new GLabel("Number of heads: " + GREEN, x, y);
		add(z);
		return z;
	}

	private GLabel drawRedNumber(int RED) {
		double x = getWidth() - 100;
		double y = 25;
		GLabel z = new GLabel("Number of heads: " + RED, x, y);
		add(z);
		return z;

	}

	private GOval drawCircle(int k) {
		GOval circle = new GOval(getWidth() / 2 - RADIUS, getHeight() / 2 - RADIUS, 2 * RADIUS, 2 * RADIUS);
		circle.setFilled(true);
		if(k == 0){
			circle.setColor(Color.RED);
		}
		else{
			circle.setColor(Color.GREEN);
		}
		add(circle);
		return circle;
	}
	private GLabel drawTails() {
		double x = getWidth() / 2 - 15;
		double y = getHeight() / 2;
		GLabel z = new GLabel("TAILS", x, y);
		add(z);
		return z;
	}
	private GLabel drawHeads() {
		double x = getWidth() / 2 - 18;
		double y = getHeight() / 2;
		GLabel z = new GLabel("HEADS", x, y);
		add(z);
		return z;
	}
}
