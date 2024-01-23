import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class rearrange extends ConsoleProgram{
    public void run(){
    	String s = readLine("Enter the string: ");
    	String ans = rearrange(s);
    	println("This is the rearranged string: " + ans);
    }

	private String rearrange(String s) {
		StringTokenizer tokenizer = new StringTokenizer(s);
		String w = null;
		int[] array = new int[tokenizer.countTokens()];
		int[] sorted = new int[tokenizer.countTokens()];
		int j = 0;
		while(tokenizer.hasMoreTokens()){
			array[j] = tokenizer.nextToken().length();
			j++;
		}
		for(int i = 0; i < tokenizer.countTokens(); i++){
			int index = array[i];
			for(int p = 0; p < tokenizer.countTokens(); p++){
				if(array[p] < index){
					index = p;
				}
			}
			sorted[i] = index;
		}
		for(int i = 0; i < tokenizer.countTokens(); i++){
			
		}
		return null;
	}
}
