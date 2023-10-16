import java.awt.Color;

import acm.graphics.GLine;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;
public class problem22 extends GraphicsProgram{
	public void run(){
		for(int i = 0; i < 4; i++){
			startBlackRow();
			startWhiteRow();
		}
	}

	private void startWhiteRow() {
		for(int i = 0; i < 4; i++){
			GRect rec = new GRect(getWidth() / 8, getHeight() / 8);
			double x = (double) (getWidth() *  i / 4 + getWidth() / 8);
			double y = (double) (getHeight() / 8);
			rec.setFilled(true);
			rec.setColor(Color.BLACK);
			add(rec, x, y);
		}
		
	}

	private void startBlackRow() {
		for(int i = 0; i < 4; i++){
			GRect rec = new GRect(getWidth() / 8, getHeight() / 8);
			double x = (double) (getWidth() *  i / 4);
			double y = (double) (0);
			rec.setFilled(true);
			rec.setColor(Color.BLACK);
			add(rec, x, y);
		}
		
		for(int i = 0; i < 4; i++){
			GRect rec = new GRect(getWidth() / 8, getHeight() / 8);
			double x = (double) (getWidth() *  i / 4);
			double y = (double) (getHeight() / 4);
			rec.setFilled(true);
			rec.setColor(Color.BLACK);
			add(rec, x, y);
		}
		
		for(int i = 0; i < 4; i++){
			GRect rec = new GRect(getWidth() / 8, getHeight() / 8);
			double x = (double) (getWidth() *  i / 4);
			double y = (double) (getHeight() / 2);
			rec.setFilled(true);
			rec.setColor(Color.BLACK);
			add(rec, x, y);
		}
		
		for(int i = 0; i < 4; i++){
			GRect rec = new GRect(getWidth() / 8, getHeight() / 8);
			double x = (double) (getWidth() *  i / 4);
			double y = (double) (getHeight() * 3 / 4);
			rec.setFilled(true);
			rec.setColor(Color.BLACK);
			add(rec, x, y);
		}
	}
}
