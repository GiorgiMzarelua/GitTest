import acm.program.ConsoleProgram;

public class problem26 extends ConsoleProgram{
	public void run(){
	    int n = readInt("ENTER THE FIRST NUMBER: ");
		int m = readInt("ENTER THE SECOND NUMBER: ");
	   	for(int i = min(n,m); i >= 1; i--){
	   		if(m % i == 0 & n % i == 0){
	   			print("THIS IS THE ANSWER: " + i);
	   			break;
	   		}
	   	}
	}

	private int min(int n, int m) {
		if(n < m){
			return n;
		}
		else {
			return m;
		}
	}
}
