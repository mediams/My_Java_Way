public enum Subject {
//    MATHEMATICS ("Mathematics");
    MATHEMATICS,
    PHYSICS,
    CHEMISTRY,
    BIOLOGY,
    COMPUTER_SCIENCE,
    HISTORY,
    GEOGRAPHY,
    ENGLISH,
    LITERATURE,
    PHYSICAL_EDUCATION,
    ART,
    MUSIC;

//    private final String descr;
//
//    Subject(String descr) {
//
//        this.descr = descr;
//    }

        @Override
    public String toString() {
        return name().charAt(0) + name().substring(1).toLowerCase().replace('_', ' ');
    }

}

