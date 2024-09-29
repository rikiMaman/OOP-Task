//class describes student - type of Person
public class Student extends Person {

    //private properties
    private String studentId;

    //ctor
    public Student(String name, int age, String address, String studentId) {
        super(name, age, address);
        this.studentId = studentId;
    }

    //return a string describing study
    public String study() {
        return getName() + " is studying.";
    }

    //return role
    @Override
    public String getRole(){
        return "Student";
    }

}
