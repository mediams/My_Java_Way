package a_oop.polymorphism_referenceTypes.restourant;

import java.math.BigDecimal;

public class Item {
    private final String name;
    private final String type;
    private final BigDecimal price;
    private String size = "MEDIUM";

    public Item(String name, String type, BigDecimal price) {
        this.name = name.toUpperCase();
        this.type = type.toUpperCase();
        this.price = price;
    }

    public static void printItem(String name, BigDecimal price) {
        System.out.printf("%20s:%6.2f%n", name, price.doubleValue());
    }

    public BigDecimal getBasePrice() {
        return price;
    }

    public BigDecimal getAdjustedPrice() {
        return switch (size) {
            case "SMALL" -> getBasePrice().subtract(BigDecimal.valueOf(0.5));
            case "LARGE" -> getBasePrice().add(BigDecimal.valueOf(1));
            default -> getBasePrice();
        };
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void printItem() {
        printItem(getName(), getAdjustedPrice());
    }

    public String getName() {
        if (type.equals("SIDE") || type.equals("DRINK")) {
            return size + " " + name;
        }
        return name;
    }


}
