import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class SolveTheEquation extends ConsoleProgram{
    public void run(){
    	String equation = readLine("Enter the equation: ");
    	String x = solveEquation(equation);
    	println(x);
    }
    
    private String solveEquation(String equation){
    	StringTokenizer tokenizer = new StringTokenizer(equation);
    	char operation = '+';
    	int sum = 0;
    	String s = "";
    	while(tokenizer.nextToken() != '=' + ""){
    		String token = tokenizer.nextToken();
    		if(!token.contains("x") && token != operation + ""){
                int num = convertToInteger(token);
                if(operation == '+'){
                	sum += num;
                }
                else{
                	sum -= num;
                }
    		}
    		else if(!token.contains("x")){
    			operation = token.charAt(0);
    		}
    		else if(token.contains("x")){
    			s += token;
    		}
    	}
    	if(sum >= 0) s += " + " + sum + " ";
    	else s += " - " + (-sum) + " ";
    	s += "= ";
    	return s;
    }

	private int convertToInteger(String token) {
		int n = token.length();
		int num = 0;
		for(int i = 0; i < n; i++){
			int k = (int) token.charAt(i) - 48;
			num = 10 * num + k;
		}
		return num;
	}
}
