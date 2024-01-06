import java.awt.event.ActionEvent;

import javax.swing.JTextField;

import acm.graphics.GImage;
import acm.graphics.GLabel;
import acm.program.GraphicsProgram;

public class problem67 extends GraphicsProgram{
	private JTextField textField;
	 public void init(){
		 textField = new JTextField();
		 add(textField, SOUTH);
	 }
}
