import acm.program.ConsoleProgram;

public class longestSubstringWithoutRepeatingCharecters extends ConsoleProgram{
    public void run(){
    	String s = readLine("Enter the text: ");
    	int ans = lengthOfLongestSubstring(s);
    	println(ans);
    }

	private int lengthOfLongestSubstring(String s) {
		int n = s.length();
		int factorial = factorial(n);
        int[] array = new int[factorial];
        int sequence = 0;
        for(int i = 0; i < n; i++){
        	for(int j = i; j < n; j++){
        		String w = s.substring(i, j);
        		boolean p = isRepeating(w);
        		if(p == true) array[sequence] = j - i + 1;
        		else array[sequence] = 1;
        		sequence++;
        	}
        }
		return 0;
	}

	private boolean isRepeating(String w) {
		int[] substring = new int[26];
		for(int i = 0; i < w.length(); i++){
			substring[i] = (int) w.charAt(i) - 97;
		}
	    for(int i = 0; i < 26; i++){
	    	if(substring[i] != 0 && substring[i] != 1){
	    		return false;
	    	}
	    }
		return true;
	}

	private int factorial(int n) {
		int factorial = 1;
		for(int i = 1; i <= n; i++){
			factorial = factorial * i;
		}
		return factorial;
	}
}
