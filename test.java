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
	private double x = 4;
	private double y = 4;
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
		addStone(size);
	}

	private void addStone(int size) {
		circle = new GOval(getHeight() / 8, getHeight() / 8);
		circle.setFilled(true);
		circle.setColor(Color.RED);
		add(circle, x * size / 8, y * size / 2);
		rect = new GRect((getHeight() / 8) * 0.7, (getHeight() / 8) * 0.7);
		rect.setFilled(true);
		rect.setColor(Color.GREEN);
		add(rect, x * size / 8 + 0.15 * size / 8, y * size / 8 + 0.15 * size / 8);
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

