import java.awt.event.MouseEvent;

import acm.graphics.GLine;
import acm.program.GraphicsProgram;

public class shualedur21i3 extends GraphicsProgram{
    public void run(){
    	addMouseListeners();
    }
    @Override
	public void mouseClicked(MouseEvent e){
    	int x = e.getX();
    	int y = e.getY();
    	GLine line = new GLine(x, y, e.getX(), e.getY());
    	add(line);
    }
}
