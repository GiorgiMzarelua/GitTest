import acm.program.ConsoleProgram;

public class fillInSudoku extends ConsoleProgram{
    public void run(){
    	int[][] sudoku = new int[3][3];
    	int[]sudoku1 = new int[9];
 //   	int[][] filledSudoku = fillSudoku(sudoku);
    	sudoku1[0] = 1;
    	sudoku1[1] = 2;
    	sudoku1[2] = 3;
    	sudoku1[3] = 4;
    	sudoku1[4] = 5;
    	sudoku1[5] = 6;
    	sudoku1[6] = 7;
    	sudoku1[7] = 8;
    	sudoku1[8] = 9;
    	println(sudoku1.toString());
    }

	private int[][] fillSudoku(int[][] sudoku) {
		
		return null;
	}
}
