import java.util.ArrayList;
import java.util.Arrays;

import acm.program.ConsoleProgram;

public class DiagonalTraverse extends ConsoleProgram{
    public void run(){
    	int n = readInt("Enter the width of matrix: ");
    	int m = readInt("Enter the length of matrix: ");
    	int[][] mat= new int[n][m];
    	for(int i = 0; i < n; i++){
    		for(int j = 0; j < m; j++){
    			mat[i][j] = readInt("Enter the " + (j + 1) + "-th element of " + (i + 1) + "-th array: ");
    		}
    	}
    	int[] ans = findDiagonalOrder(mat);
    	println(Arrays.toString(ans));
    }

	private int[] findDiagonalOrder(int[][] mat) {
		int row = 0;
		int col = 0;
		int rows = mat.length;
		int colls = mat[0].length;		
		int[] ans = new int[rows * colls];
		int i = 0;
		boolean up = true;
		while(row < rows && col < colls){
			if(up){
				while(row > 0 && col < mat[0].length - 1){
					ans[i] = mat[row][col];
					row--;
					col++;
					i++;
				}
				ans[i] = mat[row][col];
				i++;
				if(col == mat[0].length - 1) row++;
				else col ++;
			}
			else{
				while(col > 0 && row < mat.length - 1){
					ans[i] = mat[row][col];
					row++;
					col--;
					i++;
				}
				ans[i] = mat[row][col];
				i++;
				if(col == 0) row++;
				else col++;
			}
			up = !up; 
		}
		return ans;
	}
}
