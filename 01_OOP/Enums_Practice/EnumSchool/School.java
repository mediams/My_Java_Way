public class School {
    public static void main(String[] args) {
        for (Subject subject : Subject.values()) {
            System.out.println(subject);
        }

        Teacher teacher = new Teacher("Ivan", Subject.ART);
        System.out.println(teacher);

        Student student1 = new Student("Bart", Subject.MUSIC, Subject.MATHEMATICS);
        Student student2 = new Student("Lisa", Subject.MUSIC, Subject.ART);
        System.out.println(student1);

        teacher.teach(student1);

        System.out.println();
        teacher.teach(student1, student2);



    }
}
