package a_oop.inheritance_abstractClasses.car;

public abstract class Car {
    private String model;
    private String color;
    private int maxSpeed;

    //    public abstract void gas();
    public void gas() {
        System.out.println("Das Auto gibt Gas!");
    }

    public abstract void brake();

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
