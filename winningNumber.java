import java.util.HashMap;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JWindow;

import acm.program.ConsoleProgram;

public class winningNumber extends ConsoleProgram{
	private static final String SENTINEL = "";
	
	public void run(){
		int n = readInt("How many children are asked? ");
		String[] children = new String[n];
		Map<String, Integer> numbers = new HashMap<String, Integer>();
		for(int i = 0; i < n; i++){
			children[i] = readLine("Enter the " + (i + 1) + "-th guy's name: ");
			int number = readInt("Enter the " + children[i] + "-th number: ");
			numbers.put(children[i], number);
		}
		int sum = 0;
		for(int i = 0; i < n; i++){
			sum += numbers.get(children[i]);
		}
		int avg = sum / n * 2 / 3;
		for(int i = 0; i < n; i++){
			if(numbers.containsValue(avg)){
				println(children[i]);
			}
		}
	}
}
