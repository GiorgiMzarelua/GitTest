import java.awt.Color;
import acm.graphics.*;
import acm.program.GraphicsProgram;
public class problem12 extends GraphicsProgram {
	private static final double HOUSE_WIDTH = 200;
	private static final double HOUSE_HEIGHT  = 300;
	private static final double DOOR_WIDTH  = 50;
	private static final double DOOR_HEIGHT  = 100;
	private static final double ROOF_HEIGHT  = 100;
	private static final double WINDOWS_WIDTH = 40;
	private static final double WINDOWS_HEIGHT  = 40;
	public void run(){
		drawWall();
		drawWindows();
//		drawDoor();
//		drawRoof();
	}
	private void drawWall() {
		GRect wall = new GRect(HOUSE_WIDTH, HOUSE_HEIGHT);
		int x = (int) (getWidth() / 2 - HOUSE_WIDTH / 2);
		int y = (int) (getHeight() - HOUSE_HEIGHT);
		wall.setFilled(true);
		wall.setColor(Color.DARK_GRAY);
		add(wall, x, y);
	}
	private void drawWindows(){
		GRect window1 = new GRect(WINDOWS_WIDTH, WINDOWS_HEIGHT);
		int x1 = (int) (getWidth() / 2 - HOUSE_WIDTH / 2 + 40);
		int y1 = (int) (getHeight() - 2 * DOOR_HEIGHT + 40);
		window1.setFilled(true);
		window1.setColor(Color.BLACK);
		add(window1, x1, y1);
		
		GRect window2 = new GRect(WINDOWS_WIDTH, WINDOWS_HEIGHT);
		int x2 = (int) (getWidth() / 2 + HOUSE_WIDTH / 2 - 80);
		int y2 = (int) (getHeight() - 2 * DOOR_HEIGHT + 40);
		window2.setFilled(true);
		window2.setColor(Color.BLACK);
		add(window2, x2, y2);
	}
}