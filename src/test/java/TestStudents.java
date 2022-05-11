import org.junit.Assert;
import org.junit.Test;

public class TestStudents {
    @Test
    public void testStudentsCount(){
        //when
        Students instance = Students.getINSTANCE();
        int expected = 2;

        int actual = instance.count();

        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testStudentsName(){
        //when
        Students instance = Students.getINSTANCE();
        Student s = instance.findById(3);


        Assert.assertEquals(s.getName(),"Paul");
    }
}
