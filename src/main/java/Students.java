import java.util.Arrays;

public final class Students extends People<Student> {
    private static final Students INSTANCE = new Students();

    private Students () {
        Student paul = new Student(3,"Paul");
        Student john = new Student(4, "John");
        addPerson(paul);
        addPerson(john);
        }


    public static Students getINSTANCE(){
        return INSTANCE;
    }


    @Override
    public Student[] toArray() {
        return getPersonList().toArray(new Student[0]);
    }

}
