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
				for(int p = i; p < matrix.length; p++){
					for(int q = j; q < matrix[0].length; q++){
						if(isAreaFilled(matrix, i, j, p, q) == true){
							int currArea = (p - i + 1) * (q - j + 1);
							size = Math.max(size, currArea);
						}
					}
				}
			}
		}
		return size;
	}

	private boolean isAreaFilled(int[][] matrix, int i, int j, int p, int q) {
		for(int I = i; I <= p; I++){
			for(int J = j; J <= q; J++){
				if(matrix[I][J] != 1) return false;
			}
		}
		return true;
	}
}
