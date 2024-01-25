import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class applyDiscountToPrices extends ConsoleProgram{
    public void run(){
    	String sentence = readLine("Enter the text: ");
    	int discount = readInt("Enter the discount: ");
    	String ans = discountedSentence(sentence, discount);
    	println(ans);
    }

	private String discountedSentence(String sentence, int discount) {
		String s = "";
		StringTokenizer tokenizer = new StringTokenizer(sentence);
		boolean[] array = new boolean[tokenizer.countTokens()];
		int j = 0;
		while(tokenizer.hasMoreTokens()){
			array[j] = isPrice(tokenizer.nextToken());
			j++;
		}
		for(int i = 0; i < tokenizer.countTokens(); i++){
			if(array[i] == false) s += tokenizer.nextToken() + " ";
			else{
				s += discounted(tokenizer.nextToken(), discount) + " ";
			}
		}
		return s;
	}

	private String discounted(String nextToken, int discount) {
		String s = nextToken.charAt(0) + "";
		int price = 0;
		for(int i = 1; i < nextToken.length(); i++){
			price = 10 * price + ((int) nextToken.charAt(i) - 48);
		}
		int discountedPrice = price * discount / 100;
		
		return null;
	}

	private boolean isPrice(String nextToken) {
		if(nextToken.charAt(0) == '$'){
			for(int i = 1; i < nextToken.length(); i++){
				if((int)nextToken.charAt(i) - 48 != 0 && (int)nextToken.charAt(i) - 48 != 1 && (int)nextToken.charAt(i) - 48 != 2 && (int)nextToken.charAt(i) - 48 != 3 && (int)nextToken.charAt(i) - 48 != 4 && (int)nextToken.charAt(i) - 48 != 5 && (int)nextToken.charAt(i) - 48 != 6 && (int)nextToken.charAt(i) - 48 != 7 && (int)nextToken.charAt(i) - 48 != 8 && (int)nextToken.charAt(i) - 48 != 9){
					return false;
				}
			}
			return true;
		}
		return false;
	}
}
