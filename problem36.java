import acm.program.ConsoleProgram;
import acm.util.RandomGenerator; 

public class problem36 extends ConsoleProgram{
	private static final int NUM_EXPERIMENTS = 100000;
	private RandomGenerator rgen = RandomGenerator.getInstance();
    public void run(){
    	int sumFlips = 0;
    	for(int i = 0; i < NUM_EXPERIMENTS; i++){
    		int currFlips = holdExperiment();
    		sumFlips += currFlips;
    	}
    	int avgFlips = sumFlips / NUM_EXPERIMENTS;
    	println("this is the average number of getting head three times in a row: " + avgFlips);
    }
	private int holdExperiment() {
		int numFlips = 0;
		int headsInArow = 0;
		while(true){
			numFlips++;
			boolean isHeads = rgen.nextBoolean(0.4);
			if(isHeads){
				headsInArow++;
				if(headsInArow == 3){
					break;
				}
				else{
					headsInArow = 0;
				}
			}
		}
		return numFlips;
	}
}
