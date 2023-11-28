import acm.program.ConsoleProgram;

public class midTerm2 extends ConsoleProgram{
    public void run(){
    	String text = readLine("Enter the text: ");
    	println(isSorted(text));
    }

	private boolean isSorted(String text) {
		for(int i = 0; i < text.length(); i++){
			if((int)text.charAt(i) > 96 && (int)text.charAt(i) < 123){
				for(int j = i + 1; j < text.length(); j++){
					if((int)text.charAt(j) > 96 && (int)text.charAt(j) < 123 && (int)text.charAt(i) >= (int)text.charAt(j)){
						return false;
					}
				}
			}
		}
		return true;
	}
}
