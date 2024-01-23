import acm.program.ConsoleProgram;

public class similarStrings extends ConsoleProgram{
    public void run(){
    	String S = readLine("Enter the first String: ");
    	String T = readLine("Enter the second String: ");
    	boolean ans = same(S, T);
    	println(ans);
    }

	private boolean same(String S, String T) {
		int n = S.length();
		for(int i = 0; i < n; i++){
			if((S.charAt(i) != T.charAt(i) && S.charAt(n - i - 1) == T.charAt(n - i - 1)) || (S.charAt(i) != T.charAt(n - i - 1) && S.charAt(n - i - 1) == T.charAt(i)) || (S.charAt(i) != S.charAt(n - i - 1) && T.charAt(i) == T.charAt(n - i - 1)) || (S.charAt(i) == S.charAt(n - i - 1) && T.charAt(i) != T.charAt(n - i - 1))){
				return false;
			}
		}
		return true;
	}
}
