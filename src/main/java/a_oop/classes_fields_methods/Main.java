package a_oop.classes_fields_methods;

public class Main {
    public static void main(String[] args) {
        RecordStudent recordStudent = new RecordStudent("John", "email@mail.com", 25);

        System.out.println(recordStudent);
        System.out.println(recordStudent.name());
    }
}
