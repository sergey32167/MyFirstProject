package Lesson8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args){

        Product product1 = new Product(1, "milk", 100);
        Product product2 = new Product(3, "bread", 1);
        Product product3 = new Product(9, "apple", 20);
        Product product4 = new Product(10, "grapes", 123);

        Supermarket supermarket = new Supermarket();
        supermarket.addproduct(product1);
        supermarket.addproduct(product2);
        supermarket.addproduct(product3);
        supermarket.addproduct(product4);
        supermarket.showproducts();
        supermarket.removeById(3);
        supermarket.showproducts();
        supermarket.showSortedProductsByPrize();
        supermarket.showSortedProductsByAdd();
        supermarket.editById(1);
        supermarket.showproducts();

    }
}
