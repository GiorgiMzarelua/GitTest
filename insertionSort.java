import java.util.Arrays;

import acm.program.ConsoleProgram;

public class insertionSort extends ConsoleProgram{
    public void run(){
        int n = readInt("Enter the quantity of numbers: ");
        int[] array = new int[n];
        for(int i = 0; i < n; i++){
        	array[i] = readInt("Enter the " + (i + 1) + "-th number of the list: ");
        }
        int key = array[0];
        for(int i = 0; i < n - 1; i++){
        	for(int j = i; j < n; j++){
        		if(array[j] < key){
        			swap(key, array[j]);
        		}
        	}
        }
        println(Arrays.toString(array));
    }

	private void swap(int key, int i) {
		int k = key;
		key = i;
		i = k;
	}
}
