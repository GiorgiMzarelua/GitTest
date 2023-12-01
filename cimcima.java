import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class cimcima extends GraphicsProgram{
	private static final int CIRCLE_D = 40;
	private static final int DELAY = 1;
	RandomGenerator rgen = RandomGenerator.getInstance();
    public void run(){
    	addMouseListeners();
    }
    @Override
    public void mouseClicked(MouseEvent e){
    	if(getElementAt(e.getX(), e.getY()) == null){
    		GOval circle = new GOval(e.getX() - CIRCLE_D / 2, e.getY() - CIRCLE_D / 2, CIRCLE_D, CIRCLE_D);
        	circle.setFilled(true);
        	circle.setColor(rgen.nextColor());
        	add(circle);
    	}
    	else{
    		while(getElementAt(e.getX(), e.getY()).getColor() != Color.GREEN){
    			Color color = getColor();
    			getElementAt(e.getX(), e.getY()).setColor(color);
    			pause(DELAY);
    		}
    	}
    	
    }
	private Color getColor() {
		int test = rgen.nextInt(1,5);
		Color color = null;
		if(test == 1){
			color = Color.GREEN;
		}
		if(test == 2){
			color = Color.RED;
		}
		if(test == 3){
			color = Color.BLUE;
		}
		if(test == 4){
			color = Color.BLACK;
		}
		if(test == 5){
			color = Color.YELLOW;
		}
		return color;
	}
}
