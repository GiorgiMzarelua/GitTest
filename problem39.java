import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class problem39 extends GraphicsProgram{
	private static final int PAUSE_TIME = 20;
	private static final int INITIAL_VELOCITY = 4;
	private static final int RADIUS = 15;
	public void run(){
		drawCircle();
	}
	private void drawCircle() {
		GOval circle = new GOval(0, getHeight() / 2 - RADIUS, 2 * RADIUS, 2 * RADIUS);
		circle.setFilled(true);
		add(circle);
	}

}
