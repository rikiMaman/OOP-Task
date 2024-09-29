import java.util.List;

public interface Course {

    public String getCourseName();
    public String getCourseCode();

    void addParticipant(Person person);
    List<Person> getParticipants();


}
