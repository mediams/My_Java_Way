package a_oop.Classes_Fields_Methods;

public class Main {
    public static void main(String[] args) {
        RecordStudent recordStudent = new RecordStudent("John", "email@mail.com", 25);

        System.out.println(recordStudent);
        System.out.println(recordStudent.name());
    }
}
