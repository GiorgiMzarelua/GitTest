import javax.swing.JButton;

import acm.program.ConsoleProgram;

public class buttons extends ConsoleProgram{
    public void init(){
    	JButton but = new JButton("Hi");
    	add(but, SOUTH);
    }
}
