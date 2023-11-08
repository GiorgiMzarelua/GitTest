import java.awt.Color;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class additional13seminari2 extends GraphicsProgram{
	private static final int RADIUS = 25;
	private static final int PAUSE_TIME = 40;
	private static final int ACCELERATION = 10;
	private static final int SPEED_DECREASE = 15;
	public void run(){
		GOval circle = drawCircle();
	    int speed = 1; 
		while(speed > 0){
			if(speed <= ACCELERATION){
				while(circle.getY() <= getHeight() - 2 * RADIUS){
					circle.move(0, speed);
					pause(PAUSE_TIME);
					speed = speed + ACCELERATION;
				}
			}
			else{
				while(speed > ACCELERATION){
					circle.move(0, -speed);
					pause(PAUSE_TIME);
					if(speed - SPEED_DECREASE >= 0){
						speed = speed - SPEED_DECREASE;
					}
				}
			}
			
		}
		
	}
	private GOval drawCircle() {
		GOval circle = new GOval(getWidth() / 2 - RADIUS, 0, 2 * RADIUS, 2* RADIUS);
		circle.setFilled(true);
		circle.setColor(Color.RED);
		add(circle);
		return circle;
	}

}
