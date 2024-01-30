import acm.program.ConsoleProgram;

public class CountBinarySubStrings extends ConsoleProgram{
    public void run(){
    	String s = readLine("Enter the binary number: ");
    	int ans = countBinarySubStrings(s);
    	println(ans);
    }

	private int countBinarySubStrings(String s) {
		int n = s.length();
		int counter = 0;
		for(int i = 0; i < n - 1; i++){
			for(int j = i + 1; j < n; j++){
				String w = s.substring(i, j);
				if(isBinary(w)) counter++;
			}
		}
		return counter;
	}

	private boolean isBinary(String w) {
		if(w.length() % 2 == 1) return false;
		if(w.charAt(0) == '0'){
			for(int i = 0; i < w.length() / 2; i++){
				if(w.charAt(i) != '0' && w.charAt(w.length() - 1 - i) != '1') return false;
			}
		}
		else {
			for(int i = 0; i < w.length() / 2; i++){
				if(w.charAt(i) != '1' && w.charAt(w.length() - 1 - i) != '0') return false;
			}
		}
		return true;
	}
} 
