import acm.program.ConsoleProgram;

public class howManyEachSymbol extends ConsoleProgram{
	private String w;
	
    public void run(){
    	String s =readLine("Enter the text: ");
        int isBalanced = isBalanced(s);
        println(isBalanced);
    }

	private int isBalanced(String s) {
		int counter = 0;
		for(int i = 0; i < s.length(); i++){
			for(int j = i; j < s.length(); j++){
				if(s.charAt(i) == s.charAt(j)){
					counter++;
				}
			}
		}
		return counter;
	}
}
