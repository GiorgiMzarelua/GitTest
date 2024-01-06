import java.awt.event.ActionEvent;

import javax.swing.JTextField;

import acm.graphics.GImage;
import acm.graphics.GLabel;
import acm.program.GraphicsProgram;

public class problem67 extends GraphicsProgram{
	private JTextField textField;
	 public void init(){
		 addActionListeners();
		 textField = new JTextField(20);
		 add(textField, SOUTH);
		 textField.addActionListener(this);
		 GImage image = new GImage("bad path");
		 double x = getWidth() / 2 - image.getWidth() / 2;
		 double y = getHeight() / 2 - image.getHeight() / 2;
		 add(image, x, y);
	 }
	 @Override
	 public void actionPerformed(ActionEvent e){
		 if(e.getSource() == textField){
			 try{
				 GImage image = new GImage(textField.getText());
					double x = getWidth()/ 2 - image.getWidth() / 2;
					double y = getHeight()/ 2 - image.getHeight() / 2;
					add(image, x, y);
			 }catch(Exception ex){
				    removeAll();
					add(new GLabel("Error occured"), 20, 20);
			 }
			 textField.setText("");
		 }
	 }
}
