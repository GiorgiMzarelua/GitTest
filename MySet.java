import java.util.ArrayList;
import java.util.Iterator;

public class MySet implements MySetInterface{
	private ArrayList<Object> list;
    public MySet(){
    	list = new ArrayList<>();
    }

	@Override
	public int size() {
		return list.size();
	}

	@Override
	public boolean isEmpty() {
		if(list.size() > 0) return true;
		return false;
	}

	@Override
	public boolean contains(Object o) {
		if(list.contains(o)) return true;
		return false;
	}

	@Override
	public Iterator<Object> iterator() {
		return list.iterator();
	}

	@Override
	public boolean add(Object o) {
		if(!list.contains(o)){
			list.add(o);
			return true;
		}
		 return false;
	}

	@Override
	public boolean remove(Object o) {
		if(list.contains(o)){
			list.remove(o);
			return true;
		}
		return false;
	}
}
