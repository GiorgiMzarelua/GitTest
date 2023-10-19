import java.awt.Color;
import acm.graphics.*;
import acm.program.GraphicsProgram;

public class test extends GraphicsProgram{
	public void run(){
		GRect rect = new GRect(20, 30);
		rect.setFilled(true);
		
		add(rect, 100, 100);
	}
}