import acm.program.ConsoleProgram;

public class seminari9evklide extends ConsoleProgram{
    public void run(){
    	int a =readInt("enter the first number: ");
    	int b =readInt("enter the second number: ");
    	print("THIS IS THE ANSWER: " + euklide(a, b));
    }

	private int euklide(int a, int b) {
        int c = Math.max(a , b);
        b = Math.min( a,  b);
        a = c;
        int d = 0;
        while(b != 0){
        	c = a % b;
        	d = b;
        	b = c;
        	a = d;
        }
		return a;
	}
}