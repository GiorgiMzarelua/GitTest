import java.awt.Color;
import acm.graphics.*;
import acm.program.GraphicsProgram;

public class problem14 extends GraphicsProgram{
	private static final double FACE_WIDTH = 200;
	private static final double FACE_HEIGHT = 200;
	private static final double EYE_WIDTH = 20;
	private static final double EYE_HEIGHT = 20;
	private static final double NOSE_HEIGHT = 40;
	private static final double NOSE_WIDTH = 10;
	private static final double MOUSE_WIDTH = 60;
	private static final double MOUSE_HEIGHT = 20;
	private static final double EARS_WIDTH = 20;
	private static final double EARS_HEIGHT = 50;
	private static final double EARSENDING_WIDTH = 30;
	private static final double EARSENDING_HEIGHT = 15;
	public void run(){
		drawRobotFace();
	}

	private void drawRobotFace() {
		drawFace();
    	drawEyes();
		drawMouse();
		drawNose();
		drawEars();
	}

	private void drawEars() {
		GRect ear1 = new GRect(EARS_WIDTH, EARS_HEIGHT);
		int x1 = (int) (getWidth() / 2 - 70);
		int y1 = (int) (getHeight() / 2  - FACE_HEIGHT / 2 - EARS_HEIGHT);
		ear1.setFilled(true);
		ear1.setColor(Color.YELLOW);
		add(ear1, x1, y1);
		
		GRect ear2 = new GRect(EARS_WIDTH, EARS_HEIGHT);
		x1 = (int) (getWidth() / 2 + 50);
		y1 = (int) (getHeight() / 2  - FACE_HEIGHT / 2 - EARS_HEIGHT);
		ear2.setFilled(true);
		ear2.setColor(Color.YELLOW);
		add(ear2, x1, y1);
	}

	private void drawNose() {
		GRect nose = new GRect(NOSE_WIDTH, NOSE_HEIGHT);
		int x1 = (int) (getWidth() / 2);
		int y1 = (int) (getHeight() / 2  - 70);
		nose.setFilled(true);
		nose.setColor(Color.WHITE);
		add(nose, x1, y1);
		
	}

	private void drawMouse() {
		GRect mouse = new GRect(MOUSE_WIDTH, MOUSE_HEIGHT);
		int x1 = (int) (getWidth() / 2 - 30);
		int y1 = (int) (getHeight() / 2  + 40);
		mouse.setFilled(true);
		mouse.setColor(Color.WHITE);
		add(mouse, x1, y1);
	}

	private void drawEyes() {
		GRect eye1 = new GRect(EYE_WIDTH, EYE_HEIGHT);
		int x1 = (int) (getWidth() / 2 - 70);
		int y1 = (int) (getHeight() / 2  - 70);
		eye1.setFilled(true);
		eye1.setColor(Color.WHITE);
		add(eye1, x1, y1);
		
		GRect eye2 = new GRect(EYE_WIDTH, EYE_HEIGHT);
		int x2 = (int) (getWidth() / 2 + 50);
		int y2 = (int) (getHeight() / 2  - 70);
		eye2.setFilled(true);
		eye2.setColor(Color.WHITE);
		add(eye2, x2, y2);
	}

	private void drawFace() {
		GRect face = new GRect(FACE_WIDTH, FACE_HEIGHT);
		int x = (int) (getWidth() / 2 - FACE_WIDTH / 2);
		int y = (int) (getHeight() / 2 - FACE_HEIGHT / 2);
		face.setFilled(true);
		face.setColor(Color.BLACK);
		add(face, x, y);
	} 
	
	
}
