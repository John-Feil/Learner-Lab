public enum Educator implements ITeacher{
    INSTRUCTOR1 (1,"Mikaila"), INSTRUCTOR2(2,"Chad");

    private Instructor instructor;

    Educator(long id, String name) {
        this.instructor = new Instructor(id,name);
    }

    public Instructor getInstructor(){
        return instructor;
    }

    @Override
    public void teach(ILearner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    @Override
    public void lecture(ILearner[] learners, double numberOfHours) {
        int size = learners.length;
        for (ILearner iLearner : learners) {
            iLearner.learn(numberOfHours/size);
        }
    }
}
