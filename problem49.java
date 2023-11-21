import acm.program.ConsoleProgram;

public class problem49 extends ConsoleProgram{
    public void run(){
    	String s = readLine("Enter the text: ");
    	int ans = 0;
    	for(int i = s.length() - 1; i >= 0; i--){
    		int k = (int)(Math.pow(10, i));
    		ans = ans + k *((int)s.charAt(s.length() - i - 1) - 48);  
    	}
    	print(ans);
    }
}
