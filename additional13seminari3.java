import java.awt.Color;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;
public class additional13seminari3 extends GraphicsProgram{
	private static final int RADIUS = 25;
	private static final int PAUSE_TIME = 20;
	private static final int INITIAL_VELOCITY = 5;
	private RandomGenerator rgen = RandomGenerator.getInstance();
    public void run(){
        GOval randomBall = drawBall();
        double a = rgen.nextDouble(0,INITIAL_VELOCITY);
        double b = Math.sqrt(INITIAL_VELOCITY * INITIAL_VELOCITY - a * a);
        int c = rgen.nextInt(0, 1);
        if(c == 0){
        	a = -a;
        }
        int d = rgen.nextInt(1, 2);
        if(d == 1){
        	b = -b;
        }
        while(true){
        	if(randomBall.getX() <= a){
        		while(randomBall.getX() >= a && randomBall.getX() <= getWidth() - 2 * RADIUS - b && randomBall.getY() >= a && randomBall.getY() <= getHeight() - 2 * RADIUS - b) 
            	{ 
            		randomBall.move(-a, b);
        			pause(PAUSE_TIME);
            	}
        	}
        	if(randomBall.getY() <= b){
        		while(randomBall.getX() >= a && randomBall.getX() <= getWidth() - 2 * RADIUS - b && randomBall.getY() >= a && randomBall.getY() <= getHeight() - 2 * RADIUS - b) 
            	{
            		randomBall.move(a, -b);
        			pause(PAUSE_TIME);
            	}
        	}
        	if(randomBall.getX() >= getWidth() - 2 * RADIUS){
        		while(randomBall.getX() >= a && randomBall.getX() <= getWidth() - 2 * RADIUS - b && randomBall.getY() >= a && randomBall.getY() <= getHeight() - 2 * RADIUS - b) 
            	{
            		randomBall.move(-a, b);
        			pause(PAUSE_TIME);
            	}
        	}
        	if(randomBall.getY() >= getHeight() - 2 * RADIUS){
        		while(randomBall.getX() >= a && randomBall.getX() <= getWidth() - 2 * RADIUS - b && randomBall.getY() >= a && randomBall.getY() <= getHeight() - 2 * RADIUS - b) 
            	{
            		randomBall.move(a, -b);
        			pause(PAUSE_TIME);
            	}
        	}
        	else{
        		while(randomBall.getX() >= a && randomBall.getX() <= getWidth() - 2 * RADIUS - b && randomBall.getY() >= a && randomBall.getY() <= getHeight() - 2 * RADIUS - b) 
            	{
            		randomBall.move(a, b);
        			pause(PAUSE_TIME);
            	} 
        	}
        }
    }
	private GOval drawBall() {
		GOval circle = new GOval(getWidth() / 2 - RADIUS, getHeight() / 2 - RADIUS, 2 * RADIUS, 2 * RADIUS);
		circle.setFilled(true);
		Color color = rgen.nextColor();
		circle.setColor(color);
		add(circle);
		return circle;
	}
}
