import acm.program.ConsoleProgram;

public class longestSubstringWithoutRepeatingCharecters extends ConsoleProgram{
    public void run(){
    	String s = readLine("Enter the text: ");
    	int ans = lengthOfLongestSubstring(s);
    	println(ans);
    }

	private int lengthOfLongestSubstring(String s) {
		int n = s.length();
		int sum = sum(n);
        int[] array = new int[sum];
        int sequence = 0;
        int counter = 1;
        while(counter < n){
        	for(int i = 0; i < n - counter; i++){
        		String w = s.substring(i, i + counter);
        		boolean p = isRepeating(w);
        		if(p == true) array[sequence] = counter;
        		else array[sequence] = 1;
        		sequence++;
         	}
        	counter++;
        }
        int max = 0;
        for(int i = 0; i <= sequence; i++){
        	if(max < array[sequence]){
        		max = array[sequence];
        	}
        }
		return max;
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

	private int sum(int n) {
		int sum = 0;
		for(int i = 1; i <= n; i++){
			sum += i;
		}
		return sum;
	}
}
