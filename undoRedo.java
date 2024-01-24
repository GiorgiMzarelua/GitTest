import java.util.ArrayList;

public class undoRedo {
	private ArrayList<String> list;
	private String lastElement;
	private int lastElementIndex;
    public String get(){
        if(list.get(lastElementIndex) != null){
        	list.get(lastElementIndex);
        }
        return "";
    }
    
    public void save(String text){
    	list.add(text);
    	lastElementIndex++;
    }
    
    public void undo(){
    	if(lastElementIndex > 0){
    		lastElementIndex--;
    	}
    }
    
    public void redo(){
    	if(lastElementIndex < list.size()){
    		lastElementIndex++;
    	}
    }
    
    public void clear(){
    	for(int i = 0; i < list.size(); i++){
    		list.remove(i);
    	}
    }
}
