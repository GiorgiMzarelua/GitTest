import acm.program.ConsoleProgram;

public class problem46 extends ConsoleProgram{
    public void run(){
    	String s = readLine("Enter the text: ");
    	char c;
    	int n = s.length();
    	int counter = 1;
    	int ans = 0;
    	for(int i = 0; i < n; i++){
    		c = s.charAt(i);
    	    for(int j = i; j < n; j++){
    	    	if(c == s.charAt(j)){
    	    		counter++;
    	    	}
    	    	if(counter > ans){
    	    		ans = counter;
    	    	}
    	    	counter = 1;
    	    }
    	}
    	print(ans);H
    }
}
