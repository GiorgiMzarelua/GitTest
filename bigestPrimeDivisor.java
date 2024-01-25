import acm.program.ConsoleProgram;

public class bigestPrimeDivisor extends ConsoleProgram{
    public void run(){
    	int n = readInt("Enter the number: ");
    	int ans = biggestPrimeDivisor(n);
    	println(ans);
    }

	private int biggestPrimeDivisor(int n) {
		for(int i = n; i >= 1; i--){
			boolean isPrime = isPrime(i);
			if(isPrime == true && n % i ==0){
				return i;
			}
		}
        return 0;
	}

	private boolean isPrime(int i) {
		int counter = 0;
		for(int j = 1; j <= i; j++){
			if(i % j == 0) counter++;
		}
		if(counter == 2) return true;
		return false;
	}
}
