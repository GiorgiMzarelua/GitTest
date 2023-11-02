import acm.program.ConsoleProgram;

public class problem35 extends ConsoleProgram{
    private static final int NUM_EXPERIMENTS = 10000;
    public void run(){
    	double sumFlips = 0;
    	for(int i = 0; i < NUM_EXPERIMENTS; i++){
    		int currFlips = holdExperiment();
    		sumFlips += currFlips;
    	}
    	double avgFlips = sumFlips / NUM_EXPERIMENTS;
        println(avgFlips);
    }
	private int holdExperiment() {
		
		return 0;
	}
}
