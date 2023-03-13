package superThis;

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }
}

public class Student extends Person {
    private int studentId;

    public Student(String name, int studentId) {
        super(name); // calls the Person constructor that takes a name parameter
        // this.name = name; // this will not work, this field Person.name will not be visible, because of private String name in Person
        this.studentId = studentId;
    }
}
