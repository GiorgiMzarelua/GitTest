import java.util.Arrays;

import acm.program.ConsoleProgram;

public class problem58 extends ConsoleProgram{
    public void run(){
    	int n = readInt("Enter the size of matrix: ");
    	int[][] matrix = new int[n][n];
    	int[] array = new int[n * n];
    	for(int i = 0; i < n; i++){
    		for(int j = 0; j < n; j++){
    			matrix[i][j] = readInt("Enter the number: ");
    			array[i * n + j] = matrix[i][j];
    		}
    	}
    	
    	for(int i = 1; i <= n * n; i++){
    		if(array[i] != i){
    			println(false);
    			break;
    		}
    		if(i == n * n){
    			println(true);
    			break;
    		}
    	}
    }

    
}
