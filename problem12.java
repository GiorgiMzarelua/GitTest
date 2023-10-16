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
		drawDoor();
		drawRoof();
	}
	private void drawRoof() {
		double x1 = getWidth() / 2 - HOUSE_WIDTH / 2; 
		double y1 = getHeight() - HOUSE_HEIGHT;
		double x2 = getWidth() / 2;
		double y2 = y1 - ROOF_HEIGHT;
		for( int i = 0; i < 2; i++){
			if( i == 1 ){
				x1 = getWidth() / 2 + HOUSE_WIDTH / 2;
			}
			GLine roof = new GLine(x1, y1, x2, y2);
			add(roof);
		}
		
	}
	private void drawDoor() {
		GRect wall = new GRect(DOOR_WIDTH, DOOR_HEIGHT);
		int x = (int) (getWidth() / 2 - DOOR_WIDTH / 2);
		int y = (int) (getHeight() - DOOR_HEIGHT);
		wall.setFilled(true);
		wall.setColor(Color.YELLOW);
		add(wall, x, y);
	}
	private void drawWall() {
		GRect wall = new GRect(HOUSE_WIDTH, HOUSE_HEIGHT);
		int x = (int) (getWidth() / 2 - HOUSE_WIDTH / 2);
		int y = (int) (getHeight() - HOUSE_HEIGHT);
		wall.setFilled(true);
		wall.setColor(Color.BLACK);
		add(wall, x, y);
	}
	private void drawWindows(){
		GRect window1 = new GRect(WINDOWS_WIDTH, WINDOWS_HEIGHT);
		int x1 = (int) (getWidth() / 2 - HOUSE_WIDTH / 2 + 40);
		int y1 = (int) (getHeight() - 2.5 * DOOR_HEIGHT + 40);
		window1.setFilled(true);
		window1.setColor(Color.WHITE);
		add(window1, x1, y1);
		
		GRect window2 = new GRect(WINDOWS_WIDTH, WINDOWS_HEIGHT);
		int x2 = (int) (getWidth() / 2 + HOUSE_WIDTH / 2 - 80);
		int y2 = (int) (getHeight() - 2.5 * DOOR_HEIGHT + 40);
		window2.setFilled(true);
		window2.setColor(Color.WHITE);
		add(window2, x2, y2);
		
		double x3 = (double) (getWidth() / 2 - HOUSE_WIDTH / 2 + 40);
		double y3 = (double) (getHeight() - 2.5 * DOOR_HEIGHT + 60);
		double x4 = (double) (getWidth() / 2 - HOUSE_WIDTH / 2 + 40 + WINDOWS_WIDTH);
		double y4 = (double) (getHeight() - 2.5 * DOOR_HEIGHT + 60);
		GLine line = new GLine(x3, y3, x4, y4);
		add(line);
		
		x3 = (double) (getWidth() / 2 - HOUSE_WIDTH / 2 + 40 + WINDOWS_WIDTH / 2);
		y3 = (double) (getHeight() - 2.5 * DOOR_HEIGHT + 40);
		x4 = (double) (getWidth() / 2 - HOUSE_WIDTH / 2 + 40 + WINDOWS_WIDTH / 2);
		y4 = (double) (getHeight() - 2.5 * DOOR_HEIGHT + 80);
		GLine line2 = new GLine(x3, y3, x4, y4);
		add(line2);
		
		x3 = (double) (getWidth() / 2 + HOUSE_WIDTH / 2 - 80);
		y3 = (double) (getHeight() - 2.5 * DOOR_HEIGHT + 60);
		x4 = (double) (getWidth() / 2 + HOUSE_WIDTH / 2 - 40);
		y4 = (double) (getHeight() - 2.5 * DOOR_HEIGHT + 60);
		GLine line3 = new GLine(x3, y3, x4, y4);
		add(line3);
	}
}