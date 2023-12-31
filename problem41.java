import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class problem41 extends GraphicsProgram{
	private static final int RADIUS = 15;
	private RandomGenerator rgen = RandomGenerator.getInstance();
	public void run(){
		addMouseListeners();
		
	}
	public void mouseDragged(MouseEvent e){
		addBrush(e.getX(), e.getY());
	}
	private void addBrush(int centerX, int centerY) {
		GOval circle = new GOval(2 * RADIUS, 2 * RADIUS);
		circle.setFilled(true);
		Color color = rgen.nextColor();
		circle.setColor(color);
		add(circle, centerX - RADIUS, centerY - RADIUS);
	}
}
