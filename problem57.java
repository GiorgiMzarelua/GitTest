import acm.program.ConsoleProgram;

public class problem57 extends ConsoleProgram{
    public void run(){
    	String s1 = readLine("Enter the first String: ");
    	String s2 = readLine("Enter the second String: ");
    	if(s1.length() != s2.length()){
    		println(false);
    	}
    	else{
    		boolean isAnagram = isAnagram(s1, s2);
    		println(isAnagram);
    	}
    }

	private boolean isAnagram(String s1, String s2) {
		int n = s1.length();
		int[] array = new int[n];
		for(int i = 0; i < n; i++){
			array[(int) s1.charAt(i) - 'a']++;
		}
		for(int i = 0; i < n; i++){
			array[(int) s2.charAt(i) - 'a']--;
		}
		for(int i = 0; i < n; i++){
			if(array[i] != 0){
				return false;
			}
		}
		return true;
	}
} 
