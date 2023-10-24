import acm.program.ConsoleProgram;

public class seminari9evklide extends ConsoleProgram{
    public void run(){
    	int a =readInt("enter the first number: ");
    	int b =readInt("enter the second number: ");
    	euklide(a , b);
    	
    }

	private void euklide(int a, int b) {
		int c = 0;
		int d = Math.max(a , b);
	    int e = Math.min(a, b);
	    a = d;
	    b = e;
		while(a == 0 || b == 0 ){
			c = a % b;
			a =  
			
		}
	}
}
