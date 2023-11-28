import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class problem50 extends ConsoleProgram{
    public void run(){
    	String s = readLine("Enter the text to tokenize: ");
    	StringTokenizer tokenizer =  new StringTokenizer(s);
    	int ans = 0;
    	while(tokenizer.hasMoreTokens()){
    		String currToken = tokenizer.nextToken();
    	    ans++;
    	}
    	println("This is the answer: " + ans);
    }	
}
