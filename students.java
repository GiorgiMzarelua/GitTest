import java.util.ArrayList;
import java.util.Map;

import acm.program.ConsoleProgram;

public class students extends ConsoleProgram{
	private Map<String, ArrayList<String>> studentToFriends;
	private Map<String, Map<String, Double>> studentToMarks;
    public void run(){
    	ArrayList MakosFriends = new ArrayList();
    	ArrayList NinosFriends = new ArrayList();
    	ArrayList BesosFriends = new ArrayList();
    	ArrayList LilesFriends = new ArrayList();
    	ArrayList TomasFriends = new ArrayList();
    	ArrayList TakosFriends = new ArrayList();
    	MakosFriends.add("Nino");
    	MakosFriends.add("Tako");
    	MakosFriends.add("Beso");
    	MakosFriends.add("Lile");
    	MakosFriends.add("Gio");
    	NinosFriends.add("Mako");
    	NinosFriends.add("Tako");
    	NinosFriends.add("Toma");
    	BesosFriends.add("Mako");
    	BesosFriends.add("Toma");
    	LilesFriends.add("Tako");
    	LilesFriends.add("Mako");
    	TakosFriends.add("Mako");
    	TakosFriends.add("Lile");
    	TakosFriends.add("Nino");
    	studentToFriends.put("Lile", LilesFriends);
    	studentToFriends.put("Mako", MakosFriends);
    	studentToFriends.put("Nino", NinosFriends);
    	studentToFriends.put("Beso", BesosFriends);
    	studentToFriends.put("Tako", TakosFriends);
    }
} 
