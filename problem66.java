
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import acm.program.ConsoleProgram;

public class problem66 extends ConsoleProgram{
	private static final String SENTINEL = "";
    public void run(){
    	Map<String, ArrayList<String>> mutualFriend = new HashMap<String, ArrayList<String>>();
        while(true){
        	String person = readLine("Enter the person who knows the second person: ");
        	if(person.equals(SENTINEL)) break;
        	String friend = readLine("Enter the person who is known for the first one: ");
        	if(!mutualFriend.containsKey(person)){
    			mutualFriend.put(person, new ArrayList<String>());
    		}
    		ArrayList<String> knownPeople = mutualFriend.get(person);
    		knownPeople.add(friend);
        }
        
    }
}
