public class School {
    public static void main(String[] args) {
        for (Subject subject : Subject.values()) {
            System.out.println(subject);
        }

        Teacher teacher = new Teacher("Ivan", Subject.MUSIC);
        System.out.println(teacher);
    }
}
