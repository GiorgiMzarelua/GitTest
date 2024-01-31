import java.util.ArrayList;
import java.util.HashMap;

import acm.program.ConsoleProgram;

//ამოცანა 4. (30 ქულა) სამზარეულო
//თქვენი ამოცანაა გაიგოთ რა კერძების გაკეთება შეიძლება სამზარეულოში. ამისათვის მოცემული გაქვთ რეცეპტების სია ჰეშმეფის სახით. 
//ჰეშმეფის key არის კერძის სახელი(String), ხოლო value ინგრედიენტების სახელების სია(ArrayList<String>). 
//ზოგიერთი კერძის ინგრედიენტი შეიძლება სხვა კერძიც იყოს, მაგალითად:
//პური - [ფქვილი, მარილი]
//ხაჭაპური - [ფქვილი, ყველი , მარილი]
//ბურგერი - [პური, ყველი, სალათის ფოთოლი]
//ასევე მოცემული გაქვთ მაცივარში არსებული ინგრედიენტების სახელების სია(ArrayList<String>). ჩათვალეთ, რომ 
//უსასრულო რაოდენობის ინგრედიენტები გაქვთ.
//დაწერეთ kitchen მეთოდი რომელსაც გადაეცემა რეცეპტების ჰეშმეფი და ინგრედიენტების არაილისტი და რომელიც აბრუნებს შესაძლებელი
//კერძების არაილისტს.
//ამოხსნა დაწერეთ kitchen.java კლასში
//TODO არასწორადაა პირობა გაგებული და უფრო მარტივი ვარიანტის ამოხსნა წერია.
//https://www.youtube.com/playlist?list=PL6qg6DlVkjd6XenORSl6px7Z_NweBs8yf

public class Kitchen extends ConsoleProgram{
	private HashMap<String, ArrayList<String>> recepies;
	private ArrayList<String> ingredients;
    public void run(){
    	recepies = new HashMap<>();
    	ingredients = new ArrayList<>();
    	ingredients.add("flour");
    	ingredients.add("salt");
    	ArrayList<String> bread = new ArrayList<>();
    	bread.add("flour");
    	bread.add("salt");
    	recepies.put("bread", bread);
    	ArrayList<String> khachapuri = new ArrayList<>();
    	khachapuri.add("flour");
    	khachapuri.add("salt");
    	khachapuri.add("cheese");
    	recepies.put("khachapuri", khachapuri);
    	ArrayList<String> burger = new ArrayList<>();
    	burger.add("bread");
    	burger.add("salatis fotoli");
    	burger.add("cheese");
    	recepies.put("burger", burger);
    	ArrayList<String> dishes = kitchen(recepies, ingredients);
    	println(dishes);
    }
    
    private ArrayList<String> kitchen(HashMap<String, ArrayList<String>> recepies, ArrayList<String> ingredients){
    	ArrayList<String> dishes = new ArrayList<>();
    	for(String food : recepies.keySet()){
    		int counter = 0;
    		for(String ingredient : recepies.get(food)){
    			if(ingredients.contains(ingredient)) counter++;
    		}
    		if(counter == recepies.get(food).size()) dishes.add(food);
    	}
    	return dishes;
    }
}
