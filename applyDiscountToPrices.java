import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class applyDiscountToPrices extends ConsoleProgram{
    public void run(){
    	String sentence = readLine("Enter the text: ");
    	int discount = readInt("Enter the discount: ");
    	String ans = discountedSentence(sentence);
    	println(ans);
    }

	private String discountedSentence(String sentence) {
		
		StringTokenizer tokenizer = new StringTokenizer(sentence);
		boolean[] array = new boolean[tokenizer.countTokens()];
		int i = 0;
		while(tokenizer.hasMoreTokens()){
			array[i] = isPrice(tokenizer.nextToken());
			i++;
		}
		return null;
	}

	private boolean isPrice(String nextToken) {
		// TODO Auto-generated method stub
		return false;
	}
}
