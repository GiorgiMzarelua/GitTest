import java.awt.event.ActionEvent;
import java.awt.event.ComponentListener;

import javax.swing.JButton;
import javax.swing.JWindow;

import acm.program.ConsoleProgram;

public class GraphicsTest extends ConsoleProgram{
	private JButton close;
	private JWindow window;
    public void init(){
    	addActionListeners();
    	add(new JButton("open"), SOUTH);
    }
    
    public void ActionPerformed(ActionEvent e){
    	if(e.getActionCommand().equals("open")){
    		println("beeeeeee");
    	}
    }
}
