import java.util.Arrays;

import acm.program.ConsoleProgram;

public class insertionSort extends ConsoleProgram{
    public void run(){
        int n = readInt("Enter the quantity of numbers: ");
        int[] array = new int[n];
        for(int i = 0; i < n; i++){
        	array[i] = readInt("Enter the " + (i + 1) + "-th number of the list: ");
        }
        int key1 = array[0];
        int key2 = array[0];
        for(int i = 0; i < n - 1; i++){
        		key1 = Math.min(key2, array[i]);
        		key2 = Math.max(key1, array[i]);
        		array[i] = key1;                
        }
        println(Arrays.toString(array));
    }
}
