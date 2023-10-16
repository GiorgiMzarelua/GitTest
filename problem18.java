import acm.program.ConsoleProgram;

public class problem18 extends ConsoleProgram{
    public void run(){
    	int a = readInt("ENTER THE FIRST NUMBER: ");
    	int b = readInt("ENTER THE SECOND NUMBER: ");
    	if(a > b){
    		print("THE ANSWER IS: " + a);
    	}
    	else{
    		print("THE ANSWER IS: " + b);
    	}
    }
}
