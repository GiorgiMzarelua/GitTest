import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import acm.program.GraphicsProgram;

public class phoneBook extends GraphicsProgram{
	private static final int MARGIN_X = 10;
	private static final int MARGIN_Y = 10; 
	private int y = 0;
	private JLabel label;
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
		name.setActionCommand("Add");
		add(name,SOUTH);
		add(new JLabel("phone: "), SOUTH);
		phone = new JTextField(15);
	    phone.setActionCommand("Add");
		add(phone, SOUTH);
		add = new JButton("Add");
		add.getActionCommand();
		add.addActionListener(this);
		add(add, SOUTH);
	}
    
    public void actionPerformed(ActionEvent e){
        String cmd = e.getActionCommand();
        if(cmd.equals("Add")){
        	String s1 = name.getText();
        	String s2 = phone.getText();
        	label = new JLabel(s1 + " " + s2);
        	add(label, MARGIN_X, y + 2 * MARGIN_Y);
        	y = label.getY();
        }
    }
}
