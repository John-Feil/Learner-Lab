import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructor(){
        String expectedName = "John";
        long expectedId = 1;

        Person person = new Person(expectedId,expectedName);

        long actualId = person.getId();
        String actualName = person.getName();

        Assert.assertEquals(expectedId,actualId);
        Assert.assertEquals(expectedName,actualName);
    }

    @Test
    public void testSetName(){
        String expectedName = "John";
        Person person = new Person(0,"");

        person.setName(expectedName);

        String actualName = person.getName();

        Assert.assertEquals(expectedName,actualName);
    }
}
