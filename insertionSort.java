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
        	int key = array[i];
        	for(int j = i; j < n; j++){
        		if(array[j] < key){
        			swap(array, key, j);
        		}
        	}
        }
        println(Arrays.toString(array));
    }

	private void swap(int[] array, int key, int j) {
		int m = key;
		key = array[j];
		array[j] = m;
	}
}
