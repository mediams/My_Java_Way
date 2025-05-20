package a_oop.polymorphism_referenceTypes.restourant;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ItemTest {
    private Item item;

    @BeforeAll
    static void setUp() {

    }

    @Test
    void getBasePrice() {
        item = new Item("small", "burger", new BigDecimal("4.50"));

        assertEquals(new BigDecimal("4.50"), item.getBasePrice());
    }

    @Test
    void getBasePriceWithZero() {
        item = new Item("small", "burger", BigDecimal.ZERO);

        assertEquals(new BigDecimal("0"), item.getBasePrice());
    }

    @Test
    void getAdjustedPrice() {
        item = new Item("regular", "burger", new BigDecimal("4.50"));

        item.setSize("small");
        assertEquals(0, item.getAdjustedPrice().compareTo(new BigDecimal("4.00")));

        item.setSize("medium");
        assertEquals(0, item.getAdjustedPrice().compareTo(new BigDecimal("4.50")));

        item.setSize("large");
        assertEquals(0, item.getAdjustedPrice().compareTo(new BigDecimal("5.50")));
    }

}