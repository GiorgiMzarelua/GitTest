import java.util.Arrays;

import acm.program.ConsoleProgram;

public class spiralMatrix extends ConsoleProgram{
    public void run(){
    	int n = readInt("Enter the matrix width: ");
    	int m = readInt("Enter the matrix length: ");
    	int[][] matrix = new int[n][m];
    	for(int i = 0; i < n; i++){
    		for(int j = 0; j < m; j++){
    			matrix[i][j] = readInt("Enter the " + (j + 1) + "-th element of " + (i + 1) + "-th array: ");
    		}
    	}
    	int[] spiral = spiralOrder(matrix);
    	println(Arrays.toString(spiral));
    }

	private int[] spiralOrder(int[][] matrix) {
		int[] spiral = new int[matrix.length * matrix[0].length];
		int k = 0;
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[0].length; j++){
				if(i <= (matrix.length + 1) / 2 && j != matrix[0].length - 1){
					spiral[k] = matrix[i][j];
					k++;
				}
			}
		}
		return null;
	}
}
