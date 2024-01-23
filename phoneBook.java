import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import acm.program.GraphicsProgram;

public class phoneBook extends GraphicsProgram{
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
	}
	
}
