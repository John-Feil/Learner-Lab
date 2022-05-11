import java.util.*;

public class ZipCodeWilmington {
    private Students studentsInstance = Students.getINSTANCE();
    private Instructors instructorsInstance = Instructors.getINSTANCE();

    public void hostLecture(ITeacher teacher, double numberOfHours){
        teacher.lecture( studentsInstance.toArray(), numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours){
        ITeacher teacher = instructorsInstance.findById(id);
        teacher.lecture( studentsInstance.toArray(), numberOfHours);
    }
    public HashMap<String,Double> getStudyMap(){
        HashMap<String,Double> studyMap = new HashMap<>();
        for (Student s : studentsInstance.getPersonList()){
            studyMap.put(s.getName(),s.getTotalStudyTime());
        }
        return studyMap;
    }


}
