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
	    int speed1 = 1; 
	    int speed2 = 1;
		while(speed1 > 0){
			if(speed2 <= ACCELERATION){
				while(circle.getY() <= getHeight() - 2 * RADIUS){
					circle.move(0, speed2);
					pause(PAUSE_TIME);
					speed2 = speed2 + ACCELERATION;
					speed1 = speed1 + ACCELERATION;
				}
			}
			else{
				while(speed2 > ACCELERATION){
					circle.move(0, -speed2);
					pause(PAUSE_TIME);
					if(speed2 - SPEED_DECREASE >= -6){
						speed2 = speed2 - SPEED_DECREASE;
						speed1 = speed1 - SPEED_DECREASE;
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
