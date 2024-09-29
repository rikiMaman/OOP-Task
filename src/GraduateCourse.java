import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//graduate course implements course interface
public class GraduateCourse implements Course {

    //private properties
    private String courseName;
    private String courseCode;
    private List<Person> participents;
    private String researchFocus;

    //ctor
    public GraduateCourse(String courseName, String courseCode, String researchFocus) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.researchFocus = researchFocus;
        participents = new ArrayList<>();
    }

    //return research focus
    public String getResearchFocus() {
        return researchFocus;
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

    //add participant to the list of participant
    @Override
    public void addParticipant(Person person) {
        participents.add(person);
    }

    //return a list of participant (of type Person)
    @Override
    public List<Person> getParticipants() {
        return participents;
    }
}
