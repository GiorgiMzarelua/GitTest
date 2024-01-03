import java.util.HashMap;
import java.util.Map;

import acm.program.ConsoleProgram;

public class problem62 extends ConsoleProgram{
	private static final String SENTINEL = "";
	public void run(){
		Map<String, Integer> namesCounter = new HashMap<String, Integer>();
		while(true){
			String name = readLine("Enter the name: ");
			if(name.equals(SENTINEL))   break;
			if(!namesCounter.containsKey(name)) namesCounter.put(name, 0);
			int newCount = namesCounter.get(name) + 1;
			namesCounter.put(name, newCount);
		}
		println(namesCounter);
	}
}
