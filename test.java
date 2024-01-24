import acm.program.ConsoleProgram;

public class test extends ConsoleProgram{
    public void run(){
    	for(int i = 2; i < 4201; i++){
    		if(4201 % i == 0){
    			println(i);
    			break;
    		}
    	}
    	println("nope");
    }
}

