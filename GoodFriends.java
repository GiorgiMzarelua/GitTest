import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GoodFriends {
    Map<String, ArrayList<String>> friends;
    Map<String, Map<String, Double>> courses;
    
    public GoodFriends(){
    	friends = new HashMap<>();
    	courses = new HashMap<>();
    }
    
    public String getStudentWithMostGoodFriends(){
    	String result = "";
    	int maxLength = 0;
    	for(String friend : friends.keySet()){
    		ArrayList goodFriends = getgoodFriends(friend);
    		if(maxLength < goodFriends.size()){
    			maxLength = goodFriends.size();
    			result = friend;
    		}
    	}
		return result;
    }

	private ArrayList getgoodFriends(String name) {
		ArrayList<String> goodFriends = new ArrayList<>();
		for(String friend : friends.get(name)){
			if(isGoodFriend(name, friend)){
				goodFriends.add(friend);
			}
		}
		return goodFriends;
	}

	private boolean isGoodFriend(String name, String friend) {
		int numCourses = 5;
        for(String course : courses.get(name).keySet()){
            if(courses.get(name).get(course) > 51){
                if(courses.get(friend).getOrDefault(course, 51.0) >= 51){
                    numCourses--;
                }
                if(courses.get(friend).containsKey(course) && courses.get(friend).get(course) >= 51){
                    numCourses--;
                }
            }
        }
        return (numCourses <= 0);
	}
}
