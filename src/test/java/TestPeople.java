import org.junit.*;

public class TestPeople {
    @Test
    public void testAdd(){
        Student john = new Student(5,"John");
        Students students = Students.getINSTANCE();
        boolean expected = true;

        students.addPerson(john);

        boolean actual = students.containsPerson(john);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testRemove(){
        Instructor peter = new Instructor(5,"Peter");
        Instructors instructors = Instructors.getINSTANCE();
        boolean expected = false;
        instructors.addPerson(peter);

        instructors.removePerson(peter);
        boolean actual = instructors.containsPerson(peter);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void  testFindById(){
        Instructor expected = new Instructor(5,"Fuchs");
        Instructors instructors = Instructors.getINSTANCE();
        instructors.addPerson(expected);


        Instructor actual = instructors.findById(5);

        Assert.assertEquals(expected,actual);
    }
}
