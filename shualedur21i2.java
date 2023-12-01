import acm.program.ConsoleProgram;

public class shualedur21i2 extends ConsoleProgram{
    public void run(){
    	String lukeDna = readLine("Enter Luke's DNA: ");
    	String anakineDna = readLine("Enter Anakine's DNA: ");
    	boolean isFather = amIYourFatherLuke(lukeDna, anakineDna);
    	print(isFather);
    }

	private boolean amIYourFatherLuke(String lukeDna, String anakineDna) {
		int n1 = lukeDna.length();
		int n2 = anakineDna.length();
		int counter = 0;
		while(true){
			for(int i = 0; i < n2; i++){
				for(int j = 0; j < n1; j++){
					if(anakineDna.charAt(i) == lukeDna.charAt(j)){
						while(anakineDna.charAt(i + counter) == lukeDna.charAt(j + counter)){
							counter++;	
						}
						if(counter > n2 / 2){
							return true;
						}
						else{
							counter = 0;
						}
					}
				}
			}
			return false;
		}
		
	}
}
