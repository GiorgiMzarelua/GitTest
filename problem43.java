import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class problem43 extends GraphicsProgram{
	private static final int RADIUS = 30;
	private GObject lastPressedObj;
	private int prevX;
	private int prevY;
    public void run(){
    	GOval circle = new GOval(2 * RADIUS, 2 * RADIUS);
		int x = getWidth() / 2 - RADIUS;
		int y = getHeight() / 2 - RADIUS;
		circle.setFilled(true);
		circle.setColor(Color.BLACK);
		add(circle, x, y);
    	addMouseListeners();
    }
	
	public void MousePressed(MouseEvent e){
		GObject obj = getElementAt(e.getX(), getY());
		lastPressedObj = obj;
		if(obj != null){
			prevX = e.getX();
			prevY = e.getY();
		}
	}
	
	public void MouseDragged(MouseEvent e){
		if(lastPressedObj != null){
			lastPressedObj.move(e.getX() - prevX, e.getY() - prevY);
			prevX = e.getX();
			prevY = e.getY();
		}
	}
}
