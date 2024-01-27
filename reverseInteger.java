import acm.program.ConsoleProgram;

public class reverseInteger extends ConsoleProgram{
    public void run(){
    	int x = readInt("Enter the number to reverse: ");
    	int ans = reversedInt(x);
    	println(ans);
    }

	private int reversedInt(int x) {
		if(Math.pow(2, 31) - 1 < x || -Math.pow(2, 31) > x) return 0;
		int y = mod(x);
		int ans = 0;
		while(y > 0){
			ans = 10 * ans + y % 10;
			y = y / 10;
		}
		if( x > 0) return ans;
		else return -ans;
	}

	private int mod(int x) {
		if(x >= 0) return x;
		else return -x;
	}
} 
