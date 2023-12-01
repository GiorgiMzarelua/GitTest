import acm.program.ConsoleProgram;

public class shualedur21i1 extends ConsoleProgram{
    public void run(){
    	int number1 = readInt("Enter the first number: ");
    	int number2 = readInt("Enter the second number: ");
    	int ans = 0;
    	for(int i = 1; i <= number2; i++){
    		int j = i;
    		while(j > 0){
    			int number = 1;
    			number = number * number1;
    			ans++;
    			if(number >= number2){
    				break;
    			}
    		}
    	}
    	print(ans - 1);
    }
}
