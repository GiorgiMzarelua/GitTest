import java.awt.event.MouseEvent;

import acm.graphics.GLine;
import acm.graphics.GObject;
import acm.graphics.GPoint;
import acm.program.GraphicsProgram;

public class shualedur21i3 extends GraphicsProgram{
	private GPoint POINT = new GPoint(7, 7);
	private GLine LINE = new GLine(0, 0, 5, 5);
    public void run(){
    	addMouseListeners();
    	POINT = new GPoint(0,0);
    }
    @Override
	public void mousePressed(MouseEvent e){
    	LINE= new GLine(POINT.getX(), POINT.getY(),
				e.getX(), e.getY());
		add(LINE);
		POINT = new GPoint(e.getX(), e.getY());
    }
    @Override
    public void mouseDragged(MouseEvent e){
    	LINE.setEndPoint(e.getX(), e.getY());
		POINT = new GPoint(e.getX(), e.getY());
    }
}
