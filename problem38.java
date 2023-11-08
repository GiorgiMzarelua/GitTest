import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class problem38 extends ConsoleProgram{
	private static final int MIN_VALUE = 0;
	private static final int MAX_VALUE = 36;
	private static final int STARTING_MONEY = 1000;
	public void run(){
		int currMoney = STARTING_MONEY;
		while(currMoney >= 0){
			int betNumber = filterNumbers();
		}
	}
	private int filterNumbers() {
		while(true){
			int Num = readInt("Enter the number from " + MIN_VALUE + " to " + MAX_VALUE + ": ");
			if(Num >= MIN_VALUE && Num <= MAX_VALUE){
				return Num;
			}
		}
	}

}
