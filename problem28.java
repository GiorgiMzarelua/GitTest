import acm.program.ConsoleProgram;

public class problem28 extends ConsoleProgram{
    public void run(){
    	int n = readInt ("ENTER THE NUMBER: ");
    	int ans = 0;
    	while (n != -1){
    		n = readInt("ENTER THE NUMBER: ");
    		if(n % 2 == 0 ){
    		    ans++;
    		}
    	}
    	print("THIS IS THE ANSWER: " + ans);
    }
}
