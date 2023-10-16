import acm.program.ConsoleProgram;

public class problem15 extends ConsoleProgram{
    public void run(){
    	double n = readInt("ENTER THE FIRST NUMBER: " );
    	double m = readInt("ENTER THE FIRST NUMBER: " );
    	double ans = (n + m) / 2;
    	print("THE ANSWER IS: " + ans);
    }
}
