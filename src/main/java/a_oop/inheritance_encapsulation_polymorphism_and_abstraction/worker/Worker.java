package a_oop.inheritance_encapsulation_polymorphism_and_abstraction.worker;

public class Worker {
    private String name;
    private String birthday;
    protected String endDay;

    public int getAge() {
        return 2025 - Integer.parseInt(birthday.substring(6));
    }

    public double collectPay() {
        return 0.0;
    }

    public void terminate(String endDay) {
        this.endDay = endDay;
    }

    public Worker(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public Worker() {
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", endDay='" + endDay + '\'' +
                '}';
    }
}
