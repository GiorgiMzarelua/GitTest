import acm.program.ConsoleProgram;

public class biggestSubMatrix extends ConsoleProgram{
    public void run(){
    	int n = readInt("Enter the width of matrix: ");
    	int m = readInt("Enter the length of matrix: ");
    	int[][] matrix = new int[n][m];
    	for(int i = 0; i < n; i++){
    		for(int j = 0; j < m; j++){
    			matrix[i][j] = readInt("Enter the " + (j + 1) + "-th element of " + (i + 1) + "-th array: ");
    		}
    	}
    	int ans = biggestSubMatrix(matrix);
    	println(ans);
    }

	private int biggestSubMatrix(int[][] matrix) {
		int size = 0;
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[0].length; j++){
				int counter = 0;
				for(int p = i; p < matrix.length; p++){
					int q;
					for(q = j; q < matrix[0].length; q++){
						if(matrix[p][q] == 0) break;
						else counter++;
					}
					if(matrix[p][q] == 0) break;
				}
				size = Math.max(size, counter);
				counter = 0;
			}
		}
		return size;
	}
}
