import java.awt.Color;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.*;
public class problem33 extends GraphicsProgram{
	public static final int STARTING_RANGE = 199;
	public static final int FINAL_RANGE = 200;
    public void run(){
    	RandomGenerator rgen = new RandomGenerator();
    	int radius =  rgen.nextInt(STARTING_RANGE, FINAL_RANGE);
    	GOval circle = new GOval(getWidth() / 2 - radius, getHeight() / 2 - radius, 2* radius, 2 * radius);
    	circle.setFilled(true);
    	Color randColor = rgen.nextColor();
    	circle.setColor(randColor);
    	add(circle);
    }
}
