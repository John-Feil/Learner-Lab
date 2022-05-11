import org.junit.Assert;
import org.junit.Test;

public class TestEducator {
    @Test
    public void testImplementation(){
        Educator educator = Educator.INSTRUCTOR1;

        boolean answer = educator instanceof ITeacher;

        Assert.assertTrue(answer);
    }
    @Test
    public void testTeach(){
        Educator instructor = Educator.INSTRUCTOR2;
        Student student = new Student(4,"John");
        double expected = 5.0;

        instructor.teach(student,5.0);
        double actual = student.getTotalStudyTime();
        Assert.assertEquals(expected,actual,0.1);
    }
    @Test
    public void testLecture(){
        Educator instructor = Educator.INSTRUCTOR1;
        Student student = new Student(6,"Yev"); Student student1 = new Student(7,"Kyle");
        Student student2 = new Student(8,"Luis"); Student student3 = new Student(9,"Aisha");
        Student[] students = new Student[4];
        students[0] = student;
        students[1] = student1;
        students[2] = student2;
        students[3] = student3;

        double expected = 8.0;

        instructor.lecture(students,8.0);
        double actual = 0;
        for (Student s: students){
            actual = actual + s.getTotalStudyTime();
        }
        Assert.assertEquals(expected,actual,0.1);
    }

}
