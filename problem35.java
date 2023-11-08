import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class problem35 extends ConsoleProgram{
    private static final int NUM_EXPERIMENTS = 10000;
    private RandomGenerator rgen = RandomGenerator.getInstance();
    public void run(){
    	double sumFlips = 0;
    	for(int i = 0; i < NUM_EXPERIMENTS; i++){
    		int currFlips = holdExperiment();
    		sumFlips += currFlips;
    	}
    	double avgFlips = sumFlips / NUM_EXPERIMENTS;
    	println("this is the average number of getting head: " + avgFlips);
    }
    
	private int holdExperiment() {
		int numFlips = 0;
		while(true){
			numFlips++;
			boolean isHeads = rgen.nextBoolean();
			if(isHeads){
				break;
			}
		}
		return numFlips;
	}
}
