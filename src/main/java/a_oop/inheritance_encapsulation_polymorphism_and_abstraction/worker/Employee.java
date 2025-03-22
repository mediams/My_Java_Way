package a_oop.inheritance_encapsulation_polymorphism_and_abstraction.worker;

public class Employee extends Worker {
    private long employeeId;
    private String hireDate;
    private static int employeeNo = 1;

    public Employee(String name, String birthday, String hireDate) {
        super(name, birthday);
        this.employeeId = Employee.employeeNo++;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                ", endDay='" + endDay + '\'' +
                "} " + super.toString();
    }
}
