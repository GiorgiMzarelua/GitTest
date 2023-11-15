import java.awt.Color;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class problem43 extends GraphicsProgram{
	private static final int RADIUS = 30;
    public void run(){
    	addCircle();
    }
	private void addCircle() {
		GOval circle = new GOval(2 * RADIUS, 2 * RADIUS);
		int x = getWidth() / 2 - RADIUS;
		int y = getHeight() / 2 - RADIUS;
		circle.setFilled(true);
		circle.setColor(Color.BLACK);
		add(circle, x, y);
	}
}
