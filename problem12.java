import acm.graphics.*;
import acm.program.GraphicsProgram;

public class problem12 extends GraphicsProgram{
	public void run(){
		drawMidline();
//		drawHouse();
	}

	private void drawMidline() {
		double x1=0;
		double x2=getWidth();
		double y1=getHeight()/2;
		double y2=y1;
		GLine Line = new GLine(x1, y1, x2, y2);
		add(Line);
	}
}
