/*
 * 63-ე ამოცანის გაგრძელება. დაბეჭდეთ ადამიანი რომელსაც ყველაზე მეტი ადამიანი ემეგობრება
 */
import java.util.HashMap;
import java.util.Map;

import acm.program.ConsoleProgram;

public class problem65 extends ConsoleProgram{
	private static final String SENTINEL = "";
    public void run(){
    	Map<String, Integer> relationships = new HashMap<String,Integer>();
    	while(true){
    		String person = readLine("Enter the person who knows the second person: ");
    		if(person.equals(SENTINEL)) break;
    		String friend = readLine("Enter the person who is known for the first one: ");
    		if(!relationships.containsKey(friend)){
    			relationships.put(friend, 0);
    		}
    		int newCount = relationships.get(friend) + 1;
			relationships.put(friend, newCount);
    	}
    	int maxFriends = 0;
    	String popularPerson = null;
    	for(String friend: relationships.keySet()){
    		int friendQuantity = relationships.get(friend);
    		if(friendQuantity > maxFriends){
    			maxFriends = friendQuantity;
    			popularPerson = friend;
    		}
    	}
    	println(popularPerson);
    }
}
