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
			//!! to include substring at the end =>  j < lukeDNA.length() + 1
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

//	private String amIYourFatherLuke(String lukeDna, String anakineDna) {
//		int n = lukeDna.length();
//		int m = anakineDna.length();
//		String ans = null;
//		for(int i  = 0; i < n; i++){
//			for(int j = i + 1; j < n + 1; j++){
//				
//			}
//		}
//		return ans;
//	}
//}	
