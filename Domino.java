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
		while(n > 0){
			int num1 = rgen.nextInt(0, 6);
			int num2 = rgen.nextInt(0, 6);
			println(num1 + " " + num2);
			return;
		}
		return 0;
	}
}
