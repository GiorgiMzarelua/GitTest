import java.awt.Color;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;
public class additional13seminari3 extends GraphicsProgram{
	private static final int RADIUS = 35;
	private RandomGenerator rgen = RandomGenerator.getInstance();
    public void run(){
        GOval randomBall = drawBall();
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
