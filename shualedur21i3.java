import java.awt.event.MouseEvent;

import acm.graphics.GLine;
import acm.program.GraphicsProgram;

public class shualedur21i3 extends GraphicsProgram{
    public void run(){
    	addMouseListeners();
    }
    @Override
	public void mouseClicked(MouseEvent e){
    	int x = 0;
    	int y = 0;
    	GLine line = new GLine(x, y, e.getX(), e.getY());
    	x = e.getX();
    	y = e.getY();
    	add(line);
    }
}
