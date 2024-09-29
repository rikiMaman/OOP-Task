//class Person describes a person - abstract class
public abstract class Person {

    //private properties
    private String name;
    private int age;
    protected String address;

    //ctor
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    //abstract method - get role
    public abstract String getRole();

    //return name
    public String getName() {
        return name;
    }

    //return age
    public int getAge() {
        return age;
    }


    //return address
    public String getAddress() {
        return address;
    }


}
