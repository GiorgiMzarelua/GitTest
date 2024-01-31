import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class Joker extends ConsoleProgram{
	RandomGenerator rgen = RandomGenerator.getInstance();
    public void run(){
    	int n = readInt("Enter the quantity of experiments: ");
    	double avg = simulateJoker(n);
    	println(avg);
    }

	private double simulateJoker(int n) {
		double counter = 0;
		for(int i = 0; i < n; i++){
			counter += simulateOne();
		}
		return counter / n;
	}

	private int simulateOne() {
		int tries = 0;
		while(true){
			tries++;
			int[] joker = new int[36];
			for(int i = 0; i < 36; i++){
				int num = rgen.nextInt(0, 35);
				if(joker[num] == 0 && i % 4 == 0) joker[num] = 1;
				else if(joker[num] == 0 && i % 2 == 1 || i % 2 == 2 || i % 2 == 3) joker[num] = -1;
				else i--;
			}
			int countJokers = 0;
			for(int i = 0; i < 2; i++){
				if(joker[i] == 1) countJokers++;
				if(countJokers == 2) return tries;
			}
		}
	}
}
