import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class problem50 extends ConsoleProgram{
    public void run(){
    	String s = readLine("Enter the text to tokenize: ");
    	StringTokenizer tokenizer = new StringTokenizer(s);
    	int count = 0;
    	while(tokenizer.hasMoreTokens()){
    		count++;
    	}
    	println("there are " + count + " tokens");
    }	
}
