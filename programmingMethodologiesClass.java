import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class programmingMethodologiesClass {
	private Map<String, Double> studentsScores;
    public programmingMethodologiesClass(){
    	studentsScores = new HashMap<String, Double>();
    	
    }
    
    public programmingMethodologiesClass(ArrayList<String> students){
    	studentsScores = new HashMap<String, Double>();
    	for(String student : students){
    		studentsScores.put(student, null);
    	}
    }
    
    public Double getScore(String student){
    	if(!studentsScores.containsKey(student)){
    		System.out.println("No such student: " + student);
    	}
		return studentsScores.get(student);   	
    }
    
    public void setscore(String student, double score){
    	if(!studentsScores.containsKey(student)){
    		System.out.println("No such student: " + student);
    	    return;
    	}
    	studentsScores.put(student, score);
    }
}
