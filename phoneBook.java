import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import acm.program.GraphicsProgram;

public class phoneBook extends GraphicsProgram{
	private static final int MARGIN_X = 10;
	private static final int MARGIN_Y = 10; 
	private int x = 0;
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
    
    public void actionPerformed(ActionEvent e){
        String cmd = e.getActionCommand();
        if(cmd.equals("name: ")){
        	label = new JLabel(name.getText());
        	add(label, MARGIN_X, y + MARGIN_Y);
        	x = MARGIN_X + 3 * label.getText().length() + MARGIN_X;
        }
        else if(cmd.equals("phone: ")){
        	label = new JLabel(phone.getText());
        	add(label, x + MARGIN_X, y + MARGIN_Y);
        	y = label.getY() + 2 * MARGIN_Y;
        }
    }
}
