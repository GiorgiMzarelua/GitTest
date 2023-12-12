import acm.program.ConsoleProgram;

public class problem54 extends ConsoleProgram{
    public void run(){
    	int n = readInt("Enter the quantity of numbers: ");
    	int[] array = new int[n];
    	for(int i = 0; i < n; i++){
    		array[i] = readInt("Enter the " + (i + 1) + " number: ");
    	}
    	int max = array[0];
    	int secondMax = array[0];
    	for(int i = 1; i < n; i++){
    		if(max < array[i]){
    			secondMax = max;
    			max = array[i];
    		}
    	}
    	println("The second greatest number: " + secondMax);
    	println("The greatest number: " + max);
    }
}
