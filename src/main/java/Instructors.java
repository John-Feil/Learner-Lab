public final class Instructors extends People<Instructor>{
    private static final Instructors INSTANCE = new Instructors();

    private Instructors() {
        Instructor mikaila = new Instructor(1, "Mikaila");
        Instructor chad = new Instructor(2,"Chad");
        addPerson(mikaila);
        addPerson(chad);
    }
    public static Instructors getINSTANCE(){
        return INSTANCE;
    }

    @Override
    public Instructor[] toArray() {
        return getPersonList().toArray(new Instructor[0]);
    }
}
