import acm.program.ConsoleProgram;

public class problem54 extends ConsoleProgram{
    public void run(){
    	int n = readInt("Enter the quantity of numbers: ");
    	int[] array = new int[n];
    	for(int i = 0; i < n; i++){
    		array[i] = readInt("Enter the " + (i + 1) + " number: ");
    	}
    	if(n == 1){
    		println("The second greatest number: " + array[0]);
        	println("The greatest number: " + array[0]);
    	}
    	else{
    		int max = array[0];
        	int secondMax = array[0];
        	for(int i = 1; i < n; i++){
        		if(max < array[i]){
        			secondMax = max;
        			max = array[i];
        		}
        	}
        	if(secondMax == max){
        		secondMax = array[1];
        		for(int i = 1; i < n; i++){
        			if(secondMax < array[i]){
        				secondMax = array[i];
        			}
        		}
        	}
        	println("The second greatest number: " + secondMax);
        	println("The greatest number: " + max);
    	}
    	
    	
    }
}
