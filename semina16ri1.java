import acm.program.ConsoleProgram;

public class semina16ri1 extends ConsoleProgram{
	public void run(){
		String s1 = readLine("Enter the first string: ");
		String s2 = readLine("Enter the second string: ");
		if(s1.length() != s2.length()){
			print("FALSE");
		}
		else{
			int n = s1.length();
			int counter1 = 1;
			int counter2 = 0;
			for(int i = 0; i < n; i++){
				for(int j = i + 1; j< n; j++){
					if(s1.charAt(i) == s1.charAt(j)){
						counter1++;
					}
				}
				for(int j = 0; j < n; j++){
					if(s1.charAt(i) == s2.charAt(j)){
						counter2++;
					}
				}
				if(counter1 != counter2){
					print("FALSE");
					break;
				}
				else{
					counter1 = 1;
					counter2 = 0;
				}
				
			}
			print("TRUE");
		}
	}
}
