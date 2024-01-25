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
				if(i % 3 == 0 && j % 3 == 0){
					for(int p = i; p < i + 3; p++){
						for(int q = j; q < j + 3; q++){
							
						}
					}
				}
				else if(i % 3 == 0 && j % 3 == 1){
					for(int p = i; p < i + 3; p++){
						for(int q = j - 1; q < j + 2; q++){
							
						}
					}
				}
				else if(i % 3 == 0 && j % 3 == 2){
					for(int p = i; p < i + 3; p++){
						for(int q = j - 2; q < j + 1; q++){
							
						}
					}
				}
				else if(i % 3 == 1 && j % 3 == 0){
					for(int p = i - 1; p < i + 2; p++){
						for(int q = j; q < j + 3; q++){
							
						}
					}
				}
				else if(i % 3 == 1 && j % 3 == 1){
					for(int p = i - 1; p < i + 2; p++){
						for(int q = j - 1; q < j+ 2; q++){
							
						}
					}
				}
				else if(i % 3 == 1 && j % 3 == 2){
					for(int p = i - 1; p < i + 2; p++){
						for(int q = j - 2; q < j + 1; q++){
							
						}
					}
				}
				else if(i % 3 == 2 && j % 3 == 0){
					for(int p = i - 2; p < i + 1; p++){
						for(int q = j; q < j + 3; q++){
							
						}
					}
				}
				else if(i % 3 == 2 && j % 3 == 1){
					for(int p = i - 2; p < i + 1; p++){
						for(int q = j - 1; q < j + 2; q++){
							
						}
					}
				}
				else if(i % 3 == 2 && j % 3 == 2){
					for(int p = i - 2; p < i + 1; p++){
						for(int q = j - 2; q < j + 1; q++){
							
						}
					}
				}
			}
		}
		return true;
	}
} 
