import acm.program.ConsoleProgram;

public class validSudoku extends ConsoleProgram{
    public void run(){
    	int[][] sudoku= new int[3][3];
    	sudoku[0][0] = 1;
    	sudoku[0][1] = 2;
    	sudoku[0][2] = 3;
    	sudoku[1][0] = 4;
    	sudoku[1][1] = 5;
    	sudoku[1][2] = 6;
    	sudoku[2][0] = 7;
    	sudoku[2][1] = 8;
    	sudoku[2][2] = 9;
    	boolean isValid = isValid(sudoku);
    	println(isValid);
    }

	private boolean isValid(int[][] sudoku) {
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				for(int p = 0; p < 3; p++){
					if(p != j && sudoku[i][p] == sudoku[i][j]){
						return false;
						
					}
				}
				for(int q = 0; q < 3; q++){
					if(q != i && sudoku[q][j] == sudoku[i][j]){
						return false;
					}
				}
			}
		}
		return true;
	}
} 
