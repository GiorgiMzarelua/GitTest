import java.awt.event.MouseEvent;

import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class seminari20 extends GraphicsProgram{
	private GOval circle;
	
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
	private static final int V_MIN = 1;
	
	private static final int V_MAX = 5;
	
	private static final int MIN_RADIUS = 20;
	
	private static final int MAX_RADIUS = 50;
	
	private static final int DELAY = 15;
    
	public void run(){
    	addMouseListeners();
    	addBall();
    	double vx = rgen.nextDouble(V_MIN, V_MAX);
		double vy = rgen.nextDouble(V_MIN, V_MAX);
		while(true){
			if(circle.getX() <= 0){
				vx = -vx;
			}
			else if(circle.getY() <= 0){
				vy = -vy;
			}
			else if(circle.getY() >= getWidth() - circle.getWidth()){
				vy = -vy;
			}
			else if(circle.getY() >= getHeight() - circle.getHeight()){
				vy = -vy;
			}
			else{
				circle.move(vx, vy);
				pause(DELAY);
			}
		}
    }
	
	private void addBall() {
		double radius = rgen.nextDouble(MIN_RADIUS, MAX_RADIUS);
		double x = rgen.nextDouble(0, getWidth() - 2 * radius);
		double y = rgen.nextDouble(0 , getHeight() - 2 * radius);
		circle = new GOval(x, y, 2 * radius, 2 * radius);
		circle.setFilled(true);
		circle.setColor(rgen.nextColor());
		add(circle);
	}
	@Override
	public void mouseClicked(MouseEvent e){
		GObject obj = getElementAt(e.getX(), e.getY());
		if(obj != null){
			double vx = rgen.nextDouble(V_MIN, V_MAX);
			double vy = rgen.nextDouble(V_MIN, V_MAX);
		    
		}
	}
}
