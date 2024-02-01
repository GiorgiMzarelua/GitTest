import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JTextField;

import acm.program.ConsoleProgram;

public class buttons extends ConsoleProgram{
	private static final String HELLO = "Hi";
	private static final String HELLO_THERE = "Hello there";
	private JTextField textField;
    public void init(){
    	addActionListeners();
    	textField = new JTextField(20);
    	textField.setActionCommand(HELLO);
    	textField.addActionListener(this);
    	add(textField, NORTH);
    	JButton but = new JButton(HELLO);
    	add(but, SOUTH);
    }
    @Override
    public void actionPerformed(ActionEvent e){
    	String st = e.getActionCommand();
    	if(st.equals(HELLO)){
    		println(textField.getText());
    	}
    	
    }
}
