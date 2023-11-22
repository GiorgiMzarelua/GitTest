import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class problem50 extends ConsoleProgram{
    public void run(){
    	String s = readLine("Enter the text: ");
    	println("There is the number of word in the entered sentence: " + equals( new StringTokenizer(s). countTokens()));
    }
}
