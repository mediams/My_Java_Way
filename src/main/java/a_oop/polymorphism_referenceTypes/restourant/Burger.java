package a_oop.polymorphism_referenceTypes.restourant;

import java.math.BigDecimal;

public class Burger extends Item {
    private Item extra1;
    private Item extra2;
    private Item extra3;

    public Burger(String name, BigDecimal price) {
        super(name, "Burger", price);
    }

    @Override
    public String getName() {
        return super.getName() + " BURGER";
    }

    @Override
    public BigDecimal getAdjustedPrice() {
        BigDecimal total = getBasePrice();
        total = total.add((extra1 == null) ? BigDecimal.ZERO : extra1.getAdjustedPrice());
        total = total.add((extra2 == null) ? BigDecimal.ZERO : extra2.getAdjustedPrice());
        total = total.add((extra3 == null) ? BigDecimal.ZERO : extra3.getAdjustedPrice());
        return total;
    }

    public BigDecimal getExtraPrice(String toppingName) {
        return switch (toppingName.toUpperCase()) {
            case "AVOCADO", "CHEESE" -> BigDecimal.valueOf(1);
            case "BACON", "HAM", "SALAMI" -> BigDecimal.valueOf(1.5);
            default -> BigDecimal.valueOf(0.0);
        };
    }

    public void addToppings(String extra1, String extra2, String extra3) {
        this.extra1 = new Item(extra1, "TOPPING", getExtraPrice(extra1));
        this.extra2 = new Item(extra2, "TOPPING", getExtraPrice(extra2));
        this.extra3 = new Item(extra3, "TOPPING", getExtraPrice(extra3));
    }

    public void printItemizedList() {
        printItem("BASE BURGER", getBasePrice());
        if (extra1 != null) {
            extra1.printItem();
        }
        if (extra2 != null) {
            extra2.printItem();
        }
        if (extra3 != null) {
            extra3.printItem();
        }
    }

    @Override
    public void printItem() {
        printItemizedList();
        System.out.println("-".repeat(30));
        super.printItem();
    }
}
