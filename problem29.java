import acm.program.ConsoleProgram;

public class problem29 extends ConsoleProgram{
    public void run(){
    	int n = readInt("ENTER THE NUMBER: ");
    	int ans = 0;
    	int a = 1; 
    	int b = 1;
    	for(int i = 2; i < n; i++){
    		ans = a + b;
    		a = b; 
    		b = ans;
    	}
    	print("THIS IS THE ANSWER: " + ans);
    }
}
