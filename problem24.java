import acm.program.ConsoleProgram;
public class problem24 extends ConsoleProgram{
    public void run(){
    	int ans = 0;
    	int n = readInt("ENTER THE NUMBER: ");
    	for(int i = 1; i <= n; i++){
    	    if(n % i == 0){
    	    	ans++;
    	    }
    	}
    	print("THIS IS THE ANSWER: " + ans);
    }
}
