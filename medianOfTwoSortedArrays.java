import acm.program.ConsoleProgram;

public class medianOfTwoSortedArrays extends ConsoleProgram{
    public void run(){
    	int size1 = readInt("Enter the size of the first array: ");
    	int size2 = readInt("Enter the size of the second array: ");
    	int[] array1 = new int[size1];
    	int[] array2 = new int[size2];
    	for(int i = 0; i < size1; i++){
    		array1[i] = readInt("Enter the " + (i + 1) + "-th number of the first array: ");
    	}
    	for(int i = 0; i < size2; i++){
    		array2[i] = readInt("Enter the " + (i + 1) + "-th number of the second array: ");
    	}
    	int median = medianOfTwoSortedArrays(array1, array2);
    	println("This is the median of this two merged sorted arrays: " + median);
    }

	private int medianOfTwoSortedArrays(int[] array1, int[] array2) {
		int size1 = array1.length;
		int size2 = array2.length;
		int[] mergedArray = new int[size1 + size2];
		int sequence = 0;
		for(int i = 0; i < size1; i++){
			for(int j = 0; j < size2; j++){
				if(array1[i] <= array2[j]){
					mergedArray[sequence] = array1[i];
					sequence++;
					break;
				}
				else{
					mergedArray[sequence] = array2[j];
					sequence++;
				}
			}
		}
		if((size1 + size2) % 2 == 1){
			return mergedArray[(size1 + size2) / 2];
		}
		else{
			return(mergedArray[size1 + size2] / 2 + mergedArray[size1 + size2 - 1] / 2) / 2;
		}
	}
}
