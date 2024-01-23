import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import acm.program.GraphicsProgram;

public class phoneBook extends GraphicsProgram{
	private static final int MARGIN_X = 10;
	private static final int MARGIN_Y = 10; 
	private JLabel lastName;
	private JLabel lastNumber;
	private JTextField name;
	private JTextField phone;
	private JButton add;
	public void init(){
		createButtons();
		addActionListeners();
	}
	
    private void createButtons() {
		add(new JLabel("name: "), SOUTH);
		name = new JTextField(15);
		name.setActionCommand("name: ");
	    name.addActionListener(this);
		add(name,SOUTH);
		add(new JLabel("phone: "), SOUTH);
		phone = new JTextField(15);
	    phone.setActionCommand("phone: ");
	    phone.addActionListener(this);
		add(phone, SOUTH);
		add = new JButton("Add");
		add.getActionCommand();
		add.addActionListener(this);
		add(add, SOUTH);
		lastName.setLocation(0, 0);
		lastNumber.setLocation(0, 0);
	}
    
    public void actionPerformed(ActionEvent e){
    	String cmd = e.getActionCommand();
    	if(cmd.equals("name: ")){
    		lastName = new JLabel(name.getText() + ": ");
    		add(lastName, MARGIN_X, lastName.getY() + MARGIN_Y);
    	}
    	if(cmd.equals("phone: ")){
    		lastNumber = new JLabel(phone.getText());
    		add(lastNumber, lastName.getX() + MARGIN_X, lastName.getY() + MARGIN_Y);
    	}
    }
}
