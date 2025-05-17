package a_oop.polymorphism_referenceTypes.restourant;

import java.math.BigDecimal;

public class MealOrder {
    private final Burger burger;
    private final Item drink;
    private final Item side;

    public MealOrder() {
        this("regular", "coke", "fries");
    }

    public MealOrder(String burger, String drink, String side) {
        this.burger = new Burger(burger, new BigDecimal("4.0"));
        this.drink = new Item(drink, "drink", new BigDecimal("1"));
        this.side = new Item(side, "side", new BigDecimal("1.5"));
    }

    public BigDecimal getTotalPrice() {
        return side.getAdjustedPrice().add(drink.getAdjustedPrice()).add(burger.getAdjustedPrice());
    }

    public void printItemizedList() {
        burger.printItem();
        drink.printItem();
        side.printItem();
        System.out.println("-".repeat(30));
        Item.printItem("TOTAL PRICE", getTotalPrice());
    }

    public void addBurgerToppings(String extra1, String extra2, String extra3) {
        burger.addToppings(extra1, extra2, extra3);
    }

    public void setDrinkSize(String size) {
        drink.setSize(size.toUpperCase());
    }
}
