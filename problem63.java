import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import acm.program.ConsoleProgram;

public class problem63 extends ConsoleProgram{
	private static final String SENTINEL = "";
    public void run(){
    	Map<String, ArrayList<String>> relationships = new HashMap<String, ArrayList<String>>();
    	while(true){
    		ArrayList<String> knownPeople = null;
    		String S1 = readLine("Enter the person who knows the second person: ");
    		if(S1.equals(SENTINEL)) break;
    		String S2 = readLine("Enter the person who is known for the first one: ");
    		if(!relationships.containsKey(S1)){
    			relationships.put(S1, new ArrayList<String>());
    		}
    		knownPeople.add(S2);
			relationships.put(S1, knownPeople);
    	}
    	println(relationships);
    }
}
