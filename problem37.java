import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class problem37 extends ConsoleProgram{
	private static final int MIN_VALUE = 0;
	private static final int MAX_VALUE = 36;
	private RandomGenerator rgen = RandomGenerator.getInstance();
    public void run(){
    	int betNumber = filterNumbers();
    	int roulleteNumber = spinRoullete();
    	if(betNumber == roulleteNumber){
    		println("You won! Congratulations");
    	}
    	else{
    		println("Unfortunately, you lost!");
    	}
    }
	private int filterNumbers() {
		while(true){
			int Num = readInt("Enter the number from " + MIN_VALUE + " to " + MAX_VALUE);
			if(Num >= MIN_VALUE && Num <= MAX_VALUE){
				return 0;
			}
		}
	}
	private int spinRoullete() {
		int result = rgen.nextInt(MIN_VALUE, MAX_VALUE);
		return result;
	}
}
