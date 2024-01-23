import acm.program.ConsoleProgram;

public class D2Array extends ConsoleProgram{
	private int[][] matrix2;
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
		for(int i = 0; i < array.length; i++){
			for(int j = 0; j < array[i]; j++){
				matrix2[i][j] = 0;
			}
		}
		return matrix2;
	}

	
}
