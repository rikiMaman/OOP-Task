import java.util.List;

//main university
public class MainUniversity {


    //main method
    public static void main(String[] args) {
        // Create Students
        Student student1 = new Student("Alice", 20, "123 University St", "S001");
        Student student2 = new Student("Bob", 22, "456 College Ave", "S002");

        System.out.println(student1.study());
        System.out.println(student2.study());

        // Create Professors
        Professor professor1 = new Professor("Dr. Smith", 45, "789 Faculty Rd", "Computer Science");
        System.out.println(professor1.teach());

        // Create Courses
        UndergraduateCourse course1 = new UndergraduateCourse("Intro to Programming", "CS101");
        GraduateCourse course2 = new GraduateCourse("Advanced Algorithms", "CS501", "Algorithm Optimization");

        // Add participants to courses
        course1.addParticipant(student1);
        course1.addParticipant(professor1);

        course2.addParticipant(student2);
        course2.addParticipant(professor1);

        // Display participants for course 1
        System.out.println("Participants in " + course1.getCourseName() + ":");
        displayParticipants(course1.getParticipants());

        // Display participants for course 2
        System.out.println("\nParticipants in " + course2.getCourseName() + ":");
        displayParticipants(course2.getParticipants());
    }

    // Helper method to display participants
    public static void displayParticipants(List<Person> participants) {
        for (Person person : participants) {
            System.out.println(person.getName() + " - " + person.getRole());
        }
    }
}