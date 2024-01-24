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
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		int rem = 0;
		for(int i = num1.size() - 1; i >= 0; i--){
			for(int j = num2.size() - 1; j >= 0; j--){
				list1.add(num1.get(i) * num2.get(j) % 10 + rem);
				rem = num1.get(i) * num2.get(j) / 10;
				int k = list2.get(num2.size() - 1 - j);
			}
			list1.add(num1.get(num1.size() - 1) * num2.get(num2.size() - 1) / 10 );
		}
		return null;
	}
}
