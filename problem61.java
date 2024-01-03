/*
 * კონსოლიდან შეგვყავს რიცხვი m და n, შემდეგ n ცალი რიცხვი. პროგრამამ უნდა იპოვოს
 * შეყვანილი რიცხვებიდან წყვილი რომელთა ჯამი არის m.
 */
import java.util.HashMap;
import java.util.Map;

import acm.program.ConsoleProgram;

public class problem61 extends ConsoleProgram{
    public void run(){
    	int m = readInt("Enter the number to compare: ");
    	int n = readInt("Enter the quantity of numbers: ");
    	int[] array = new int[n];
    	Map<Integer, Integer> findingCouple = new HashMap<Integer, Integer>();
    	for(int i = 0; i < n; i++){
    		array[i] = readInt("Enter the " + (i + 1) + "-th number: ");
    	}
    	for(int i = 0; i < n; i++){
    		for(int j = i + 1; j < n; j++){
    			if(array[i] + array[j] == m){
    				findingCouple.put(array[i], array[j]);
    			}
    		}
    	}
    	println(findingCouple);
    }
}
