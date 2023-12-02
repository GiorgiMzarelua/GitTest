import acm.program.ConsoleProgram;

public class test extends ConsoleProgram{
    public void run(){
    	for(int i = 0; i < 10; i++){
    		for(int j = 11; j < 20; j++ ){
    			println(j);
    			break;
    		}
    	}
    }
}