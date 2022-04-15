import org.junit.*;

public class TestPeople {
    @Test
    public void testAdd(){
        Person person = new Person(1,"John");
        People people = new People();
        boolean expected = true;

        people.addPerson(person);
        boolean actual = people.containsPerson(person);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testRemove(){
        Person person = new Person(1,"John");
        People people = new People();
        boolean expected = false;
        people.addPerson(person);
        people.removePerson(person);
        boolean actual = people.containsPerson(person);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void  testFindById(){
        People people = new People();
        Person person = new Person(1,"John");
        people.addPerson(person);

        Person expected = new Person(5,"Kyle");
        people.addPerson(expected);

        Person actual = people.findById(5);

        Assert.assertEquals(expected,actual);
    }
}
