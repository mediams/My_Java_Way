package a_oop.polymorphism_referenceTypes.restourant;

public class Main {
    public static void main(String[] args) {
//        Item coke = new Item("coke", "drink", new BigDecimal("1.50"));
//        coke.printItem();
//        coke.setSize("LARGE");
//        coke.printItem();
//
//        Item avocado = new Item("avocado", "Topping", new BigDecimal("1.50"));
//        avocado.printItem();
//        avocado = new Item("avocado", "side", new BigDecimal("1.75"));
//        avocado.printItem();

//        Burger burger = new Burger("regular", new BigDecimal("4.0"));
//        burger.addToppings("BACON", "CHEESE", "MAYO");
//        burger.printItem();

//        MealOrder mealOrder = new MealOrder();
//        mealOrder.addBurgerToppings("BACON", "CHEESE", "MAYO");
//        mealOrder.setDrinkSize("LARGE");
//        mealOrder.printItemizedList();

        MealOrder secondMeal = new MealOrder("turkey", "7-up", "chili");
        secondMeal.addBurgerToppings("LETTUCE", "CHEESE", "MAYO");
        secondMeal.setDrinkSize("small");
        secondMeal.printItemizedList();
    }
}
