//describes class Professor - type of Person
public class Professor extends Person {

    //private properties

    private String department;

    //ctor
    public Professor(String name, int age, String address, String department) {
        super(name, age, address);
        this.department = department;
    }


    //return role
    @Override
    public String getRole(){
        return "Professor";
    }


    //return a string describing the teaching
    public String teach() {
        return getName() + " is teaching in the " + department + " department.";
    }


}
