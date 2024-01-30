import java.util.ArrayList;
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
    	ArrayList<Integer> spiral = spiralOrder(matrix);
    	println(spiral);
    }

	private ArrayList<Integer> spiralOrder(int[][] matrix) {
		ArrayList<Integer> spiral = new ArrayList<Integer>();
		int row = 0;
		int col = 0;
		int rows = matrix.length - 1;
		int colls = matrix[0].length - 1;
		while(row <= rows && col <= colls){
			for(int i = col; i <= colls; i++){
				spiral.add(matrix[row][i]);
			}
			row++;
			for(int i = row; i <= rows; i++){
				spiral.add(matrix[i][colls]);
			}
			colls--;
			if(rows >= row){
				for(int i = colls; i >= col; i--){
					spiral.add(matrix[rows][i]);
				}
			}
			rows--;
			if(colls >= col){
				for(int i = rows; i >= row; i--){
					spiral.add(matrix[i][col]);
				}
			}
			col++;
		}
		return spiral;
	}
}
