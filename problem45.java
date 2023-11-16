import acm.program.ConsoleProgram;;

public class problem45 extends ConsoleProgram{
    public void run(){
    	String s = readLine("Enter the text: ");
    	String s2 = readLine("Enter the symbol: ");
    	char c = s2.charAt(0);
     	int ans = 0;
    	int n = s.length();
    	for(int i = 0; i < n; i++){
    		if(s.charAt(i) == c){
    			ans++;
    		}
    	}
    	print(ans);
    }

}
