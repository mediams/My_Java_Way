package a_oop.inheritance_encapsulation_polymorphism_and_abstraction;

public class SuperObject extends Object {
    public static void main(String[] args) {
        Student max = new Student("max", 21);
        System.out.println(max);

        PrimarySchoolStudent parent = new PrimarySchoolStudent("John", 25, "Steve");
        System.out.println(parent);
    }
}

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}

class PrimarySchoolStudent extends Student{

    private String parentName;

    public PrimarySchoolStudent(String name, int age, String parentName) {
        super(name, age);
        this.parentName = parentName;
    }

    @Override
    public String toString() {
        return "PrimarySchoolStudent{" +
                "parentName='" + parentName + '\'' +
                "} " + super.toString();
    }
}
