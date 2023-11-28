import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class problem51 extends ConsoleProgram{
    public void run(){
    	String s = readLine("Enter the text: ");
    	String ans = removeDuplicates(s);
    	println(ans);
    }
    private String removeDuplicates(String s){
    	String result = "";
    	for(int i = 0; i < s.length(); i ++){
    		char ch = s.charAt(i);
//    		if(s.indexOf(ch) == i)
    		if(result.contains("" + ch)){
    			result += ch;
    		}
    	}
		return result;
    }
}
