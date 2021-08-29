package p5;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InventoryTest {
    static Inventory inventory = new Inventory();

    @BeforeAll
    public static void populateInventory(){
        inventory.productList.put(4, new Product(4, "Hike", 1000.0));
        inventory.productList.put(5, new Product(5, "Reebok", 2000.0));
        inventory.productList.put(6, new Product(6, "Uniqlo", 3000.0));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5, 6}) // 3
    public void searchProductByIDPositveTest(int id){
        assertEquals(true, inventory.searchProduct(id));
    }
    @ParameterizedTest
    @ValueSource(ints = { 7,8, 9, 10, Integer.MAX_VALUE}) // 3
    public void searchProductByIDnegativeTest(int id){
        assertEquals(false, inventory.searchProduct(id));
    }


}
