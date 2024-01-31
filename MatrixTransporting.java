import java.util.Arrays;

import acm.program.ConsoleProgram;

public class MatrixTransporting extends ConsoleProgram{
    public void run(){
    	int n = readInt("Enter the length of matrix: ");
    	int m = readInt("Enter the width of matrix: ");
    	int[][] matrix = new int[n][m];
    	for(int i = 0; i < n; i++){
    		for(int j = 0; j < m; j++){
    			matrix[i][j] = readInt("Enter the " + (j + 1) + "-th element of " + (i + 1) +"-th array: ");
    		}
    	}
    	int[][] transportedMatrix = matrixTransporting(matrix);
    	for(int i = 0; i < m; i++){
    		println(Arrays.toString(transportedMatrix[i]));
    	}
    }

	private int[][] matrixTransporting(int[][] matrix) {
		int[][] transportedMatrix = new int[matrix[0].length][matrix.length];
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[i].length; j++){
				transportedMatrix[j][i] = matrix[i][j];
			}
		}
		return transportedMatrix;
	}
}
