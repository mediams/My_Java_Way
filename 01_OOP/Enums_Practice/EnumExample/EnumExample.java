public class EnumExample {
    public static void main(String[] args) {
        Day today = Day.THURSDAY;

        System.out.println(Day.values());
        System.out.println();

        for (Day day : Day.ordinal()) {
            System.out.println(day);
        }

        switch (today){
            case MONDAY -> System.out.println("Start work.");
            case FRIDAY -> System.out.println("End work.");
            default -> System.out.println("Just a day!");
        }

        for (Season season : Season.values()) {
            System.out.println(season + ": " + season.getDescription());
        }
    }
}
