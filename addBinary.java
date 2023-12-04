import acm.program.ConsoleProgram;

public class addBinary extends ConsoleProgram{
    public void run(){
    	String s1 = readLine("Enter the first number: ");
    	String s2 = readLine("Enter the second number: ");
    	int number1 = stringToInt(s1);
    	int number2 = stringToInt(s2);
    	number1 = binaryToTen(number1);
    	number2 = binaryToTen(number2);
    	int sum = number1 + number2;
    	int ans = tenToBinary(sum);
    	println(ans);
    }

	private int tenToBinary(int n) {
		int k = 0;
		while(n > 0){
			k = 10 * k + n % 2;
			n = n / 10;
		}
		int l = reverse(k);
	    return l;
	}

	private int reverse(int k) {
		int m = 0;
		while(k > 0){
			m = 10 * m + k %2;
			k = k / 10;
		}
		return m;
	}

	private int binaryToTen(int number) {
		int m = number;
		int counter = 0;
		while(m > 0){
			counter++;
			m = m / 10;
		}
		for(int  i = counter - 1; i >= 0; i--){
			m = m + (number / power(10, i)) * power(2, i);
		}
		return m;
	}

	private int power(int a, int b) {
		int k = 1;
		for(int i = 0; i < b; i++){
			k = k * a;
		}
		return k;
	}

	private int stringToInt(String s) {
		int n = 0;
		for(int i = 0; i < s.length(); i++){
			n = 10 * n + ((int)s.charAt(i) - 48);
		}
		return n;
	}
}
