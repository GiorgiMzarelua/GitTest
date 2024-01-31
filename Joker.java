import acm.program.ConsoleProgram;

public class Joker extends ConsoleProgram{
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

	private double simulateOne() {
		
		return 0;
	}
}
