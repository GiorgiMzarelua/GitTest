import acm.program.ConsoleProgram;

public class problem59 extends ConsoleProgram{
    public void run(){
    	int n = readInt("Enter the length of matrix: ");
    	int m = readInt("Enter the width of matrix: ");
    	int[][] matrix = new int[n][m]; 
    	for(int i = 0; i < n; i++){
    		for(int j = 0; j < m; j++){
    			matrix[i][j]= readInt("Enter the number: ");
    		}
    	}
    	int ans = 0;
    	int counter = 0;
    	for(int i = 0; i < n; i++){
    		for(int j = 0; j < m; j++){
    			for(int k = i ; k < n; k++){
    				for(int p = m; p < m; p++){
    					if(matrix[k][p] == 1){
    						counter++;
    					}
    				}
    			}
    			ans = Math.max(ans,  counter);
    			counter = 0;
    		}
    	}
    	println(ans);
    }
} 
