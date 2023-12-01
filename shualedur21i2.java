import acm.program.ConsoleProgram;

public class shualedur21i2 extends ConsoleProgram{
    public void run(){
    	String lukeDna = readLine("Enter Luke's DNA: ");
    	String anakineDna = readLine("Enter Anakine's DNA: ");
    	boolean isFather = amIYourFatherLuke(lukeDna, anakineDna);
    }

	private boolean amIYourFatherLuke(String lukeDna, String anakineDna) {
		int n1 = lukeDna.length();
		int n2 = anakineDna.length();
		int counter = 1;
		while(true){
			for(int i = 0; i < n2; i++){
				for(int j = 0; j < n1; j++){
					if(anakineDna.charAt(i) == lukeDna.charAt(j)){
						
					}
				}
			}
		}
		return false;
	}
}
