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
		
		while(currMoney > 0){
			int yourNum = rgen.nextInt(0, 36);
			int Num = rgen.nextInt(0, 36);
			if(currMoney != n - lostMoney){
				println("error");
				break;
			}
			if(currMoney >= n){
                betMoney = 1;				
			}
			if(currMoney != n - lostMoney){
				println("error");
				break;
			}
			else if(currMoney < n && currMoney >= (lostMoney + 1) / 36){
				betMoney = (lostMoney + 1) / 36;
			}
			if(currMoney != n - lostMoney){
				println("error");
				break;
			}
			else if(currMoney < n && currMoney < (lostMoney + 1) / 36){
				betMoney = currMoney;
			}
			if(currMoney != n - lostMoney){
				println("error");
				break;
			}
			if(yourNum == Num){
				currMoney += betMoney * 36;
				lostMoney -= betMoney * 36;
			}
			if(currMoney != n - lostMoney){
				println("error");
				break;
			}
			else{
				currMoney -= betMoney;
				lostMoney += betMoney;
			}
			if(currMoney != n - lostMoney){
				println("error");
				break;
			}
			rolls++;
		}
		return rolls;
	}
}
