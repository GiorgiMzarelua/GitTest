import java.util.Iterator;

public interface MySetInterface {
    public int size();
    public boolean isEmpty();
    public boolean contains(Object o);
    public Iterator<Object> iterator();
    public boolean add(Object o);
    public boolean remove(Object o);
}
