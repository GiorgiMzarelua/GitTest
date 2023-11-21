import acm.program.ConsoleProgram;

public class problem49 extends ConsoleProgram{
    public void run(){
    	String s = readLine("Enter the text: ");
    	double ans = 0;
    	for(int i = s.length() - 1; i >= 0; i--){
    		ans = ans + Math.pow(10, i) *((int)s.charAt(i) - 48);  
    	}
    	print(ans);
    }
}
