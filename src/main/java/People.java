import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Consumer;

public abstract class People<E extends Person> implements Iterator{
    private List<E> personList = new ArrayList<>();

    public void addPerson(E person){
        personList.add(person);
    }
    public E findById(long id){
        for (E p: personList){
            if (p.getId() == id){
                return p;
            }
        }
        return null;
    }
    public boolean containsPerson(E person){
        for (E p : personList){
            if (p.equals(person)){
                return true;
            }
        }
        return false;
    }
    public void removePerson(E person){
        personList.remove(person);
    }
    public void removeAll(){
        personList.clear();
    }
    public int count(){
        return personList.size();
    }
    public abstract E[] toArray();

    public ArrayList<E> getPersonList(){
        return (ArrayList<E>) personList;
    }
    public Iterator iterator(){
        Iterator<E> iteratorObject = personList.iterator();
        return iteratorObject;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }

    @Override
    public void forEachRemaining(Consumer action) {
        Iterator.super.forEachRemaining(action);
    }
}
