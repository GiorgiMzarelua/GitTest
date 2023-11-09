import java.awt.event.MouseEvent;

import acm.graphics.GLine;
import acm.program.GraphicsProgram;

public class problem42 extends GraphicsProgram{
    public void run(){
    	addMouseListeners();
    }
    
    public void mouseDragged(MouseEvent e){
    	double x1 = e.getX();
    	double y1 = e.getY();
    	double x2 = e.getX();
    	double y2 = e.getY();
        GLine line = new GLine(x1, y1, x2, y2);
        add(line);
    }
}
