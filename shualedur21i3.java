import java.awt.event.MouseEvent;

import acm.graphics.GLine;
import acm.graphics.GObject;
import acm.graphics.GPoint;
import acm.program.GraphicsProgram;

public class shualedur21i3 extends GraphicsProgram{
	private GObject POINT = null;
    public void run(){
    	addMouseListeners();
    	
    }
    @Override
	public void mouseClicked(MouseEvent e){
    	GLine line = new GLine(POINT.getX(), POINT.getY(), e.getX(), e.getY());
    	POINT = getElementAt(e.getX(), e.getY());
    	add(line);
    }
}
