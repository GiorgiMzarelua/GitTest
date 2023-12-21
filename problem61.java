import java.util.HashMap;
import java.util.Map;

import acm.program.ConsoleProgram;

public class problem61 extends ConsoleProgram{
    public void run(){
    	int m = readInt("Enter the main number: ");
    	int n = readInt("Enter the quantity of random numbers: ");
    	int[] array = new int[n];
    	for(int i = 0; i < n; i++){
    		array[i] = readInt("Enter a number: ");
    	}
    	Map <Integer, Integer> mp = new HashMap <Integer, Integer>();
    	int counter = 0;
    	for(int i = 0; i < n - 1; i++){
    		for(int j = i + 1; j < n; j++){
    			if(array[i] + array[j] == m){
    				counter++;
    				mp.put(array[i], counter);
    				println("The " + counter + "-th number is: " + mp.get(counter));
    				counter++;
    				mp.put(array[j], counter);
    				println("The " + counter + "-th  number is: " + mp.get(counter));
    			}
    		}
    	}
    	
    }
}
