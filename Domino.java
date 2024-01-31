import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class Domino extends ConsoleProgram{
	RandomGenerator rgen = RandomGenerator.getInstance();
    public void run(){
    	int n = readInt("Enter the number of experiments: ");
    	double avg = simulateDomino(n);
        println(avg);
    }

	private double simulateDomino(int n) {
		int counter = 0;
		for(int i = 0; i < n; i++){
			counter += stimulateOne();
		}
		return counter / n;
	}

	private int stimulateOne() {
		int tries = 0;
		while(true){
			tries++;
			boolean[] nums = new boolean[28];
			for(int i = 0; i < 7; i++){
				int num = rgen.nextInt(0, 27);
				if(nums[num] == false) nums[num] = true;
				else i--;
			}
			int countPairs = 0;
			for(int i = 0; i < 13; i+=2){
				if(nums[i] == true) countPairs++;
				if(countPairs == 5) return tries;
			}
		}
	}
}
