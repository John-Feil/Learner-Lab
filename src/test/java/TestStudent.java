import org.junit.Assert;
import org.junit.Test;

public class TestStudent {
    @Test
    public void testImplementation(){
        Student student = new Student(5,"John");

        boolean actual = student instanceof ILearner;

        Assert.assertTrue(actual);
    }
    @Test
    public void testInheritance(){
        Student student = new Student(6,"Mike");

        boolean actual = student instanceof Person;

        Assert.assertTrue(actual);
    }
    @Test
    public void testLearn(){
        Student student = new Student(8,"Pele");
        double expected = 5.0;

        student.learn(expected);
        double actual = student.getTotalStudyTime();

        Assert.assertEquals(expected,actual,0.1);
    }
}
