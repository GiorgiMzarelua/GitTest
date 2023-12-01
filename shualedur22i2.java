import java.awt.Color;
import java.awt.event.MouseEvent;


import acm.graphics.GObject;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class shualedur22i2 extends GraphicsProgram{
	private static final int COLUMNS = 8;
	private static final int ROWS = 8;
    public void run(){
    	addMouseListeners();
    	drawGrid();
    }

	private void drawGrid() {
		for(int i = 0; i < COLUMNS; i++){
			drawALine(i);
		}
	}

	private void drawALine(int i) {
		for(int j = 0; j < ROWS; j++){
			double length = Math.min(getHeight(), getWidth()) / 8;
			GRect rect = new GRect(j * length, i * length, length, length);
			rect.setFilled(true);
			rect.setFillColor(Color.WHITE);
			add(rect);
		}
	}
	@Override
	public void mouseClicked(MouseEvent e){
	    if(getElementAt(e.getX(), e.getY()) != null){
	    	if(getElementAt(e.getX(), e.getY()).getColor() == Color.WHITE){
	    		getElementAt(e.getX(), e.getY()).setColor(Color.BLACK);
	    	}
	    	if(getElementAt(e.getX(), e.getY()).getColor() == Color.BLACK){
	    		getElementAt(e.getX(), e.getY()).setColor(Color.WHITE);
	    	}
	    }
	}
}
