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
	private static final double EARS_WIDTH = 10;
	private static final double EARS_HEIGHT = 30;
	private static final double EARSENDING_WIDTH = 20;
	private static final double EARSENDING_HEIGHT = 5;
	public void run(){
		drawRobotFace();
	}

	private void drawRobotFace() {
		drawFace();
    	drawEyes();
//		drawMouse();
//		drawNose();
//		drawEars();
	}

	private void drawEyes() {
		GRect eye1 = new GRect(EYE_WIDTH, EYE_HEIGHT);
		int x = (int) (getWidth() / 2 - FACE_WIDTH / 2 - 70);
		int y = (int) (getHeight() / 2 - FACE_HEIGHT / 2 - 70);
		eye1.setFilled(true);
		eye1.setColor(Color.WHITE);
		add(eye1, x, y);
		
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
