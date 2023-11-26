import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class problem50 extends ConsoleProgram{
    public void run(){
    	String s = readLine("Enter the text to tokenize: ");
    	StringTokenizer countTokens = new StringTokenizer(s);
    	println("there are " + countTokens + " tokens");
    }	
}
