import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class problem43 extends GraphicsProgram{
	private static final int RADIUS = 70;
	private GObject lastPressedObj;
	private int prevX;
	private int prevY;
    public void run(){
    	addCircle();
    	addMouseListeners();
    }
	private void addCircle() {
		GOval circle = new GOval(2 * RADIUS, 2 * RADIUS);
		int x = getWidth() / 2 - RADIUS;
		int y = getHeight() / 2 - RADIUS;
		circle.setFilled(true);
		circle.setColor(Color.BLACK);
		add(circle, x, y);
	}
	
	public void mousePressed(MouseEvent e){
		GObject obj = getElementAt(e.getX(), e.getY());
		lastPressedObj = obj;
		if(obj != null) {
			prevX = e.getX();
			prevY = e.getY();
		}
	}
	
	public void mouseDragged(MouseEvent e){
		if(lastPressedObj != null) {
			lastPressedObj.move(e.getX() - prevX, e.getY() - prevY);
			prevX = e.getX();
			prevY = e.getY();
		}
	}
}