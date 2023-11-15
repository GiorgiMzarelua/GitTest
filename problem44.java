import java.awt.event.MouseEvent;

import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class problem44 extends GraphicsProgram{
	private static final int RADIUS = 70;
	private static final int SPEED = 5;
	private static final int DELAY = 20;
	private GOval circle;
    public void run(){
    	circle = new GOval(2 * RADIUS, 2 * RADIUS);
    	circle.setFilled(true);
    	addMouseListeners();
    	add(circle);
    	while(true){
    		circle.move(0, SPEED);
    		pause(DELAY);
    	}
    }
    
    public void MouseClicked(MouseEvent e){
    	add(circle, e.getX() - RADIUS, e.getY() - RADIUS);
    }
}
