import acm.program.ConsoleProgram;
public class problem32 extends ConsoleProgram{
    public void run(){
    	int counter  = 0;
    	for(int i = 2; i < 1000000; i++){
    		for(int j = 2; j < i; j++){
    			if (i % j == 0){
    				counter++;
    			}
    		}
    		if(counter > 0){
    			println(i);
    		}
    		counter = 0;
    	}
    }
}
