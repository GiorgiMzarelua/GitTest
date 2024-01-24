import java.util.Arrays;

import acm.program.ConsoleProgram;

public class fillInSudoku extends ConsoleProgram{
    public void run(){
    	int[][] sudoku = new int[3][3];
 //   	int[][] filledSudoku = fillSudoku(sudoku);
    	sudoku[0][0] = 1;
    	sudoku[0][1] = 2;
    	sudoku[0][2] = 3;
    	sudoku[1][0] = 4;
    	sudoku[1][1] = 5;
    	sudoku[1][2] = 6;
    	sudoku[2][0] = 7;
    	sudoku[2][1] = 8;
    	sudoku[2][2] = 9;
    	println(Arrays.toString(sudoku));
    }

	private int[][] fillSudoku(int[][] sudoku) {
		
		return null;
	}
}
