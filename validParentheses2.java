import acm.program.ConsoleProgram;

public class validParentheses2 extends ConsoleProgram{
    public void run(){
    	String s = readLine("Enter the parentheses: ");
    	boolean ans = isValid(s);
    	println("This is the answer: " + ans);
    }

	private boolean isValid(String s) {
		int[] array = new int[6];
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) == '('){
				array[0]++;
			}
			else if(s.charAt(i) == ')'){
				array[1]++;
			}
			else if(s.charAt(i) == '{'){
				array[2]++;
			}
			else if(s.charAt(i) == '}'){
				array[3]++;
			}
			else if(s.charAt(i) == '['){
				array[4]++;
			}
			else if(s.charAt(i) == ']'){
				array[5]++;
			}
		}
		if(array[0] != array[1] || array[2] != array[3] || array[4] != array[5] || s.charAt(0) == ')' || s.charAt(0) == '}' || s.charAt(0) == ']' || s.charAt(s.length() - 1) == '(' || s.charAt(s.length() - 1) == '{' || s.charAt(s.length() - 1) == '['){
			return false;
		}
		for(int i = 0; i < s.length() - 1; i++){
			if(s.charAt(i) == '(' && s.charAt(i + 1 ) != ')') return false;
			else if(s.charAt(i) == '{' && s.charAt(i + 1 ) != '}') return false;
			else if(s.charAt(i) == '[' && s.charAt(i + 1 ) != ']') return false;
		}	
		return true;
    }
}
