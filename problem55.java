import acm.program.ConsoleProgram;

public class problem55 extends ConsoleProgram{
    public void run(){
    	int n = readInt("Enter the quantity of numbers: ");
    	int[] array = new int[n];
    	int[] array1 = new int[n];
    	for(int i = 0; i < n; i++){
    		array[i] = readInt("Enter the " + (i + 1) + "-th number of the list: ");
    		array1[i] = array[i];
    	}
    	int k;
    	for(int i = 0; i < n; i++){
    		for(int j = 0; j < n - 1; j++){
    			k = Math.min(array[j], array[j + 1]);
    			array[j + 1] = Math.max(array[j], array[j + 1]);
    			array[j] = k;
    		}
    	}
    	for(int i = 0; i < n; i++){
    		if(array[i] != array1[i]){
    			println("Not Sorted!");
    			break;
    		}
    		if(i == n){
    			println("Sorted!");
    			break;
    		}
    	}
    	
    }
}
