import java.util.ArrayList;

import acm.program.ConsoleProgram;

public class multiplyStrings extends ConsoleProgram{
    public void run(){
    	String num1 = readLine("Enter the first number: ");
    	String num2 = readLine("Enter the second number: ");
    	String ans = multiply(num1, num2);
    	println(ans);
    }

	private String multiply(String num1, String num2) {
		ArrayList<Integer> N1 = new ArrayList<Integer>();
		ArrayList<Integer> N2 = new ArrayList<Integer>();
		for(int i = 0; i < num1.length(); i++){
			N1.add((int) num1.charAt(i) - 48);
		}
		for(int i = 0; i < num2.length(); i++){
			N2.add((int) num2.charAt(i) - 48);
		}
		
		return null;
	}
}
