import java.util.ArrayList;

import acm.program.ConsoleProgram;

public class programmingMethodologiesClassTest extends ConsoleProgram{
    public void run() {
    	ArrayList<String> students = new ArrayList<>();
    	students.add("gmzar23");
    	students.add("mberi15");
    	programmingMethodologiesClass classB = new programmingMethodologiesClass(students);
    	println(classB.getScore("gmzar23"));
    	println(classB.getScore("gmzar12"));
    	classB.setscore("gmzar23", 15.0);
    	classB.setscore("gmzar21", 15.0);
    	println(classB.getScore("gmzar23"));
    	println(classB.getScore("gmzar12"));
    }
}
