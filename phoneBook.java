import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import acm.program.GraphicsProgram;

public class phoneBook extends GraphicsProgram{
	private static final int MARGIN_X = 10;
	private static final int MARGIN_Y = 10; 
	private int y = 0;
	private Map<String, String> nameList;
	private ArrayList<JLabel> labelList;
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
		name.addActionListener(this);
		add(name,SOUTH);
		add(new JLabel("phone: "), SOUTH);
		phone = new JTextField(15);
	    phone.setActionCommand("Add");
	    phone.addActionListener(this);
		add(phone, SOUTH);
		add = new JButton("Add");
		add.getActionCommand();
		add.addActionListener(this);
		add(add, SOUTH);
	}
    
    public void actionPerformed(ActionEvent e){
    	
    }
}
