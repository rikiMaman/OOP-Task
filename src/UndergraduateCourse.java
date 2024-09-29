import java.util.ArrayList;
import java.util.List;

//under graduate course implements course interface
public class UndergraduateCourse implements Course {


    //private properties
    private String courseName;
    private String courseCode;
    private List<Person> participant;

    //ctor
    public UndergraduateCourse(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.participant =  new ArrayList<>();
    }


    //return course name
    @Override
    public String getCourseName() {
        return courseName;
    }

    //return course code
    @Override
    public String getCourseCode() {
        return courseCode;
    }

    //add participant to the list
     public void addParticipant(Person person){
        this.participant.add(person);
    }

    //return a list of participant (tpe of Person)
    public List<Person> getParticipants(){
        return participant;
    }
}
