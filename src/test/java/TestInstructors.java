import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {
    @Test
    public void testInstructorsCount(){
        //when
        Instructors instance = Instructors.getINSTANCE();
        int expected = 2;

        int actual = instance.count();

        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testInstructorsName(){
        //when
        Instructors instance = Instructors.getINSTANCE();
        Instructor s =  instance.findById(1);


        Assert.assertEquals(s.getName(),"Mikaila");
    }
}
