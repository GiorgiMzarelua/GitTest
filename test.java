import java.awt.Color;
import java.awt.event.ActionEvent;
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
		add(circle, x * size / 8, y * size / 8);
		rect = new GRect((getHeight() / 8) * 0.7, (getHeight() / 8) * 0.7);
		rect.setFilled(true);
		rect.setColor(Color.GREEN);
		add(rect, x * size / 8 + 0.15 * size / 8, y * size / 8 + 0.15 * size / 8);
	}

	public void actionPerformed(ActionEvent e){
        String text = textField.getText();
        if(text.equals("left") && circle.getX() > 2){
        	goingOnTheLeft();
        }
        else if(text.equals("right") && circle.getX() < Math.min(getWidth(), getHeight())){
        	goingOnTheRight();
        }
        else if(text.equals("top") && circle.getY() > 2){
        	goingOnTheTop();
        }
        else if(text.equals("bottom") && circle.getY() < Math.min(getWidth(), getHeight())){
        	goingOnTheBottom();
        }
    }
    
	private void goingOnTheBottom() {
		remove(rect);
		remove(circle);
		add(circle, circle.getX() , circle.getY() + Math.min(getWidth(), getHeight()) / 8);
		add(rect, rect.getX(), rect.getY() + Math.min(getWidth(), getHeight()) / 8);
	}

	private void goingOnTheTop() {
		remove(rect);
		remove(circle);
		add(circle, circle.getX() , circle.getY() - Math.min(getWidth(), getHeight()) / 8);
		add(rect, rect.getX(), rect.getY() - Math.min(getWidth(), getHeight()) / 8);
	}

	private void goingOnTheRight() {
		remove(rect);
		remove(circle);
		add(circle, circle.getX() + Math.min(getWidth(), getHeight()) / 8, circle.getY());
		add(rect, rect.getY() + Math.min(getWidth(), getHeight()) / 8, rect.getY());
	}

	private void goingOnTheLeft() {
		remove(rect);
		remove(circle);
		add(circle, circle.getY() - (Math.min(getWidth(), getHeight()) / 8), circle.getY());
		add(rect, rect.getX() - (Math.min(getWidth(), getHeight()) / 8), rect.getY());
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

