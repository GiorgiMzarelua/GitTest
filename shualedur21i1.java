import acm.program.ConsoleProgram;

public class shualedur21i1 extends ConsoleProgram{
    public void run(){
    	int number1 = readInt("Enter the first number: ");
    	int number2 = readInt("Enter the second number: ");
    	int ans = log(number1, number2);
    	print(ans);
    }

	private int log(int number1, int number2) {
		int number = 1;
		int ans = 0;
		while(number <= number2){
			number = number1 * number;
			ans++;
		}
		return (ans - 1);
	}
}
