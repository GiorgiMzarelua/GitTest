import acm.program.ConsoleProgram;

public class problem49 extends ConsoleProgram{
    public void run(){
    	String s = readLine("Enter the text: ");
    	double ans = 1;
    	for(int i = s.length() - 1; i > 0; i--){
    		ans = Math.pow(10, i) * ans + (int)s.charAt(i);  
    	}
    	print(ans);
    }
}
