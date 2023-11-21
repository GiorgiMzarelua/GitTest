import acm.program.ConsoleProgram;

public class problem46 extends ConsoleProgram{
    public void run(){
    	String s = readLine("Enter the text: ");
    	int n = s.length();
    	int counter = 0;
    	int ans = 0;
    	for(int i = 0; i < n; i++){
    	    for(int j = 0; j < n; j++){
    	    	if(s.charAt(i) == s.charAt(j)){
    	    		counter++;
    	    	}
    	    }
    	    if(counter > ans){
    	    	ans = counter;
    	    }
    	    counter = 0;
    	}
    	print(ans);
    }
}
