package a_oop.polymorphism_referenceTypes.restourant;

import java.math.BigDecimal;

public class DeluxeBurger extends Burger {
    Item deluxe1;
    Item deluxe2;

    public DeluxeBurger(String name, BigDecimal price) {
        super(name, price);
    }

    public void addToppings(String extra1, String extra2, String extra3,
                            String extra4, String extra5) {
        super.addToppings(extra1, extra2, extra3);
        deluxe1 = new Item(extra4, "TOPPING", new BigDecimal("0"));
        deluxe2 = new Item(extra5, "TOPPING", new BigDecimal("0"));
    }

    @Override
    public void printItemizedList() {
        super.printItemizedList();
        if (deluxe1 != null) {
            deluxe1.printItem();
        }
        if (deluxe2 != null) {
            deluxe2.printItem();
        }
    }

    @Override
    public BigDecimal getExtraPrice(String toppingName) {
        return BigDecimal.ZERO;
    }
}
