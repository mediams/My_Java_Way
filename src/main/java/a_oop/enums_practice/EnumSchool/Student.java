class Student {
    private String name;
    private Subject[] subjects;
    private int subjectCount;

    public Student(String name) {
        this.name = name;
        this.subjects = new Subject[Subject.values().length];
        this.subjectCount = 0;
    }

    public String getName() {
        return name;
    }

//    public void learn(Subject subject) {
//            subjects[subjectCount++] = subject;
//    }


//    public boolean knows(Subject subject) {
//        for (int i = 0; i < subjectCount; i++) {
//            if (subjects[i] == subject) {
//                return true;
//            }
//        }
//        return false;
//    }

    public void learn(Subject subject) {
        subjects[subject.ordinal()] = subject;
        System.out.println("Student " + name + "lern " + subject);
    }

    public boolean knows(Subject subject) {
        return subjects[subject.ordinal()] == subject;  // GROße Frage!!!
    }
}