import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import javax.swing.JTextField;

import acm.graphics.GCanvas;
import acm.graphics.GRect;
import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;

public class test extends GraphicsProgram implements ComponentListener{
	private JTextField textField;
	public void init(){
		addComponentListener(this);
        addMouseListeners(this);
        textField = new JTextField(15);
        textField.addActionListener(this);
		add(textField, NORTH);
		createGrids();
	}
	
    private void createGrids() {
    	int size = Math.min(getWidth(), getHeight());
		for(int i = 0; i < 8; i++){
			for(int j = 0; j < 8; j++){
				GRect rect = new GRect(size / 8, size / 8);
				double x = j * size / 8;
				double y = i * size / 8;
				add(rect, x, y);
			}
		}
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
		
	}

	@Override
	public void componentShown(ComponentEvent arg0) {
		
	}
}

