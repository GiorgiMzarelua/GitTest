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
    	for(int i = 0; i < n; i++){
    		minimum = array[i];
    		for(int j = i; j < n; j ++){
    			if(array[j] < minimum){
    				minimum = array[j];
    			}
    		}
    		int k = array[i];
    		array[i] = minimum;
    		for(int j = i; j < n; j++){
    			if(array[j] == k){
    				array[j] = k;
    				break;
    			}
    		}
    	}
    	println(Arrays.toString(array));
    }
}
