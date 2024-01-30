import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.HashSet;

import acm.program.ConsoleProgram;

public class EnemyOfMyEnemy extends ConsoleProgram{
	
	HashMap<String, HashSet<String>> friends;
	HashMap<String, HashSet<String>> enemies;
	HashSet<String> people;
	
    public void run(){
    	friends = new HashMap<>();
    	enemies = new HashMap<>();
    	people = new HashSet<>();
    	String filename = "";
    	String name = "";
    	boolean ans = enemyOfMyEnemy(filename, name);
    	println(ans);
    }
    private boolean enemyOfMyEnemy(String fileName, String name){
    	readFile(fileName);
    	determineEnemies();
    	HashSet<String> enemiesOfEnemies = new HashSet<>();
    	for(String enemy : enemies.get(name)){
    		enemiesOfEnemies.addAll(enemies.get(enemy));
    	}
    	enemiesOfEnemies.remove(name);
    	return friends.get(name).equals(enemiesOfEnemies);
    }
    
	private void determineEnemies() {
		for(String person : people){
			HashSet<String> copy = people;
			enemies.put(person, copy);
			enemies.get(person).remove(person);
			for(String friend : friends.get(person)){
				enemies.get(person).remove(friend);
			}
		}
	}
	
	private void readFile(String fileName) {
		try{
			BufferedReader rd = new BufferedReader(new FileReader(fileName));
			while(true){
				String line  = rd.readLine();
				if(line == null) break;
				int index = line.indexOf(" ");
	            String first = line.substring(0, index);
	            String second = line.substring(index+1);
	            if(!friends.containsKey(first)){
	                friends.put(first, new HashSet<>());
	            }
	            friends.get(first).add(second);
	            if(!friends.containsKey(second)){
	                friends.put(second, new HashSet<>());
	            }
	            friends.get(second).add(first);
	            people.add(first);
	            people.add(second);
			}
		} catch(Exception e){
			println("dagverxa ar gaixsna");
		}
		
	}
}
