package p5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
5- Write a program for item search in an inventory store.
An Item has ID,NAME and Price properties.
Use Java collections HashMap as a data store.
Write Unit Tests if the Item is found in search or not.
 */
public class Inventory {

    static Map<Integer, Product> productList = new HashMap<>();

    static {
        productList.put(1, new Product(1, "Nike", 1000.0));
        productList.put(2, new Product(2, "Skechers", 2000.0));
        productList.put(3, new Product(3, "AirJordan", 3000.0));
    }

    public boolean searchProduct(Integer id){
        if(productList.containsKey(id)){
            return true;
        }
        else
            return false;
    }

    public boolean searchProduct(String name){
        for(Integer k: productList.keySet()){
            Product temp = productList.get(k);
            if(temp.getName().equals(name)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        System.out.println(inventory.searchProduct(1));
    }

}
