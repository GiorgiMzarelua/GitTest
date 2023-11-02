import acm.graphics.*;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

import java.awt.*;

public class problem34 extends GraphicsProgram{
	public static final int MIN_RADIUS = 10;
	public static final int MAX_RADIUS = 20;
	public static final int NUM_CIRCLES = 1000;
	private RandomGenerator rgen = RandomGenerator.getInstance();
    public void run(){
    	for(int i = 0; i < NUM_CIRCLES; i++){
    		addCircles();
    	}
    }
	private void addCircles() {
		int radius = rgen.nextInt(MIN_RADIUS, MAX_RADIUS);
		double x = rgen.nextDouble(0, getWidth() - 2 * radius);
		double y = rgen.nextDouble(0, getHeight() - 2 * radius);
		Color color = rgen.nextColor();
		
		GOval circle = new GOval(2 * radius, 2 * radius);
		circle.setFilled(true);
    	circle.setColor(color);
    	add(circle, x, y);
	}
}
