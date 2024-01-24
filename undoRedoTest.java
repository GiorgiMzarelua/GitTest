import java.util.ArrayList;

import acm.program.ConsoleProgram;

public class undoRedoTest extends ConsoleProgram{
    public void run(){
    	ArrayList<String> list = new ArrayList<String>();
    	undoRedo classB = new undoRedo();
    	classB.save("1");
    	classB.save("2");
    	classB.save("4");
    	println(classB.get());
    }
}
