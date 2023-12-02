import acm.program.ConsoleProgram;

public class shualedur22i3 extends ConsoleProgram{
    public void run(){
    	String text = readLine("Enter the text: ");
    	String textAfterManipulation = readLine("Enter the text to check: ");
    	boolean isPossible = manipulation(text, textAfterManipulation);
    	println(isPossible);
    }

	private boolean manipulation(String text, String textAfterManipulation) {
		for(int i = 1; i < text.length() - 1; i++){
			String part1 = text.substring(0, i);
			String part2 = text.substring(i);
			if(canManipulate(part1, part2, textAfterManipulation)){
				return true;
			}
		}
		return false;
	}

	private boolean canManipulate(String part1, String part2, String textAfterManipulation) {
		for(int i = 0; i < part1.length(); i++){
			String substracted1 = substraction(part1, part1.charAt(i));
			for(int j = 0; j < part2.length(); j++){
				String substracted2 = substraction(part2, part2.charAt(j));
				String finalStr = substracted1 + substracted2;
				if(finalStr == textAfterManipulation){
					return true;
				}
			}
		}
		return false;
	}

	private String substraction(String text, char ch) {
		String returningStr = "";
		for(int i = 0; i < text.length(); i++){
			if(text.charAt(i) != ch){
				returningStr = returningStr + ch;
			}
		}
		return returningStr;
	}
}
