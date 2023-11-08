import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class problem37 extends ConsoleProgram{
	private static final int MIN_VALUE = 0;
	private static final int MAX_VALUE = 36;
	private RandomGenerator rgen = RandomGenerator.getInstance();
    public void run(){
    	int bet = readInt("Enter the number: ");
    	int roulleteResult = spinRoullete();
    }
	private int spinRoullete() {
		int result = rgen.nextInt(MIN_VALUE, MAX_VALUE);
		println(result);
		return result;
	}
}
