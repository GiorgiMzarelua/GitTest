import acm.program.ConsoleProgram;

public class problem30 extends ConsoleProgram{
    public void run(){
    	int n = readInt("ENTER THE NUMBER: ");
    	int m = n;
    	quantityOfDigits(m);
    	
    }

	private void quantityOfDigits(int m) {
		int amount = 0;
		int a = m;
		while(m > 0){
			m = m / 10;
			amount ++;
		}
		conjuction(a, amount);
	}

	private void conjuction(int a, int amount) {
		while(a > 0){
			for(int i = amount; i >= 1; i--){
				
			}
			int b = a % 10;
			a = a / 10;
		}
	}
}
