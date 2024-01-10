import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JTextField;

import acm.program.GraphicsProgram;

public class SchoolGraphics extends GraphicsProgram{
	private JTextField Teach;
	private JTextField Pupil;
	private JTextField Subject;
	private JButton addTeach;
	private JButton addPupil;
	private JButton addSubject;
	private JButton displayPupils;
	private JButton displayTeachers;
	public static final String ADD_TEACHER = "Add Teach";
	public static final String ADD_SUBJECT = "Add Subj";
	public static final String ADD_PUPIL = "Add Pupil";
	public static final String DISPLAY_TEACHER = "Display Teachers";
	public static final String DISPLAY_PUPILS = "Display Pupils";
	public void init(){
		Teach = new JTextField(5);
		Teach.setActionCommand(ADD_TEACHER);
    	Teach.addActionListener(this);
		add(Teach, SOUTH);
		Subject = new JTextField(5);
		add(Subject, SOUTH);
		Pupil = new JTextField(5);
		add(Pupil, SOUTH);
		addTeach = new JButton(ADD_TEACHER);
		add(addTeach, SOUTH);
		addSubject = new JButton(ADD_SUBJECT);
		add(addSubject, SOUTH);
		addPupil = new JButton(ADD_PUPIL);
		add(addPupil, SOUTH);
		displayPupils = new JButton(DISPLAY_PUPILS);
		add(displayPupils, SOUTH);
		displayTeachers = new JButton(DISPLAY_TEACHER);
		add(displayTeachers, SOUTH);
	}
	
    public void run(){
    	
    }
    
    @Override
	public void actionPerformed(ActionEvent e) {
    	String st = e.getActionCommand();
    	String teacher = Teach.getText();
    	if(st.equals(ADD_TEACHER)){
    		println(teacher);
    	}
	}
}
