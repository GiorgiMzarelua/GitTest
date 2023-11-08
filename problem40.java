import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class problem40 extends GraphicsProgram{
	private static final int PAUSE_TIME = 20;
	private static final int INITIAL_VELOCITY = 4;
	private static final int RADIUS = 25;
	public void run(){
		GOval circle = new GOval(0, getHeight() / 2 - RADIUS, 2 * RADIUS, 2 * RADIUS);
		circle.setFilled(true);
		add(circle);
		
		int finalX = getWidth() - 2 * RADIUS - INITIAL_VELOCITY;
		while(true){
			if(circle.getX() <= 0){
				while(circle.getX() <= finalX){
					circle.move(INITIAL_VELOCITY, 0);
					pause(PAUSE_TIME);
				}
			}
			else{
				while(circle.getX() >= 0){
					circle.move(-INITIAL_VELOCITY, 0);
					pause(PAUSE_TIME);
				}
			}
		}
	}
}

