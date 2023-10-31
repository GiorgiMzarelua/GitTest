import acm.program.ConsoleProgram;
import acm.util.*;
public class problem33 extends ConsoleProgram{
	public static final int STARTING_RANGE = 100;
	public static final int FINAL_RANGE = 200;
    public void run(){
    	print(rgen);
    }
    private RandomGenerator rgen = RandomGenerator.getInstance(STARTING_RANGE, FINAL_RANGE);
}
