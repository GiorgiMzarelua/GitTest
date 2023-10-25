import acm.program.ConsoleProgram;

public class problem30 extends ConsoleProgram{
    public void run(){
    	int m = readInt("ENTER THE NUMBER: ");
    	quantityOfDigits(m);
    	
    }

	private int quantityOfDigits(int m) {
		int amount = 0;
		int a = m;
		while(m > 0){
			m = m / 10;
			amount ++;
		}
		return conjuction(a, amount);
	}

	private int conjuction(int a, int amount) {
		int b = 0;
		while(a > 0){
			for(int i = amount; i >= 1; i--){
				b = 10 * b + a % 10;
				a = a / 10;
			}
		}
		return b;
	}
}
