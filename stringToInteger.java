import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class stringToInteger extends ConsoleProgram{
    public void run(){
    	String s = readLine("Enter an example of mathematical sum: ");
    	int ans = eval(s);
    	println("this is the sum: " + ans);
    }

	private int eval(String s) {
		StringTokenizer tokenizer = new StringTokenizer(s);
		char operation = '+';
		int sum = 0;
		while(tokenizer.hasMoreElements()){
			String token = tokenizer.nextToken();
			if(Character.isDigit(token.charAt(0))){
				int num = convertInteger(token);
				if(operation == '+'){
					sum += num;
				}
				else{
					sum -= num;
				}
			}
			else{
				operation = token.charAt(0);
			}
		}
		return sum;
	}

	private int convertInteger(String token) {
		int n = token.length();
		int num = 0;
		for(int i = 0; i < n; i++){
			int k = (int) token.charAt(i) - 48;
			num = 10 * num + k;
		}
		return num;
	}
}
