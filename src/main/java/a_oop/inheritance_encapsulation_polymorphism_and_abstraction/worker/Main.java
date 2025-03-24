package a_oop.inheritance_encapsulation_polymorphism_and_abstraction.worker;

public class Main{
    public static void main(String[] args) {
        Employee bro = new Employee("Bro", "11/12/1980", "10/10/2020");
        System.out.println(bro);
        System.out.println("Age = " + bro.getAge());
        System.out.println("Pay = " + bro.collectPay());

        SalariedEmployee bro2 = new SalariedEmployee("Bro Two", "11/10/1999", "01/02/2021", 13500, false);
        System.out.println(bro2);
        System.out.println(bro2.getName() + "'s Paycheck = $" + bro2.collectPay());

        bro2.retire();
        System.out.println(bro2.getName() + "'s Paycheck = $" + bro2.collectPay());

        System.out.println("""
                Text
                    Example
                """);

        int year0fBirth = 2023;
        System.out.printf("Age= %d%n, Birth year age", year0fBirth);



    }
}
