import java.util.Arrays;

import acm.program.ConsoleProgram;

public class insertionSort extends ConsoleProgram{
    public void run(){
        int n = readInt("Enter the quantity of numbers: ");
        int[] array = new int[n];
        for(int i = 0; i < n; i++){
        	array[i] = readInt("Enter the " + (i + 1) + "-th number of the list: ");
        }
        for(int i = 0; i < n; i++){
        	for(int j = i; j < n; j++){
        		if(array[j] < array[i]){
        			swap(array, j, i);
        		}
        	}
        }
        println(Arrays.toString(array));
    }

	private void swap(int[] array, int j, int i) {
		int m = array[i];
		array[i] = array[j];
		array[j] = m;
	}
}
