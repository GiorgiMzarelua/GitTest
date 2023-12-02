import acm.program.ConsoleProgram;

public class shualedur21i2 extends ConsoleProgram{
    public void run(){
    	String lukeDna = readLine("Enter Luke's DNA: ");
    	String anakineDna = readLine("Enter Anakine's DNA: ");
    	boolean isFather = amIYourFatherLuke(lukeDna, anakineDna);
    	print(isFather);
    }
    
    private boolean amIYourFatherLuke(String lukeDna, String anakineDna){
		int maxLength = 0;
		for(int i = 0; i < lukeDna.length(); i++){
			for(int j = i + 1; j < lukeDna.length() + 1; j++){
				String currSubs = lukeDna.substring(i, j);
				if(anakineDna.indexOf(currSubs) == -1){
					break;
				}
				maxLength = Math.max(maxLength, currSubs.length());
			}
		}
		return maxLength > anakineDna.length() / 2.0;
	}
}    

