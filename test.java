import java.awt.Color;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import javax.swing.JTextField;

import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class test extends GraphicsProgram implements ComponentListener{
	private JTextField textField;
	private GRect rect;
	private GOval circle;
	private double x;
	private double y;
	public void init(){
		addComponentListener(this);
        addMouseListeners(this);
        textField = new JTextField(15);
        textField.addActionListener(this);
		add(textField, SOUTH);
		createGrids();
		stoneMovement();
	}
	
    private void stoneMovement() {
		
	}

	private void createGrids() {
    	removeAll();
    	int size = Math.min(getWidth(), getHeight());
		for(int i = 0; i < 8; i++){
			for(int j = 0; j < 8; j++){
				GRect rect = new GRect(size / 8, size / 8);
				double x = j * size / 8;
				double y = i * size / 8;
				add(rect, x, y);
			}
		}
		addStone();
	}

	private void addStone() {
		circle = new GOval(getHeight() / 8, getHeight() / 8);
		circle.setFilled(true);
		circle.setColor(Color.RED);
		add(circle, getHeight() / 2, getHeight() / 2);
		rect = new GRect((getHeight() / 8) * 0.7, (getHeight() / 8) * 0.7);
		rect.setFilled(true);
		rect.setColor(Color.GREEN);
		add(rect, getHeight() / 2 + 0.15 * getHeight() / 8, getHeight() / 2 + 0.15 * getHeight() / 8);
	}

	public void run(){
    
    }

	@Override
	public void componentHidden(ComponentEvent arg0) {
		
	}

	@Override
	public void componentMoved(ComponentEvent arg0) {
		
	}

	@Override
	public void componentResized(ComponentEvent arg0) {
		createGrids();
	}

	@Override
	public void componentShown(ComponentEvent arg0) {
		
	}
}

