import acm.program.ConsoleProgram;

public class semina16ri2 extends ConsoleProgram{
	public void run(){
	    String s = readLine("Enter the String variable: ");
	    String w;
	    int n = s.length();
	    int ans = 0;
	    int counterL = 0;
	    int counterR = 0;
	    for(int i = 0; i < n; i++){
	    	if(s.charAt(i) == 'L'){
	    		counterL++;
	    	}
	    	if(s.charAt(i) == 'R'){
	    		counterR++;
	    	}
	    	if(counterL == counterR){
	    		counterR = 0;
	    		counterL = 0;
	    		ans++;
	    	}
	    }
	    print(ans);
	}
}
