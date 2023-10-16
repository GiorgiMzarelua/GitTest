import acm.program.ConsoleProgram;

public class problem16 extends ConsoleProgram{
    public void run(){
    	double a = readInt("ENTER THE FIRST NUMBER: ");
    	double b = readInt("ENTER THE SECOND NUMBER: ");
    	double c = readInt("ENTER THE THIRD NUMBER: ");
    	double ans = 1 / ((1 / a) + (1 / b) + (1 / c));
    	print("THE ANSWER IS: " + ans);
    }
}
