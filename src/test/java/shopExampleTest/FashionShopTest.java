package shopExampleTest;
//package shopExample;
import static org.junit.jupiter.api.Assertions.*;
import static shopExample.Size.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import shopExample.Inventory;
import shopExample.Size;
import shopExample.TShirt;

import java.util.Iterator;
import java.util.Set;

public class FashionShopTest {

    static Inventory inventory = new Inventory();

    @Test
    public void checkAddtshirt(){
        TShirt t1 = new TShirt();
        t1.tshirtName = "Decathlon";
        inventory.addTshirt(t1);
        //Object assertTrue;
        //assertTrue(true, inventory.getCollection().contains(t1));
        TShirt t2 = new TShirt();
        t2.tshirtName = "Nike";
        assertEquals(true, inventory.getCollection().contains(t1));
    }


    @Test
    public void checkAddtshirtSize(){
        Set<TShirt> t2 = inventory.getCollection();
        Iterator tShirtCollection = t2.iterator();
        while(tShirtCollection.hasNext()){
            TShirt t = (TShirt) tShirtCollection.next();
            t.addtshirtSize(S, 10);
            Assertions.assertEquals(10, t.getstockSize().get(S));
        }

    }
}
