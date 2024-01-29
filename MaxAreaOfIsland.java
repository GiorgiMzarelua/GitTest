import acm.program.ConsoleProgram;

public class MaxAreaOfIsland extends ConsoleProgram{
    public void run(){
    	int n = readInt("Enter the width of matrix: ");
    	int m = readInt("Enter the length of matrix: ");
    	int[][] matrix = new int[n][m];
    	for(int i = 0; i < n; i++){
    		for(int j = 0; j < m; j++){
    			matrix[i][j] = readInt("Enter the value of an island - Zero or One: ");
    		}
    	}
    	int ans = maxArea(matrix);
    	println("This is the max filled area of this matrix: ");
    }

	private int maxArea(int[][] matrix) {
		int ans = 0;
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[i].length; j++){
				if(matrix[i][j] == 1){
					while(true){
						
					}
				}
			}
		}
		return ans;
	}
}
