import acm.program.ConsoleProgram;

public class howManyEachSymbol extends ConsoleProgram{
	private String w;
	
    public void run(){
    	String s =readLine("Enter the text: ");
        boolean isBalanced = isBalanced(s);
        println(isBalanced);
    }

	private boolean isBalanced(String s) {
		int mainCounter = 0;
		int counter = 0;
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(0) == s.charAt(i)){
				mainCounter++;
			}
		}
		for(int i = 0; i < s.length(); i++){
			for(int j = 0; j < s.length(); j++){
				if(s.charAt(i) == s.charAt(j)){
					counter++;
				}
			}
			if(counter != mainCounter){
				return false;
			}
			counter = 0;
		}
		return true;
	}
}
