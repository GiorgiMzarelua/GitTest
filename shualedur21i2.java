import acm.program.ConsoleProgram;

public class shualedur21i2 extends ConsoleProgram{
    public void run(){
    	String lukeDna = readLine("Enter Luke's DNA: ");
    	String anakineDna = readLine("Enter Anakine's DNA: ");
    	String isFather = amIYourFatherLuke(lukeDna, anakineDna);
    	print(isFather);
    }

	private String amIYourFatherLuke(String lukeDna, String anakineDna) {
		int n = lukeDna.length();
		int m = anakineDna.length();
		String ans = null;
		for(int i  = 0; i < n; i++){
			for(int j = i + 1; j < n; j++){
				for(int k = 0; k < m; k++){
					for(int f = k + 1; f < m; f++){
						if(lukeDna.substring(i, j) == anakineDna.substring(k, f) && anakineDna.substring(k, f).length() > ans.length()){
							ans = lukeDna.substring(i, j);
						}
					}
				}
			}
		}
		return ans;
	}
}	
