import java.awt.Color;
import acm.graphics.*;
import acm.program.GraphicsProgram;

public class problem13 extends GraphicsProgram{
	public void run(){
		drawLine();
	}
	private void drawLine() {
		double x1 = 0;
		double y1 = getHeight() / 2;
		double x2 = getWidth();
		double y2 = getHeight() / 2;
		GLine line = new GLine(x1, y1, x2, y2);
		add(line);
	}
}
