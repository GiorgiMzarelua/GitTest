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
		double counter = 0;
		for(int i = 0; i < n; i++){
			counter += stimulateOne();
		}
		return counter / n;
	}

	private int stimulateOne() {
		int tries = 0;
		while(true){
			tries++;
			int[] nums = new int[28];
			for(int i = 0; i < 14; i++){
				int num = rgen.nextInt(0, 27);
				if(nums[num] == 0 && i % 2 == 0) nums[num] = 1;
				else if(nums[num] == 0 && i % 2 == 1) nums[num] = -1;
				else i--;
			}
			int countPairs = 0;
			for(int i = 0; i < 7; i+=1){
				if(nums[i] == 1) countPairs++;
				if(countPairs == 5) return tries;
			}
		}
	}
}
