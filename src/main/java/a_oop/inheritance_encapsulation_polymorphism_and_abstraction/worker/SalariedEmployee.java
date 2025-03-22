package a_oop.inheritance_encapsulation_polymorphism_and_abstraction.worker;

public class SalariedEmployee extends Employee {
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthday, String hireDate, double annualSalary, boolean isRetired) {
        super(name, birthday, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }

    public void retire() {
        terminate("12/10/2025");
        isRetired = true;
    }

    @Override
    public double collectPay() {
        double paycheck = annualSalary / 26;
        double adjustedPay = (isRetired) ? 0.9 * paycheck : paycheck;
        return (int) adjustedPay;
    }

}
