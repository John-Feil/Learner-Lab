import java.util.*;
import java.util.function.Consumer;

public class People implements Iterator{
    private List<Person> personList = new ArrayList<>();

    public void addPerson(Person person){
        personList.add(person);
    }
    public Person findById(long id){
        for (Person p: personList){
            if (p.getId() == id){
                return p;
            }
        }
        return null;
    }
    public boolean containsPerson(Person person){
        for (Person p : personList){
            if (p.equals(person)){
                return true;
            }
        }
        return false;
    }
    public void removePerson(Person person){
        personList.remove(person);
    }
    public void removeAll(){
        personList.clear();
    }
    public int count(){
        return personList.size();
    }
    public Object[] toArray(){
        return personList.toArray();
    }
    public Iterator iterator(){
        Iterator<Person> iteratorObject = personList.iterator();
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
