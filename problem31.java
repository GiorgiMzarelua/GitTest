import acm.program.ConsoleProgram;

public class problem31 extends ConsoleProgram{
    public void run(){
    	int n = readInt("ENTER THE NUMBER: ");
    	int counter = 0;
    	for(int i = 2; i < n; i++){
    		if(n % i == 0){
    			counter++;
    		}
    	}
	    if(counter == 0){
	    	println("THIS IS A PRIME NUMBER.");
	    }
	    else{
	    	println("THIS IS NOT A PRIME NUMBER.");
	    }
    }
}
