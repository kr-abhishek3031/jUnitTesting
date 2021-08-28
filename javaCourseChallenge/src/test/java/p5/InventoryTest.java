package p5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InventoryTest {
    static Inventory inventory = new Inventory();

    @Test
    public void searchProductTest(){
        Integer i = 1;
        assertEquals(true, inventory.searchProduct(1));
    }
}
