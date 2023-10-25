import acm.program.ConsoleProgram;

public class problem31 extends ConsoleProgram{
    public void run(){
    	int n = readInt("ENTER THE NUMBER: ");
    	if(n == 2){
    		println("THIS IS A PRIME NUMBER.");
    	}
    	for(int i = 2; i < n; i++){
    		if(n % i == 0){
    			println("THIS IS NOT A PRIME NUMBER.");
    			break; 
    		}
    	}
	    println("THIS IS A PRIME NUMBER.");
    }
}
