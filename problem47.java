import acm.program.ConsoleProgram;

public class problem47 extends ConsoleProgram{
    public void run(){
    	String s = readLine("Enter a String: ");
    	boolean isPalindrom = isPalindrom(s);
    	println(s + " is palindrome: " + isPalindrom);
    }

	private boolean isPalindrom(String s) {
		for(int i = 0; i < s.length() / 2; i++){
			if(s.charAt(i) != s.charAt(s.length() - i - 1)){
				return false;
			}
		}
		return true;
	}
}
