import acm.program.ConsoleProgram;

public class problem58 extends ConsoleProgram{
    public void run(){
    	int n = readInt("Enter the size of matrix: ");
    	int[][] matrix = new int[n][n];
    	int[] array = new int[n * n];
    	for(int i = 0; i < n; i++){
    		for(int j = 0; j < n; j++){
    			matrix[i][j] = readInt("Enter the number");
    			array[i * n + j] = matrix[i][j];
    		}
    	}
    	int k;
    	for(int i = 0; i < n; i++){
    		for(int j = 0; j < n - 1; j++){
    			k = Math.min(array[j], array[j + 1]);
    			array[j + 1] = Math.max(array[j], array[j + 1]);
    			array[j] = k;
    		}
    	}
    	for(int i = 1; i <= n * n; i++){
    		if(array[i] != i){
    			println(false);
    			break;
    		}
    		if(i == n * n){
    			println(true);
    			break;
    		}
    	}
    }
}
