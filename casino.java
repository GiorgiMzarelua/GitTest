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
    	int ans = quantity / NUMBER_OF_EXPERIMENTS;
    	println("This is the answer: " + ans);
    }
	private int playAGame(int n) {
		int rolls = 0;
		int lostMoney = 0;
		int currMoney = n;
		int betMoney = 0;
		
		while(currMoney > 0){
			int yourNum = readInt(0, 36);
			int Num = readInt(0, 36);
			if(currMoney >= n){
				betMoney = 1;
			}
			else if(currMoney < n && currMoney >= (lostMoney + 1) / 36){
				betMoney = (lostMoney + 1) / 36;
			}
			else if(currMoney < n && currMoney < (lostMoney + 1) / 36){
				betMoney = currMoney;
			}
			if(yourNum == Num){
				currMoney += betMoney * 36;
				lostMoney -= betMoney * 36;
			}
			else{
				currMoney -= betMoney;
				lostMoney += betMoney;
			}
			rolls++;
		}
		return rolls;
	}
}
