import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class problem38 extends ConsoleProgram{
	private static final int MIN_VALUE = 0;
	private static final int MAX_VALUE = 36;
	private static final int STARTING_MONEY = 1000;
	private RandomGenerator rgen = RandomGenerator.getInstance();
	public void run(){
		int currMoney = STARTING_MONEY;
		while(currMoney >= 0){
			int betNumber = filterNumbers();
			int roulleteNumber = spinRoullete();
			int bet = filterMoney(currMoney);
			if(betNumber == roulleteNumber){
				currMoney = currMoney * 2;
				println("Congretulations! You won. Now you have " + currMoney + " dollars");
			}
			else{
				currMoney = currMoney - betNumber;
				println("Unfortunately you lost. Now you have " + currMoney + " dollars");
			}
		}
	}
	
	private int filterMoney(int currMoney) {
		while(true){
			int BET = readInt("Enter the number from " + 1 + " to " + currMoney + ": ");
			if(BET >= 1 && BET <= currMoney){
				return BET;
			}
		}
	}

	private int spinRoullete() {
		int result = rgen.nextInt(MIN_VALUE, MAX_VALUE);
		return result;
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
