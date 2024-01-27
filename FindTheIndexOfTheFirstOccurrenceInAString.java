import acm.program.ConsoleProgram;

public class FindTheIndexOfTheFirstOccurrenceInAString extends ConsoleProgram{
    public void run(){
    	String haystack = readLine("Enter the haystack: ");
    	String needle = readLine("Enter the needle: ");
    	int ans = findTheIndexOfTheFirstOccurrenceInAString(haystack, needle);
    	println(ans);
    }

	private int findTheIndexOfTheFirstOccurrenceInAString(String haystack, String needle) {
		int hS = haystack.length();
		int nS = needle.length();
		if(nS > hS) return -1;
		for(int i = 0; i < hS; i++){
			if(haystack.charAt(i) == needle.charAt(0) && hS - i - 1 > nS){
				int counter = 0;
				for(int j = i; j < i + nS; j++){
					if(haystack.charAt(j) == needle.charAt(j - i)) counter++;
				}
				if(counter == nS) return i;
			}
		}
		return -1;
	}
}
