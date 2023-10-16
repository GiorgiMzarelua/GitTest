import acm.program.ConsoleProgram;
public class problem20 extends ConsoleProgram{
    public void run(){
    	int n = readInt("ENTER THE QUANTITY OF NUMBERS: ");
    	int ans = 0;
    	for(int i = 0; i < n; i++){
    		int m = readInt("ENTER THE NUMBER: ");
    		ans = ans + m;
    	}
    	print("THE ANSWER IS: " + ans);
    }
}
