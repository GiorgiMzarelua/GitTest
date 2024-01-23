import java.util.ArrayList;

import acm.program.ConsoleProgram;

public class multiply extends ConsoleProgram{
    public void run(){
    	ArrayList<Integer> num1 = new ArrayList<Integer>();
    	num1.add(1);
    	num1.add(2);
    	num1.add(3);
    	num1.add(4);
    	num1.add(5);
    	num1.add(6);
    	num1.add(7);
    	num1.add(8);
    	num1.add(9);
    	ArrayList<Integer> num2 = new ArrayList<Integer>();
    	num2.add(1);
    	num2.add(0);
    	num2.add(0);
    	num2.add(0);
    	num2.add(0);
    	num2.add(0);
    	num2.add(0);
    	num2.add(0);
    	num2.add(0);
    	num2.add(0);
    	num2.add(0);
    	ArrayList<Integer> ans = multiply(num1, num2);
    	println(ans.toString());
    }

	private ArrayList<Integer> multiply(ArrayList<Integer> num1, ArrayList<Integer> num2) {
		
		return null;
	}
}
