import java.util.Arrays;

import acm.program.ConsoleProgram;

public class selectionSort extends ConsoleProgram{
    public void run(){
    	int n = readInt("Enter the quantity of numbers: ");
    	int[] array = new int[n];
    	int minimum = 0;
    	int k = 0;
    	for(int i = 0; i < n; i++){
    		array[i] = readInt("Enter the " + (i + 1) + "-th number of the list: ");
    	}
    	for(int i = 0; i < n; i++){
    		minimum = array[i];
    		for(int j = i; j < n; j ++){
    			if(array[j] < minimum){
    				minimum = array[j];
    				k = j;
    			}
    		}
    		swap(array, i, k);
    	    
    	}
    	println(Arrays.toString(array));
    }

	private void swap(int[] array, int i, int j) {
		int m = array[i];
		array[i] = array[j];
		array[j] = m;
	}	
}
