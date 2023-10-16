import acm.program.ConsoleProgram;

public class problem25 extends ConsoleProgram{
	public void run(){
		int n = readInt("ENTER THE FIRST NUMBER: ");
		int m = readInt("ENTER THE SECOND NUMBER: ");
		for(int i = max(n, m); i <= n * m; i++ ){
			if(i % n == 0 & i % m == 0){
				print("THIS IS THE ANSWER: " + i);
				break;
			}
		}
	}

	private int max(int n, int m) {
		if(n > m){
			return n;
		}
		else{
			return m;
		}
	}
}
