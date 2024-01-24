import java.util.ArrayList;
import java.util.Arrays;

import acm.program.ConsoleProgram;

public class fillInSudoku extends ConsoleProgram{
    public void run(){
    	int[][] sudoku = new int[3][3];
    	sudoku[0][2] = 9;
    	sudoku[1][1] = 2;
    	sudoku[2][0] = 7;
     	int[][] filledSudoku = fillSudoku(sudoku);
    	
    	for(int i = 0; i < 3; i++){
    		println(Arrays.toString(filledSudoku[i]));
    	}
    }

	private int[][] fillSudoku(int[][] sudoku) {
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				ArrayList<Integer> list = new ArrayList<Integer>();
				for(int p = 0; p < 3; p++){
					if(!list.contains(sudoku[i][p]) && sudoku[i][p] !=0){
						list.add(sudoku[i][p]);
					}
				}
				for(int q = 0; q < 3; q++){
					if(!list.contains(sudoku[q][j]) && sudoku[q][j] !=0){
						list.add(sudoku[q][j]);
					}
				}
				if(!list.contains(1) && sudoku[i][j] == 0){
					sudoku[i][j] = 1;
				}
				else if(!list.contains(2) && sudoku[i][j] == 0){
					sudoku[i][j] = 2;
				}
				else if(!list.contains(3) && sudoku[i][j] == 0){
					sudoku[i][j] = 3;
				}
				else if(!list.contains(4) && sudoku[i][j] == 0){
					sudoku[i][j] = 4;
				}
				else if(!list.contains(5) && sudoku[i][j] == 0){
					sudoku[i][j] = 5;
				}
				else if(!list.contains(6) && sudoku[i][j] == 0){
					sudoku[i][j] = 6;
				}
				else if(!list.contains(7) && sudoku[i][j] == 0){
					sudoku[i][j] = 7;
				}
				else if(!list.contains(8) && sudoku[i][j] == 0){
					sudoku[i][j] = 8;
				}
				else if(!list.contains(9) && sudoku[i][j] == 0){
					sudoku[i][j] = 9;
				}
			}
		}
		return sudoku;
	}
}
