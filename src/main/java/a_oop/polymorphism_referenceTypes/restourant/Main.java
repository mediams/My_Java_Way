package a_oop.polymorphism_referenceTypes.restourant;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Item coke = new Item("coke", "drink", new BigDecimal("1.50"));
        coke.printItem();
        coke.setSize("LARGE");
        coke.printItem();

        Item avocado = new Item("avocado", "Topping", new BigDecimal("1.50"));
        avocado.printItem();
    }
}
