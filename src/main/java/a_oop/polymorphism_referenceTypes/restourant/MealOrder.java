package a_oop.polymorphism_referenceTypes.restourant;

import java.math.BigDecimal;

public class MealOrder {
    private final Burger burger;
    private final Item drink;
    private final Item side;

    public MealOrder() {
        this("regular", "coke", "fries");
    }

    public MealOrder(String burgerType, String drink, String side) {
        if (burgerType.equalsIgnoreCase("deluxe")) {
            this.burger = new DeluxeBurger(burgerType, new BigDecimal("8.5"));
        } else {
            this.burger = new Burger(burgerType, new BigDecimal("4"));
        }
        this.drink = new Item(drink, "drink", new BigDecimal("1"));
        this.side = new Item(side, "side", new BigDecimal("1.5"));
    }

    public BigDecimal getTotalPrice() {
        if (burger instanceof DeluxeBurger) {
            return burger.getAdjustedPrice();
        }
        return side.getAdjustedPrice().add(drink.getAdjustedPrice()).add(burger.getAdjustedPrice());
    }

    public void printItemizedList() {
        burger.printItem();
        if (burger instanceof DeluxeBurger) {
            Item.printItem(drink.getName(), new BigDecimal("0"));
            Item.printItem(side.getName(), new BigDecimal("0"));
        } else {
            drink.printItem();
            side.printItem();
        }
        System.out.println("-".repeat(30));
        Item.printItem("TOTAL PRICE", getTotalPrice());
    }

    public void addBurgerToppings(String extra1, String extra2, String extra3) {
        burger.addToppings(extra1, extra2, extra3);
    }

    public void addBurgerToppings(String extra1, String extra2, String extra3,
                                  String extra4, String extra5) {
        if (burger instanceof DeluxeBurger db) {
            db.addToppings(extra1, extra2, extra3, extra4, extra5);
        } else
            burger.addToppings(extra1, extra2, extra3);
    }

    public void setDrinkSize(String size) {
        drink.setSize(size.toUpperCase());
    }
}
