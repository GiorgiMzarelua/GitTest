import java.util.Arrays;

import acm.program.ConsoleProgram;

public class selectionSort extends ConsoleProgram{
    public void run(){
    	int n = readInt("Enter the quantity of numbers: ");
    	int[] array = new int[n];
    	int minimum = 0;
    	for(int i = 0; i < n; i++){
    		array[i] = readInt("Enter the " + i + "-th number of the list: ");
    	}
    	minimum = array[0];
    	for(int i = 0; i < n; i++){
    		for(int j = i; j < n; j ++){
    			if(array[j] < minimum){
    				int k = array[j];
    				array[j] = minimum;
    				minimum = k;
    				array[i] = minimum;
    			}
    		}
    	}
    	println(Arrays.toString(array));
    }
}
