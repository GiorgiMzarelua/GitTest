import acm.program.ConsoleProgram;

public class D2Array extends ConsoleProgram{
    public void run(){
    	int n = readInt("Enter the quantity of numbers: ");
    	int[] array = new int[n];
    	for(int i = 0; i < n; i++){
    		array[i] = readInt("Enter the " + (i + 1) + "-th number: ");
    	}
    	int[][] matrix = create(array);
    	println(matrix.toString());
    }

	private int[][] create(int[] array) {
		int[][] matrix = new int[array.length][];
		for(int i = 0; i < array.length; i++){
			for(int j = 0; j < array[i]; j++){
				matrix[i][j] = 0;
			}
		}
		return matrix;
	}

	
}
