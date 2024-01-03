/*
 * კონსოლიდან შეგვყავს წყვილ-წყვილად მეგობრების სახელები, მანამ სანამ არ შევიყვანთ
 * ცარიელ სტრინგს. დაბეჭდეთ იმ ადამიანის სახელი ვისაც ჰყავს ყველაზე მეტი მეგობარი.
 * მეგობრობა შეიძლება იყოს ცალმხრივი. თუკი შევიყვანთ A-ს და B-ს, ეს ნიშნავს, რომ A არის
 * B-ს მეგობარი, მაგრამ B შეიძლება არ იყოს A-ს მეგობარი.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import acm.program.ConsoleProgram;

public class problem63 extends ConsoleProgram{
	private static final String SENTINEL = "";
    public void run(){
    	Map<String, Integer> relationships = new HashMap<String,Integer>();
    	while(true){
    		String S1 = readLine("Enter the person who knows the second person: ");
    		if(S1.equals(SENTINEL)) break;
    		String S2 = readLine("Enter the person who is known for the first one: ");
    		if(!relationships.containsKey(S1)){
    			relationships.put(S1, 0);
    		}
    		int newCount = relationships.get(S1) + 1;
			relationships.put(S1, newCount);
    	}
    	println(relationships);
    }
}
