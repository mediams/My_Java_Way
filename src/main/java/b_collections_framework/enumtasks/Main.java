package b_collections_framework.enumtasks;

import java.util.Random;


public class Main {
    public static void main(String[] args) {
        DayOfTheWeek dayOfTheWeek = DayOfTheWeek.TUES;
        System.out.println(dayOfTheWeek);

//        System.out.printf("Name is %s, Ordinal Value = %d%n", dayOfTheWeek.name(), dayOfTheWeek.ordinal());
//        for (int i = 0; i < 10; i++) {
//            var weekDay = getRandom();
//            System.out.println(weekDay + " " + weekDay.ordinal());
//            if (weekDay == DayOfTheWeek.FRI) {
//                System.out.println("Its Friday!");
//            }
//        }

        switchDayOfTheWeek(getRandom());

        for (Topping topping : Topping.values()) {
            System.out.println(topping.name() + " : " + topping.getPrice());
        }
    }

    public static void switchDayOfTheWeek(DayOfTheWeek weekDay) {
        int weekDayInteger = weekDay.ordinal() + 1;

        switch (weekDay) {
            case WED -> System.out.println("Wednesday is Day " + weekDayInteger);
            case SAT -> System.out.println("Saturday is Day " + weekDayInteger);
            default -> System.out.println(weekDay.name().charAt(0) + weekDay.name().substring(1).toLowerCase() +
                    "day is Day " + weekDayInteger);

        }
    }

    public static DayOfTheWeek getRandom() {
        int randomInteger = new Random().nextInt(7);
        var allDays = DayOfTheWeek.values();

        return allDays[randomInteger];
    }
}
