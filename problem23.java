import acm.program.ConsoleProgram;

public class problem23 extends ConsoleProgram{
    public void run(){
    	int ans = 0;
    	int n = readInt("ENTER THE NUMBER: ");
    	for(int i = 1; i <= n; i++){
    		ans = ans + i;
    	}
    	print("THIS IS THE ANSWER: " + ans);
    }
}
