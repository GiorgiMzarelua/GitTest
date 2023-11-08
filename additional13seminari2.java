import java.awt.Color;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class additional13seminari2 extends GraphicsProgram{
	private static final int RADIUS = 25;
	public void run(){
		GOval circle = drawCircle();
		
	}
	private GOval drawCircle() {
		GOval circle = new GOval(getWidth() / 2 - RADIUS, 0, 2 * RADIUS, 2* RADIUS);
		circle.setFilled(true);
		circle.setColor(Color.RED);
		add(circle);
		return circle;
	}

}
