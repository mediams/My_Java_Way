public class Teacher {
    private String name;
    private Subject subject;

    public Teacher(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", subject=" + subject +
                '}';
    }
}
