import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class casino extends ConsoleProgram{
	private static final int NUMBER_OF_EXPERIMENTS = 1000;
	private RandomGenerator rgen = RandomGenerator.getInstance();
    public void run(){
    	int n = readInt("Enter the amount of money you have: ");
    	double quantity = 0;
    	for(int i = 0; i < NUMBER_OF_EXPERIMENTS; i++){
    		int experiment = playAGame(n);
    		quantity = quantity + experiment;
    	}
    	double ans = quantity / NUMBER_OF_EXPERIMENTS;
    	println("This is the answer: " + ans);
    }
	private int playAGame(int n) {
		int rolls = 0;
		double lostMoney = 0;
		double currMoney = n;
		double betMoney = 0;
		while(n > 0){
			int yourNum = rgen.nextInt(1, 36);
			int Num = rgen.nextInt(1, 36);
			if(currMoney >= n){
                betMoney = 1;				
			}
			else if(currMoney < n && currMoney < (lostMoney + 1) / 36){
				betMoney = currMoney;
			}
			else{
				betMoney = (lostMoney + 1) / 36;
			}
			if(yourNum == Num){
				n -= betMoney;
				currMoney += betMoney * 36;
				lostMoney -= betMoney * 36;
			}
			else{
				n -= betMoney;
				lostMoney += betMoney;
			}
			rolls++;
		}
		return rolls;
	}
}
